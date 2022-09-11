public class main {
    public static void main(String[] args){
        System.out.println("Exercises!!");
        Persona pablo = new Persona();
        Persona mario = new Persona();
        pablo.setNombre("Me llamo pablo");
        pablo.setEdad(23);
        pablo.setTelefono(20393484);
        mario.setNombre("Me llamo Mario");
        mario.setEdad(30);
        mario.setTelefono(564365465);

        //Imprimiendo datos de pablo
        System.out.println(pablo.getNombre());
        System.out.println(pablo.getEdad());
        System.out.println(pablo.getTelefono());

        //Imprimiendo datos de mario
        System.out.println(mario.getNombre());
        System.out.println(mario.getEdad());
        System.out.println(mario.getTelefono());
    }
}

class Persona {
    private int edad, telefono;
    private String nombre;

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}