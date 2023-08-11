package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.hibernate.model.Product;

public class AlteracaoDeProduto {
  public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("controle-estoque");

    EntityManager em = emf.createEntityManager();

    try {
      em.getTransaction().begin();

      Product product = em.find(Product.class, 2L);
      product.setPrice(345.00);

      em.merge(product);

      em.getTransaction().commit();

      System.out.println("Produto atualizado com sucesso ID: " + product.getId());
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
