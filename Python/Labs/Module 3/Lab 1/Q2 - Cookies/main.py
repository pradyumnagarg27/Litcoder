tar=int(input())
arr=input().split()
a=[]
count=0
for i in arr:
    a.append(int(i))
for i in range(0,len(a)-1):
    ch=[]
    for j in a:
        if j>tar:
            ch.append(True)
        else:
            ch.append(False)
    if False in ch:
        a.sort()
        ele=a[0]+2*a[1]
        a.pop(0)
        a.pop(0)
        a.insert(0,ele)
        count+=1
    else:
        break
print(count)
                                                                                                                            