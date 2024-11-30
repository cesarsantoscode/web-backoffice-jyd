package pe.edu.cibertec.spring_mvc_jyd.service;

import pe.edu.cibertec.spring_mvc_jyd.dto.FilmDto;

import java.util.List;

public interface MaintenanceService {

    List<FilmDto> findAllFilms();

}
