from itertools import permutations


def solution(numbers):
    set_list = set()

    def check(num):
        if num == 2:
            return True
        if num < 2:
            return False

        for i in range(2, int(num ** 0.5)+1):
            if num % i == 0:
                return False
        return True

    for i in range(len(numbers)):
        for p in permutations(numbers, i + 1):
            if check(int(''.join(p))):
                set_list.add(int(''.join(p)))

    return len(set_list)
