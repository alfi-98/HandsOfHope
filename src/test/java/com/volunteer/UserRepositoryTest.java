package com.volunteer;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.volunteer.models.User;
import com.volunteer.repositories.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {
	@Autowired 
	private UserRepository repo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test 
	public void testCreateUser() {
		User user = new User(null, null, null, null, null, null, null);
		user.setCity("Chittagong");
		user.setPassword("test1234");
		user.setContact("01711449955")
		;
		user.setEmail("user3@gmail.com");
		user.setF_name("User");
		user.setL_name("6");
		
		User savedUser = repo.save(user);
		User existUser = entityManager.find(User.class, savedUser.getRoles());
		
		assertThat(existUser.getEmail()).isEqualTo(user.getEmail());
	}
}
