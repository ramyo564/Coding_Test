
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
        graph = [[] for _ in range(n + 1)]
        visited = [False] * (n + 1)
        for first_node, second_node in c:
            graph[first_node].append(second_node)
            graph[second_node].append(first_node)

        first_network = bfs(1)
        second_network = n - first_network
        answer = min(answer, abs(first_network - second_network))

    return answer