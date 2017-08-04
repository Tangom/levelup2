package org.levelup.hibernate.domain;

import javafx.geometry.Pos;

import javax.persistence.*;
import java.util.Set;

/**
 * @author Protsko D.
 *         02.08.17.
 */
@Entity
@Table(name = "USER")
public class User {

    @Id
    @Column(name = "USER_ID")
    @SequenceGenerator(name = "user_seq", sequenceName = "user_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    private int userId;

    @Column(name = "LOGIN", nullable = false, unique = true, length = 10)
    private String login;

    @Column(name = "NAME", nullable = false, length = 30)
    private String name;

    @Column(name = "LAST_NAME", nullable = false, length = 30)
    private String lastName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "author")
    private Set<Post> posts;

    public User() {}

}
