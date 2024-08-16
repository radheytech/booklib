package  com.cola.librarymanagementapi.service;

import com.example.library.model.Borrower;
import com.example.library.repository.BorrowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowerService {

    @Autowired
    private BorrowerRepository borrowerRepository;

    public List<Borrower> getAllBorrowers() {
        return borrowerRepository.findAll();
    }

    public Borrower saveBorrower(Borrower borrower) {
        return borrowerRepository.save(borrower);
    }
}
