def solution(brown, yellow):
    for i in range(1, yellow + 1):
        y = i
        if yellow % y == 0:
            x = yellow // y
            if (2 * y) + (2 * x) + 4 == brown:
                return [x + 2, y + 2]
