package sv.edu.udb.desafio.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.udb.desafio.Model.ArtistasModel;
import sv.edu.udb.desafio.Model.DiscosModel;
import sv.edu.udb.desafio.Repository.ArtistaRepository;
import sv.edu.udb.desafio.Repository.DiscoRepository;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class DiscosService {

    @Autowired
    DiscoRepository discoRepository;

    public ArrayList<DiscosModel> obtenerDiscos(){
        return (ArrayList<DiscosModel>) DiscoRepository.findAll();
    }

    public DiscosModel guardarDisco(DiscosModel disco){
        return DiscoRepository.save(disco);
    }

    public Optional<DiscosModel> obtenerPorId(Long id){
        return DiscoRepository.findByid(id);
    }

    public boolean eliminarDisco(Long id){
        try {
            discoRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }


}
