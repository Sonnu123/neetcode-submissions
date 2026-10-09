class Solution {

    public String longestPalindrome(String s) {

        char[] c = s.toCharArray();

        String t = "";

        for(int i = 0; i<c.length; i++){

            for(int k = i; k<c.length; k++){

                int o = i;
                int b = k;

                String r = s.substring(i,k+1);

                boolean palindrome = true;

                while(o <= b){

                    if(c[o] != c[b]){
                        palindrome = false;
                        break;
                    }

                    o++;
                    b--;
                }

                if(palindrome){   

                    if(t.length() < r.length()){
                        t = r;
                    }
                }
            }
        }

        return t;
    }
}