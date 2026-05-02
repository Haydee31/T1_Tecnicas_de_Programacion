/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package institutoinnova;

/**
 *
 * @author LCB10112
 */
public class Alumno {
    private String nombres;
    private String tipoDocumento;
    private String numeroDocumento;
    private String nivelSocioeconomico;
    private String tipobeca;

    public Alumno(String nombres, String tipoDocumento, String numeroDocumento, String nivelSocioeconomico, String tipobeca) {
        this.nombres = nombres;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nivelSocioeconomico = nivelSocioeconomico;
        this.tipobeca = tipobeca;
    }
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        if (tipoDocumento.equalsIgnoreCase("DNI") || tipoDocumento.equalsIgnoreCase("Carnet de Residencia Temporal")) {
            this.tipoDocumento = tipoDocumento;
        }
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        if (tipoDocumento.equalsIgnoreCase("DNI")) {
            if (numeroDocumento.length() == 8) {
                this.numeroDocumento = numeroDocumento;
            } else {
                System.out.println("El DNI debe tener exactamente 8 digitos.");
            }
        } else if (tipoDocumento.equalsIgnoreCase("Carnet de Residencia Temporal")) {
            if (numeroDocumento.length() == 11) {
                this.numeroDocumento = numeroDocumento;
            } else {
                System.out.println("El Carnet de Residencia Temporal debe tener exactamente 11 digitos.");
            }
        }
    }

    public String getNivelSocioeconomico() {
        return nivelSocioeconomico;
    }

    public void setNivelSocioeconomico(String nivelSocioeconomico) {
        if (nivelSocioeconomico.equals("A") || nivelSocioeconomico.equals("B") || nivelSocioeconomico.equals("C"))
            this.nivelSocioeconomico = nivelSocioeconomico;
        else
            System.out.println("El nivel socioeconómico debe ser A, B o C");
    }

    public String getTipobeca() {
        return tipobeca;
    }

    public void setTipobeca(String tipobeca) {
        if (tipobeca.equalsIgnoreCase("Sin Beca") ||
            tipobeca.equalsIgnoreCase("Beca Parcial") ||
            tipobeca.equalsIgnoreCase("Beca Total"))
            this.tipobeca = tipobeca;
        else
            System.out.println(" La Beca debe ser 'Sin Beca', 'Beca Parcial' o 'Beca Total'");
    }
   
   public double calcularPensionBase() {
        switch (nivelSocioeconomico) {
            case "A": return 500.0;
            case "B": return 350.0;
            case "C": return 200.0;
            default:  return 0.0;
        }
    }
   
   public double calcularPorcentajeBeca() {
        switch (tipobeca) {
            case "Beca Total":   return 0.00;
            case "Beca Parcial": return 0.50;
            default:             return 1.00; 
        }
    }
   
   public double calcularPensionFinal() {
        return calcularPensionBase() * calcularPorcentajeBeca();
    }
   
   public void verDatos() {
        System.out.println("Alumno => NOMBRES: " + nombres
            + " | TIPO DOC: " + tipoDocumento
            + " | NUMDOC: " + numeroDocumento
            + " | NIVEL: " + nivelSocioeconomico
            + " | BECA: " + tipobeca);
        System.out.printf("  PENSION BASE: %.2f | PENSION FINAL: %.2f%n",
            calcularPensionBase(), calcularPensionFinal());
    }
    
}
