package java1proyect.com.java_proyect.persistence.entity;


import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class CompraEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_compra;
    private String id_cliente;
    private LocalDateTime fecha;
    private String medio_pago;
    private String comentario;
    private String estado_compra;

    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = false, updatable = false )
    private ClienteEntity cliente;

    @OneToMany(mappedBy = "compra")
    private List<ComprasProductoEntity> productos;


    public Integer getId_compra() {
        return id_compra;
    }
    public void setId_compra(Integer id_compra) {
        this.id_compra = id_compra;
    }
    public String getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }
    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    public String getMedio_pago() {
        return medio_pago;
    }
    public void setMedio_pago(String medio_pago) {
        this.medio_pago = medio_pago;
    }
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public String getEstado_compra() {
        return estado_compra;
    }
    public void setEstado_compra(String estado_compra) {
        this.estado_compra = estado_compra;
    }


    
}
