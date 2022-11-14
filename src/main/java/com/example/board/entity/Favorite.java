package com.example.board.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "favorite")
@Getter
@Setter
public class Favorite extends BaseEntity{

    @ManyToMany
    private List<Product> products;

    @OneToOne
    private Customer customer;
}
