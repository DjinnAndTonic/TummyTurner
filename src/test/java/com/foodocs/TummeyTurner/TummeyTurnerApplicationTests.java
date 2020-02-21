package com.foodocs.TummeyTurner;
import com.foodocs.TummeyTurnerApplication;
import com.foodocs.core.MenuItem;
import com.foodocs.service.MenuDAO;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.*;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = TummeyTurnerApplication.class)
@SpringBootTest
class TummeyTurnerApplicationTests {
	@Autowired
	private WebApplicationContext wac;

/*	@MockBean
	private MenuDAO mock;

	@Test
	public void testTummyTurnerGet() throws Expection {
		MenuItem menu = new MenuItem();
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
*/

}
