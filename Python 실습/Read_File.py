'''
with open("i_have_a_dream.txt","r") as my_file:
    contents = my_file.read()
    print(type(contents),contents)

with open("i_have_a_dream.txt","r") as my_file:
    content_list = my_file.readlines()
    print(type(content_list))
    print(content_list)

'''

with open("i_have_a_dream.txt","r") as my_file:
    i=0
    while True:
        line = my_file.readline()
        if line.strip() != "":
            print(str(i) + "===" +line.strip())
        if not line:
            break
        i = i+1
    
with open("i_have_a_dream.txt","r") as my_file:
    line = my_file.read()
    lines = my_file.readline()
    cnt_a=0 #단어 수 세기
    cnt_b=len(line) #글자 수 세기
    cnt_c=0#라인 수 세기
    for i in line:
        if i == ' ':
            cnt_a +=1
    for i in lines:
        if lines.strip() != "":
            cnt_c+=1

    print("단어수 : ",cnt_a)
    print("글자수 : ",cnt_b)
    print("라인수 : ",cnt_c)
