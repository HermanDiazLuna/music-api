package org.hdiaz.api.controllers;

import java.util.List;

import org.hdiaz.api.entities.Album;
import org.hdiaz.api.services.IAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AlbumController {
	
	@Autowired
	private IAlbumService service;
	
	@GetMapping("/albums")
	public List<Album> buscarTodos(){
		List<Album> listaAlbum = service.buscarTodos();
		return listaAlbum;
	}
	
	@PostMapping("/album")
	public Album guardar(@RequestBody Album album) {
		service.guardar(album);
		return album;
	}
	
	@DeleteMapping("/album/{id}")
	public String eliminar(@PathVariable("id") Integer idAlbum) {
		service.eliminar(idAlbum);
		return "Registro eliminado";
		
	}
	@GetMapping("/album/{id}")
	public Album buscarPorId(@PathVariable("id") Integer idAlbum) {
		
		Album album = service.buscarPorId(idAlbum);
		return album;
	}
	
	@PutMapping("/album")
	public Album actualizar(@RequestBody Album album) {
		service.actualizar(album);
		return album;
	
	}
	
	
}
