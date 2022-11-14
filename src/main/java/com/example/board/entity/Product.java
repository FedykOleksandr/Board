package com.example.board.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "product")
@Getter
@Setter
public class Product extends BaseEntity{

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price", columnDefinition="Decimal(10,2) default 0")
    private BigDecimal price;

    @ManyToOne
    private Customer owner;

    @Enumerated(EnumType.STRING)
    private Category category;
}
