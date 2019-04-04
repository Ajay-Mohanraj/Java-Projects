package unit10.lessons;

import java.util.ArrayList;

public class Day06_ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jared");
        list.add("Kyle");
        list.add(1, "Sasha");
        list.add(1, "Zachary");
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        list.remove("Kyle");
        list.remove(1);

        for (String s : list){
            System.out.println(s);
        }

    }
}
