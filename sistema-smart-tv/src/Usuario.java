public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        
        //System.out.println("A Tv está: " + smartTv.ligada);
        System.out.println("A Tv está no canal: " + smartTv.canal);
        System.out.println("A Tv está com o volume em: " + smartTv.volume);
        

        smartTv.ligar();
        //System.out.println("A Tv está: " + smartTv.ligada);

        smartTv.desligar();
        //System.out.println("A Tv está: " + smartTv.ligada);

        smartTv.mudarCanal(50);

        smartTv.subirCanal();



    }
}
