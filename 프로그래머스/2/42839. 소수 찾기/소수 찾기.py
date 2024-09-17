from itertools import permutations


def check(num):
    if num < 2:
        return False
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return False

    return True


def solution(numbers):
    answer = 0
    j = set()
    for idx, _ in enumerate(numbers):
        for i in permutations(numbers, idx + 1):
            x = int(''.join(i))
            if check(x):
                j.add(x)
    return len(j)
