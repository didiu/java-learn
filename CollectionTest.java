import java.util.*;

public class CollectionTest {
    public static void main(String[] args){
        List<String> list=new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add(" I'am guangtu");
        for (String str : list) {
            System.out.println(str);
        }

        String[] strArray=new String[list.size()];
        list.toArray(strArray);
        for(String str:strArray)
        {
            System.out.println(str);
        }
        Iterator<String> ite=list.iterator();
        while(ite.hasNext())
        {
            System.out.println(ite.next());
        }
        Map<String,String> map=new HashMap<String,String>();
        map.put("1","value1");
    }
}
