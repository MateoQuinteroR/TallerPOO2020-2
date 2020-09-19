package TallerPOO2020.LeTourDeFrance;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombreEquipo;
    private List<Corredor> corredores;
    private List<Equipo> Equipos;
    private static byte numIntegrantes = 0;
    public static byte numMaxEquipos = 0;


    public Equipo(String nombreEquipo) {
        if (numMaxEquipos <= 5) {

            this.nombreEquipo = nombreEquipo;
            corredores = new ArrayList<>();

            numMaxEquipos += 1;

        } else {

        }
        int numero;
        ArrayList numeros = new ArrayList();
        ArrayList camisas = new ArrayList();
        for (int i = 1; i <= 5; i++) {
            numero = (int) (Math.random() * 7 + 1);
            if (numeros.contains(numero)) {
                i--;
            } else {
                numeros.add(numero);
            }
        }


    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public List<Corredor> getCorredores() {
        return corredores;
    }

    public void setCorredores(List<Corredor> corredores) {
        this.corredores = corredores;
    }

    public List<Equipo> getEquipos() {
        return Equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        Equipos = equipos;
    }

    public static byte getNumIntegrantes() {
        return numIntegrantes;
    }

    public static void setNumIntegrantes(byte numIntegrantes) {
        Equipo.numIntegrantes = numIntegrantes;
    }

    public static byte getNumMaxEquipos() {
        return numMaxEquipos;
    }

    public static void setNumMaxEquipos(byte numMaxEquipos) {
        Equipo.numMaxEquipos = numMaxEquipos;
    }
}


