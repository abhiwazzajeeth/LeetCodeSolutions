class Solution {
    public String reverseOnlyLetters(String S) {
        int start = 0;
        int end = S.length() - 1;
        StringBuilder result = new StringBuilder(S);
        
        while(start < end) {
            if(!isAlphabet(S.charAt(start))) {
                start++;
            }
            if(!isAlphabet(S.charAt(end))) {
                end--;
            }
            if(isAlphabet(S.charAt(start)) && isAlphabet(S.charAt(end))) {
                char temp = result.charAt(start);
                result.setCharAt(start, result.charAt(end));
                result.setCharAt(end,  temp);
                start++;
                end--;
            }
        }
        return result.toString();
    }
    
    public static boolean isAlphabet(char character) {
        if((character >= 97 && character <= 122) || (character >= 65 && character <= 90)) {
            return true;
        }
        return false;
    }
}
