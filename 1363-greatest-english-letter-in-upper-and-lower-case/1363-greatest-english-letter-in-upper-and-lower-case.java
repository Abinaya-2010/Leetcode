class Solution {
    public String greatestLetter(String s) {
        Set<Character> lu = new HashSet<>();
        TreeMap<Character,Boolean> tr = new TreeMap<>();
        for(char a:s.toCharArray()){
                lu.add(a);
        }
        for(char a:lu){
            if(Character.isLowerCase(a)){
                char b = Character.toUpperCase(a);
                for(char c:lu){
                    if(b == c){
                        tr.put(b,true);
                    }
                }
            }
            else{
                 char b = Character.toLowerCase(a);
                for(char c:lu){
                    if(b == c){
                        tr.put(a,true);
                    }
                }
            }
        }
    if(tr.isEmpty()){
        return "";
    }
        return String.valueOf(tr.lastEntry().getKey());
    }
}