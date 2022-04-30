package vsu.cs.c3.g4.irentor.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vsu.cs.c3.g4.irentor.server.model.ItemsModel;
import vsu.cs.c3.g4.irentor.server.repository.ItemsRepository;

import java.util.List;

@Service
public class ItemsService {
    private final ItemsRepository itemsRepository;

    @Autowired
    public ItemsService(ItemsRepository itemsRepository) {
        this.itemsRepository = itemsRepository;
    }

    public void add(ItemsModel entity) {
        this.itemsRepository.save(entity);
    }

    public void remove(ItemsModel entity) {
        this.itemsRepository.delete(entity);
    }

    public List<ItemsModel> getAll() {
        return this.itemsRepository.findAll();
    }
}
