package org.levelup.hibernate.domain;

import javax.persistence.*;

/**
 * @author Protsko D.
 *         04.08.17.
 */
@Entity
@Table(name = "CATEGORY")
public class Category {

    @Id
    @Column(name = "CATEGORY_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;

    @Column(name = "NAME")
    private String name;

    public Category() {}

}
