package com.example.library.service;

import com.example.library.model.Borrower;
import com.example.library.repository.BorrowerRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class BorrowerServiceTest {

    @Autowired
    private BorrowerService borrowerService;

    @MockBean
    private BorrowerRepository borrowerRepository;

    @Test
    public void testSaveBorrower() {
        Borrower borrower = new Borrower();
        borrower.setName("radhey v");
        borrower.setEmail("radh.worke@lab.com");

        when(borrowerRepository.save(Mockito.any(Borrower.class))).thenReturn(borrower);

        Borrower savedBorrower = borrowerService.saveBorrower(borrower);
        assertEquals("radhey v", savedBorrower.getName());
    }
}
