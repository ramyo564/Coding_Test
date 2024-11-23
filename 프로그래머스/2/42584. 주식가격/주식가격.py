def solution(prices):
    answer = []
    n = len(prices)
    for i in range(n):
        cnt = 0
        for r in range(i, n - 1):
            if prices[i] <= prices[r+1]:
                cnt += 1
            else:
                cnt += 1
                break
        answer.append(cnt)

    return answer