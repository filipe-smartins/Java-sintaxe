public class CondicionaisIfOpTernarioSwithCase {
    
    public static void main(String[] args) {
        
    }

    
    
    public void operadorTernario() {

            int n = 10;
            String resposta = (n > 20) ? "Sim" : "Não";
            System.out.println(resposta);
    
            double preco = 34.50;
            double desc = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
            System.out.println(desc);

        }
        
    public void ifEElse() {

        double price = 34.50;
        double desconto;
        if (price < 20.0) {
            desconto = price * 0.1;
        }
        else {
            desconto = price * 0.05;
        }
        System.out.println(desconto);
    }
    
    public void switchCase() {
    
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
    }
}
