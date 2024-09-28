from collections import Counter

def solution(topping):
    # topping의 각 원소의 개수를 세는 카운터
    right_counter = Counter(topping)
    left_counter = set()
    
    cnt = 0
    
    for i in range(len(topping)):
        # i번째 토핑을 left_counter에 추가
        left_counter.add(topping[i])
        
        # i번째 토핑을 right_counter에서 하나 제거
        right_counter[topping[i]] -= 1
        if right_counter[topping[i]] == 0:
            del right_counter[topping[i]]
        
        # left와 right의 고유 토핑 개수가 같다면 카운트 증가
        if len(left_counter) == len(right_counter):
            cnt += 1
    
    return cnt
