package vsu.cs.c3.g4.irentor.server.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@Table(name = "orders")
public class OrdersModel {
    @Id
    @Column(nullable = false, name = "order_id")
    private int order_id;

    @Column(nullable = false, name = "customer_user_id")
    private int customer_user_id;

    @Column(nullable = false, name = "order_status_id")
    private int order_status_id;

    @Column(nullable = false, name = "start_of_rent")
    private Date start_of_rent;

    @Column(nullable = false, name = "end_of_rent")
    private Date end_of_rent;

    @Column(nullable = false, name = "price")
    private float price;
}
