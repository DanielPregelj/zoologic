public class Aplicacion {


    public static void main (String[] args) {




        Perro[] perros = new Perro[4];
        perros[1] = new Perro("marron", 40);
        perros[2] = new Perro();
        Gato[] gatos = new Gato[4];
        gatos[1] = new Gato( "blanco", 30);
        gatos[2] = new Gato();
        int contadorAtaque = 0;

 //       while (perros[1].getVida()< 0)
 //          for (int i=0; i< perros.length; i++){

 //           }


        while (perros[1].getVida()> 0 && gatos[1].getVida() > 0) {
            if (contadorAtaque == 0) {
                perros[1].atacar((gatos[1]));
                contadorAtaque++;
                System.out.println("Gato_1 quedo con: " + gatos[1].getVida() + " puntos de vida");
            } else {
                gatos[1].atacar(perros[1]);
                contadorAtaque = 0;
                System.out.println("Perro_1 quedo con: " + perros[1].getVida() + " puntos de vida");
            }
        }

        if (perros[1].getVida() <= 0) {
            System.out.println("Perro_1 murio");
        } else {
            System.out.println("Gato_1 murio");
        }
    }




}

