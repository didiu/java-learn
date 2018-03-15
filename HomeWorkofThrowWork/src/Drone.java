import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Drone {
        public ArrayList readTxt(){
            ArrayList list=new ArrayList();
            try {
                //System.out.println("请输入txt文件的绝对路径:");
                //Scanner scanner=new Scanner(System.in);
                //String pathName=scanner.nextLine();
                File filename=new File("C:\\Users\\v-guax\\Desktop\\New Text Document (2).txt");
                InputStreamReader reader=new InputStreamReader(
                        new FileInputStream(filename));
                BufferedReader br=new BufferedReader(reader);

                String line="";
                line=br.readLine();
                list.add(line);
                while(line!=null)
                {
                    line=br.readLine();
                    list.add(line);
                }
                br.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return list;
        }
}
