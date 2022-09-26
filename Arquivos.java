import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Arquivos {

    public static void main(String[] args) {
        
        

    }


    public void modoFile () {  // BÁCISO
        File file = new File("arquivo_teste.txt");

        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
            
        }
    }


    public void modoBuffered() { // MAIS RÁPIDO E COM GERENCIADO DE CONTEXTO
        String file_path = "./arquivo_teste.txt"; 


        try (BufferedReader br = new BufferedReader(new FileReader(file_path))) {  // GERENCIADOR DE CONTEXTO

            String line = br.readLine();
            
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public void modoEscreverBuffered () {
        String[] textos = new String[] {"Good morning", "Good Afternoon", "Good night"};
        String file_path = "./arquivo_teste_escrita.txt"; 

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file_path))) { // para acrescentar texto no arquivo e não recriar, colocar parâmetro "true" no FileWireter.
            for (String texto : textos) {
                bw.write(texto);
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
