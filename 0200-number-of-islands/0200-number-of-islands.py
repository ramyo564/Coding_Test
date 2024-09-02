class Solution(object):
    def numIslands(self, grid):
        x = len(grid[0])
        y = len(grid)
        visited = [[False] * x for _ in range(y)]
        queue = deque()
        cnt = 0
        dy = [-1, 1, 0, 0]
        dx = [0, 0, -1, 1]

        def bfs(temp_y, temp_x):
            queue.append((temp_y, temp_x))
            visited[temp_y][temp_x] = True
            while queue:
                cur_y, cur_x = queue.popleft()
                for i in range(4):
                    next_y = cur_y + dy[i]
                    next_x = cur_x + dx[i]
                    if 0 <= next_y < y and 0 <= next_x < x:
                        if not visited[next_y][next_x] and grid[next_y][next_x] == "1":
                            queue.append((next_y, next_x))
                            visited[next_y][next_x] = True

        for i in range(y):
            for j in range(x):
                if grid[i][j] == "1" and not visited[i][j]:
                    bfs(i, j)
                    cnt += 1

        return cnt