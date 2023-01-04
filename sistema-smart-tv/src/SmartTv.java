public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        //aumenta o volume em +1
        volume++;
        System.out.println("Aumentando o volume para " + volume);
    }

    public void diminuirVolume(){
        //diminui o volume em -1
        volume--;
        System.out.println("Diminuindo o volume para " + volume);
    }

    public void aumentarCanal(){
        //aumenta o canal em +1
        canal++;
        System.out.println("Mudou para o canal " + canal);
    }

    public void diminuirCanal(){
        //diminui o canal em -1
        canal--;
        System.out.println("Mudou para o canal " + canal);
    }

    public void mudarCanal(int novoCanal){
        //muda para um canal específico
        canal = novoCanal;
        System.out.println("Mudou para o canal " + canal);
    }
}
