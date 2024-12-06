def solution(answers):
    people_1 = [1, 2, 3, 4, 5]
    people_2 = [2, 1, 2, 3, 2, 4, 2, 5]
    people_3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]

    temp = [0, 0, 0]
    for i in range(len(answers)):

        if people_1[i % len(people_1)] == answers[i]:
            temp[0] += 1
        if people_2[i % len(people_2)] == answers[i]:
            temp[1] += 1
        if people_3[i % len(people_3)] == answers[i]:
            temp[2] += 1

    target = max(temp)
    answer = []
    for i in range(len(temp)):
        if temp[i] == target:
            answer.append(i+1)

    return answer
