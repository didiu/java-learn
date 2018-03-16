import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Drone {
    private String[][] planeArray;
    private int x = 0, y = 0, z = 0;
    private boolean flag;

    public static void main(String[] args) {
        Drone plane = new Drone();
        plane.planeRun();
    }

    public void planeRun() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter file location (absolute path)：");
        if (scan.hasNextLine()) {
            String fileName = scan.nextLine();
            String[][] read = this.ReadTxt(fileName);
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Please enter signal index：");
                if (scanner.hasNextInt()){
                    int ID = scanner.nextInt();
                    this.check(ID, read);
                }
                else {
                    System.out.println("Please enter int type");
                    break;
                }

            }
        }
        scan.close();
    }

    private String[][] ReadTxt(String fileName) {
        ArrayList array = new ArrayList();
        try {
            if (fileName.endsWith(".txt")){
                BufferedReader bf = new BufferedReader(new FileReader(fileName));
                String lineContent;
                while ((lineContent = bf.readLine()) != null) {
                    array.add(lineContent);
                }
                planeArray = new String[array.size()][7];
                for (int i = 0; i < array.size(); i++) {
                    String[] str = array.get(i).toString().split(" ");
                    for (int j = 0; j < str.length; j++) {
                        planeArray[i][j] = str[j];
                    }
                }
            }
            else {
                System.out.println("Please select file type like *.txt");
                System.exit(1);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return planeArray;
    }

    private int checkLength(String[][] array, int str) {
        int sum = 0;
        for (int i = 0; i < array[str].length; i++) {
            if (array[str][i] != null) {
                sum++;
            }
        }
        return sum;
    }

    private void check(int ID, String[][] save) {
        if (ID >=save.length) {
            System.out.println("Cannot find " + ID);
        } else {
            for (int i = 0; i <= ID; i++) {
                if (i == 0) {
                    if (this.checkLength(save, i) != 4&&flag) {
                        flag = false;
                    } else {
                        flag = true;
                        x = Integer.parseInt(save[0][1]);
                        y = Integer.parseInt(save[0][2]);
                        z = Integer.parseInt(save[0][3]);
                    }
                } else {
                    if (this.checkLength(save, i) != 7&&flag) {
                        flag = false;
                    } else if (flag&&Integer.parseInt(save[i][1]) == x &&
                                    Integer.parseInt(save[i][2]) == y &&
                                    Integer.parseInt(save[i][3]) == z) {
                                flag = true;
                                x = x + Integer.parseInt(save[i][4]);
                                y = y + Integer.parseInt(save[i][5]);
                                z = z + Integer.parseInt(save[i][6]);
                            }
                            else flag=false;
                }
                if (i == ID) {
                    if (flag) {
                        System.out.println(save[i][0] + " " + ID + " " + x + " " + y + " " + z);
                    } else {
                        System.out.println("Error: " + ID);
                    }
                }
            }
        }
    }
}