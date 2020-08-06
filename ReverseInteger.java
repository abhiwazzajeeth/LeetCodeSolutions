class Solution {
    public boolean isPalindrome(int x) {
        if(x == 0) {
            return true;
        }
        if(x < 0 || x % 10 == 0){
            return false;
        }

        int newNumber = 0;
        while(x > newNumber){
            int rem = x % 10;
            newNumber = newNumber * 10 + rem;
            x = x / 10;
        }
        if(newNumber == x || newNumber/10 == x){
            return true;
        }
        return false;
    }
}
