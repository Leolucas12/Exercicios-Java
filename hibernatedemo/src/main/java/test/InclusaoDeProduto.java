package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.hibernate.model.Product;

public class InclusaoDeProduto {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("controle-estoque");

        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            Product product = new Product("Panela", "Panela de Pressao 10 Litros", 56.80);
            em.persist(product);

            Product product1 = new Product("Cama", "Cama de casal Big", 450.68);
            em.persist(product1);

            Product product2 = new Product("Caixa Som", "Caixa de Som JBL", 160.00);
            em.persist(product2);

            em.getTransaction().commit();

            System.out.println("Produto criado com sucesso ID: " + product.getId());
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}
