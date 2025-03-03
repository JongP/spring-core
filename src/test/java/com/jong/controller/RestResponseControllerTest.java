package com.jong.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(RestResponseController.class)
public class RestResponseControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void test1() throws Exception{
        mockMvc.perform(get("/restResponse/normal"))
                .andExpect(status().isOk());
    }

    @Test
    public void test2() throws Exception{
        mockMvc.perform(get("/restResponse/test2"))
               .andExpect(status().isOk());
    }
}
