package vsu.cs.c3.g4.irentor.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vsu.cs.c3.g4.irentor.server.model.ItemsInOrdersModel;
import vsu.cs.c3.g4.irentor.server.repository.ItemsInOrdersRepository;

import java.util.List;

@Service
public class ItemsInOrdersService {
    private final ItemsInOrdersRepository itemsInOrdersRepository;

    @Autowired
    public ItemsInOrdersService(ItemsInOrdersRepository itemsInOrdersRepository) {
        this.itemsInOrdersRepository = itemsInOrdersRepository;
    }

    public void add(ItemsInOrdersModel entity) {
        this.itemsInOrdersRepository.save(entity);
    }

    public void remove(ItemsInOrdersModel entity) {
        this.itemsInOrdersRepository.delete(entity);
    }

    public List<ItemsInOrdersModel> getAll() {
        return this.itemsInOrdersRepository.findAll();
    }
}
