package repositorios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import clases.Empresa;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Repository
public interface Empresarepo extends JpaRepository<Empresa, String> {
    // Aquí puedes agregar métodos adicionales para acceder a la base de datos
    @Service
    public class EmpresaService {

        @Autowired
        private Empresarepo empresaRepository;

        public List<Empresa> getAllEmpresas() {
            return empresaRepository.findAll();
        }

        public Optional<Empresa> getEmpresaById(String id) {
            return empresaRepository.findById(id);
        }

        public Empresa saveEmpresa(Empresa empresa) {
            return empresaRepository.save(empresa);
        }

        public void deleteEmpresa(String id) {
            empresaRepository.deleteById(id);
        }
    }
}
