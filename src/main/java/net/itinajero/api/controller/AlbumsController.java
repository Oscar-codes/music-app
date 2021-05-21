package net.itinajero.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.itinajero.api.entity.Album;
import net.itinajero.api.service.IAlbumService;

@RestController
@RequestMapping("/api")
public class AlbumsController {
	
	@Autowired
	private IAlbumService serviceAlbum;
	
	@GetMapping("/albums")
	public List<Album> BuscarTodos() {
		return serviceAlbum.BuscarTodos();
	}
	
	@PostMapping("/albums")
	public Album guardar(@RequestBody Album album) {
		serviceAlbum.Guardar(album);
		return album;
	}
	
	@PutMapping("/albums")
	public Album modificar(@RequestBody Album album) {
		serviceAlbum.Guardar(album);
		return album;
	}
	
	@DeleteMapping("/albums/{id}")
	public String eliminar(@PathVariable("id") int idAlbum) {
		serviceAlbum.Elimincar(idAlbum);
		return "Registro Elminado";
	}
}
