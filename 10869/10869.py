# 첫번째 풀이
A,B = intput().split()
a = int(A)
b = int(B)

print(a+b)
print(a-b)
print(a*b)
print(int(a/b))
#print(a//b)
print(a%b)

# 두번째 풀이
a,b = map(int, input().split())
print("%d\n%d\n%d\n%d\n%d"%(a+b, a-b, a*b, a/b, a%b))