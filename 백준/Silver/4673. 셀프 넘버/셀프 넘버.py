generated_num = set()
target_num = set()
for i in range(1, 10001):
    num = str(i)
    for n in num:
        i += int(n)
    generated_num.add(i)

for i in range(1, 10001):
    target_num.add(i)

answer = sorted(target_num - generated_num)
for i in answer:
    print(i)