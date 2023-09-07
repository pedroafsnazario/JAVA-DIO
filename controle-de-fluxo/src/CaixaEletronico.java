public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 30.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;

            System.out.println("Você retirou de sua conta " + valorSolicitado + " Reais.");
        }

        
        System.out.println("Agora tem " + saldo + " Reais de saldo na sua conta.");
    }
    
}
