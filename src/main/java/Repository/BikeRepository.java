package Repository;

import Repository.CrudRepository.BikeCrudRepository;
import Entities.Bike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//author michael971103
@Repository
public class BikeRepository {
    @Autowired
    private BikeCrudRepository bikeCrudRepository;

    public List<Bike> getAll(){
        return (List<Bike>) bikeCrudRepository.findAll();
    }
    public Optional<Bike> getBike(int id){
        return bikeCrudRepository.findById(id);
    }

    public Bike save(Bike bike){
        return bikeCrudRepository.save(bike);
    }

    public void delete(Bike bike){
        bikeCrudRepository.delete(bike);
    }
}
