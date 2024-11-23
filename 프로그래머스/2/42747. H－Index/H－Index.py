def solution(citations):
    citations.sort(reverse=True)
    temp = []
    for i in citations:
        if i == 0:
            break
        temp.append(i)

    temp.sort()
    answer = 0
    cnt = 0
    print(temp)

    for i in range(1, len(temp)+1):
        for r in temp:
            if i <= r:
                cnt += 1
        n = i
        if n <= cnt and answer < n:
            answer = n
        else:
            break
        print(f"{i}번째 {cnt}번")
        cnt = 0
    return answer