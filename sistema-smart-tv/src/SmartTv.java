public class SmartTv {
    boolean ligada = false;

    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
        System.out.println("LIGADA");
    }
    public void desligar(){
        ligada = false;
        System.out.println("DESLIGADA");
    }


    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal selecionado para: " + novoCanal);
    }
    public void subirCanal(){
        canal++;
        System.out.println("Canal selecionado para: " + canal);
    }
    public void descerCanal(){
        canal--;
        System.out.println("Canal selecionado para: " + canal);
    }



}
