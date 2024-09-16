from itertools import permutations
def solution(k, dungeons):
    answer = -1

    for p in permutations(dungeons, len(dungeons)):
        temp = k
        cnt = 0
        for need, spend in p:
            if temp >= need:
                temp -= spend
                cnt += 1
        answer = max(cnt, answer)
    return answer
