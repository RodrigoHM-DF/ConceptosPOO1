package pe.edu.upeu.conceptospoo.intefaz;

public class ClasePrincipal {

    public static void main(String[] args) {
        Animal animal = new Loro();
        animal.emitirSonido();
        animal.dormir();

        animal=new Gato();
        animal.emitirSonido();
        animal.dormir();
    }
}
