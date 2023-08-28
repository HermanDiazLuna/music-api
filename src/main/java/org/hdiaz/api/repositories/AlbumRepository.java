package org.hdiaz.api.repositories;

import org.hdiaz.api.entities.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Integer>{

}
