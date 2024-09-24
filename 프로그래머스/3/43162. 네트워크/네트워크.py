
from collections import deque


def solution(n, computers):
    visited = [False] * n
    graph = [[] * n for _ in range(len(computers))]
    answer = 0

    for i in range(len(computers)):
        for j in range(len(computers[0])):
            if computers[i][j] == 1:
                graph[i].append(j)

    def bfs(start):
        visited[start] = True
        queue = deque()
        queue.append(start)

        while queue:
            cur_v = queue.popleft()
            for v in graph[cur_v]:
                if not visited[v]:
                    visited[v] = True
                    queue.append(v)

    for i in range(n):
        if not visited[i]:
            bfs(i)
            answer += 1

    return answer