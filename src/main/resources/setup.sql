CREATE TABLE IF NOT EXISTS plants (
    uuid VARCHAR(16) not null,
    owner VARCHAR(16) not null,
    location_x FLOAT not null,
    location_y FLOAT not null,
    location_z FLOAT not null,
    growth_state int not null,
    humidity int not null,
    nutrient int not null
);