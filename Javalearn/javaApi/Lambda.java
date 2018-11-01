package javaApi;

import java.util.Arrays;
import java.util.List;

public class Lambda {
    public void lambda(){
        String[] str={
                "Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"
        };
        List<String> players= Arrays.asList(str);

        for (String player:players){
             System.out.println(player);
        }

        players.forEach((player)->System.out.println(player));

        players.forEach(System.out::println);

        MathOperation addition=()

        System.out.println();

    }
    interface MathOperation{
        int operation(int a,int b);
    }
}
