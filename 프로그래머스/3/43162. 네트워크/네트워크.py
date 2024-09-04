from collections import deque

def solution(n, computers):
    visited = [[False] * n]
    com_dic = {}
    answer = 0
    num = 0
    for i in range(n):
        for j in computers[i]:
            if i not in com_dic:
                com_dic[i] = []
            if j == 1:
                com_dic[i].append(num)
            num += 1
        num = 0
    def bfs(com_dic, start_v):
        queue = deque([start_v])
        while queue:
            cur_v = queue.popleft()
            for v in com_dic[cur_v]:
                if not visited[0][v]:
                    visited[0][v] = True
                    queue.append(v)

    for i in range(n):
        if not visited[0][i]:
            bfs(com_dic, i)
            answer += 1

    return answer