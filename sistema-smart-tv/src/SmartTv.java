public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando a volume para: " + volume);
        //volume = volume + 1;        
    }

    public void diminuirVolume(){
        //volume = volume - 1;
        volume--;
        System.out.println("Diminuindo a volume para: " + volume);
    }

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }

}




/* Exercitando
 * Vamos criar um exemplo de uma classe para representar uma SmartTV onde:
 * 1.Ela tenha as características: ligada (boolean), canal (int) e volume (int)
 * 2. Nossa TV poderá ligar e desligar e assim mudar o estado ligada
 * 3.Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
 * 4.Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente
*/