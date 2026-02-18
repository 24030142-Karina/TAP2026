/*
 Ejemplo de como funciona la programacion generica
 basicamente es la reutilizacion de datos
 */


public class Main {
    public static void main(String[] args) {

        Caja C = new Caja();

        /*
        Facilmente con el mismo metodo "ponerAlgo"
        se pudieron guardar contenido de dos tipos de datos
         */


        // Caja de Strings, solo guarda ese tipo de dato
        Caja<String> cajaString = new Caja<>();
        cajaString.ponerAlgo("Hola que tal?");
        String contenido = cajaString.obtenerAlgo();

        System.out.println("El contenido es: "+contenido);

        // Caja de enteros, solo guarda es tipo de datos
        Caja<Integer> cajaEnteros =new Caja<>();
        cajaEnteros.ponerAlgo(23);
        Integer numero = cajaEnteros.obtenerAlgo();

        System.out.println("El numero es: "+numero);

    }
}