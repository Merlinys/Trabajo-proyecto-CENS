package repo;

import clases.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Empresarepo extends CrudRepository<Empresa,Long>{
    public Empresa findByUsernameAndPassword(String rutEmpresa,String contraseña);
}
