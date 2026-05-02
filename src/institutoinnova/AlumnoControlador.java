/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package institutoinnova;

import java.util.ArrayList;

/**
 *
 * @author LCB10112
 */
public class AlumnoControlador {
    ArrayList<Alumno> listaAlumnos = new ArrayList<>();
 
    void agregarAlumno(Alumno a) {
        listaAlumnos.add(a);
    }
 
    void listarAlumnos() {
        System.out.println("LISTA DE ALUMNOS: ");
            for (Alumno a : listaAlumnos) {
                a.verDatos();
            }
    }
}
