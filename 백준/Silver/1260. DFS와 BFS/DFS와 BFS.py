from collections import deque

import sys

n, m, start = map(int, sys.stdin.readline().split())

graph = [[] for _ in range(n + 1)]
visited_bfs = [False] * (n + 1)
visited_dfs = [False] * (n + 1)

for i in range(m):
    key, val = map(int, sys.stdin.readline().split())
    graph[key].append(val)
    graph[val].append(key)

for i in graph:
    i.sort()


def bfs(start):
    queue = deque([start])
    visited_bfs[start] = True

    while queue:
        v = queue.popleft()
        print(v, end=" ")
        for i in graph[v]:
            if not visited_bfs[i]:
                visited_bfs[i] = True
                queue.append(i)


def dfs(start):
    visited_dfs[start] = True
    print(start, end=" ")
    for i in graph[start]:
        if not visited_dfs[i]:
            dfs(i)


dfs(start)
print()
bfs(start)