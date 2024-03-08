package sv.edu.udb.desafio.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.desafio.Model.ArtistasModel;
import sv.edu.udb.desafio.Services.ArtistasService;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/artista")
public class ArtistasController {
    @Autowired
    ArtistasService artistasService;

    @GetMapping()
    public ArrayList<ArtistasModel> obtenerArtistas(){
        return artistasService.obtenerArtistas();
    }

    @PostMapping()
    public ArtistasModel guardarArtista(@RequestBody ArtistasModel artista){
        return this.artistasService.guardarArtista(artista);
    }

    @GetMapping(path = "/{id}")
    public Optional<ArtistasModel> obtenerArtistaPorId(@PathVariable("id") Long id){
        return this.artistasService.obtenerPorId(id);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.artistasService.eliminarArtista(id);
        if (ok){
            return "Se elimino artista" + id;
        }else {
            return "No pudo eliminarse el artista con id "+ id;
        }
    }

}
