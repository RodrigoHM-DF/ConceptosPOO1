package pe.edu.upeu.conceptospoo.abspolimorfismo;

public class Loro extends Animal {

    @Override
    public void sonidoAnimal() {
        System.out.println("hola manito");
    }
    @Override
    public void dormir() {
        System.out.println("chao... Zzzzzz");
    }
}
