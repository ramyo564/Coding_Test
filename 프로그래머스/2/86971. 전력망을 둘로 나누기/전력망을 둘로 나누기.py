from itertools import combinations
from collections import deque

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
                    visited[v] = True
                    queue.append(v)
                    cnt += 1
        return cnt

    for c in combinations(wires, len(wires) - 1):
        visited = [False] * (n+1)
        graph = [[] for _ in range(n + 1)]
        for w in c:
            graph[w[0]].append(w[1])
            graph[w[1]].append(w[0])

        first_net = bfs(1)
        second_net = n - first_net
        answer = min(answer, abs(first_net - second_net))
    return answer