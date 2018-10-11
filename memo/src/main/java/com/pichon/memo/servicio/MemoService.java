package com.pichon.memo.servicio;

import java.util.List;

import com.pichon.memo.repositorio.MemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pichon.memo.modelo.Cliente;
import com.pichon.memo.modelo.Products;
import com.pichon.memo.repositorio.ProductsRepository;

@Service
public class MemoService {

    @Autowired
    private MemoRepository memoRepository;
    
    //Clientes
    public List<Cliente> getAllCliente(){
        return memoRepository.findAll();
    }

    public Cliente getClienteById(long id){
        return memoRepository.getOne(id);
    }

    public Cliente saveCliente(Cliente cliente){
        return memoRepository.save(cliente);
    }

    public void removeCliente(Cliente cliente){
        memoRepository.delete(cliente);
    }
   
}