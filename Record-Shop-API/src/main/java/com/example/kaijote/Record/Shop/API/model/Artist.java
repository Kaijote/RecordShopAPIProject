package com.example.kaijote.Record.Shop.API.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artist_id")
    private long id;

    @Column
    private String name;

    @ManyToMany
    @JoinTable(name = "artist_recordings",
    joinColumns = @JoinColumn(name = "artist_id"),
    inverseJoinColumns = @JoinColumn(name = "vinyl_id"))
    private List<Vinyl> recordings;



}
