import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * hello
 */
public class hello {

    //Locale.setDefault(Locale.US);

    String[] nomes = new String[] {"Filipe", "Poly", "Priscila", "Jonatas", "Miriam"};
    String[] sobrenomes = {"Souza", "Silva", "Martins", "Souza", "Trindade"};

    public void declaraVariaveis() {

    int acb = 1, cde = 2, fgh = 3;
    System.out.println(acb+cde+fgh);


        // ==============## Wrapper classes ## ==================
    // São classes equivalentes aos tipos primitivos
    // String Double Integer Boolean Character Byte Short Float

    // =====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====

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
    }

    public void listas() {

        
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

    // =====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====
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
                
        System.out.println(Arrays.toString(idades));
        System.out.println(Arrays.toString(nomes));
        System.out.println(Arrays.toString(sobrenomes));
    // =====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====
    }
    
    public void forLoop1() {
    // ==============## LOOP COM FOR ## ==================
        for (int i=0; i<nomes.length; i++) {
                System.out.println(nomes[i] + sobrenomes[i]);
        }
    }

    public void forLoop2() {
        for (String nome : nomes) {
            System.out.println(nome);
        }
    // =====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====
    }
 
    public void whileLoop() {
    // ==============## LOOP COM WHILE ## ==================
    
        int a = 0;
        while (a < 10) {
            System.out.print(a);
            a++;
        }
    // =====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====
    }

    public void whileLoop2() {
    // ==============## LOOP COM DO WHILE ## ==================
        int b = 0;
        do {
            System.out.print(b);
            b++;
        } while (b<10);
    // =====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====
    }
    
    public void operadorTernario() {
    // ==============## OPERADOR TERNÁRIO ## ==================
        int n = 10;
        String resposta = (n > 20) ? "Sim" : "Não";
        System.out.println(resposta);

        double preco = 34.50;
        double desc = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.println(desc);
    // =====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====
    }
    
    public void ifEElse() {
    // ==============## IF ELSE ## ==================
        double price = 34.50;
        double desconto;
        if (price < 20.0) {
            desconto = price * 0.1;
        }
        else {
            desconto = price * 0.05;
        }
        System.out.println(desconto);
    // =====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====
    }
    
    public void switchCase() {
    // ==============## SWITCH CASE ## ==================
    
        String veiculo = "Carreta";

        switch (veiculo) {
            case "Carro":
                System.out.println("É Carro");
                break;
            case "Onibus":
                System.out.println("É Onibus");
                break;
            case "Carreta":
                System.out.println("É Carreta");
                break;
            case "Van":
                System.out.println("É Van");
                break;
            case "Escolar":
                System.out.println("É Escolar");
                break;
            case "Caminhonete":
                System.out.println("É Caminhonete");
                break;
            default:
                System.out.println("Outro Veiculo");

        }
    // =====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====
    }

    public void scanner(){
    // ==============## INPUT ## ==================
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        int idade = sc.nextInt();
        double altura = sc.nextDouble();
        sc.close();
        System.out.printf("%s %d %f",nome, idade, altura);

     // =====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====
    }
    
    public void numerosRandom() {
     // ==============## NUMEROS ALEATÓRIOS ## ==================
        Random number = new Random();
        int n2 = number.nextInt(100); // Gera um número de 0 a 99 aleatoriamente
        int n3 = number.nextInt(2); // Gera um número de 0 a 1 aleatoriamente
        System.out.println(n2);
        System.out.println(n3);
    // =====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====#=====
    }

    public void strings() {
    // ==============## STRINGS ## ==================
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

    public void datas () {

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

		LocalDate d10 = LocalDate.of(2022, 07, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);
		
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
        

        		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + fmt1.format(d04));
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d05 = " + d05.format(fmt4));

		System.out.println("d06 = " + fmt3.format(d06));
		System.out.println("d06 = " + fmt5.format(d06));
		System.out.println("d06 = " + d06.toString());


        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);

		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mês = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());

		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 minutos = " + d05.getMinute());

        //CÁLCULOS COM DATA-HORA
	
		LocalDate pastWeekDate = d04.minusDays(7);
		LocalDate nextWeekDate = d04.plusDays(7);
		
		LocalDateTime pastWeekLocalDate = d05.minusDays(7);
		LocalDateTime nextWeekLocalDate = d05.plusDays(7);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekDate = " + pastWeekDate);
		System.out.println("nextWeekDate = " + nextWeekDate);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDate, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);

		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
        
    }

}