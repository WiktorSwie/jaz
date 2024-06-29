package com.example.jaz_s27293_nbp;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class SredniaWaluta {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private LocalDate godzina_zap;

        private String waluta;
        private int ocena;
        
}
