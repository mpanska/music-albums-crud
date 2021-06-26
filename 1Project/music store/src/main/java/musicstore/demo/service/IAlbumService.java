package musicstore.demo.service;

import musicstore.demo.model.Album;
import java.util.List;


public interface IAlbumService {
    List<Album> getAllAlbums();
    void addAlbum(Album album);

}
