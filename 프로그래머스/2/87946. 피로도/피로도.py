from itertools import permutations


def solution(k, dungeons):
    max_cnt = 0
    for i in permutations(dungeons, len(dungeons)):
        start = k
        cnt = 0
        for requisite, energy in i:
            if start >= requisite:
                start -= energy
                cnt += 1
            else:
                break
        max_cnt = max(max_cnt, cnt)
    return max_cnt
