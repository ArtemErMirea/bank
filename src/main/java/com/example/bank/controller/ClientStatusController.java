package com.example.bank.controller;

import com.example.bank.domain.ClientStatusService;
import com.example.bank.model.entities.ClientStatus;
import com.example.bank.model.repos.ClientStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path="/status") // This means URL's start with /demo (after Application path)
public class ClientStatusController {
    @Autowired
    private ClientStatusRepository clientStatusRepository;

    @GetMapping(path="/get")
    public ClientStatus getClientStatus(@RequestParam(value = "id", defaultValue = "1") long id){
        return clientStatusRepository.getReferenceById(id);
    }
}
