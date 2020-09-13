package br.cesed.si.arqsoft.Usuario;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "usuario", path = "usuario")
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, String> {

}
