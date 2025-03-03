package com.jong.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.jong.service.JongService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(JongController.class)
public class JongControllerTest {

    @MockBean
    JongService jongService;

    @Autowired
    private MockMvc mockMvc;
    
    @Test
    public void test() throws Exception{
        mockMvc.perform(get("/jong"))
                .andExpect(status().isOk());
    }
}
