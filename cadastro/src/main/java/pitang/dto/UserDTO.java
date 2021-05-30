package pitang.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

import pitang.entities.User;

public class UserDTO {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("users");
	
	private EntityManager em = emf.createEntityManager();
	
	public User getUser(String name, String email, String password) {
		try {
			
			return null;
			
		} catch(NoResultException e) {
			return null;
		}
	}
}
