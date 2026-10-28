package edu.cmu.cc.project2.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * Test class for MainController Class
 */
@RunWith(SpringRunner.class)
@WebMvcTest(MainController.class)
public class MainControllerTest {

    @Autowired
    private MockMvc mockMvc; // We will utilize Spring’s MockMvc to test the controller.

    @Test
    public void testGetMappingWithMockMVC() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/")) // builing a sample GET request with the uri "/"
                .andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.status().isOk()); // HTTP OK response expected after the url action performed

    }

    @Test
    public void testPostMappingWithMockMVC() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.post("/calculate")) // builing a sample POST request with the uri "/calculate"
                .andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.status().isOk()); // HTTP OK response expected after the url action performed

    }

    @Test
    public void testCreateRetrieveWithMockMVCAdd() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/calculate?operation=1&firstNumber=10&secondNumber=50"))  // the url - check the controller class - operation 1 is add, first number is 10 and second is 50
                .andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.status().isOk()) // HTTP OK response expected after the url action performed
                .andExpect(MockMvcResultMatchers.view().name("index")) //the name of the view file where the response will be rendered
                .andExpect(MockMvcResultMatchers.model().attribute("result", 60.0)); // expected response - note it is in double

    }
}


