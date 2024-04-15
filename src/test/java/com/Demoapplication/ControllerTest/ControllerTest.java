package com.Demoapplication.ControllerTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import com.Demoapplication.Controller.Controller;

@ExtendWith(MockitoExtension.class)
class ControllerTest {

    @InjectMocks
    private Controller controller;

    @Test
    void testApi() {
     
        String result = controller.getApi();
        
        assertEquals("This is the get Method.", result);
    }
}
