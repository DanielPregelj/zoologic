public class Perro extends Animal{

    //Constructores
    public Perro(){
        patas = 4;
        ojos = 2;
        color = "Negro";
        vida = 30;
    }

    public Perro(String color){
        this.patas = 4;
        this.ojos = 2;
        this.color = color;
        this.vida = 30;
    }

    public Perro(String color, int vida){
        this.patas = 4;
        this.ojos = 2;
        this.color = color;
        this.vida = vida;
    }

    public Perro(int patas, int cantidadDeOjos, String color, int vida){
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
