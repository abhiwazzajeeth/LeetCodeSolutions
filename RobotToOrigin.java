class Solution {
    public boolean judgeCircle(String moves) {
        int vertical = 0;
        int horizontal = 0;
        int sum = 0;
        for(char c : moves.toCharArray()) {
            if(c == 'R') {
                horizontal += 1;
            }
            if(c == 'L') {
                horizontal -= 1;
            }
            if(c == 'U') {
                vertical += 2;
            }
            if(c == 'D') {
                vertical -= 2;
            }
        }
        return horizontal == 0 && vertical == 0;
    }
}
