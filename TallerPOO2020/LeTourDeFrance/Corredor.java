package TallerPOO2020.LeTourDeFrance;

public class Corredor {

    String nombre;
    byte   edad;
    String nacionalidad;
    byte camisa;

    public Corredor(String nombre, byte edad, byte camisa, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.camisa = camisa;
        this.nacionalidad = nacionalidad;

    }

    public String getNombre() {
        return nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public byte getCamisa() {
        return camisa;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void setCamisa(byte camisa) {
        this.camisa = camisa;
    }
}
