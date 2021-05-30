package pitang.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pitang.entities.User;

public class UserApplication {

    public static void main(String[] args) {
        User usr = new User(null, "admin", "admin@gmail", "admin");

        try {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(usr);
        em.getTransaction().commit();
        System.out.println("Sucesso!!!");
        emf.close();
        }catch(Exception e){
        	System.out.println("Erro ao gerar as tabelas !!! Verificar as entidades !!!");
            e.printStackTrace();
        }
    }
}
