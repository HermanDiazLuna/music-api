package org.hdiaz.api.repository;

import org.hdiaz.api.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Integer>{
	
	
}
