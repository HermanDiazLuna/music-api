package org.hdiaz.api.services;

import java.util.List;
import java.util.Optional;
import org.hdiaz.api.entity.Album;
import org.hdiaz.api.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbumServiceImpl implements IAlbumService {
	
	@Autowired
	private AlbumRepository repository;
	
	@Override
	public List<Album> buscarTodos() {
		List<Album> listasAlbums = repository.findAll();
		return listasAlbums;
	}

	@Override
	public void guardar(Album album) {
		repository.save(album);

	}

	@Override
	public void eliminar(Integer idAlbum) {
		repository.deleteById(idAlbum);

	}

	@Override
	public Album buscarPorId(Integer idAlbum) {
		Album album = null;
		Optional<Album> op = repository.findById(idAlbum);
		if (op.isPresent()) {
			return album = op.get();
		}
		return album;
	}

	@Override
	public void actualizar(Album album) {
		repository.save(album);
		
	}
	
	

}
