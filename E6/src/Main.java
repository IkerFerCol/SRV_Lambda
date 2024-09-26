import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main{
    public static void main(String[] args) {
        List<String> listanombres = new ArrayList<>();
        listanombres.add("Alvaro");
        listanombres.add("David");
        listanombres.add("Carlos");
        listanombres.add("Andres");

        Collections.sort(listanombres, (c1, c2) -> c1.charAt(1) - c2.charAt(1));
        System.out.println(listanombres);
    }
}