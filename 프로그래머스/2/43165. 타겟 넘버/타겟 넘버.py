from collections import deque
def solution(numbers, target):
    answer = 0

    queue = deque()
    queue.append((numbers[0], 0))
    queue.append((-numbers[0], 0))

    while queue:
        temp, idx = queue.popleft()
        if idx < len(numbers) - 1:
            idx += 1
            queue.append((temp + numbers[idx], idx))
            queue.append((temp - numbers[idx], idx))


        else:
            if temp == target:
                answer += 1

    return answer