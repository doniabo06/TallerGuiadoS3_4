package sofware;

public class Dispositivo {

    private String nombre;
    private String tipo;
    private boolean activo;
    private static int contador = 0;
    private int id;

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()){
             this.nombre = nombre;
        }
        else
        {
            System.out.println("No se puede dejar el nombre vacio");
        }
    }

    public void setTipo (String tipo){
        this.tipo = tipo;
    }

    public void isActivo (boolean activo){
        this.activo = activo;
    }

    public String getNombre() { return nombre;
    }

    public String getTipo(){ return tipo;
    }

    public boolean getActivo () { return activo;
    }

    public static int getTotalCreados(){
        return contador;
    }

    public int getId (){
        return id;
    }



    public void mostrarInformacion() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Estado: " + activo);

    }

    public Dispositivo(String nombre, String tipo, boolean activo) {
        setNombre(nombre);
        this.tipo = tipo;
        this.activo = activo;

        contador ++;
        this.id = contador;

    }

    /*void mostrarEstado() {
        String estado = activo ? "esta activo" : "esta inactivo";
        System.out.println(nombre + " " + estado);

    }

    void activar() {

        if (activo == false) {
            activo = true;
            System.out.println(nombre + " se ha activado");
        } else
            System.out.println(nombre + " ya estaba activo");

    }

     */


}
