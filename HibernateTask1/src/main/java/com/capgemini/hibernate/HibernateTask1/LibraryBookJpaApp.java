package com.capgemini.hibernate.HibernateTask1;

/**
 * Hello world!
 *
 */

import jakarta.persistence.*;

import java.util.List;

public class LibraryBookJpaApp {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("libraryPU");
        EntityManager em = emf.createEntityManager();

        try {

            // ------------------ CREATE ------------------
            em.getTransaction().begin();

            Book b1 = new Book(1, "The Alchemist", "Paulo Coelho",
                    "Fiction", 450.0, "Available", 1988);

            Book b2 = new Book(2, "Clean Code", "Robert C. Martin",
                    "Programming", 750.0, "Available", 2008);

            Book b3 = new Book(3, "Atomic Habits", "James Clear",
                    "Self-help", 600.0, "Available", 2018);

            em.persist(b1);
            em.persist(b2);
            em.persist(b3);

            em.getTransaction().commit();

            System.out.println("Books Inserted Successfully\n");

            // ------------------ READ (By ID) ------------------
            Book book = em.find(Book.class, 1);
            System.out.println("Fetch by ID:");
            System.out.println(book);

            // ------------------ READ (All Books) ------------------
            System.out.println("\nFetch All Books:");
            TypedQuery<Book> query =
                    em.createQuery("SELECT b FROM Book b", Book.class);

            List<Book> books = query.getResultList();
            books.forEach(System.out::println);

            // ------------------ UPDATE ------------------
            em.getTransaction().begin();

            Book updateBook = em.find(Book.class, 2);
            if (updateBook != null) {
                updateBook.setPrice(800.0);
                updateBook.setAvailabilityStatus("Issued");
            }

            em.getTransaction().commit();
            System.out.println("\nBook Updated Successfully");

            // ------------------ DELETE ------------------
            em.getTransaction().begin();

            Book deleteBook = em.find(Book.class, 3);
            if (deleteBook != null) {
                em.remove(deleteBook);
            }

            em.getTransaction().commit();
            System.out.println("Book Deleted Successfully");

        } finally {
            em.close();
            emf.close();
        }
    }
}
