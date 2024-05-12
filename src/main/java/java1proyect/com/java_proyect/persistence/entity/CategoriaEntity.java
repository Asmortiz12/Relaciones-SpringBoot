package java1proyect.com.java_proyect.persistence.entity;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class CategoriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id_categoria;
    private String descripcion;
    private Boolean estado_compra;

    @OneToMany(mappedBy = "categoria")
    private List<ProductoEntity> productos;

    public Integer getId_categoria() {
        return id_categoria;
    }
    public void setId_categoria(Integer id_categoria) {
        this.id_categoria = id_categoria;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Boolean getEstado_compra() {
        return estado_compra;
    }
    public void setEstado_compra(Boolean estado_compra) {
        this.estado_compra = estado_compra;
    }
    
}
