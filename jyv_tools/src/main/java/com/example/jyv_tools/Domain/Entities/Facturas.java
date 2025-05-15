package com.example.jyv_tools.Domain.Entities;

import java.math.BigDecimal;
import java.sql.Timestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Facturas {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero_factura;
    private Timestamp fecha;
    private BigDecimal Monto_total;

    @OneToOne
    @JoinColumn(name = "id_reserva")
    private Reservas reserva;

    @OneToOne(mappedBy = "factura", cascade = CascadeType.ALL)
    private Detalles_facturas detalleFactura;


    public Facturas() {
    }

    public Facturas(BigDecimal Monto_total, Timestamp fecha, Long id, String numero_factura) {
        this.Monto_total = Monto_total;
        this.fecha = fecha;
        this.id = id;
        this.numero_factura = numero_factura;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero_factura() {
        return numero_factura;
    }

    public void setNumero_factura(String numero_factura) {
        this.numero_factura = numero_factura;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getMonto_total() {
        return Monto_total;
    }

    public void setMonto_total(BigDecimal Monto_total) {
        this.Monto_total = Monto_total;
    }

    public Reservas getReserva() {
        return reserva;
    }

    public void setReserva(Reservas reserva) {
        this.reserva = reserva;
    }

    public Detalles_facturas getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(Detalles_facturas detalleFactura) {
        this.detalleFactura = detalleFactura;
    }
    

    
}
