//problem Link:-  https://leetcode.com/problems/robot-return-to-origin/

class Solution {
    public boolean judgeCircle(String moves) {
        String[] commands = moves.split("");
        int row = 0;
        int col = 0;
        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals("U")) {
                col++;
            } else if (commands[i].equals("D")) {
                col--;
            } else if (commands[i].equals("R")) {
                row++;
            } else {
                row--;
            }
        }
        if (row == 0 && col == 0) {
            return true;
        }
        return false;
    }
}