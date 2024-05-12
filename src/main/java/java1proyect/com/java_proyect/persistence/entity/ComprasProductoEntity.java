package java1proyect.com.java_proyect.persistence.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ComprasProductoEntity {
    
    @EmbeddedId
    private ComprasProductoPK id;

    private Integer cantidad;
    private Double total;
    private Boolean estado;
    
    @ManyToOne
    @JoinColumn(name = "id_compra", insertable= false, updatable = false)
    private CompraEntity compra;

    @ManyToOne
    @JoinColumn( name = "id_producto", insertable = false, updatable = false)
    private ProductoEntity producto;


    public ComprasProductoPK getId() {
        return id;
    }
    public void setId(ComprasProductoPK id) {
        this.id = id;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public Double getTotal() {
        return total;
    }
    public void setTotal(Double total) {
        this.total = total;
    }
    public Boolean getEstado() {
        return estado;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }


    





    
}
