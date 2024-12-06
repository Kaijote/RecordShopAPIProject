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

    @Column
    private int releaseYear;

    // GETTERS AND SETTERS


    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getRunTimeMinutes() {
        return runTimeMinutes;
    }

    public void setRunTimeMinutes(int runTimeMinutes) {
        this.runTimeMinutes = runTimeMinutes;
    }

    public RecordType getType() {
        return type;
    }

    public void setType(RecordType type) {
        this.type = type;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Vinyl(){}// No args

    public Vinyl(long id, String name, List<Artist> artists, RecordType type, int runTimeMinutes, Genre genre, int quantityInStock, int releaseYear) {
        this.id = id;
        this.name = name;
        this.artists = artists;
        this.type = type;
        this.runTimeMinutes = runTimeMinutes;
        this.genre = genre;
        this.quantityInStock = quantityInStock;
        this.releaseYear = releaseYear;
    }

    public Vinyl(String name, List<Artist> artists, RecordType type, int runTimeMinutes, Genre genre, int quantityInStock, int releaseYear) {
        this.name = name;
        this.artists = artists;
        this.type = type;
        this.runTimeMinutes = runTimeMinutes;
        this.genre = genre;
        this.quantityInStock = quantityInStock;
        this.releaseYear = releaseYear;
    }
}
