import sys
def doSomething(inval):
    d=u=l=s=0
    for i in inval:
        if i.isdigit():
            d+=1
        elif i.isupper():
            u+=1
        elif i.islower():
            l+=1
        else:
            s+=1
    outval=(u,l,d,s)
    return outval
inputVal = input()    
o = doSomething(inputVal)
u=o[0]*100/(o[0]+o[1]+o[2]+o[3])
l=o[1]*100/(o[0]+o[1]+o[2]+o[3])
d=o[2]*100/(o[0]+o[1]+o[2]+o[3])
s=o[3]*100/(o[0]+o[1]+o[2]+o[3])
print(round(u,3),"% ",round(l,3),"% ",round(d,3),"% ",round(s,3),"%",sep="")
                                                                                                                            