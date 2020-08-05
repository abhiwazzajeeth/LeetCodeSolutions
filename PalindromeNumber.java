class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int number = x;
        int newNumber = 0;
        while(x > number){
            int rem = number % 10;
            newNumber = newNumber * 10 + rem;
            number = number / 10;
        }
        if(newNumber == x || newNumber == x/10){
            return true;
        }
        return false;
    }
}
