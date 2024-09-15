def solution(sizes):
    max_width = 0
    max_length = 0

    for i in sizes:
        if max(i) > max_length:
            max_length = max(i)
        if min(i) > max_width:
            max_width = min(i)

    return max_width * max_length