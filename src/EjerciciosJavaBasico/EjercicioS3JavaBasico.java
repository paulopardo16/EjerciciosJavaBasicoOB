package EjerciciosJavaBasico;

public class EjercicioS3JavaBasico {

    public static void main(String[] args) {

        String[] nombres = {"Paulo","Rosa","David","Alejandro","David"};

        String nombre = "";

        for (int i = 0; i < nombres.length; i++){

            nombre += " " + nombres[i];

        }

        System.out.println(nombre);
    }
}
