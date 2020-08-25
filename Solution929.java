class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> count = new HashSet<String>();
        
        for(int i = 0; i < emails.length; i++) {
            
            String[] temp = emails[i].split("(?=@)");
            StringBuilder temp0 = new StringBuilder();
            
            for(int j = 0; j < temp[0].length(); j++) {
                if(temp[0].charAt(j) == '.') {
                    continue;
                } 
                if(temp[0].charAt(j) == '+') {
                    break;
                }
                temp0.append(temp[0].charAt(j));
            }
            temp0.append(temp[1]);
            System.out.println(temp0);
            count.add(temp0.toString());
        }
        return count.size();
    }
}
