def solution(answers):
    student1 = [1, 2, 3, 4, 5]
    student2 = [2, 1, 2, 3, 2, 4, 2, 5]
    student3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    answer = [0, 0, 0]

    for idx, v in enumerate(answers):

        if v == student1[idx % 5]:
            answer[0] += 1
        if v == student2[idx % 8]:
            answer[1] += 1
        if v == student3[idx % 10]:
            answer[2] += 1
    return [idx + 1 for idx, x in enumerate(answer) if x == max(answer)]