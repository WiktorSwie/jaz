package com.example.jaz_s27293_nbp;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class SredniaWaluta {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private LocalTime godzina_zap;
        private String waluta;
        private LocalDate data_rozpoczynajaca;
        private LocalDate data_koncowa;
        private double sredni_kurs;
        private LocalDate data_zapytania;
        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public LocalTime getGodzina_zap() {
                return godzina_zap;
        }

        public void setGodzina_zap(LocalTime godzina_zap) {
                this.godzina_zap = godzina_zap;
        }

        public String getWaluta() {
                return waluta;
        }

        public void setWaluta(String waluta) {
                this.waluta = waluta;
        }

        public LocalDate getData_rozpoczynajaca() {
                return data_rozpoczynajaca;
        }

        public void setData_rozpoczynajaca(LocalDate data_rozpoczynajaca) {
                this.data_rozpoczynajaca = data_rozpoczynajaca;
        }

        public LocalDate getData_koncowa() {
                return data_koncowa;
        }

        public void setData_koncowa(LocalDate data_koncowa) {
                this.data_koncowa = data_koncowa;
        }

        public double getSredni_kurs() {
                return sredni_kurs;
        }

        public void setSredni_kurs(double sredni_kurs) {
                this.sredni_kurs = sredni_kurs;
        }

        public LocalDate getData_zapytania() {
                return data_zapytania;
        }

        public void setData_zapytania(LocalDate data_zapytania) {
                this.data_zapytania = data_zapytania;
        }
}
