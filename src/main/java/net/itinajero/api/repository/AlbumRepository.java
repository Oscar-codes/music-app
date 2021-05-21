package net.itinajero.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.itinajero.api.entity.Album;

public interface AlbumRepository extends JpaRepository<Album, Integer> {

	
}
