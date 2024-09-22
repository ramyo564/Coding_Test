from collections import deque


def solution(priorities, location):
    priority = deque(sorted(priorities, reverse=True))
    queue = deque()
    answer = 0

    for idx, v in enumerate(priorities):
        queue.append([idx, v])

    while priority:
        target_peek = priority[0]
        idx, cur_v = queue.popleft()

        if cur_v == target_peek:
            priority.popleft()
            answer += 1
        else:
            queue.append([idx, cur_v])
        if idx == location and cur_v == target_peek:
            break

    return answer