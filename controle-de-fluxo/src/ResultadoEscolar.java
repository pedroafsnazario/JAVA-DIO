public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 8;
        //condição ternária
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);


        //condição composta/encadeada
        /* 
        if(nota >= 7){
            System.out.println("Aprovado");
        }
        else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        }
        else {
            System.out.println("Reprovado");
        }
        */
    }
}
