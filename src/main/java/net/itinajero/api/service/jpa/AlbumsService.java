package net.itinajero.api.service.jpa;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.itinajero.api.entity.Album;
import net.itinajero.api.repository.AlbumRepository;
import net.itinajero.api.service.IAlbumService;

@Service
public class AlbumsService implements IAlbumService {

	@Autowired
	private AlbumRepository repoAlbums;
	
	
	public List<Album> BuscarTodos() {
		// TODO Auto-generated method stub
		return repoAlbums.findAll();
	}

	
	public void Guardar(Album album) {
		repoAlbums.save(album);
		
	}

	
	public void Elimincar(int idAlbum) {
		repoAlbums.deleteById(idAlbum);
		
	}

}
