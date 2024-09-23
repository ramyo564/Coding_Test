def solution(sizes):
    length = 0
    width = 0
    for i in sizes:
        temp = max(i)
        temp2 = min(i)
        if length < temp:
            length = temp
        if width < temp2:
            width = temp2

    return length * width