class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> count = new HashSet<String>();
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        
        for(int i = 0; i < words.length; i++) {
            StringBuilder string = new StringBuilder();
            for(int j = 0; j < words[i].length(); j++) {
                string.append(morse[words[i].charAt(j) - 'a']);
            }
            count.add(string.toString());
        }
        return count.size();
    }
}
