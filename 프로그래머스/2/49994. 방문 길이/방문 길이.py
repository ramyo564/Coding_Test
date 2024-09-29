def solution(dirs):


    dic = {
        "U": [-1, 0],
        "D": [1, 0],
        "R": [0, -1],
        "L": [0, 1],
    }
    coordinate_dic = {}
    x = 5
    y = 5
    cnt = 0
    for i in dirs:
        next_x = x + dic[i][1]
        next_y = y + dic[i][0]
        if -1 < next_x < 11 and -1 < next_y < 11:
            coordinate = ""
            temp_x_coordinate = sorted([next_x, x])
            for i in temp_x_coordinate:
                coordinate += str(i)
            temp_y_coordinate = sorted([next_y, y])
            for i in temp_y_coordinate:
                coordinate += str(i)

            if coordinate not in coordinate_dic:
                coordinate_dic[coordinate] = 1
                cnt += 1
                x = next_x
                y = next_y
            else:
                x = next_x
                y = next_y
    return cnt

