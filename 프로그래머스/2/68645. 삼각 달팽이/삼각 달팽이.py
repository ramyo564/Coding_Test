def solution(n):
    answer = []
    triangle = [[0] * n for _ in range(n)]
    y = -1
    x = 0
    num = 1
    for i in range(n):
        for j in range(i, n):
            if i % 3 == 0:
                y += 1
                triangle[y][x] = num
            elif i % 3 == 1:
                x += 1
                triangle[y][x] = num
            else:
                y -= 1
                x -= 1
                triangle[y][x] = num

            num += 1

    for i in range(n):
        for j in range(i+1):
            answer.append(triangle[i][j])
    return answer