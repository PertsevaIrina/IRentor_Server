package vsu.cs.c3.g4.irentor.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vsu.cs.c3.g4.irentor.server.model.AdminsModel;
import vsu.cs.c3.g4.irentor.server.repository.AdminsRepository;

import java.util.List;

@Service
public class AdminsService {
    private final AdminsRepository adminsRepository;

    @Autowired
    public AdminsService(AdminsRepository adminsRepository) {
        this.adminsRepository = adminsRepository;
    }

    public void add(AdminsModel entity) {
        this.adminsRepository.save(entity);
    }

    public void remove(AdminsModel entity) {
        this.adminsRepository.delete(entity);
    }

    public List<AdminsModel> getAll() {
        return this.adminsRepository.findAll();
    }
}
