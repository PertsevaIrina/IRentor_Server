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
@Table(name = "customers")
public class CustomersModel {
    @Id
    @Column(nullable = false, name = "user_id")
    private int user_id;

    @Column(nullable = false, name = "balance")
    private float balance;
}
