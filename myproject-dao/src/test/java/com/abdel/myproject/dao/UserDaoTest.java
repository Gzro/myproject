package com.abdel.myproject.dao;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.abdel.myproject.dao.config.AppConfig;
import com.abdel.myproject.dao.impl.UserDao;
import com.abdel.myproject.dao.impl.UserDaoImp;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class UserDaoTest {

	@Test
	public addTest() {
		assertNotNull(userDao);
	}

	@Configuration
	static class ContextConfiguration {

		// this bean will be injected into the OrderServiceTest class
		@Bean
		public UserDao userDao() {
			UserDao userDao = new UserDaoImp();
			// set properties, etc.
			return userDao;
		}
	}

	@Autowired
	private UserDao userDao;

}
