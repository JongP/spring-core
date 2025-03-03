package com.jong.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.jong.service.JongService;

@ExtendWith(SpringExtension.class)
@WebMvcTest({BeanNameController.class, JongController.class})
public class BeanNameControllerTest {
    @Autowired
    MockMvc mockMvc;

    @MockBean
    JongService jongService;

    @Test
    public void assert_get_bean_name() throws Exception{
        mockMvc.perform(get("/bean"))
                .andExpect(status().isOk())
                .andExpect(view().name("/index"))
                .andDo(print());
    }

    @Test
    public void assert_get_request_mapping() throws Exception{
        mockMvc.perform(get("/jong"))
               .andExpect(status().isOk())
               .andDo(print());
    }



}
