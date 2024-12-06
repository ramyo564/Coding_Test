def solution(sizes):
    x = 0
    y = 0
    for i in sizes:
        x = max(x, max(i))
        y = max(y, min(i))

    return x * y