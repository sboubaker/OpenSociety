package org.sb.os.et.ejb.bean;


import java.util.List;

import javax.ejb.Local;

import org.sb.os.et.ejb.entity.Role;
import org.sb.os.et.ejb.entity.User;





@Local
public interface UserBeanLocal {

	List<Role> getRoles();
	List<User> getUsers();
	User getUserById(int id);
	boolean saveOrUpdateUser(User user);

}
