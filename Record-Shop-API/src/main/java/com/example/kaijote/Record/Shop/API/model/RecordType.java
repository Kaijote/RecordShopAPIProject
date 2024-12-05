package com.example.kaijote.Record.Shop.API.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


public enum RecordType {
    TWELVE_INCH_LP,
    EP,
    SEVEN_INCH_SINGLE;
}
