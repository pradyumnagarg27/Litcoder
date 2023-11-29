def addToTree(tree,word):
    if len(word)==0:
        return tree
    l=word[0]
    if l in tree:
        tree[l]=addToTree(tree[l],word[1:])
    else:
        tree[l]=addToTree(dict(),word[1:])
    return tree
    
def checkInTree(tree,word):
    if len(tree)==0:
        return True
    if len(word)==0:
        return True
    l=word[0]
    if l not in tree:
        return False
    return checkInTree(tree[l],word[1:])

words=input().split()
tree=dict()
inTree=False
p="GOOD PASSWORD"
for w in words:
    if len(tree)!=0:
        inTree=checkInTree(tree,w)
    if inTree:
        p="BAD PASSWORD"
        break
    tree=addToTree(tree,w)
print(p)
                                                                                                                            