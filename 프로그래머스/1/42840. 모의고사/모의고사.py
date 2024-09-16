def solution(answers):
    num1 = [1, 2, 3, 4, 5]
    num2 = [2, 1, 2, 3, 2, 4, 2, 5]
    num3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    quiz_len = len(answers)

    cnt_1 = 0
    cnt_2 = 0
    cnt_3 = 0

    for idx in range(quiz_len):
        if answers[idx] == num1[idx % 5]:
            cnt_1 += 1
        if answers[idx] == num2[idx % 8]:
            cnt_2 += 1
        if answers[idx] == num3[idx % 10]:
            cnt_3 += 1

    max_v = max(cnt_1, cnt_2, cnt_3)
    temp = [cnt_1, cnt_2, cnt_3]

    return [i + 1 for i in range(len(temp)) if temp[i] == max_v]