//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();


        System.out.println("Canal Atual : " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual : " + smartTv.canal);

        System.out.println("Volume Atual: "+ smartTv.volume);

        System.out.println("Tv está Ligada? "+smartTv.ligada);
        System.out.println(" Canal Atual: "+smartTv.canal);
        System.out.println(" Volume Atual: "+smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo status -> Tv Ligada?"+ smartTv.ligada);
        smartTv.desligar ();
        System.out.println("Novo status -> Tv Ligada?"+ smartTv.ligada);
        }
    }
