# 1929. Concatenation of Array

def getConcatenate(nums):
    for i in range(len(nums)):
        nums.append(nums[i])
    return nums