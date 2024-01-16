package org.example.dbrelatedentities;

import org.example.dbrelatedentities.entity.Assurance;
import org.example.dbrelatedentities.entity.User;
import org.example.dbrelatedentities.repository.AssuranceRepository;
import org.example.dbrelatedentities.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyDataService {
    private final AssuranceRepository assuranceRepository;
    private final UserRepository userRepository;

    @Autowired
    public MyDataService(AssuranceRepository assuranceRepository, UserRepository userRepository) {
        this.assuranceRepository = assuranceRepository;
        this.userRepository = userRepository;
    }

    public void insertData() {
        Assurance assurance = new Assurance();
        // Set assurance properties
        assuranceRepository.save(assurance);

        User user = new User();
        // Set user properties
        userRepository.save(user);
    }
}
