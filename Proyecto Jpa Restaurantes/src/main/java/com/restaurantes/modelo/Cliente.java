package com.restaurantes.modelo;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class Cliente {
    @Id
    private Long id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String telefono;
    @Column(nullable = false)
    private boolean vip;
    @OneToMany(mappedBy = "restaurante", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Reserva> reservas;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cliente{");
        sb.append("ID: ").append(id);
        sb.append(" | ").append(nombre);
        sb.append(" | ").append(email);
        sb.append(" | ").append(telefono);
        sb.append(" | VIP: ").append(vip);
        sb.append('}');
        return sb.toString();
    }
}
