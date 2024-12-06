package com.example.kaijote.Record.Shop.API.repository;


import com.example.kaijote.Record.Shop.API.model.Vinyl;
import com.example.kaijote.Record.Shop.API.model.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VinylRepository extends CrudRepository<Vinyl, Long> {


}
