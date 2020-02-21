//package com.foodocs.TummeyTurner;
//import com.foodocs.TummyTurnerApplication;
//import org.hamcrest.CoreMatchers.equalTo;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.*;
//import ord.springframework.boot.test.*;
//import ord.springframework.boot.test.context.*;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
//@ContextConfiguration(classes = TummyTurnerApplication.class)
//@SpringBootTest
//class TummyTurnerApplicationTests {
//	@Autowired
//	private WebApplicationContent wac;
//	@MockBean
//	private TummeyTurnerDAO mock;
//	@Test
//	public void testTummyTurnerGet() throws Expection {
//		TummyTurnerMenu menu = new TummyTurnerMenu();
//		menu.setPrice(18.00);
//		menu.setInventory(5);
//		Mockito.when(mock.getItem(Mockito.getAnyLong())).thenReturn(item);
//		MockMvc mvc = MockMvcBuilders.webAppContextSetup(wac).build();
//		MockHttpServletRequestBulider request = MockMvcBuilders.get(urlTemplet"/menuItem/{id}, ..uriVars: 1);
//		ResultActions actions = mvc.perform(request);
//		actions.andExpect(MockMvcResultMatchers.status().isOk());
//		actions.andDo(print());
//		actions.andExpect(jsonPath("$.price", equalTo(menu.getPrice)));
//	}
//
//}
