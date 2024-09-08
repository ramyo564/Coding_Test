from collections import deque
def solution(n, computers):
    visited = [False] * n
    list = [[] * n for _ in range(n)]
    answer = 0

    for i in range(n):
        for j in range(n):
            if computers[i][j] == 1:
                list[i].append(j)
    print(list)
    def bfs(start):
        queue = deque()
        queue.append(list[i])
        visited[i] = True
        while queue:
            linked_computer = queue.popleft()
            for com in linked_computer:
                if not visited[com] and com in list[com]:
                    visited[com] = True
                    queue.append(list[com])

    for i in range(n):
        if not visited[i]:
            bfs(i)
            answer += 1

    return answer