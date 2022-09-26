public class LoopsForWhile {

    public static void main(String[] args) {
        
    }

    String[] nomes = new String[] {"Filipe", "Poly", "Priscila", "Jonatas", "Miriam"};
    String[] sobrenomes = {"Souza", "Silva", "Martins", "Souza", "Trindade"};

    public void forLoop1() {
            for (int i=0; i<nomes.length; i++) {
                    System.out.println(nomes[i] + sobrenomes[i]);
            }
        }
    
    public void forLoop2() {
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
    
    public void whileLoop() {
    
        int a = 0;
        while (a < 10) {
            System.out.print(a);
            a++;
        }
    }

    public void whileLoop2() {
        int b = 0;
        do {
            System.out.print(b);
            b++;
        } while (b<10);
    }
    
}

