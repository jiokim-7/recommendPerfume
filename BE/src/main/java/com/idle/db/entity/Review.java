/**
 *
 * Review
 * Review Entity
 *
 * @author David
 * @version 1.0.0
 * 생성일 2022-03-14
 * 마지막 수정일 2022-03-14
 **/
package com.idle.db.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "review")
@NoArgsConstructor
@IdClass(ReviewId.class)
public class Review extends BaseTimeEntity implements Serializable {
    @Id
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name="u_seq")
    private User user;

    @Id
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name="p_id")
    private Perfume perfume;


    @Column(name = "r_content", nullable = false)
    String reviewContent;

    @Column(name = "r_score", nullable = false)
    float reviewScore;

    @Builder
    public Review(User user, Perfume perfume, String reviewContent, float reviewScore){
        this.user = user;
        this.perfume = perfume;
        this.reviewContent = reviewContent;
        this.reviewScore = reviewScore;
    }

}
