'''

'''


def fibo(n):
    a = [0,1,1]
    i=1
    while(a[i]+a[i+1]<=n):
        sum = a[i]+a[i+1]
        a.append(sum)
        i=i+1
    return a

n = int(input("값을 입력해주세요."))
print(fibo(n))
