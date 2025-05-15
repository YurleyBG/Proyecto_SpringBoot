package com.example.jyv_tools.Domain.Entities;

import java.math.BigDecimal;
import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Pagos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal monto;
    private Timestamp fecha;

    
    @OneToOne
    @JoinColumn(name = "id_reserva")
    private Reservas reserva;

    @ManyToOne
    @JoinColumn(name = "id_formaPago")
    private Forma_pago formaPago;

    public Pagos(Timestamp fecha, Long id, BigDecimal monto) {
        this.fecha = fecha;
        this.id = id;
        this.monto = monto;
    }

    public Pagos() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public Reservas getReserva() {
        return reserva;
    }

    public void setReserva(Reservas reserva) {
        this.reserva = reserva;
    }

    public Forma_pago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(Forma_pago formaPago) {
        this.formaPago = formaPago;
    }
    

}
