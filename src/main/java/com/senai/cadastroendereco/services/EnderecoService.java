package com.senai.cadastroendereco.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.cadastroendereco.entities.Endereco;
import com.senai.cadastroendereco.repositories.EnderecoRepository;

@Service
public class EnderecoService {
    
    @Autowired
    private EnderecoRepository enderecoRepository;
    
    //salvar endereco
    public Endereco salvar(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }
    
    //buscar todos os enderecos
    public List<Endereco> listarTodos(){
        return enderecoRepository.findAll();
    }
    
    //buscar um endereco por id
    public Optional<Endereco> buscarPorId(Long id) {
        return enderecoRepository.findById(id);
    }
    
    //deletar um endereco por id
    public void deletarPorId(Long id) {
        enderecoRepository.deleteById(id);
    }
    
}