def solution(numbers):
    temp = []
    for i in numbers:
        temp.append(str(i))
    temp.sort(key=lambda x: x*3, reverse=True)

    answer = ''
    for i in temp:
        answer += i
        
    return answer if answer[0] != '0' else '0'
