import sys

n = int(sys.stdin.readline())

people_spec = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]

for i in people_spec:
    rank = 1
    for j in people_spec:
        if i[0] < j[0] and i[1] < j[1]:
            rank += 1
    print(rank, end=" ")