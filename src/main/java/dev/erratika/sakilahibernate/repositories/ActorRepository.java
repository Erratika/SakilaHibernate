package dev.erratika.sakilahibernate.repositories;

import dev.erratika.sakilahibernate.entities.ActorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<ActorEntity, Integer> {
}