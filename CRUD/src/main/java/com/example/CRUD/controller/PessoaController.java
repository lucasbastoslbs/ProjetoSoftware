package com.example.CRUD.controller;

import com.example.CRUD.Repository.PessoaRepository;
import com.example.CRUD.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/pessoa")
public class PessoaController {
    @Autowired //marcacao do atributo que acessa o CRUD de pessoa
    private PessoaRepository pessoaRepository;
    @GetMapping(path = "/cadastrar")
    public String cadastrarPessoa(Model model){
        //mandar objeto para o html
        model.addAttribute("pessoa", new Pessoa());
        return "cadastrarPessoa";
    }

    @PostMapping("/save")
    public String salvarPessoa(@ModelAttribute Pessoa pessoa, Model model){
        pessoaRepository.save(pessoa);
        return "salvarPessoa";
    }

    @GetMapping(path = "/listar")
    public String listarPessoa(@ModelAttribute Pessoa pessoa, Model model){
        List<Pessoa> lista = (List<Pessoa>) pessoaRepository.findAll();
        model.addAttribute("lista",lista);
        return "listarPessoa";
    }
}
