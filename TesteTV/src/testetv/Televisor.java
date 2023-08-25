package testetv;


public class Televisor {

    byte canal;
    short volume;
    boolean ligada = false;
    
    public void ligar (){
        ligada = true;
        System.out.println("A TV está ligda.");
    }
    
    public void desligar(){
        ligada = false;
        System.out.println("A TV foi desligada.");
    }
    
    public void trocarCanal(byte novoCanal){
        if(!ligada){
            System.out.println("A TV está desligada!");
        }
        else{
            if(novoCanal > 1 && novoCanal < 14){
                
                canal = novoCanal;
                System.out.println("Canal " + canal + "sintonizado");
                
            }else{
                System.out.println("Canal inválido");
            }
        }
        
    }
    
    public void aumentarVolume(){
        if(!ligada){
            System.out.println("A TV está desligada!");
        }
        else{
            if(volume < 100){
                volume++;
            }
            System.out.println("Volume atual: " + volume);
        }
    }
    
    public void diminuirVolume(){
        if(!ligada){
            System.out.println("A TV está desligada!");
        }
        else{
            if(volume > 0){
                volume--;
            }
            System.out.println("Volume atual:" + volume);
        }
    }

}
