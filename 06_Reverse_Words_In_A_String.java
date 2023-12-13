class Solution {
    public String reverseWords(String s) {
        String words[] = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length-1;i>=0;i--)
        {
            if(words[i].isEmpty())
            continue;
            sb.append(words[i]+" ");
        }
    
        String str = sb.toString();
        return str.trim();
    }
}