import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListasVetoresMatrizes {

    public static void main(String[] args) {
        
    }

    public void array() {
        // ==============## ARRAY/VETOR ## ==================
        /*
        ARRAY - VETOR (SÓ ARMAZENA VALORES DO MESMO TIPO - TEM TAMANHO DEFINIDO NA CRIAÇÃO)
        Arranjo (array) é uma estrutura de dados: 
            • Homogênea (dados do mesmo tipo)
            • Ordenada (elementos acessados por meio de posições)
            • Alocada de uma vez só, em um bloco contíguo de memória
        Vantagens:
            • Acesso imediato aos elementos pela sua posição
        Desvantagens:
            • Tamanho fixo
            • Dificuldade para se realizar inserções e deleções
            */

            int[] idades = new int[5];
            idades[0] = 30;
            idades[1] = 32;
            
            String[] nomes = new String[] {"Filipe", "Poly", "Priscila", "Jonatas", "Miriam"};
            String[] sobrenomes = {"Souza", "Silva", "Martins", "Souza", "Trindade"};
            
            System.out.println(Arrays.toString(idades));
            System.out.println(Arrays.toString(nomes));
            System.out.println(Arrays.toString(sobrenomes));
        }

    public void listas() {
    // ==============## LISTAS ## ==================
    /*
        Lista é uma estrutura de dados:
            • Homogênea (dados do mesmo tipo)
            • Ordenada (elementos acessados por meio de posições)
            • Inicia vazia, e seus elementos são alocados sob demanda
            • Cada elemento ocupa um "nó" (ou nodo) da lista
        Tipo (interface): List
            • Classes que implementam: ArrayList, LinkedList, etc.
        Vantagens:
            • Tamanho variável
            • Facilidade para se realizar inserções e deleções
        Desvantagens:
            • Acesso sequencial aos elementos *
        */

        List<String> listaNomes = new ArrayList<>();
        
        listaNomes.add("Filipe");
        listaNomes.add("Jonatas");
        listaNomes.add("Miriam");
        listaNomes.add("Ana");
        listaNomes.add("Aylla");
        listaNomes.add(1, "Poly");
        listaNomes.add("Cachorro");
        listaNomes.add("Casa");
        listaNomes.add("Cachoeira");
        
        System.out.println(listaNomes.size());
        System.out.println(listaNomes);
        
        listaNomes.remove("Filipe");
        System.out.println(listaNomes);
        listaNomes.remove(0);
        System.out.println(listaNomes);
        
        listaNomes.removeIf(x -> x.charAt(0) == 'C');
        System.out.println(listaNomes);
        System.out.println("Index of Miriam: " + listaNomes.indexOf("Miriam"));
        System.out.println("Index of BANANA: " + listaNomes.indexOf("BANANA"));
        // RETNORNA -1 QUANDO NÃO ESTÁ NA LISTA
        
        //FILTRAR A LISTA:
        List<String> listaFiltrada = listaNomes.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        
        System.out.println(listaFiltrada);
    }

    public void matrizes() {
        /*
        Em programação, "matriz" é o nome dado a arranjos bidimensionais
            • Atenção: "vetor de vetores"
        Arranjo (array) é uma estrutura de dados: • Homogênea (dados do mesmo tipo)
            • Ordenada (elementos acessados por meio de posições)
            • Alocada de uma vez só, em um bloco contíguo de memória
        Vantagens:
            • Acesso imediato aos elementos pela sua posição
        Desvantagens:
            • Tamanho fixo
            • Dificuldade para se realizar inserções e deleções
         */


        Scanner sc = new Scanner(System.in);
        int n = 3;
        int m = 3;

		int[][] mat = new int[m][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
        sc.close();

    }

}
