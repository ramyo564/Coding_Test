def solution(n):
    answer = [[0] * n for _ in range(n)]
    y, x = -1, 0
    num = 1
    list = []
    for i in range(n):
        for j in range(i, n):
            if i % 3 == 0:
                y += 1
            elif i % 3 == 1:
                x += 1
            elif i % 3 == 2:
                y -= 1
                x -= 1
            answer[y][x] = num
            num += 1
    for i in range(n):
        for j in range(i + 1):
            list.append(answer[i][j])

    return list