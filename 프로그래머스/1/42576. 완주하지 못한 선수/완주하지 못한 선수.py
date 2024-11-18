def solution(participant, completion):
    participant.sort()
    completion.sort()
    n = len(participant)
    for i in range(n - 1):
        if completion[i] != participant[i]:
            return participant[i]

    return participant[n - 1]
