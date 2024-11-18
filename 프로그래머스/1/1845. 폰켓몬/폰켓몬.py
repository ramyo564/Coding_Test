def solution(nums):
    nums_set = set(nums)
    n = int(len(nums) / 2)
    if len(nums_set) == n:
        return n
    elif len(nums_set) < n:
        return len(nums_set)
    else:
        return n