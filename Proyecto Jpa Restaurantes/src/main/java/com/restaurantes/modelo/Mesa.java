package com.restaurantes.modelo;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mesa {

    @Id
    private Long id;
    @Column(nullable = false)
    private int numero;
    @Column(nullable = false)
    private int capacidad;
    @Column(nullable = false)
    private boolean terrasa;
    @ManyToOne
    private Restaurante restaurante;
    @OneToMany(mappedBy = "mesa", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Reserva> reservas;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Mesa{");
        sb.append("ID: ").append(id);
        sb.append(" | Mesa: ").append(numero);
        sb.append(" | Capacidad: ").append(capacidad);
        sb.append(" | Terrasa: ").append(terrasa);
        sb.append(" | ").append(restaurante);
        sb.append('}');
        return sb.toString();
    }
}
