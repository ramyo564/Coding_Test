from collections import deque


def solution(rectangle, characterX, characterY, itemX, itemY):
    def bfs(y, x, item_y, item_x, visited, graph):

        dx = [1, -1, 0, 0]
        dy = [0, 0, 1, -1]

        visited[y][x] = True
        cnt = 0
        queue = deque()
        queue.append([y, x, cnt])
        while queue:
            cur_y, cur_x, cnt = queue.popleft()
            if cur_y == item_y and cur_x == item_x:
                return int(cnt // 2)

            for i in range(4):
                next_y = cur_y + dy[i]
                next_x = cur_x + dx[i]

                if graph[next_y][next_x] == 1 and not visited[next_y][next_x]:
                    visited[next_y][next_x] = True
                    queue.append([next_y, next_x, cnt + 1])

    def make_graph(data):
        start_x = data[0] * 2
        start_y = data[1] * 2
        end_x = data[2] * 2
        end_y = data[3] * 2

        # 로직 확인하면 2배 해줘야함
        for y in range(start_y, end_y + 1):
            for x in range(start_x, end_x + 1):
                if start_y < y < end_y and start_x < x < end_x:
                    graph[y][x] = 3
                else:
                    if graph[y][x] == 3:
                        continue
                    else:
                        graph[y][x] = 1

    graph = [[0] * 102 for _ in range(102)]
    visited = [[False] * 102 for _ in range(102)]

    for data in rectangle:
        make_graph(data)

    return bfs(characterY * 2, characterX * 2, itemY * 2, itemX * 2, visited, graph)