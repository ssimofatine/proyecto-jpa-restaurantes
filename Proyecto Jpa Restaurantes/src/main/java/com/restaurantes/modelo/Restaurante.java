package com.restaurantes.modelo;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;



@Data
@NoArgsConstructor
@AllArgsConstructor

public class Restaurante {

    @Id
    private Long id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String ciudad;
    @Column(nullable = false)
    private String direccion;
    @Column(nullable = false)
    private String telefono;
    @OneToMany(mappedBy = "restaurante", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Mesa> mesas;

    //ID: 1 | La Esquina | Sevilla | C/ Sierpes 12 | 954123456


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Restaurante{");
        sb.append("ID: ").append(id);
                sb.append(" | ").append(nombre);
                sb.append(" | ").append(ciudad);
                sb.append(" | ").append(direccion);
                sb.append(" | ").append(telefono);
                sb.append('}');
        return sb.toString();
    }
}
