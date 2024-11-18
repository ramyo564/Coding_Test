def solution(phone_book):
    dic = {}
    for num in phone_book:
        dic[num] = 1

    for nums in phone_book:
        arr = ""
        for num in nums:
            arr += num

            if arr in dic and arr != nums:
                return False
    return True