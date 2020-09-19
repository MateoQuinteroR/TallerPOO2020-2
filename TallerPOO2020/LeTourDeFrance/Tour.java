package TallerPOO2020.LeTourDeFrance;

import java.util.List;

public class Tour {

    List<Corredor> top10;
    List<Etapa> resultadoEtapa;
    List<Equipo> mostrarEquipo;
    List<Equipo> mostrarTotalEquipos;
    public static byte numMaxEquipo= 7;


    public Tour() {
    }

    public List<Corredor> getTop10() {
        return top10;
    }

    public void setTop10(List<Corredor> top10) {
        this.top10 = top10;
    }

    public List<Etapa> getResultadoEtapa() {
        return resultadoEtapa;
    }

    public void setResultadoEtapa(List<Etapa> resultadoEtapa) {
        this.resultadoEtapa = resultadoEtapa;
    }

    public List<Equipo> getMostrarEquipo() {


        return mostrarEquipo;
    }

    public void setMostrarEquipo(List<Equipo> mostrarEquipo) {
        this.mostrarEquipo = mostrarEquipo;
    }

    public List<Equipo> getMostrarTotalEquipos() {
        return mostrarTotalEquipos;
    }

    public void setMostrarTotalEquipos(List<Equipo> mostrarTotalEquipos) {
        this.mostrarTotalEquipos = mostrarTotalEquipos;
    }
//    int numero;
//    ArrayList<> numeros = new ArrayList();
//    ArrayList camisas = new ArrayList();
//
//    for(int i = 1; i < 5; i++) {
//        numero = (int) (Math.random() * 5 + 1);
//        if (numeros.contains(numero)) {
//            i--;
//        } else {
//            numeros.add(numero);
//        }
//    }
//        for (Integer n ; numeros) {
//        System.out.println(n + "");
//    }


}





