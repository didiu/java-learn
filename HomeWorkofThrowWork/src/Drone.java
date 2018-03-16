import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Drone {
    public String[][] save;
    public static void main(String[]args){

    }

    private String[][] ReadTxt(){
        ArrayList array=new ArrayList();
        try{
            BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\v-guax\\Desktop\\plane.txt"));
            String lineContent;
            while((lineContent=bf.readLine())!=null) {
                array.add(lineContent);
            }
            save=new String[array.size()][7];
            for (int i = 0; i <array.size() ; i++) {
                String[] str= array.get(i).toString().split(" ");
                for (int j = 0; j <str.length ; j++) {
                    save[i][j]=str[j];
                }
            }

        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        for(int i=0;i<save.length;i++)
        {
            for(int j=0;j<save[i].length;j++){
                System.out.print(save[i][j]+' ');
            }
            System.out.println();
        }

        return save;
    }

    private void Done(){
        String[][] str=this.ReadTxt();
        Scanner scan=new Scanner(System.in);
        if (scan.hasNext()) {
            String str1 = scan.next();
            System.out.println("输入的数据为：" + str1);
        }
        scan.close();
    }

}
