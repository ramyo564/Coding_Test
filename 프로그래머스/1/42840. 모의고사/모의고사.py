def solution(answers):
    num1 = [1, 2, 3, 4, 5]
    num2 = [2, 1, 2, 3, 2, 4, 2, 5]
    num3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    cnt = [0, 0, 0]

    for idx, v in enumerate(answers):
        if answers[idx] == num1[idx % len(num1)]:
            cnt[0] += 1
        if answers[idx] == num2[idx % len(num2)]:
            cnt[1] += 1
        if answers[idx] == num3[idx % len(num3)]:
            cnt[2] += 1

    return [idx+1 for idx, v in enumerate(cnt) if max(cnt) == v]
