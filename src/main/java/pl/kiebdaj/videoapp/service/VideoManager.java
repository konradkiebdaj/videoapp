package pl.kiebdaj.videoapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.kiebdaj.videoapp.dao.VideoCassetteRepo;
import pl.kiebdaj.videoapp.dao.entity.VideoCassette;

import java.time.LocalDate;
import java.util.Optional;

//serwis do obsługi podstawowych opreacji CRUD oraz wpisanie kilku pozycji 'na sztywno' do bazy
@Service
public class VideoManager {

    private VideoCassetteRepo videoRepo;

    @Autowired
    public VideoManager(VideoCassetteRepo videoRepo) {
        this.videoRepo = videoRepo;
    }

    public Iterable<VideoCassette> findAll() {
        return videoRepo.findAll();
    }

    public Optional<VideoCassette> findById(Long id) {
        return videoRepo.findById(id);
    }

    public VideoCassette save(VideoCassette videoCassette) {
        return videoRepo.save(videoCassette);
    }

    public void delete(Long id) {
        videoRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB() {
        save(new VideoCassette(1L, "Taken", "Pierre Morel", LocalDate.of(2008, 05, 22)));
        save(new VideoCassette(2L, "Ironman", "Ron Howard", LocalDate.of(2008, 03, 05)));
        save(new VideoCassette(3L, "Avengers", "Russoe Brothers", LocalDate.of(2012, 10, 30)));
        save(new VideoCassette(4L, "Godfather", "F. F. Copolla", LocalDate.of(1972, 12, 31)));
    }

}
