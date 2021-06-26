package musicstore.demo.controller;

import musicstore.demo.model.Album;
import musicstore.demo.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class AlbumController {
    private final AlbumService albumService;

    @Autowired
    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping("/albums")
    public String getAlbumsList(Model model){
        model.addAttribute("albumsList", albumService.getAllAlbums());
        return "index";
    }//addAlbum

    @GetMapping("/showForm")
    public String showAlbumForm(Model model){
        Album album = new Album();
        model.addAttribute("album", album);
        return "addAlbumForm";
    }

    @PostMapping("/addAlbum")
    public String addAlbum(@ModelAttribute("album") Album album){
        //save to db
        albumService.addAlbum(album);
        return "redirect:/albums";
    }
}
