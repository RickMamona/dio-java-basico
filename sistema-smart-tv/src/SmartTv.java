public class SmartTv {

    boolean ligada;
    int canal;
    int volume;

    public SmartTv(){
        canal = 1;
        volume = 10;
        ligada = true;
    }

    public void mudarCanal(int novoCanal){
        if(novoCanal > 0)
        canal = novoCanal;
    }
    public void aumentarCanal(){
        if (canal >0) {
            canal++;
        }
    }
    public void diminuirCanal(){
        if (canal >1) {
            canal--;
        }
    }
    public void aumentarVolume(){
        if(volume>0)
         this.volume++;
    }
    public void diminuirVolume(){
        if (volume>1) {
            volume--;
        }
    }
    public void ligar (){
        ligada = true;
    }
    public void desligar (){
        ligada = false;
    }

    public String toString(){
        return "Televisao {" + 
        "canal = " + canal +
        ", volume= " + volume +
        ", ligada = " + ligada +
        "}";
    }
}
