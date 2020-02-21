package com.foodocs.TummeyTurner;
import org.hamcrest.CoreMatchers.equalTo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.*;
import ord.springframework.boot.test.*;
import ord.springframework.boot.test.context.*;




@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = InventoryApplication.class)
@SpringBootTest
class RestrauntApplicationTests {
	@AutoWired
	private WebApplicationContent wac;
	@MockBean
	private TummeyTurnerDAO mock;
	@Test
	public void testTummyTurnerGet() throws Expection {
		Inventory item = new Inventory();
		inventory.setPrice(20.00);
		inventory.setInventory(19);
		Mockito.when(mock.getItem(Mockito.getAnyLong())).thenReturn(item);
		MockMvc mvc = MockMvcBuilders.webAppContextSetup(wac).build();
		MockHttpServletRequestBulider request = MockMvcBuilders.get(urlTemplet"/menuItem/{id}", ..uriVars: 1);
		ResultActions actions = mvc.perform(request);
		actions.andExpect(MockMvcResultMatchers.status().isOk());
		actions.andDo(print());
		actions.andExpect(jsonPath(expresion: "$.inventory", equalTo(menu.getPrice)));
	}

}
