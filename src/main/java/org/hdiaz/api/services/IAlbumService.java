package org.hdiaz.api.services;

import java.util.List;

import org.hdiaz.api.entities.Album;

public interface IAlbumService {

	List<Album> buscarTodos();
	void guardar(Album album);
	void eliminar(Integer idAlbum);
	Album buscarPorId(Integer idAlbum);
	void actualizar(Album album);
}
