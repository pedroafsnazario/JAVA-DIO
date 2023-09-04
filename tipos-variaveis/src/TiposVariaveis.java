public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        double salarioMinimo = 2500.33;
        //float precisa ter um 'f'ou'F' no final do valor.
        //o mesmo se vale pro long (L).
        //Importante: Java é fortemente "tipado". exemplo:
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        //short numeroCurto2 = numeroNormal; //nao funciona pois short nao aceita int! apesar de ser 1 o valor é recusado


    }
}
