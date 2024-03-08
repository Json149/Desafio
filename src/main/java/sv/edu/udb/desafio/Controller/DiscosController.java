package sv.edu.udb.desafio.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.desafio.Model.ArtistasModel;
import sv.edu.udb.desafio.Model.DiscosModel;
import sv.edu.udb.desafio.Repository.DiscoRepository;
import sv.edu.udb.desafio.Services.DiscosService;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/discos")
public class DiscosController {

    @Autowired
    DiscosService discosService;

    @GetMapping()
    public ArrayList<DiscosModel> obtenerDiscos() {
        return discosService.obtenerDiscos();
    }

    @PostMapping()
    public DiscosModel guardarDisco(DiscosModel disco) {
        return this.discosService.guardarDisco(disco);
    }

    @GetMapping(path = "/{id}")
    public Optional<DiscosModel> obtenerDiscoPorId(@PathVariable("id") Long id) {
        return this.discosService.obtenerPorId(id);
    }


    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.discosService.eliminarDisco(id);
        if (ok) {
            return "Se elimino disco" + id;
        } else {
            return "No pudo eliminarse el disco con id " + id;
        }
    }
}

