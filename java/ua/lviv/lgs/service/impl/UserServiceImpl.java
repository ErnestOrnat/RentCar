package ua.lviv.lgs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.lgs.dao.UserDAO;
import ua.lviv.lgs.model.User;
import ua.lviv.lgs.service.UserService;

@Service("user service")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO dao;

	@Transactional
	public void saveUser(User user) {
		dao.save(user);

	}

	public User getUser(Integer id) {

		return dao.findOne(id);
	}

	public Iterable<User> getAllUsers() {

		return dao.findAll();
	}

	@Transactional
	public void deleteUser(Integer id) {
		dao.delete(id);

	}

	@Transactional
	public User editUser(Integer id, User user) {
		User newUser = dao.findOne(id);
		newUser.setFirstName(user.getFirstName());
		newUser.setLastName(user.getLastName());
		return dao.save(newUser);
	}

}
