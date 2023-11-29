text=input()
pattern=input()
res=cnt1=cnt2=0
for c in text:
    if c==pattern[1]:
        res+=cnt1
        cnt2+=1
    if c==pattern[0]:
        cnt1+=1
print(res+max(cnt1,cnt2))
                                                                                                                            