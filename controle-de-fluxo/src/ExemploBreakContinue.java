public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero ++){
            if (numero == 3){
                //break; -> encerra o proceso do código. imprimindo apenas o valor 1 e 2
                // continue; -> continua com o processo porém não irá imprimir o valor 3. Pois mudou o fluxo.
                continue;
            }
            System.out.println(numero);
        }
    }
}
