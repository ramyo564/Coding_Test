def solution(brown, yellow):
    for i in range(1, yellow + 1):
        if yellow % i == 0:
            y = yellow // i
            x = i
            if (2+y) * (2+x) == yellow + brown:
                return [y+2, x+2]
