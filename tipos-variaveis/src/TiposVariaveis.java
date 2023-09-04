public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
     //Lógicos
     //permite criar expressões logicas maiores (boas para utilizar em condições e loops)
     // '&&' operador logico 'E'
     // '||' operador logico 'OU'

     boolean condicao1 = true;
     boolean condicao2 = true;

     if(condicao1 && condicao2){
        System.out.println("ambas condicoes são verdadeiras");
     }
     if(condicao1 && ( 7 > 4 )){
        System.out.println("o valor booleano e a relação são verdadeiras");
     }
     else if(condicao1 || condicao2){
        System.out.println("uma das condições é verdadeira");
     }
     else{
        System.out.println("nenhuma delas é verdadeira");
     }

     System.out.println("termino de execucao");


    }
}
