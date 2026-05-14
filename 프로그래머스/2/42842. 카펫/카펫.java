class Solution {
    public int[] solution(int brown, int yellow) {
       int result = brown + yellow;
       double squareRoot = Math.sqrt(result);
 
            for (int width = (int) squareRoot; width >= 1; width--) {
                if (result % width == 0) {
                    int height = result / width;
                    if ((width - 2) * (height - 2) == yellow) {
                        return new int[]{height, width};
                    }
                }
            }
        return null;
    }
    
}
