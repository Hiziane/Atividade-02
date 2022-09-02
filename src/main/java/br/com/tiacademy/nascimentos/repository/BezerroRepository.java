package br.com.tiacademy.nascimentos.repository;

import br.com.tiacademy.nascimentos.core.crud.CrudRepository;
import br.com.tiacademy.nascimentos.domain.Bezerro;
import br.com.tiacademy.nascimentos.domain.Matriz;
import br.com.tiacademy.nascimentos.domain.proprietario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BezerroRepository extends CrudRepository<Bezerro,Long> {

         //nesta Query usamos o apelido "b", nesse caso o Bezerro é uma entidade
        //HQL
        // @Query("select b from Bezerro b where b.id in (:ids)")
        //List<Bezerro>recuperar(@Param("ids") List<Long> ids);

        // Query nativa: passa o nome da tabela mesmo, é bom evitar por causa da dependencia com o banco
        // neste caso, o nome da tabela é com letra minuscula
        // @Query(nativeQuery = true, value = "select * from bezerro where id in (:ids)")
        //List<Bezerro>recuperarNativo(@Param("ids") List<Long> ids);

        //Query Spring Data
         //List<Bezerro>findByIdIn(List<Long> ids);

        //String select = "select b from Bezerro b where b.matriz = :matriz_id ";
        //String select2 = "select b from Bezerro b where b.proprietario_id = :proprietario_id ";

        @Query(nativeQuery = true, value = "select * from bezerro where proprietario_id in (:proprietario_id)")
        List<Bezerro> constultarBezerrosPorProprietario(@Param("proprietario_id") proprietario id);

        //List<Bezerro> findByIdIn(@Param("matriz_id") Matriz id);

        //@Query("select b from Bezerro b where b.sexo = :sexo" )
        //List<Bezerro>consultarBezerroPorSexo(@Param("sexo") Bezerro sexo);

        @Query(value = "select b from Bezerro b where b.proprietario = :proprietario_id  and b.valor = null")
        List<Bezerro> constultaBezerrosDisponiveisProprietario(@Param("proprietario_id") proprietario id);

        @Query("select b from Bezerro b where b.matriz = :matriz_id")
        List<Bezerro>constultarBezerrosPorMatriz(@Param("matriz_id") Matriz id);

}
