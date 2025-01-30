class Solution {
    public int value(char r){
        if(r=='I') return 1;
        if(r=='V') return 5;
        if(r == 'X') return 10;
        if(r == 'L') return 50;
        if(r == 'C') return 100;
        if(r == 'D') return 500;
        if(r == 'M') return 1000;
        return -1;
    }
    public int romanToInt(String s) {
        int sum =0;
        for(int i=0;i<s.length();i++){
            int s1 = value(s.charAt(i));
            if(i+1 < s.length() && s1 < value(s.charAt(i+1))){
                sum = sum-s1;
            }
            else{
                sum = sum+s1;
            }
    }
    return sum;
}
}
