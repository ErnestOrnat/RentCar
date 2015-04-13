package ua.lviv.lgs.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.lgs.model.User;

@Repository
public interface UserDAO extends
		CrudRepository<User, Integer> {

}
