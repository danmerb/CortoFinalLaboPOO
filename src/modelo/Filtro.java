/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Jeniffer Merino<<https://github.com/danmerb>>
 */
public class Filtro {
    private int id;
    private String codigo;
    private String marca;
    private int stock;
    private boolean existencia;
    
    public Filtro(){}

    public Filtro(int id, String codigo, String marca, int stock, boolean existencia) {
        this.id = id;
        this.codigo = codigo;
        this.marca = marca;
        this.stock = stock;
        this.existencia = existencia;
    }
    
    public Filtro(String codigo, String marca, int stock, boolean existencia) {
        this.codigo = codigo;
        this.marca = marca;
        this.stock = stock;
        this.existencia = existencia;
    }

    public Filtro(String marca, int stock, boolean existencia) {
        this.marca = marca;
        this.stock = stock;
        this.existencia = existencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isExistencia() {
        return existencia;
    }

    public void setExistencia(boolean existencia) {
        this.existencia = existencia;
    }
    /**
     * Al generar los Setters y Getters automaticamente, no me generaba el de getExistencia 
     * es cual se usa en las clases FilstroDao.java y Consulta.java
     * y el (return existencia;) dentro del getExistencia(){ 
     * lo tuve que hacer manualmente
     * @return 
     */
    public boolean getExistencia() {
        return existencia;
    }
    
    
    
    
}
