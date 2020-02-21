package com.foodocs.TummeyTurner;
import org.hamcrest.CoreMatchers.equalTo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = TummeyTurnerApplication.class)
@SpringBootTest
class TummeyTurnerApplicationTests {
	@AutoWired
	private WebApplicationContent wac;
	@MockBean
	private TummeyTurnerDAO mock;
	@Test
	public void testTummyTurnerGet() throws Expection {
		TummyTurnerMenu item = new TummyTurnerMenu();
		menu.setPrice(18.00);
		menu.setInventory(5);
		Mockito.when(mock.getItem(Mockito.getAnyLong())).thenReturn(item);
		MockMvc mvc = MockMvcBuilders.webAppContextSetup(wac).build();
		MockHttpServletRequestBulider request = MockMvcBuilders.get(urlTemplet"/menuItem/{id}, )
	}

}
