ops=input().split(',')
s=[]
history=[]
for op in ops:
    if op[0]=='1':
        history=s
        s.extend(op[2:])
    elif op[0]=='2':
        history=s
        k=int(op[2])
        del s[-k:]
    elif op[0]=='3':
        history=s
        k=int(op[2])
        print(s[k-1])
    elif op[0]=='4':
        s=history
        