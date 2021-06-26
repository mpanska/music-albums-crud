package musicstore.demo.service;

import musicstore.demo.model.Album;
import musicstore.demo.repo.IAlbumRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService implements IAlbumService{
    private final IAlbumRepo albumRepository;

    @Autowired
    public AlbumService(IAlbumRepo albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Override
    public List<Album> getAllAlbums() {
        return albumRepository.findAll();
    }

    @Override
    public void addAlbum(Album album) {
        this.albumRepository.save(album);
    }
}
