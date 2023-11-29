s1=[]
s2=[]

def enqueue(item):
    s1.append(item)

def dequeue():
    if not s2:
        if not s1:
            return None
        while s1:
            s2.append(s1.pop())
    return s2.pop(0) if s2 else None

def peek():
    if not s2:
        if not s1:
            return None
        while s1:
            s2.append(s1.pop())
    return s2[0] if s2 else None

inp=input().split(",")
a=[]
for i in inp:
    x=i.split()
    a.append(x)
for i in a:
    if i[0]=='1':
        enqueue(i[1])
    elif i[0]=='2':
        dequeue()
    else:
        print(peek())
                                                                                                                            