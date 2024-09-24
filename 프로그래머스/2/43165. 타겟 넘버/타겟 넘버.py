from collections import deque


def solution(numbers, target):
    answer = 0
    queue = deque()
    queue.append([numbers[0] * -1, 0])
    queue.append([numbers[0], 0])

    while queue:
        cur_v, idx = queue.popleft()
        idx += 1
        if idx < len(numbers):
            queue.append([cur_v + numbers[idx], idx])
            queue.append([cur_v - numbers[idx], idx])
        else:
            if cur_v == target:
                answer += 1

    return answer
