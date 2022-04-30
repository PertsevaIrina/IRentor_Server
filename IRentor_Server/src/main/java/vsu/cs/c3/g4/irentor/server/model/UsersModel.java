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
@Table(name = "users")
public class UsersModel {
    @Id
    @GeneratedValue
    @Column(nullable = false, updatable = false, insertable = false, name = "user_id")
    private int user_id;

    @Column(nullable = false, name = "login")
    private String login;

    @Column(nullable = false, name = "password")
    private String password;

    @Column(nullable = false, name = "email")
    private String email;

    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = false, name = "surname")
    private String surname;
}
