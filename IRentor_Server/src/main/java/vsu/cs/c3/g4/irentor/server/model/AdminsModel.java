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
@Table(name = "admins")
public class AdminsModel {
    @Id
    @Column(nullable = false, name = "user_id")
    private int user_id;
}
