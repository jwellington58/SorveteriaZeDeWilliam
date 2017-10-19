package com.wjw.zeDeWilliam.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.wjw.zeDeWilliam.model.Picole;
import com.wjw.zeDeWilliam.model.Status;
import com.wjw.zeDeWilliam.repository.Picoles;

import ch.qos.logback.core.net.SyslogOutputStream;
@RequestMapping("/picole")
@Controller
public class PicoleController {
	@Autowired
	Picoles p;
	@RequestMapping("/novo")
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("CadastroPicole");
		mv.addObject(new Picole());
		return mv;
	}
	@RequestMapping(method = RequestMethod.POST)
	public String salvar(@Validated Picole picole, Errors err, RedirectAttributes redirect) {
		
		if(err.hasErrors()) {
			return "CadastroPicole";
		}
		
		p.save(picole);
		redirect.addFlashAttribute("mensagem", "Salvo com sucesso");
		
		
		return "redirect:/picole/novo";
		
	}
	
	@RequestMapping
	public ModelAndView pesquisar() {
		List<Picole> todosPic = p.findAll();
		ModelAndView mv = new ModelAndView("PesquisaPicole");
		mv.addObject("picoles", todosPic);
		return mv;
	}
	
	@ModelAttribute("statusTitulo")
	public List<Status> todosStatus(){
		return Arrays.asList(Status.values());
		
	}
	
	@RequestMapping("{id}")
	public ModelAndView editar(@PathVariable("id") Picole picole) {
		ModelAndView mv = new ModelAndView("CadastroPicole");
		
		mv.addObject(picole);
		return mv;
	}
	
	
}
