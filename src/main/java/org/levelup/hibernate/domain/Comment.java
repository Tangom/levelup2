package org.levelup.hibernate.domain;

import javafx.geometry.Pos;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Protsko D.
 *         04.08.17.
 */
@Entity
@Table(name = "COMMENT")
public class Comment {

    @Id
    @Column(name = "COMMENT_ID")
    @SequenceGenerator(name = "comment_seq", sequenceName = "comment_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_seq")
    private long commentId;

    @Column(name = "TEXT", nullable = false, length = 300)
    private String text;

    @Column(name = "COMMENTED_AT", nullable = false)
    private Date commentedAt;

    @ManyToOne
    @JoinColumn(name = "POST_ID")
    private Post commentedPost;

}
