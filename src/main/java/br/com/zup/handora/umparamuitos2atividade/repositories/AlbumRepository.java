package br.com.zup.handora.umparamuitos2atividade.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zup.handora.umparamuitos2atividade.models.Album;

public interface AlbumRepository extends JpaRepository<Album, Long> {

}
