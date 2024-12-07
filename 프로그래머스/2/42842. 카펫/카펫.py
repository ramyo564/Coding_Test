def solution(brown, yellow):
    for i in range(1, yellow + 1):
        x = i
        y = int(yellow // i)
        if x * y == yellow:
            if (x + y) == int((brown - 4) // 2):
                return [y+2, x+2]
    