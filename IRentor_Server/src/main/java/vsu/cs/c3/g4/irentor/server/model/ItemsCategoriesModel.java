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
public class ItemsCategoriesModel {
    @Id
    @Column(nullable = false, name = "items_category_id")
    private int items_category_id;

    @Column(nullable = false, name = "items_category_name")
    private String items_category_name;
}
