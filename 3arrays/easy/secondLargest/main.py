
class Solution:
    def getSecondLargest(self, arr):
        max = -99999999;
        secondMax = max;
        for i in arr:
            if i>max :
                max = i
                secondMax = max
            elif i>= secondMax:
                secondMax=i

        return secondMax 
