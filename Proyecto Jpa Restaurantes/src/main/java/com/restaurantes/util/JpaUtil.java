package com.restaurantes.util;
import jakarta.persistence.*;

public class JpaUtil {
    private static final EntityManagerFactory emf;

    static {
        try {
            emf = Persistence.createEntityManagerFactory("restaurantesPU");
        } catch (Exception e) {
            throw new ExceptionInInitializerError("Error al iniciar JPA: " + e);
        }
    }

    public static EntityManager createEntityManager() {
        return emf.createEntityManager();
    }

    public static void shutdown() {
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }
}
