import java.util.Arrays;

public class Strings {

    public static void main(String[] args) {
        
    }
    
    public void strings() {
            String texto = "     FILipe de SOUza Martins    testE   AVG    ";
            texto = texto.toLowerCase();
            System.out.println(texto);
            texto = texto.toUpperCase();
            System.out.println(texto);
            texto = texto.trim();
            System.out.println(texto);
            texto = texto.substring(5);
            System.out.println(texto);
            texto = texto.substring(2, 25);
            System.out.println(texto);
            texto = texto.replace('A', '9');
            System.out.println(texto);
            
            int index = texto.indexOf('S');
            System.out.println(index);
            int index2 = texto.lastIndexOf('S');
            System.out.println(index2);
            
            texto = "     FILipe de SOUza Martins    testE   AVG    ";
            String[] lista = texto.split(" ");
            System.out.println(Arrays.toString(lista));
    
        }

    public void operarLetras () {
        System.out.println('d' > 'c');
        System.out.println('b' - 'a');
        System.out.println('d' - 'a');
        System.out.println('f' - 'a');
    }
}
