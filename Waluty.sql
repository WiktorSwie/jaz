create table Waluty
(
    id                  int auto_increment
        primary key,
    godzina_zap         time   not null,
    waluta              int    not null,
    data_rozpoczynajaca date   not null,
    data_koncowa        date   not null,
    sredni_kurs         double not null,
    data_zapytania      date   not null
);


