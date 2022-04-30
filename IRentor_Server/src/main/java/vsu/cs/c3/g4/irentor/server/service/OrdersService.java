package vsu.cs.c3.g4.irentor.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vsu.cs.c3.g4.irentor.server.model.OrdersModel;
import vsu.cs.c3.g4.irentor.server.repository.OrdersRepository;

import java.util.List;

@Service
public class OrdersService {
    private final OrdersRepository ordersRepository;

    @Autowired
    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public void add(OrdersModel entity) {
        this.ordersRepository.save(entity);
    }

    public void remove(OrdersModel entity) {
        this.ordersRepository.delete(entity);
    }

    public List<OrdersModel> getAll() {
        return this.ordersRepository.findAll();
    }
}
