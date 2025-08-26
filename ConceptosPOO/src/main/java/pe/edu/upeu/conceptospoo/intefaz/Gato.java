package pe.edu.upeu.conceptospoo.intefaz;

public class Gato implements Animal {

    @Override
    public void emitirSonido() {
        System.out.println("Miauuu... Miauuu...");
    }

    @Override
    public void dormir() {
        System.out.println("Zzz zzz...");
    }
}
