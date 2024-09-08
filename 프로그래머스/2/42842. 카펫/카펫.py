def solution(brown, yellow):
    answer = []
    total = brown + yellow
    for i in range(1, int(total**0.5)):
        if yellow % i == 0:
            x = yellow // i
            y = i
            if (2*x) + (2*y) + 4 == brown:
                answer.append(x+2)
                answer.append(y+2)
                break;
    answer.sort(reverse=True)
    return answer