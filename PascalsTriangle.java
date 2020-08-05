class Solution {
    public List<List<Integer>> generate(int numRows) {
        int i = 1;
        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(Arrays.asList(1));
        if(numRows == 0){
            return new ArrayList();
        }
        if(numRows == 1) {
            return outerList;
        }
        while(i < numRows) {
            List<Integer> innerList = new ArrayList();
            innerList.add(1);
            int j = 0;
            while(j < outerList.get(i - 1).size() - 1){
                innerList.add(outerList.get(i-1).get(j) + outerList.get(i-1).get(j + 1));
                j++;
            }
            innerList.add(1);
            outerList.add(innerList);
            i++;
        }
        
        return outerList;
    }
}
