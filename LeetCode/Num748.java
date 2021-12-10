public class Num748 {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] arr=new int[26];
        for(int i=0;i<licensePlate.length();i++){
            char c=licensePlate.charAt(i);
            if('a'<=c&&c<='z') arr[c-'a']++;
            if('A'<=c&&c<='Z') arr[c-'A']++;
        }
        int ans=-1;
        for(int i=0; i<words.length; i++){
            int[] wordz=new int[26];
            for(int j=0;j<words[i].length();j++){
                char c=words[i].charAt(j);
                wordz[c-'a']++;
            }
            boolean flag=true;
            for(int j=0;j<26;j++){
                if(arr[j]>wordz[j]){
                    flag=false;
                    break;
                }
            }
            if(flag&&(ans<0||words[i].length()<words[ans].length())){
                ans=i;
            }

        }
        return words[ans];
    }
}
