/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package institutoinnova;

import java.util.Scanner;

/**
 *
 * @author LCB10112
 */
public class InstitutoInnova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        AlumnoControlador controla = new AlumnoControlador();
        String rpta = "si";
        while (rpta.equalsIgnoreCase("si")) 
        {
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = sc.nextLine();
            
            String tipoDoc = "";
            while (!tipoDoc.equalsIgnoreCase("DNI") && !tipoDoc.equalsIgnoreCase("Carnet de Residencia Temporal")) 
            {
                System.out.print("Ingrese tipo de documento: ");
                tipoDoc = sc.nextLine();
            }
            String numDoc = "";
            boolean docValido = false;
            while (!docValido) {
                System.out.print("Ingrese el numero de documento: ");
                numDoc = sc.nextLine();
                if (tipoDoc.equalsIgnoreCase("DNI") && numDoc.length() == 8)
                    docValido = true;
                else if (tipoDoc.equalsIgnoreCase("Carnet de Residencia Temporal") && numDoc.length() == 11)
                    docValido = true;
            }
            String nivel = "";
            while (!nivel.equalsIgnoreCase("A") && !nivel.equalsIgnoreCase("B") && !nivel.equals("C")) 
            {
                System.out.print("Ingrese nivel socioeconomico (A / B / C): ");
                nivel = sc.nextLine().toUpperCase();
            }
            String beca = "";
            while (!beca.equalsIgnoreCase("Sin Beca") && !beca.equalsIgnoreCase("Beca Parcial") && !beca.equalsIgnoreCase("Beca Total")) {
            System.out.print("Ingrese tipo de beca (Sin Beca / Beca Parcial / Beca Total): ");
            beca = sc.nextLine();
        }
            
            Alumno a = new Alumno(nombre, tipoDoc, numDoc, nivel, beca);
            controla.agregarAlumno(a);
            System.out.print("¿Desea ingresar otro alumno? (si/no): ");
            rpta = sc.nextLine();
        }
        controla.listarAlumnos();
    }   
}
