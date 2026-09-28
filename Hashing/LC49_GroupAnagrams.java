class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      
        HashMap<String, List<String>> hash= new HashMap<>();

        for(int i=0; i<strs.length; i++){
            char[] arr= strs[i].toCharArray();
            Arrays.sort(arr);
            String sorted= new String(arr);
            if(hash.containsKey(sorted)){
                hash.get(sorted).add(strs[i]);
            }
            else{
                hash.put(sorted,new ArrayList());
                hash.get(sorted).add(strs[i]);
            }
        }

        return new ArrayList<>(hash.values());
        
    }
}