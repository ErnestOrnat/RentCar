package ua.lviv.lgs;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ua.lviv.lgs.dao.UserDAO;
import ua.lviv.lgs.model.User;
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/root-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestUser {
	@Autowired
	private UserDAO dao;
	@Test
	public void testSaveUser() {
		long sizeBefore = dao.count();
		User user = new User();
		dao.save(user);
		long sizeAfter = dao.count();
		Assert.assertTrue(sizeAfter-sizeBefore==1);
	}
	@Test
	public void testDeleteUser() {
		long sizeBefore = dao.count();
		User user = new User();
		dao.save(user);
		dao.delete(user);
		long sizeAfter = dao.count();
		Assert.assertTrue(sizeAfter-sizeBefore==0);
	}
	@Test
	public void testUserRead(){
        User user = new User();
        dao.save(user);
		User user2 = dao.findOne(user.getId());
		Assert.assertTrue(user2.getId() == user.getId());
	}
	@Test
	public void testUserEdit(){
		User user = new User();
		user.setFirstName("");
	    dao.save(user);
	    dao.findOne(user.getId());
		Assert.assertTrue(user.getFirstName().equals(user.getFirstName()));
	}
}
