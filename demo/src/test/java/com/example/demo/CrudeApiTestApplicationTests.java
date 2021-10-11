package com.example.demo;


import org.junit.jupiter.api.Test;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
@SpringBootTest
class CrudeApiTestApplicationTests {

//	private final PrintStream standardOut = out;
//	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
//
//	@BeforeEach
//	public void setUp() {
//		System.setOut(new PrintStream(outputStreamCaptor));
//	}
//
//	@Test
//	void givenSystemOutRedirection_whenInvokePrintln_thenOutputCaptorSuccess() {
//		out.print("Hello Baeldung Readers!!");
//		assertEquals("Hello Baeldung Readers!!", "Hello Baeldung Readers!!"
//				);
//	}

	@Autowired
	private MockMvc mockMvc;

	@Test
	void shouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/api/cassets/"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string("Eluwina Byku!"));
	}

}
