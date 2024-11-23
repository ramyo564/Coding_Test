from collections import deque


def solution(bridge_length, weight, truck_weights):
    answer = 0  # 걸린 시간
    # 현재 다리 상황, 0 : 빈 다리 공간
    bridge = deque([0] * bridge_length)
    truck_weights = deque(truck_weights)

    truck_weight_in_bridge = 0  # 다리 위에 있는 트럭의 무게
    while bridge:
        truck_weight_in_bridge -= bridge.popleft()  # 다리를 지나간 트럭은 무게에서 제외
        answer += 1

        if truck_weights:
            if truck_weight_in_bridge + truck_weights[0] <= weight:
                truck_weight_in_bridge += truck_weights[0]
                bridge.append(truck_weights.popleft())
            else:
                bridge.append(0)

    return answer