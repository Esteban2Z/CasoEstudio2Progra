/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoestudio2.esteban;

/**
 *
 * @author Cynthia Camacho
 */
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;

public class CasoEstudio2Esteban {
    public static void main(String[] args) {
        ArrayList<Actividad> actividades = new ArrayList<>();

        // Agrega las actividades iniciales aquí
        actividades.add(new Actividad("Desayuno coffePrime", new ArrayList<String>(Arrays.asList("Josua", "Greivin", "Guillermo", "Andres", "Tavo", "David")), "Guillermo", 120));
        actividades.add(new Actividad("Almuerzo Pig Factory", new ArrayList<String>(Arrays.asList("Josua", "Greivin", "Guillermo", "Andres", "Tavo")), "Guillermo", 200));
        actividades.add(new Actividad("Cena FastFood", new ArrayList<String>(Arrays.asList("Joshua", "David")), "David", 50));
        actividades.add(new Actividad("Pizza Hut", new ArrayList<String>(Arrays.asList("Guillermo", "Andres", "Greivin", "Tavo")), "Tavo", 100));
        actividades.add(new Actividad("Quicksilver store", new ArrayList<String>(Arrays.asList("Guillermo")), "Grevin", 150));
        actividades.add(new Actividad("Apple store", new ArrayList<String>(Arrays.asList("Andres")), "Joshua", 200));
        actividades.add(new Actividad("Desayuno chillis", new ArrayList<String>(Arrays.asList("Josua", "Greivin", "Guillermo", "Andres", "Tavo", "David")), "Greivin", 150));
        actividades.add(new Actividad("Almuerzo hooters", new ArrayList<String>(Arrays.asList("Josua", "Greivin", "Guillermo", "Andres", "Tavo", "David")), "Tavo", 180));

        // Muestra cuánto debe cada miembro por cada actividad
        for (Actividad actividad : actividades) {
            double montoIndividual = actividad.getMonto() / actividad.getParticipantes().size();
            for (String participante : actividad.getParticipantes()) {
                if (!participante.equals(actividad.getPagador())) {
                    JOptionPane.showMessageDialog(null, participante + " debe " + montoIndividual + " a " + actividad.getPagador() + " por la actividad " + actividad.getNombre() + ".");
                }
            }
        }
    }
}




