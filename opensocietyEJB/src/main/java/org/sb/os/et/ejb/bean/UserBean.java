package org.sb.os.et.ejb.bean;



import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.sb.os.et.ejb.entity.Role;
import org.sb.os.et.ejb.entity.User;




/**
 * Session Bean implementation class UserBean
 */
@Stateless
public class UserBean implements UserBeanLocal {

	@PersistenceContext
	EntityManager em;
    /**
     * Default constructor. 
     */
    public UserBean() {
        
    }

	@SuppressWarnings("unchecked")
	@Override
	public List<Role> getRoles() {
		Query query=em.createNamedQuery("Role.findAll");
		return  query.getResultList();
	}

	@Override
	public User getUserById(int id) {
		Query query=em.createNamedQuery("User.getById");
		return  (User) query.setParameter("id", id).getSingleResult();
	}

	@Override
	public boolean saveOrUpdateUser(User user) {
		try{
			em.merge(user);
			return true;
		}catch(Exception exception){
			exception.printStackTrace();
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUsers() {
		Query query=em.createNamedQuery("User.findAll");
		return  query.getResultList();
	}

}
