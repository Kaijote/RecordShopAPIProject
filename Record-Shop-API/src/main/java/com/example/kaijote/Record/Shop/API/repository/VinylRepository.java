package com.example.kaijote.Record.Shop.API.repository;


import com.example.kaijote.Record.Shop.API.model.Vinyl;
import com.example.kaijote.Record.Shop.API.model.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VinylRepository extends CrudRepository<Vinyl, Long> {

    public List<Vinyl> getAllVinylInStock();

    public Vinyl getVinylById();

    public Vinyl addVinylToDatabase();

    public Vinyl updateVinyl();

    public void deleteVinyl();

    public List<Vinyl> getVinylFromArtist();

    public List<Vinyl> getVinylsFromReleaseYear();

    public List<Vinyl> getVinylByGenre();

}
