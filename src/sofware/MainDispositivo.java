package sofware;

public class MainDispositivo {
    static void main() {
        // Dispositivo di1 = new Dispositivo();


        /* di1.nombre = "Mouse";
        di1.tipo = "Periferico";
        di1.activo = true;


        di2.nombre= "Monitor";
        di2.tipo= "   ";
        di2.activo = false;
         */
        /*di1.setNombre("Mouse");
        di1.setTipo("Periferico");
        di1.isActivo(true);

        System.out.println(di1.getNombre());
        System.out.println(di1.getTipo());
        System.out.println(di1.getActivo());
        */



        Dispositivo di2= new Dispositivo(
                        "Mouse",
                        "Periferico",
                        true
                );

        Dispositivo di3= new Dispositivo(
                        "teclado",
                        "Periferico",
                        true
                );

        System.out.println( Dispositivo.getTotalCreados());

        Dispositivo di1 = new Dispositivo ("Mose", "Periferico", true);
         System.out.print("Objeto 1 si es ID: " + di1.getId());
        System.out.println();
        System.out.print("ID: " + di2.getId());







        //di1.mostrarInformacion();
        System.out.println();
//        di1.mostrarEstado();
        //System.out.println("\n");
        di2.mostrarInformacion();
        System.out.println("\n");
        //di2.mostrarEstado();

        // di1.activo = false;
        //di1.mostrarEstado();

        /*di1.mostrarEstado();
        System.out.println("\n");
        di1.activar();
        di1.activar()
         */

    }

}
