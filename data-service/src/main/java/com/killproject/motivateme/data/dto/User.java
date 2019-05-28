package com.killproject.motivateme.data.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer age;

    public User(String name, int age) {
        this.name=name;
        this.age=age;
    }

//    @ManyToMany
//    private Set<Promise> promises;

//    @ManyToMany
//    private Set<Promise> successPromises;

}
