package Alberano;

public class Q12 {

        public String sortString(String s) {
            int[] nums=new int[26];

            for(char c:s.toCharArray()){
                nums[c-'a']++;
            }

            StringBuilder output=new StringBuilder();
            while(output.length()<s.length()){
                for(int i=0;i<26;i++){
                    if(nums[i]!=0){
                        output.append((char)(i+'a'));
                        nums[i]--;
                    }
                }
                for(int i=25;i>=0;i--){
                    if(nums[i]!=0){
                        output.append((char)(i+'a'));
                        nums[i]--;
                    }
                }
            }
            return output.toString();
        }
        public static void main(String args[]){
            Q12 q=new Q12();
            System.out.println(q.sortString("leetcode"));
        }
    }

