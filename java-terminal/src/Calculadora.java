public class Calculadora {

    int valorUm;

    int valorDois;

    

    public void somar(int valorUm, int valorDois){

        int soma = valorUm + valorDois;
        System.out.println("Resultado: " + soma);
     
    }

    public void subtrair(int valorUm, int valorDois){

        int subtracao = valorUm - valorDois;
        System.out.println("Resultado: " + subtracao);
    }

    public void dividir(int valorUm, int valorDois){
        double divisao = valorUm / valorDois;
        System.out.println("Resultado: " + divisao);
    }

    public void multiplicar(int valorUm, int valorDois){
        int multiplicacao = valorUm * valorDois;
        System.out.println("Resultado: " + multiplicacao);
    }

    public void comparar(int valorUm, int valorDois){
        if (valorUm > valorDois){
            System.out.println(valorUm + " é maior que " + valorDois);
        }
        else if (valorUm < valorDois){
            System.out.println(valorUm + " é menor que " + valorDois);
        }
        else {
            System.out.println("Ambos valores são iguais!");
        }
    }

    
}
