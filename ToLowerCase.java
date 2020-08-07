class Solution {
    public String toLowerCase(String str) {
        StringBuilder lowerCaseString = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 65 && str.charAt(i) <= 91){
                lowerCaseString.append((char)(97 + (str.charAt(i) - 65)));
            }
            else 
            lowerCaseString.append(str.charAt(i));
        }
        return lowerCaseString.toString();
    }
}
