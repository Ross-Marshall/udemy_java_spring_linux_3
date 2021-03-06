package com.caveofprogramming.spring.web.test.tests;



import static org.junit.Assert.*;

import java.util.List;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.caveofprogramming.spring.web.dao.Offer;
import com.caveofprogramming.spring.web.dao.OffersDao;
import com.caveofprogramming.spring.web.dao.User;
import com.caveofprogramming.spring.web.dao.UsersDao;

@ActiveProfiles("dev")
@ContextConfiguration(locations = { "classpath:com/caveofprogramming/spring/web/config/dao-context.xml",
		"classpath:com/caveofprogramming/spring/web/config/security-context.xml",
		"classpath:com/caveofprogramming/spring/web/test/config/datasource.xml"})

@RunWith(SpringJUnit4ClassRunner.class)
public class UserDaoTests {
	
	@Autowired
	private UsersDao usersDao;
	
	@Autowired
	private OffersDao offersDao;
	
	@Autowired
	private DataSource dataSource;
	
	
	@Before
	public void init() {
		JdbcTemplate jdbc = new JdbcTemplate( dataSource );
		
		jdbc.execute( "delete from offers");
		jdbc.execute( "delete from users");
		
	}
	
	@Test
	public void testCreateUser() {
		
		
	    User user = new User("johnwpurcell", "John Purcell", "hellothere", "john@caveorprogramming.com", true, "user");
		 
		
		assertTrue("User creation should return true", usersDao.create(user));
		
		List<User> users = usersDao.getAllUsers();
		
		assertEquals("Number of users should be 1", 1, users.size() );
		
		assertTrue( "User should exist", usersDao.exists( user.getUsername()));
		
		assertEquals("Created user should be identical to retrieved user", user, users.get(0) );
		
	
	/*	
		Offer offer = new Offer( "johnwpurcell", "John Purcell", "This is a test offer.", "john@caveorprogramming.com" );
		
		assertTrue("User creation should return true", offersDao.create(offer));
		
		List<Offer> offers = offersDao.getOffers();
		
		assertEquals("Should be in database", 1, offers.size() );
		
		assertEquals("Retrieved offer should match created offer.", offer, offers.get(0) );

		// Get the offers with ID filled in
		offer = offers.get(0);
		
		offer.setText("Updated offer text");
		assertTrue("Offer update should return true", offersDao.update(offer) );
		
		Offer updated = offersDao.getOffer( offer.getId() );
		
		assertEquals("Updated offer should match retrieved updated offer", 1, updated );
		
		offersDao.delete( offer.getId() );
		List<Offer> empty = offersDao.getOffers();
		
		assertEquals("Offers lists should be empty", 0, empty.size() );
							*/
	}

}
