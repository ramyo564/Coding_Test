def solution(sizes):
    answer = 0
    length = 0
    width = 0

    for i in sizes:
        y, x = i
        if length < max(y, x):
            length = max(y, x)

        if width < min(y, x):
            width = min(y, x)

    return length * width