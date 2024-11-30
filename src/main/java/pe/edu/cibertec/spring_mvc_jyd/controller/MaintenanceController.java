package pe.edu.cibertec.spring_mvc_jyd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import pe.edu.cibertec.spring_mvc_jyd.dto.FilmDto;
import pe.edu.cibertec.spring_mvc_jyd.service.MaintenanceService;

import java.util.List;

@Controller
public class MaintenanceController {

    @Autowired
    MaintenanceService maintenanceService;

    public String start(Model model) {
        List<FilmDto> films = maintenanceService.findAllFilms();
        model.addAttribute("films", films);
        return "maintenance";
    }

}
