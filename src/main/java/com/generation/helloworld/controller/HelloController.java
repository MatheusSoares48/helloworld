package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	private String hello() {
		return "<i>Hello Word !!</i> <br /> By: Matheus Soares Rodrigues";
	}
	
	@GetMapping("/bsm")
	private String bsm() {
		return "<b>\n BSM </b> "
				+ "<br /> • Orientação ao futuro.\r\n"
				+ "<br /> • Responsabilidade pessoal.\r\n"
				+ "<br /> • Mentalidade de crescimento. \r\n"
				+ "<br /> • Persistência.\r\n"
				+ "<br /> • Trabalho em equipe. \r\n"
				+ "<br /> • Orientação aos detalhes.\r\n"
				+ "<br /> • Proatividade e comunicação.\r\n"
				+ "<br /> • Boas Praticas.\r\n"
				+ "<br /> • Cultura de feedbacks.";
	}
	
	@GetMapping("/objetivos")
	private String objetivos() {
		return "<b>\n Objetivos da Semana !! </b> "
				+ "<br /> Para essa semana eu tenho o objetivo"
				+ "<br /> de me aprimorar nas BSMs voltadas a "
				+ "<br /> comunicação e abrir a camera com mais"
				+ "<br /> frequencia, para assim me tornar um pro-,"
				+ "<br /> fissional com cada vez mais qualidades,"
				+ "<br /> e assim, me tornar um membro de equipe"
				+ "<br /> cada vez mais útil para a equipe como "
				+ "<br /> um todo."
				+ "<br /> "
				+ "<br /> <i>\n Metas Tecnicas</i>"
				+ "<br /> Insomnia"
				+ "<br /> Spring"
				+ "<br /> Logica de programação"
				+ "<br /> SQL"
				+ "<br /> DER"
				+ "<br /> Java";
	}
	
}
