package vsu.cs.c3.g4.irentor.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vsu.cs.c3.g4.irentor.server.model.ItemsInOrdersModel;

@Repository
public interface ItemsInOrdersRepository extends JpaRepository<ItemsInOrdersModel, String> {
}
