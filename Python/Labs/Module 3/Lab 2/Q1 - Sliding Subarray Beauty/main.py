def gsb(arr,k,n):
    result=[]
    for i in range(len(arr)-k+1):
        subarray=arr[i:i+k]
        subarray.sort()
        result.append(subarray[n-1])
    return result

oldnums=input().split()
nums=[]
for i in oldnums:
    nums.append(int(i))
k=int(input())
x=int(input())
ans=gsb(nums,k,x)
for i in range(len(ans)-1):
    print(ans[i],end=" ")
print(ans[-1])
                                                                                                                            