class Solution {
    public String makeFancyString(String s) {
        if(s.length()<3) return s;
        // leeeet
        int i=0;
        int j=1;
        int k=2;
        StringBuilder ans = new StringBuilder();

        for(k=2;k<s.length();){
            if(k==s.length()-1){
            // add all
                if(s.charAt(i)== s.charAt(j) && s.charAt(j)== s.charAt(k)){
                    ans.append(s.charAt(i)+"");
                    ans.append(s.charAt(j)+"");
                }
            else{
                ans.append(s.charAt(i)+"");
                ans.append(s.charAt(j)+"");
                ans.append(s.charAt(k)+"");
            }
            break;

         }
            if(s.charAt(i)== s.charAt(j) && s.charAt(j)== s.charAt(k)){
                i++;
                j++;
                k++;
            }
            else{
                ans.append(s.charAt(i)+"");
                i++;
                j++;
                k++;
            }

        }
        return ans.toString();
    }
}