package java1proyect.com.java_proyect.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class ProductoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_producto;
    private Integer id_categoria;
    private String nombre_producto;
    private Double precio_venta;
    private Integer cantidad_disponible;
    private Boolean estado_producto;

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private CategoriaEntity categoria;

    public Integer getId_producto() {
        return id_producto;
    }
    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }
    public Integer getId_categoria() {
        return id_categoria;
    }
    public void setId_categoria(Integer id_categoria) {
        this.id_categoria = id_categoria;
    }
    public String getNombre_producto() {
        return nombre_producto;
    }
    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }
    public Double getPrecio_venta() {
        return precio_venta;
    }
    public void setPrecio_venta(Double precio_venta) {
        this.precio_venta = precio_venta;
    }
    public Integer getCantidad_disponible() {
        return cantidad_disponible;
    }
    public void setCantidad_disponible(Integer cantidad_disponible) {
        this.cantidad_disponible = cantidad_disponible;
    }
    public Boolean getEstado_producto() {
        return estado_producto;
    }
    public void setEstado_producto(Boolean estado_producto) {
        this.estado_producto = estado_producto;
    }


       

    
}
