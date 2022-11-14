package com.example.board.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "image")
@Getter
@Setter
public class Image extends BaseEntity{

    @Column(name = "path")
    private String path;

    @ManyToOne
    private Product product;
}
