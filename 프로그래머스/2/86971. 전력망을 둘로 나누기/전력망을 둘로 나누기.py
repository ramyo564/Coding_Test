from collections import deque
from itertools import combinations


def solution(n, wires):
    answer = n
    def bfs(start):
        visited[start] = True
        queue = deque([start])
        cnt = 1
        while queue:
            cur_v = queue.popleft()
            for v in graph[cur_v]:
                if not visited[v]:
                    queue.append(v)
                    visited[v] = True
                    cnt += 1
        return cnt

    for c in combinations(wires, len(wires) - 1):
        graph = [[] for _ in range(n + 1)]
        visited = [False] * (n + 1)
        for i in c:
            graph[i[0]].append(i[1])
            graph[i[1]].append(i[0])

        first = bfs(1)
        second = n - first
        answer = min(abs(first-second), answer)

    return answer