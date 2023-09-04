public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        //Ternário '?' e ':'
        // forma resumida para definir uma condição e escolher por um dentre dois ou mais valores.
        // é como se fosse um 'IF/ELSE' simplificado
        // <Expressao Condicional> ? <Caso Condição seja true> : <Caso Condição seja falsa>.
        //pode ser usado com string, ints.. booleans..

        int a, b;
        

        a = 6;
        b = 6;
        
        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);

/* 
        if (a==b){
            resultado = "verdadeiro";
        }
        else {
            resultado = "falso";
        }
    System.out.println(resultado);
*/

    }
}
