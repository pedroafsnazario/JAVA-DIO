import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;
//controle de eros (exceções)


public class AboutMe {
    public static void main(String[] args) {
        //tratamento de exceções!
        try{
        //criando o obj Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //Inserção de valores
        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite sua Idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        //Imprimindo os dados obtidos pelo usuário
        System.out.println("Olá me chamo " + nome.toUpperCase() + " " +sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + " cm ");
        }
        catch (InputMismatchException e){
            System.err.println("Os campos Idade e Altura precisam ser númericos!");
        }

    }
}
