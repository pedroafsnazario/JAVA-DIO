public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
     //Relacionais
     //avaliam relação entre duas variaveis ou expressoes
     //definem se o operando à esquerda é igual, diferente, menor, menor ou igual, etc.
     //retornam um valor booleano como resultado
     // '==' IGUAL '!=' DIFERENÇA
     // '>' maior '>=' maior ou igual
     // '<' menor '<=' menor ou igual
     // é possivel usar esses operadoes em condições e loops até no Sout's porém tem que fazer com cautela :]
     //existe também a operação 'equals' boa para texto e strings e objetos -> 
     //System.out.println(string1.equals(string2)); a resposta é boolean.

     int numero1 = 1;
     int numero2 = 2;

     boolean simNao = numero1 == numero2;

     System.out.println("numero1 é igual a numero2? " + simNao);

     simNao = numero1 != numero2;

     System.out.println("numero1 é diferente a numero2? " + simNao);

     simNao = numero1 < numero2;

     System.out.println("numero1 é menor que numero2? " + simNao);

    }
}
