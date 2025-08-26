package pe.edu.upeu.conceptospoo.herencia;

public class Carro extends Vehiculo{

    String color="Blanco";
    String modelo="Hílux";


    void caracteristicas(){
        marca="Toyota";
        System.out.println("El vehiculo tiene las siguientes caracteristicas");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Color: "+color);
        System.out.println("y emite el siguiente sonido"+sonido());

    }
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.caracteristicas();
    }
}
