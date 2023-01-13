package lang;

import java.awt.*;
import java.lang.reflect.Field;
import java.util.ArrayList;

public final class Interpolation {
    public static void main(String[] args) {
        System.out.println(interpolation());
    }

    //TODO: output: "I am eight years old"
    public static String interpolation() {
        return "I am @age years old";
    }

    private final ArrayList<String> list = new ArrayList<>();
    private final ArrayList<String> listPar = new ArrayList<>();

    private void replace() {
        for (String target : interpolation().split("\\s+"))
            if (target.matches("@(.*)"))
                list.add(target);

//        for (String listArr : list)
//            for (String listEnd : listPar)
//                if ()
//                    System.out.println(interpolation().replace(listArr, listEnd.));
    }
}
