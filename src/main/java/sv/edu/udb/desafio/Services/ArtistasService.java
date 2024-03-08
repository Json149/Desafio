package sv.edu.udb.desafio.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.udb.desafio.Model.ArtistasModel;
import sv.edu.udb.desafio.Repository.ArtistaRepository;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class ArtistasService {

    @Autowired
    ArtistaRepository artistaRepository;

    public ArrayList<ArtistasModel> obtenerArtistas(){
       return (ArrayList<ArtistasModel>) ArtistaRepository.findAll();
    }

    public ArtistasModel guardarArtista(ArtistasModel artista){
        return ArtistaRepository.Save(artista);
    }

    public Optional<ArtistasModel> obtenerPorId(Long id){
        return ArtistaRepository.findByid(id);
    }

    public boolean eliminarArtista(Long id){
        try {
            artistaRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}
