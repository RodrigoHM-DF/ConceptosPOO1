package pe.edu.upeu.conceptospoo.encapsulamiento;

public class ClaseGeneral {

    public static void main(String[] args) {
        Persona persona = new Persona();

        //persona.nombre="David";
        //persona.edad=18;
        persona.setNombre("Maria");
        persona.setEdad(25);
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Edad: "+persona.getEdad());
    }
}