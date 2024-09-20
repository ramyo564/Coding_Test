dic = {}


class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n == 1:
            return 1
        if n == 2:
            return 2

        if n not in dic:
            dic[n] = self.climbStairs(n - 1) + self.climbStairs(n - 2)

        return dic[n]
