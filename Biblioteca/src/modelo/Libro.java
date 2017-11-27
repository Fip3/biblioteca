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
public class Libro extends Documento{
    protected boolean prestado;

    public Libro() {
    }
    
    public Libro(int codigo, String titulo, String autor, String editorial, int agnoPublicacion) {
        super(codigo, titulo, autor, editorial, agnoPublicacion);
        this.prestado = false;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void setModalidadAcceso(String modalidadAcceso) {
        this.modalidadAcceso = modalidadAcceso;
    }

    @Override
    public String mostrar() {
        return "Libro{" +
                "\n    Codigo: " + this.getCodigo() + 
                "\n    Titulo: " + this.getTitulo() + 
                "\n    Autor(es): " + this.getAutor() + 
                "\n    Editorial: " + this.getEditorial() + 
                "\n    Año Publicacion: " + this.getAgnoPublicacion() + 
                "\n    Modalidad Acceso: " + this.getCodigo() + 
                "\n    Prestado: " + this.getCodigo() +
                "}";
    }

    

    
    
    
}
