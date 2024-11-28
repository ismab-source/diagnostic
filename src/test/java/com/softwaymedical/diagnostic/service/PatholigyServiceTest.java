package com.softwaymedical.diagnostic.service;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class PatholigyServiceTest {

    @Autowired
    private PathologyService pathologyService;

    @Test
    public void shouldReturnCardiologie(){
        assertEquals("Cardiologie", pathologyService.getPathologies(33));
    }

    @Test
    public void shouldReturnTraumatologie(){
        assertEquals("Traumatologie", pathologyService.getPathologies(55));
    }

    @Test
    public void shouldReturnCardiologieAndTraumatologie(){
        assertEquals("Cardiologie, Traumatologie", pathologyService.getPathologies(15));
    }

    @Test
    public void shouldReturnUndefinedIndex(){
        assertEquals("Index Non definie", pathologyService.getPathologies(22));
    }
}
