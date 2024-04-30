public class Usuario {

    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Status atual > TV ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Status atual > TV ligada? " + smartTV.ligada);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        System.out.println("Status atual > Volume atual: " + smartTV.volume);

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        System.out.println("Status atual > Volume atual: " + smartTV.volume);

        smartTV.mudarCanal(19);
        System.out.println("Status atual > Canal atual: " + smartTV.canal);

        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        System.out.println("Status atual > Canal atual: " + smartTV.canal);

        smartTV.diminuirCanal();
        smartTV.diminuirCanal();
        smartTV.diminuirCanal();
        System.out.println("Status atual > Canal atual: " + smartTV.canal);

    }
}
