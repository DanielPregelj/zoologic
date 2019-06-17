public class Gato extends Animal{

    //Constructores
    public Gato(){
        patas = 4;
        ojos = 2;
        color = "Negro";
        vida = 30;
    }

    public Gato(String color){
        this.patas = 4;
        this.ojos = 2;
        this.color = color;
        this.vida = 30;
    }

    public Gato(String color, int vida) {
        this.patas = 4;
        this.ojos = 2;
        this.color = color;
        this.vida = vida;
    }

    public Gato(int patas, int cantidadDeOjos, String color, int vida){
        this.patas = patas;
        this.ojos = cantidadDeOjos;
        this.color = color;
        this.vida = vida;
    }


    @Override
    protected void atacar(Animal animal) {
        int daño = (int) (Math.random() * 10);
        animal.setVida(animal.getVida() - daño);
    }

}
