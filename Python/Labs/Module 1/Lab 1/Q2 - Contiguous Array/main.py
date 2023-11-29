import sys
def doSomething(inval):
    count=0
    outval=0
    dict_seen={0:-1}
    for i in range(len(inval)):
        n=inval[i]
        if n==0:
            count-=1
        if n==1:
            count+=1
        if count in dict_seen:
            outval=max(outval,i-dict_seen[count])
        else:
            dict_seen[count]=i
    return outval
inputVal = input()    
newlist=inputVal.split(" ")
outputVal = doSomething(newlist)
print (outputVal)
                                                                                                                            