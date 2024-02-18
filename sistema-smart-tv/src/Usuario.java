public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
         

        smartTv.mudarCanal();
        

        System.out.println(" TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status - TV ligada? " + smartTv.ligada );
        smartTv.desligar();
        System.out.println("Novo Status - TV desligada? " + smartTv.ligada );
        
    }
}
