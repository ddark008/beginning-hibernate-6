package com.autumncode.jpa.util;

import org.hibernate.Session;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.HashMap;
import java.util.Map;

public class JPASessionUtil {
  private static Map<String, EntityManagerFactory>
      persistenceUnits = new HashMap<>();

  @SuppressWarnings("WeakerAccess")
  public static synchronized EntityManager
  getEntityManager(String persistenceUnitName) {
    persistenceUnits
        .putIfAbsent(
            persistenceUnitName,
            Persistence
                .createEntityManagerFactory(
                    persistenceUnitName
                ));
    return persistenceUnits
        .get(persistenceUnitName)
        .createEntityManager();
  }

  public static Session getSession(String persistenceUnitName) {
    return getEntityManager(persistenceUnitName)
        .unwrap(Session.class);
  }
}
