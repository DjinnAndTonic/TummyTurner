package com.foodocs.TummeyTurner;
import org.hamcrest.CoreMatchers.equalTo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.*;
import ord.springframework.boot.test.*;
import ord.springframework.boot.test.context.*;




@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
<<<<<<< HEAD
@ContextConfiguration(classes = HomeController.class)
=======
@ContextConfiguration(classes = TummeyTurnerApplication.class)
>>>>>>> eb1db408a30bacb0236e77b7f502b3490f83d6bc
@SpringBootTest
class TummeyTurnerApplicationTests {
	@AutoWired
	private WebApplicationContent wac;
	@MockBean
	private TummeyTurnerDAO mock;
	@Test
	public void testTummyTurnerGet() throws Expection {
		TummyTurnerMenu menu = new TummyTurnerMenu();
		menu.setPrice(18.00);
		menu.setInventory(5);
		Mockito.when(mock.getItem(Mockito.getAnyLong())).thenReturn(item);
		MockMvc mvc = MockMvcBuilders.webAppContextSetup(wac).build();
		MockHttpServletRequestBulider request = MockMvcBuilders.get(urlTemplet"/menuItem/{id}, ..uriVars: 1);
		ResultActions actions = mvc.perform(request);
		actions.andExpect(MockMvcResultMatchers.status().isOk());
		actions.andDo(print());
		actions.andExpect(jsonPath(expresion: "$.price", equalTo(menu.getPrice)));
	}

}
