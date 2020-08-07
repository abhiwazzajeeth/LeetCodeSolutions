class Solution {
    public boolean isPalindrome(String s) {
        String afterStripping = "";
        
        for(char c : s.toCharArray()) {
            if(Character.isDigit(c) || Character.isLetter(c)) {
                afterStripping += c;
            }
        }
        afterStripping = afterStripping.toLowerCase();
        
        int startPointer = 0;
        int endPointer = afterStripping.length() - 1;
        while(startPointer <= endPointer) {
            if(afterStripping.charAt(startPointer) != afterStripping.charAt(endPointer)) {
                return false;
            }
            startPointer++;
            endPointer--;
        }
        return true;
    }
}
