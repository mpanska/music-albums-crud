package musicstore.demo.repo;

import musicstore.demo.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlbumRepo extends JpaRepository<Album, Long> {

}
