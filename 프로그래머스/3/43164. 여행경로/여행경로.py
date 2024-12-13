from collections import deque


def solution(tickets):
    answer = []
    q = deque()
    q.append((["ICN"], []))

    while q:
        path, used = q.popleft()

        if len(used) == len(tickets):
            answer.append(path)

        for idx, ticket in enumerate(tickets):
            depart, arrived = ticket
            x = path[-1]
            if depart == x and not idx in used:
                q.append((path +[arrived], used + [idx]))

    answer.sort()

    return answer[0]
