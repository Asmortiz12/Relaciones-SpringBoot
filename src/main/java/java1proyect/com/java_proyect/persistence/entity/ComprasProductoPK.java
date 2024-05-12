package java1proyect.com.java_proyect.persistence.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class ComprasProductoPK implements Serializable {
    
    private Integer id_compra;
    private Integer id_producto;

    public Integer getId_compra() {
        return id_compra;
    }
    public void setId_compra(Integer id_compra) {
        this.id_compra = id_compra;
    }
    public Integer getId_producto() {
        return id_producto;
    }
    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    
}
