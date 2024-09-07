def solution(word):
    answer = 0
    list = ["A", "E", "I", "O", "U"]
    for i in list:
        answer += 1
        if word == i:
            return answer
        for j in list:
            answer += 1
            if word == i+j:
                return answer
            for k in list:
                answer += 1
                if word == i + j + k:
                    return answer
                for q in list:
                    answer += 1
                    if word == i + j + k + q:
                        return answer
                    for d in list:
                        answer += 1
                        if word == i + j + k + q + d:
                            return answer