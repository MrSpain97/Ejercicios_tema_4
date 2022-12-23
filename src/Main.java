public class Main {
    public static void main(String[] args) {

        System.out.println("punto 1");

        int numeroIf = 15;

        if (numeroIf >= 0){
            System.out.println("Es positivo");
        }else {
            System.out.println("Es negativo");
        }

        System.out.println("\npunto 2");

        int numeroWhile=0;
        while (numeroWhile<3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        System.out.println("\npunto 3");

        do{
            System.out.println(numeroWhile);
        }while (numeroWhile<3);

        System.out.println("\npunto 4");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        System.out.println("\npunto 5");

        String estacion="otoño";

        switch (estacion){

            case "primavera":
                System.out.println("primavera");
                break;
            case "verano":
                System.out.println("verano");
                break;
            case "otoño":
                System.out.println("otoño");
                break;
            case "invierno":
                System.out.println("invierno");
                break;
            default:
                break;

        }





    }
}