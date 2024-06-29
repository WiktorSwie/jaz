create table srednia_waluta
(
    id                  int auto_increment
        primary key,
    godzina_zap         time         not null,
    waluta              varchar(255) not null,
    data_rozpoczynajaca date         not null,
    data_koncowa        date         not null,
    sredni_kurs         double       not null,
    data_zapytania      date         not null
);


