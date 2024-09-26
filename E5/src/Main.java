import java.util.List;

record Producto(String nombre, int precio) {}

interface Accion {
    void hacerAccion(Producto p);
}

interface Filtro {
    boolean filtro(Producto p);
}


class Almacen {

    List<Producto> productos;

    Almacen(List<Producto> productos) { this.productos = productos; }

    void ParaCadaProducto(Accion accion, Filtro filtro) {
        for (Producto producto : productos) {
            if (filtro.filtro(producto)){
                accion.hacerAccion(producto);
            }
        }
    }
}


public class Main {
    public static void main(String[] args) {

        Almacen almacen = new Almacen(List.of(new Producto("lapiz", 5), new Producto("boli", 6), new Producto("libro", 10)));

        almacen.ParaCadaProducto(p -> System.out.println(p), p -> p.precio() > 5);
    }
}