package com.pichon.memo.controlador;

import java.util.List;

import com.pichon.memo.modelo.Cliente;
import com.pichon.memo.servicio.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemoController {

    @Autowired
    private MemoService memoService;

    @RequestMapping(value="/cliente", method=RequestMethod.GET)
    public ResponseEntity<List<Cliente>> getAllBlog(){
        return new ResponseEntity<List<Cliente>>(memoService.getAllCliente(), HttpStatus.OK);
    }

    @RequestMapping(value = "/cliente/{id}", method = RequestMethod.GET)
    public ResponseEntity<Cliente> getToDoById(@PathVariable("id") long id) {
        return new ResponseEntity<Cliente>(memoService.getClienteById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/cliente", method = RequestMethod.POST)
    public ResponseEntity<Cliente> saveToDo(@RequestBody Cliente cliente) {
        return new ResponseEntity<Cliente>(memoService.saveCliente(cliente), HttpStatus.OK);
    }

    @RequestMapping(value = "/cliente", method = RequestMethod.PUT)
    public ResponseEntity<Cliente>  updateToDo(@RequestBody Cliente cliente) {
        return new ResponseEntity<Cliente>(memoService.saveCliente(cliente), HttpStatus.OK);
    }

    @RequestMapping(value = "/cliente/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> removeToDoById(@PathVariable("id") long id){
        Cliente cliente = memoService.getClienteById(id);
        memoService.removeCliente(cliente);
        return new ResponseEntity<String>("Cliente eliminado", HttpStatus.OK);
    }
}