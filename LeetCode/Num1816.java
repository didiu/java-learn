public class Num1816 {
    public String truncateSentence(String s, int k) {
        String[] str=s.split(" ");
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<k; i++){
            stringBuilder.append(str[i]);
        }
        return stringBuilder.toString();
    }
}
