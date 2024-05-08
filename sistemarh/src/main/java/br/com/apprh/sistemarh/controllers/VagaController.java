package br.com.apprh.sistemarh.controllers;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.apprh.sistemarh.models.Candidato;
import br.com.apprh.sistemarh.models.Vaga;
import br.com.apprh.sistemarh.repository;

@Controller
public class VagaController {
    
    private VagaRepository vr;
    private CandidatoRepository cr;
}
