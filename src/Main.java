public class Main {
    public static void main(String[] args) {


        int numeroif=-1;

        if (numeroif>0) {

            System.out.println("el numero es positivo");
        }
            else if (numeroif==0){
                System.out.println("el numero es 0");
            }
            else {
                System.out.println("el numero es negativo");
            }

        //------------------------------------------------------------------
        int numeroWhile=0;

        while (numeroWhile<3)  {
            numeroWhile=numeroWhile+1;
            System.out.println(numeroWhile);
        }

        //------------------------------------------------------------------
        do {
            numeroWhile=numeroWhile+1;
            System.out.println(numeroWhile);
        } while (numeroWhile<1);

        //------------------------------------------------------------------
        for (int numeroFor=0; numeroFor<=3; numeroFor++){

            System.out.println(numeroFor);
        }
        //------------------------------------------------------------------
        var estacion="invierno";
        switch (estacion) {

            case "verano":
                System.out.println("es verano");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("es otoño");
                break;
        }


    }
}




