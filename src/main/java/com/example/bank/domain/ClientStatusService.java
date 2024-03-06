package com.example.bank.domain;

import com.example.bank.controller.ClientStatusController;
import com.example.bank.model.entities.ClientStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientStatusService {
    @Autowired
    private ClientStatusController statusController;

    public ClientStatus getClientStatus(long id) {
        return statusController.getClientStatus(id);
    }

}
