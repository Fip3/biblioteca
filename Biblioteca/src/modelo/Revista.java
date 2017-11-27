/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Felipe Torrejon
 */
public class Revista extends Documento{
    protected int volumen;
    protected int numero;
    protected int mesSalida;
    protected final String MODALIDADACCESO;

    public Revista() {
        this.MODALIDADACCESO = "Consulta";
    }

    public Revista(int volumen, int numero, int mesSalida, int codigo, String titulo, String autor, String editorial, int agnoPublicacion) {
        super(codigo, titulo, autor, editorial, agnoPublicacion);
        this.MODALIDADACCESO = "Consulta";
        this.volumen = volumen;
        this.numero = numero;
        this.mesSalida = mesSalida;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getMesSalida() {
        return mesSalida;
    }

    public void setMesSalida(int mesSalida) {
        this.mesSalida = mesSalida;
    }

    public String getMODALIDADACCESO() {
        return MODALIDADACCESO;
    }
    
    @Override
    public String mostrar() {
        return "Libro{" +
                "\n    Codigo: " + this.getCodigo() + 
                "\n    Titulo: " + this.getTitulo() + 
                "\n    Autor(es): " + this.getAutor() + 
                "\n    Editorial: " + this.getEditorial() + 
                "\n    Año Publicacion: " + this.getAgnoPublicacion() + 
                "\n    Volumen: " + this.getVolumen() + 
                "\n    Numero: " + this.getNumero() + 
                "\n    Mes de Salida: " + this.getMesSalida() + 
                "}";
    }
}
