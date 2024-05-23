class CountVowels{
    public long countVowels(String s) {
        long out = 0;
        Set<Character> vow = new HashSet<>();
        vow.add('a');
        vow.add('e');
        vow.add('i');
        vow.add('o');
        vow.add('u');
        long len = s.length();

        for(int i=0; i<len; i++){
            
            char ch = s.charAt(i);
            if(vow.contains(ch)){
                out += (i+1)*(len-i);
            }
        }
        return out;
    }
}
