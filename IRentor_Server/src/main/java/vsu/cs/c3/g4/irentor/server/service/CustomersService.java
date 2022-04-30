package vsu.cs.c3.g4.irentor.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vsu.cs.c3.g4.irentor.server.model.CustomersModel;
import vsu.cs.c3.g4.irentor.server.repository.CustomersRepository;

import java.util.List;

@Service
public class CustomersService {
    private final CustomersRepository customersRepository;

    @Autowired
    public CustomersService(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    public void add(CustomersModel entity) {
        this.customersRepository.save(entity);
    }

    public void remove(CustomersModel entity) {
        this.customersRepository.delete(entity);
    }

    public List<CustomersModel> getAll() {
        return this.customersRepository.findAll();
    }
}
