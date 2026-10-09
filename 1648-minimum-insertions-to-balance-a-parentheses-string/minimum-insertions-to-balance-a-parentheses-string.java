class Solution {
    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int need = 0, result = 0;
        for(int i=0; i<s.length();i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                if(need % 2 != 0) {
                    need--;
                    result++;
                }
                need += 2;
            } else {
                need --;
                if(need < 0) {
                    result++;
                    need = 1;
                }
            }
        }
        return need + result;
    }
}