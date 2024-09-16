def solution(brown, yellow):
    answer = []
    total = brown + yellow

    for y in range(1, total):
        if yellow % y == 0:
            x = yellow // y
        if (2 * x) + (2 * y) + 4 == brown:
            answer.append(x + 2)
            answer.append(y + 2)
            return answer