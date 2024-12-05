package com.example.kaijote.Record.Shop.API.model;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.util.List;

@Entity
public class Vinyl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vinyl_id")
    private long id;

    @Column
    private String name;

    @ManyToMany(mappedBy = "recordings")
    private List<Artist> artists;

    @Enumerated(EnumType.STRING)
    private RecordType type;

    @Column
    private int runTimeMinutes;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    @Column(name = "quantity")
    private int quantityInStock;


}
