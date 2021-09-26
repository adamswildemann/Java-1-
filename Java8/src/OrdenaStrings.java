import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

    public static void main(String[] args) {


        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editorial");
        palavras.add("caelum");

        Comparator<String> comparador = new ComparadorPorTamanho();
        Collections.sort(palavras);
        System.out.println(palavras);

    }

    static Class ComparadorPorTamanho
}

 implements Comparator<String>{

    @Override
    public int compare(String, s1, String s2){
        if(s1.length() < s2.length())
            return -1;
        if(s1.length() > s2.length())
            return 1
        }

        }