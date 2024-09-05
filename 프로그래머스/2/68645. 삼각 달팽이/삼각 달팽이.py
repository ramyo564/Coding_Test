from collections import deque

def solution(n):
    # 1. 삼각형 모양의 배열 생성
    arr = [[0] * i for i in range(1, n + 1)]

    # 2. BFS에 사용할 방향(아래, 오른쪽, 왼쪽 위)
    dirs = [(1, 0), (0, 1), (-1, -1)]

    # 3. 초기 상태 설정
    y, x = 0, 0  # 시작 좌표
    cur_num = 1  # 시작 숫자
    turn = 0     # 방향을 돌려줄 인덱스
    total_num = sum(range(1, n + 1))  # 삼각형 내부에 들어갈 숫자의 총 개수

    # 4. BFS 시작
    queue = deque([(y, x)])
    arr[y][x] = cur_num

    while cur_num < total_num:
        cur_y, cur_x = queue.popleft()

        # 현재 방향에 따라 다음 좌표 계산
        next_y = cur_y + dirs[turn][0]
        next_x = cur_x + dirs[turn][1]

        # 다음 좌표가 유효하고 값이 0인 경우에만 이동
        if 0 <= next_y < n and 0 <= next_x < len(arr[next_y]) and arr[next_y][next_x] == 0:
            cur_num += 1
            arr[next_y][next_x] = cur_num
            queue.append((next_y, next_x))
        else:
            # 범위를 벗어나거나 이미 값이 차있는 경우 방향 전환
            turn = (turn + 1) % 3
            next_y = cur_y + dirs[turn][0]
            next_x = cur_x + dirs[turn][1]
            
            # 새로운 방향으로 다시 이동
            cur_num += 1
            arr[next_y][next_x] = cur_num
            queue.append((next_y, next_x))

    # 5. 최종 배열의 값을 일차원 배열로 변환
    result = []
    for row in arr:
        result.extend(row)
    
    return result
