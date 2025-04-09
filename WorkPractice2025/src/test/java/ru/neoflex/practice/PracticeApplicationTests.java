package ru.neoflex.practice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class PracticeApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testAdditionOfTwoPositiveVariables() throws Exception {
		mockMvc.perform(get("/plus/5/10"))
				.andExpect(status().isOk())
				.andExpect(content().string("15"));
	}

	@Test
	void testAdditionOfTwoNegativeVariables() throws Exception {
		mockMvc.perform(get("/plus/-5/-10"))
				.andExpect(status().isOk())
				.andExpect(content().string("-15"));
	}

	@Test
	void testSubtractingOfTwoPositiveVariables() throws Exception {
		mockMvc.perform(get("/minus/10/5"))
				.andExpect(status().isOk())
				.andExpect(content().string("5"));
	}

	@Test
	void testSubtractingOfTwoNegativeVariables() throws Exception {
		mockMvc.perform(get("/minus/-10/-5"))
				.andExpect(status().isOk())
				.andExpect(content().string("-5"));
	}
}

