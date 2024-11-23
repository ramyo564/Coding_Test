def solution(array, commands):
    answer = []
    for start, end, target in commands:
        temp = sorted(array[start-1:end])
        answer.append(temp[target-1])
    return answer