package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import com.example.hibernate.model.Product;

public class ListaTodosProdutos {
  public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("controle-estoque");

    EntityManager em = emf.createEntityManager();

    try {
      em.getTransaction().begin();

      CriteriaBuilder builder = em.getCriteriaBuilder();

      CriteriaQuery<Product> query = builder.createQuery(Product.class);
      query.from(Product.class);

      List<Product> products = em.createQuery(query).getResultList();

      if (!products.isEmpty()) {
        for (Product product : products) {
          System.out.println("ID: " + product.getId());
          System.out.println("Nome: " + product.getName());
          System.out.println("Preco: " + product.getPrice());
          System.out.println("-----------------------------");
        }
      } else {
        System.out.println("No products found.");
      }

      em.getTransaction().commit();
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
