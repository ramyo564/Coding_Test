from collections import deque


def solution(maps):
    n = len(maps)
    m = len(maps[0])

    dx = [0, 0, 1, -1]
    dy = [1, -1, 0, 0]

    visited = [[False] * m for _ in range(n)]

    def bfs(y, x):
        visited[y][x] = True
        idx = 1
        queue = deque([[y, x, idx]])
        while queue:
            cur_y, cur_x, idx = queue.popleft()
            if cur_y == n - 1 and cur_x == m - 1:
                return idx
            for i in range(4):
                next_y = cur_y + dy[i]
                next_x = cur_x + dx[i]

                if 0 <= next_y < n and 0 <= next_x < m:
                    if maps[next_y][next_x] != 0 and not visited[next_y][next_x]:
                        visited[next_y][next_x] = True
                        queue.append([next_y, next_x, idx + 1])
        return -1
    return bfs(0, 0)