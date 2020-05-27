def avg(ip):
    print(ip)
    sum=0
    for i in range(len(ip)):
        sum=sum+int(ip[i])
    avg = sum/len(ip)
    return avg

ip = list(map(int,input("값들을 입력해주세요.").split()))
print("평균 : ",round(avg(ip),2))