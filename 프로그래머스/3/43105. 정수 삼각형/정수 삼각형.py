def solution(triangle):
    memory = [0]
    for i in range(len(triangle)):
        temp = [0] * (i + 1)
        last_idx = i
        for j in range(i + 1):
            # 처음
            if j == 0:
                temp[0] = memory[0] + triangle[i][j]
            elif j == last_idx:
                temp[-1] = memory[-1] + triangle[i][j]
            else:
                temp[j] += max(memory[j - 1] + triangle[i][j], memory[j] + triangle[i][j])
        memory =[i for i in temp]
    return max(memory)