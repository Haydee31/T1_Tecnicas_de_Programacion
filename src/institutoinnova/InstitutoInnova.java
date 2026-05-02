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
        while (rpta.equalsIgnoreCase("si")) {
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = sc.nextLine();
            
            String tipoDoc = "";
            while (!tipoDoc.equalsIgnoreCase("DNI") && !tipoDoc.equals("Carnet de Residencia Temporal")) {
                System.out.println("Tipo de documento:");
                System.out.println("  1 = DNI");
                System.out.println("  2 = Carnet de Residencia Temporal");
                System.out.print("Ingrese opcion: ");
                int opDoc = sc.nextInt();
                sc.nextLine();
                if (opDoc == 1)      tipoDoc = "DNI";
                else if (opDoc == 2) tipoDoc = "Carnet de Residencia Temporal";
            }
            String numDoc = "";
            boolean docValido = false;
            while (!docValido) {
                System.out.print("Ingrese el numero de documento: ");
                numDoc = sc.nextLine();
                if (tipoDoc.equals("DNI") && numDoc.length() == 8)
                    docValido = true;
                else if (tipoDoc.equals("Carnet de Residencia Temporal") && numDoc.length() == 11)
                    docValido = true;
            }
            String nivel = "";
            while (!nivel.equals("A") && !nivel.equals("B") && !nivel.equals("C")) {
                System.out.println("Nivel socioeconomico:");
                System.out.println("  1 = A  (Pension base: S/. 500)");
                System.out.println("  2 = B  (Pension base: S/. 350)");
                System.out.println("  3 = C  (Pension base: S/. 200)");
                System.out.print("Ingrese opcion: ");
                int opNivel = sc.nextInt();
                sc.nextLine();
                if (opNivel == 1)      nivel = "A";
                else if (opNivel == 2) nivel = "B";
                else if (opNivel == 3) nivel = "C";
            }
            String beca = "";
            while (!beca.equals("Sin Beca") && !beca.equals("Beca Parcial") && !beca.equals("Beca Total")) {
                System.out.println("Tipo de beca:");
                System.out.println("  1 = Sin Beca     (paga 100%)");
                System.out.println("  2 = Beca Parcial (paga 50%)");
                System.out.println("  3 = Beca Total   (paga 0%)");
                System.out.print("Ingrese opcion: ");
                int opBeca = sc.nextInt();
                sc.nextLine(); 
                if (opBeca == 1)      beca = "Sin Beca";
                else if (opBeca == 2) beca = "Beca Parcial";
                else if (opBeca == 3) beca = "Beca Total";
            }
            Alumno a = new Alumno(nombre, tipoDoc, numDoc, nivel, beca);
            controla.agregarAlumno(a);
            System.out.print("\n¿Desea ingresar otro alumno? (si/no): ");
            rpta = sc.nextLine();
        }
        controla.listarAlumnos();
    }
    
}
