package vsu.cs.c3.g4.irentor.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vsu.cs.c3.g4.irentor.server.model.ItemsCategoriesModel;
import vsu.cs.c3.g4.irentor.server.repository.ItemsCategoriesRepository;

import java.util.List;

@Service
public class ItemsCategoriesService {
    private final ItemsCategoriesRepository itemsCategoriesRepository;

    @Autowired
    public ItemsCategoriesService(ItemsCategoriesRepository itemsCategoriesRepository) {
        this.itemsCategoriesRepository = itemsCategoriesRepository;
    }

    public void add(ItemsCategoriesModel entity) {
        this.itemsCategoriesRepository.save(entity);
    }

    public void remove(ItemsCategoriesModel entity) {
        this.itemsCategoriesRepository.delete(entity);
    }

    public List<ItemsCategoriesModel> getAll() {
        return this.itemsCategoriesRepository.findAll();
    }
}
