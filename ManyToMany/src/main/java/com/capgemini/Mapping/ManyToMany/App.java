package com.capgemini.Mapping.ManyToMany;

import jakarta.persistence.*;

public class App {

    public static void main(String[] args) {

        // Create EntityManagerFactory and EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em = emf.createEntityManager();

        try {
            // Start transaction
            em.getTransaction().begin();

            // Create Roles
            Role adminRole = new Role("ADMIN");
            Role userRole = new Role("USER");

            // Create Users
            User user1 = new User("Alice", "alice@example.com");
            User user2 = new User("Bob", "bob@example.com");

            // Assign multiple roles to users
            user1.addRole(adminRole);
            user1.addRole(userRole);

            user2.addRole(userRole);

            // Persist users (roles persist automatically due to CascadeType.ALL)
            em.persist(user1);
            em.persist(user2);

            em.getTransaction().commit();

            // Retrieve and display users with roles
            em.getTransaction().begin();

            User retrievedUser1 = em.find(User.class, user1.getUserId());
            User retrievedUser2 = em.find(User.class, user2.getUserId());

            System.out.println(retrievedUser1.getUsername() + " has roles: " + retrievedUser1.getRoles());
            System.out.println(retrievedUser2.getUsername() + " has roles: " + retrievedUser2.getRoles());

            em.getTransaction().commit();

        } finally {
            em.close();
            emf.close();
        }
    }
}
