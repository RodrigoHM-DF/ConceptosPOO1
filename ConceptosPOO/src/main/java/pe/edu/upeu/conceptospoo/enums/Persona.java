package pe.edu.upeu.conceptospoo.enums;

enum GENERO{Masculino,Femenino}
enum NACIONALIDAD{Peruano, Venezolano, Boliviado}

public class Persona {
    static String nombre;
    static GENERO genero=GENERO.Masculino;
    static NACIONALIDAD nacionalidad=NACIONALIDAD.Peruano;



    public static void main(String[] args) {
        nombre="Juanito";
        System.out.println(nombre+ " es "+nacionalidad+ " y tiene el genero "+genero);

        for (GENERO xx:GENERO.values()){
            System.out.println(xx);
        }
        for (NACIONALIDAD x:NACIONALIDAD.values()){
            System.out.println(x);
        }
    }
}
