def solution(arr):
    list = []
    for i in arr:
        if len(list) == 0:
            list.append(i)
        elif list[-1] == i:
            continue
        else:
            list.append(i)

    return list
