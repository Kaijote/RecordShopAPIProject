package com.example.kaijote.Record.Shop.API.repository;

import com.example.kaijote.Record.Shop.API.model.Vinyl;

import java.util.List;
import java.util.Optional;

public class VinylRepositoryImpl implements VinylRepository{
    @Override
    public List<Vinyl> getAllVinylInStock() {
        return List.of();
    }

    @Override
    public Vinyl getVinylById() {
        return null;
    }

    @Override
    public Vinyl addVinylToDatabase() {
        return null;
    }

    @Override
    public Vinyl updateVinyl() {
        return null;
    }

    @Override
    public void deleteVinyl() {

    }

    @Override
    public List<Vinyl> getVinylFromArtist() {
        return List.of();
    }

    @Override
    public List<Vinyl> getVinylsFromReleaseYear() {
        return List.of();
    }

    @Override
    public List<Vinyl> getVinylByGenre() {
        return List.of();
    }

    @Override
    public <S extends Vinyl> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Vinyl> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Vinyl> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Vinyl> findAll() {
        return null;
    }

    @Override
    public Iterable<Vinyl> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Vinyl entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Vinyl> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
