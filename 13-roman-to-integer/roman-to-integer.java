class Solution {
    public int romanToInt(String s) {
        int num = 0;
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'I' && (i+1) < s.length() && s.charAt(i+1) == 'V') {
                i++;
                num += 4;
            }
            else if(ch == 'I' && (i+1) < s.length() && s.charAt(i+1) == 'X') {
                i++;
                num += 9;
            }
            else if(ch == 'X' && (i+1) < s.length() && s.charAt(i+1) == 'L') {
                i++;
                num += 40;
            }
            else if(ch == 'X' && (i+1) < s.length() && s.charAt(i+1) == 'C') {
                i++;
                num += 90;
            }
            else if(ch == 'C' && (i+1) < s.length() && s.charAt(i+1) == 'D') {
                i++;
                num += 400;
            }
            else if(ch == 'C' && (i+1) < s.length() && s.charAt(i+1) == 'M') {
                i++;
                num += 900;
            }
            else if(ch == 'I')  num+=1;
            else if(ch == 'V') num+=5;
            else if(ch == 'X') num+= 10;
            else if(ch == 'L') num+= 50;
            else if(ch == 'C') num += 100;
            else if(ch == 'D') num += 500;
            else if(ch == 'M') num += 1000;
        }
    return num;
    }
}