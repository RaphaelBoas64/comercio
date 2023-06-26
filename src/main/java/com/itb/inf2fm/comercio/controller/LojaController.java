package com.itb.inf2fm.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2fm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
List<Produto> listaDeProdutos = new ArrayList<Produto>();

@GetMapping("listar")
public String listarProdutos(Model model) {
	
	Produto p1 = new Produto();
	p1.setId(28l);
	p1.setNome("Maquina de lavar Brastemp 15 1");
	p1.setCodigoBarras("145JIFJFUDE212456");
	p1.setDescricao("Produto Linha branca com papel digital");
	p1.setPreco(3215.89);
	
	Produto p2 = new Produto();
	p2.setId((long)201);
	p2.setNome("Telivisor 70");
	p2.setCodigoBarras("TLERD44487114454");
	p2.setDescricao("Televisor Tela Plana led Samsung");
	p2.setPreco(6326.12);
	
	Produto p3 = new Produto();
	p3.setId((long)269);
	p3.setNome("Micro-ondas Philco");
	p3.setCodigoBarras("12FF75SB2NIGA645");
	p3.setDescricao("Micro-ondas 20L Branco 110V");
	p3.setPreco(599.99);
	
	listaDeProdutos.add(p1);
	listaDeProdutos.add(p2);
	listaDeProdutos.add(p3);
	model.addAttribute("listaDeProdutos", listaDeProdutos);
	
		return "produtos";
	}
}
