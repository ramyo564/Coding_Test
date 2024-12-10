from collections import deque


def solution(n, computers):
    def bfs(start):
        visited[start] = True
        queue = deque([start])
        while queue:
            cur_v = queue.popleft()
            for i in graph[cur_v]:
                if not visited[i]:
                    visited[i] = True
                    queue.append(i)
        return 1

    graph = {}
    visited = [False] * n
    answer = 0
    for idx, value in enumerate(computers):
        for value_index, v in enumerate(value):
            if idx not in graph and v == 1:
                graph[idx] = [value_index]
            elif v == 1:
                graph[idx].append(value_index)

    for i in range(n):
        if not visited[i]:
            answer += bfs(i)

    return answer
