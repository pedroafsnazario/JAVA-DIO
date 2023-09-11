public class ExemploForArray {
    public static void main(String[] args) {
        //Em arrays o indice inicia com 0!
        String alunos [] = {"Felipe", "Jonas", "Julia", "Marcos"};

        for (int x=0; x < alunos.length; x++){
            System.out.println("O Aluno no indice x = " + x + " é " + alunos[x]);
        }

        //exemplo em: For / each
        /*
         for (String aluno : alunos){
            System.out.prinln("Nome do Aluno é -> " + aluno);
         }
         */
    }
}
