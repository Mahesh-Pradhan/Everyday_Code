# 28. Find the Index of the First Occurrence in a String

def strStr(haystack,needle):
    if haystack == "":
        return 0
    for i in range(len(haystack)+1-len(needle)):

        for j in range(len(needle)):

            if haystack[i+j]!=needle[j]:
                break

            if j==len(needle)-1:
                return i
        return -1

# the above code is not accepted by leetcode due time exceed limitation

def haystack_2(haystack, needle=str):
    if needle=="":
        return 0
    for i in range(len(haystack)+1-len(needle)):
        if haystack[i:i+len(needle)]==needle:
            return i
    return -1
