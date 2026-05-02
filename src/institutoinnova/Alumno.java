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
    private String clasificacion;

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
        if (tipoDocumento.equalsIgnoreCase("DNI") || tipoDocumento.equalsIgnoreCase("Residencia Temporal")) {
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
        } else if (tipoDocumento.equalsIgnoreCase("Residencia Temporal")) {
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
        this.nivelSocioeconomico = nivelSocioeconomico;
    }

    public String getTipobeca() {
        return tipobeca;
    }

    public void setTipobeca(String tipobeca) {
        this.tipobeca = tipobeca;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    public void verDatos(){
        
    }
    
}
