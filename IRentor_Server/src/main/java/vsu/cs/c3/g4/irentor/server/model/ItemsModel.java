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
@Table(name = "items")
public class ItemsModel {
    @Id
    @Column(nullable = false, name = "item_id")
    private int item_id;

    @Column(nullable = false, name = "item_name")
    private String item_name;

    @Column(nullable = false, name = "item_category_id")
    private int item_category_id;

    @Column(nullable = false, name = "price")
    private float price;
}
