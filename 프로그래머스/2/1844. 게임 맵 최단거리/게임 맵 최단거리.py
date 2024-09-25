from collections import deque


def solution(maps):
    dy = [-1, 1, 0, 0]
    dx = [0, 0, -1, 1]
    visited = [[False] * len(maps[0]) for _ in range(len(maps))]

    def bfs(y, x):
        visited[y][x] = True
        queue = deque()
        queue.append([y, x, 1])

        while queue:
            cur_y, cur_x, idx = queue.popleft()

            if cur_y == len(maps) - 1 and cur_x == len(maps[0]) - 1:
                return idx
            for i in range(4):
                next_y = cur_y + dy[i]
                next_x = cur_x + dx[i]
                if 0 <= next_y < len(maps) and 0 <= next_x < len(maps[0]):
                    if maps[next_y][next_x] == 1 and not visited[next_y][next_x]:
                        queue.append([next_y, next_x, idx + 1])
                        visited[next_y][next_x] = True
        return -1

    return (bfs(0, 0))