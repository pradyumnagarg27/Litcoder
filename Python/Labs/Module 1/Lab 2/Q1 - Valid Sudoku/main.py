def v(b,num):
    def r(b,num):
        for i in b:
            n=set()
            for c in i:
                if c!=".":
                    if c in n:
                        return False
                    n.add(c)
        return True
    def c(b,num):
        for i in range(num):
            n=set()
            for j in range(num):
                c=b[j][i]
                if c!='.':
                    if c in n:
                        return False
                    n.add(c)
        return True
    def x(b,num):
        for i in range(0,9,3):
            for j in range(0,9,3):
                n=set()
                for k in range(i,i+3):
                    for l in range(j,j+3):
                        c=b[k][l]
                        if c!='.':
                            if c in n:
                                return False
                            n.add(c)
        return True
    return r(b,num) and c(b,num) and x(b,num)
n=int(input())
b=[]
for _ in range(n):
    r=input().split()
    b.append(r)
vld=v(b,n)
if vld==True:
    print("YES")
else:
    print("NO")
                                                                                                                            