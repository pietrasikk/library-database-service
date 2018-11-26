package com.webservices.example.librarydatabaseservice.controller;

import com.webservices.example.librarydatabaseservice.service.BookService;
import com.webservices.example.librarydatabaseservice.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

//@RunWith(SpringRunner.class)
@RunWith(MockitoJUnitRunner.class)
@WebMvcTest(Controller.class)
public class ControllerTest {

//    @MockBean
//    private UserService userService;
//
//    @MockBean
//    private BookService bookService;

    @Mock
    private UserService userService;

    @Mock
    private BookService bookService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void test(){

    }
}
