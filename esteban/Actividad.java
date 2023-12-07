/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoestudio2.esteban;

/**
 *
 * @author Cynthia Camacho
 */
import java.util.ArrayList;

class Actividad {
    private String nombre;
    private ArrayList<String> participantes;
    private String pagador;
    private double monto;

    public Actividad(String nombre, ArrayList<String> participantes, String pagador, double monto) {
        this.nombre = nombre;
        this.participantes = participantes;
        this.pagador = pagador;
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getParticipantes() {
        return participantes;
    }

    public String getPagador() {
        return pagador;
    }

    public double getMonto() {
        return monto;
    }
}
