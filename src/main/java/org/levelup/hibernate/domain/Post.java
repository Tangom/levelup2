package org.levelup.hibernate.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author Protsko D.
 *         04.08.17.
 */
@Entity
@Table(name = "POST")
public class Post {

    @Id
    @Column(name = "POST_ID")
    @SequenceGenerator(name = "post_seq", sequenceName = "post_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_seq")
    private long postId;

    @Column(name = "TITLE", nullable = false, length = 100)
    private String title;

    @Column(name = "TEXT", nullable = false, length = 300)
    private String text;

    @Column(name = "POSTED_AT", nullable = false)
    private Date postedAt;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User author;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "POST_ID")
    private List<Comment> comments;

    public Post() {}

}
