package com.foodocs.TummeyTurner;
import org.hamcrest.CoreMatchers.equalTo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.*;
import org.springframework.boot.test.*;
import org.springframework.boot.test.context.*;
import org.springframework.boot.web.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TummeyTurnerApplication.class, webEnviroment = SpringBootTest.WebEnviroment.RANDOM_Port)
@ActiveProfile("prod")
class TummeyTurnerIntegrationTests {

	@AutoWired
	private TestRestTemplet templet;
	@Test
	public void test() {
		TummyTurnerMenu menu = templet.getForObject(url: "/MenuItems/{id}", menuItem.class, ...uriVaribles: 1);
		System.out.println(menu);

	}

}
l
