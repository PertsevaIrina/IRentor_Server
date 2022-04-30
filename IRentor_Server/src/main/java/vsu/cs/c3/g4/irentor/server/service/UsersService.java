package vsu.cs.c3.g4.irentor.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vsu.cs.c3.g4.irentor.server.model.UsersModel;
import vsu.cs.c3.g4.irentor.server.repository.UsersRepository;

import java.util.List;

@Service
public class UsersService {
    private final UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public void add(UsersModel entity) {
        this.usersRepository.save(entity);
    }

    public void remove(UsersModel entity) {
        this.usersRepository.delete(entity);
    }

    public List<UsersModel> getAll() {
        return this.usersRepository.findAll();
    }
}
