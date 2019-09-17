package pl.kiebdaj.videoapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kiebdaj.videoapp.dao.entity.VideoCassette;

@Repository
public interface VideoCassetteRepo extends JpaRepository<VideoCassette, Long> {
}
