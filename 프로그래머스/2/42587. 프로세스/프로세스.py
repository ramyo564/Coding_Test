from collections import deque


def solution(priorities, location):
    queue = deque()
    for idx, value in enumerate(priorities):
        queue.append([value, idx])

    priorities.sort()
    cnt = 0
    while queue:
        if priorities[-1] == queue[0][0]:
            cnt += 1
            priorities.pop()
            temp = queue.popleft()

            if location == temp[1]:
                return cnt
        else:
            queue.append(queue.popleft())