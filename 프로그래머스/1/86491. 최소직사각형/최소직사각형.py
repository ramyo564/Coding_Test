def solution(sizes):
    width = 0
    length = 0
    for i in sizes:
        if width < max(i):
            width = max(i)
        if length < min(i):
            length = min(i)

    return length * width
