package br.com.zup.handora.umparamuitos2atividade.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.handora.umparamuitos2atividade.repositories.AlbumRepository;

@RestController
@RequestMapping(AlbumController.BASE_URI)
public class AlbumController {

    public final static String BASE_URI = "/albuns";

    private final AlbumRepository albumRepository;

    public AlbumController(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

}
