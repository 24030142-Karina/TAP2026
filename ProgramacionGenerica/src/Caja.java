/*
Se tiene una caja y se quiere guardar distintas cosas:
Cuando quiera guardar un objeto y cuado se quiera, guardar otra cosa distinta
es decir, reutilizar esa caja.

En java anteriormente no se podria hacer ya que solo se podria guardar cosas
de un solo tipo
 */

// T = tipo de dato generico (Type)
public class Caja <T>{
    private T contenido; // Atributo, es decir lo que quiera guardar
        // Como no se que se guardara en la caja lo declaro como un atributo T

    public void ponerAlgo(T contenido){ //T= Parametro de contenido generico
        this.contenido=contenido;
    }

    public T obtenerAlgo() {
        return contenido;
    }
}
