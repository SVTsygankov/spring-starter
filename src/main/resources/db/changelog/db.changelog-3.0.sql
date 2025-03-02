--liquibase formatted sql

--changeset svtsygankov:1
ALTER TABLE users
ADD COLUMN image VARCHAR(64);

--changeset svtsygankov:2
ALTER TABLE users_aud
ADD COLUMN image VARCHAR(64);