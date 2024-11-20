from collections import deque


def solution(progresses, speeds):
    q = deque()
    for x, y in zip(progresses, speeds):
        q.append([x, y])

    n = 0
    answer = []
    while q:
        x, y = q.popleft()
        if x >= 100:
            n += 1
            if len(q) == 0:
                answer.append(n)
        elif n != 0:
            answer.append(n)
            x += y
            q.append([x, y])
            n = 0
            for _ in range(len(q) - 1):
                x, y = q.popleft()
                x += y
                q.append([x, y])

        else:
            x += y
            q.append([x, y])
            for _ in range(len(q) - 1):
                x, y = q.popleft()
                x += y
                q.append([x, y])

    return answer