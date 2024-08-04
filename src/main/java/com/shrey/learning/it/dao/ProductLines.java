package com.shrey.learning.it.dao;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "productlines")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductLines {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "productLine")
    private String productLine;

    @Column(name = "textDescription")
    private String textDescription;

    @Column(name = "htmlDescription")
    private String htmlDescription;

    @Column
    private String image;

}
