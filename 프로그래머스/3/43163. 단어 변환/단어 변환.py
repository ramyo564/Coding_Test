from collections import deque


def solution(begin, target, words):
    if target not in words:
        return 0
    n = len(words)
    visited = [False] * n
    queue = deque([[begin, 0]])
    while queue:
        temp, cnt = queue.popleft()
        if temp == target:
            return cnt

        for i in range(n):
            if not visited[i]:
                difference = 0

                for r in range(len(words[i])):
                    if temp[r] != words[i][r]:
                        difference += 1

                if difference == 1:
                    next = words[i]
                    visited[i] = True
                    queue.append([next, cnt + 1])