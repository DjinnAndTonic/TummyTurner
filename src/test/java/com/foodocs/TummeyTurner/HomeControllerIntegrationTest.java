package com.foodocs.TummeyTurner;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.*;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = com.foodocs.TummeyTurnerApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("prod")
class TummeyTurnerIntegrationTests {

	@Autowired
	private TestRestTemplate templet;
	@Test
	public void test() {
		//TummyTurnerMenu menu = templet.getForObject(url: "/MenuItems/{id}", menuItem.class, ...uriVaribles: 1);
		//System.out.println(menu);

	}

}

