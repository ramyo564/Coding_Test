from collections import deque


def solution(numbers, target):
    queue = deque()
    queue.append(numbers[0])
    queue.append(numbers[0] * -1)
    queue.append("END")
    cnt = 0

    for i in range(1, len(numbers)):
        while queue[0] != "END":
            temp = queue.popleft()
            queue.append(temp + numbers[i])
            queue.append(temp - numbers[i])

        queue.popleft()
        queue.append("END")

    for x in queue:
        if x == target:
            cnt += 1

    return cnt 