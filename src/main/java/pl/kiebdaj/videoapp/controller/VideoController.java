package pl.kiebdaj.videoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.kiebdaj.videoapp.dao.entity.VideoCassette;
import pl.kiebdaj.videoapp.service.VideoManager;

import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class VideoController {

    private VideoManager videoManager;

    @Autowired
    public VideoController(VideoManager videoManager) {
        this.videoManager = videoManager;
    }

    @GetMapping("/one")
    public Optional<VideoCassette> getById(@RequestParam Long id) {
        return videoManager.findById(id);
    }

    @GetMapping("/all")
    public Iterable<VideoCassette> getAll() {
        return videoManager.findAll();
    }

    @PostMapping("/save")
    public VideoCassette addVideo(@RequestBody VideoCassette videoCassette) {
        return videoManager.save(videoCassette);
    }

    @PutMapping("/update")
    public VideoCassette updateVideo(@RequestBody VideoCassette videoCassette) {
        return videoManager.save(videoCassette);
    }

    @DeleteMapping("/delete")
    public void deleteById(@RequestParam Long id) {
        videoManager.delete(id);
    }
}
