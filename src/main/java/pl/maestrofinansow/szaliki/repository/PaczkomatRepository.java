package pl.maestrofinansow.szaliki.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.maestrofinansow.szaliki.model.Paczkomat;

@Repository
public interface PaczkomatRepository extends CrudRepository<Paczkomat,Long> {
}
