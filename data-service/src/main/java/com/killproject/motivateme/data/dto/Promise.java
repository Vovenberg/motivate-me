package com.killproject.motivateme.data.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor

@Entity
public class Promise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private boolean isActive;

    public Promise(String title, String description) {
        this.title = title;
        this.description = description;
    }

//    @ManyToMany
//    private Set<User> successSubscribers;
//    @ManyToMany
//    private Set<User> subscribers;

}
