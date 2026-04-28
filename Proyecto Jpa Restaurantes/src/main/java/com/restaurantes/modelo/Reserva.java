package com.restaurantes.modelo;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class Reserva {
    @Id
    private Long id;
    @Column(nullable = false)
    private LocalDate fechaReserva;
    @Column(nullable = false)
    private LocalTime horaReserva;
    @Column(nullable = false)
    private int numPersonas;
    @Column(nullable = false)
    private EstadoReserva estado;
    @Column(nullable = false)
    private double importeEstimado;
    @ManyToOne
    private Mesa mesa;
    @ManyToOne
    private Cliente cliente;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Reserva{");
        sb.append("ID: ").append(id);
        sb.append(" | ").append(fechaReserva);
        sb.append("  ").append(horaReserva);
        sb.append(" | ").append(numPersonas).append(" personas");
        sb.append(" | ").append(estado);
        sb.append(" | ").append(importeEstimado).append("€");
        sb.append(" | Mesa ").append(mesa);
        sb.append(" | ").append(cliente);
        sb.append('}');
        return sb.toString();
    }
}
