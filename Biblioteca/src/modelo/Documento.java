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
public abstract class Documento {
    
    protected int codigo;
    protected String titulo;
    protected String autor;
    protected String editorial;
    protected int agnoPublicacion;
    protected String modalidadAcceso;

    public Documento() {
    }

    public Documento(int codigo, String titulo, String autor, String editorial, int agnoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.agnoPublicacion = agnoPublicacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAgnoPublicacion() {
        return agnoPublicacion;
    }

    public void setAgnoPublicacion(int agnoPublicacion) {
        this.agnoPublicacion = agnoPublicacion;
    }
    
    public String getModalidadAcceso() {
        return modalidadAcceso;
    }
    
    public abstract String mostrar();
}
