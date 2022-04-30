package vsu.cs.c3.g4.irentor.server.model;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@Table(name = "items_in_orders")
public class ItemsInOrdersModel {
    @Column(nullable = false, name = "order_id")
    private int order_id;

    @Column(nullable = false, name = "item_id")
    private int item_id;
}
