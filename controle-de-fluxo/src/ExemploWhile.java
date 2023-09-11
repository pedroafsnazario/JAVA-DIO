import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        /*
        Joazinho recebeu 50R$ de mesada e foi a uma loja de doces gastar todo seu dinheiro.
        Enquanto o valor de sua compra não se igualar a sua mesada, joazinho continuara a adicionar mais doces
        em sua compra.
        */

        double mesada = 50.0;

        while (mesada > 0){
            Double valorDoce = valorAleatorio();
            //o if e para deixar a mesada com um valor exato a fim de evitar valores negativos na mesada.
            if (valorDoce > mesada){
                valorDoce = mesada ;
            }

            System.out.println("Doce do valor: " + valorDoce + " Adcionado no carrinho");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joazinho gastou toda sua mesada em doces.");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
