class Solution {
    private static final Map<Character, String> map = new HashMap<>();
    static {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }
    public List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
        if(digits==null||digits.length()==0){
            return list;
        }
        backTrack(0,digits,new StringBuilder(),list);
        return list;    
    }
    private void backTrack(int index,String digits,StringBuilder sb,List<String> list){
        if(index==digits.length()){
            list.add(sb.toString());
            return ;
        }
        String first=map.get(digits.charAt(index));
         for (int i = 0; i < first.length(); i++) {
            sb.append(first.charAt(i));
            backTrack(index+1,digits,sb,list);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}
 