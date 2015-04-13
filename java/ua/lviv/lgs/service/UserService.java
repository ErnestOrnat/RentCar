package ua.lviv.lgs.service;

import ua.lviv.lgs.model.User;



public interface UserService {
	public void saveUser(User User);
	public User getUser(Integer id);
	public Iterable<User> getAllUsers();
	public void deleteUser(Integer id);
	public User editUser(Integer id, User User);
}
