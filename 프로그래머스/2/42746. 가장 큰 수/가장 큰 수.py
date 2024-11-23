def solution(numbers):
    # 숫자를 문자열로 변환
    temp = list(map(str, numbers))
    # 정렬: 두 숫자를 이어붙였을 때 큰 순서로 정렬
    temp.sort(key=lambda x: x*3, reverse=True)
    # 정렬 결과를 이어붙여 최종 답안 생성
    answer = ''.join(temp)
    # 모든 숫자가 0인 경우를 처리
    return answer if answer[0] != '0' else '0'

numbers = [3, 30, 34, 5, 9]
print(solution(numbers))  # "9534330"
