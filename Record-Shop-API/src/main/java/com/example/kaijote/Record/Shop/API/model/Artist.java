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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vinyl> getRecordings() {
        return recordings;
    }

    public void setRecordings(List<Vinyl> recordings) {
        this.recordings = recordings;
    }

    public Artist(){}

    public Artist(long id, String name, List<Vinyl> recordings) {
        this.id = id;
        this.name = name;
        this.recordings = recordings;
    }

    public Artist(String name, List<Vinyl> recordings) {
        this.name = name;
        this.recordings = recordings;
    }

}
