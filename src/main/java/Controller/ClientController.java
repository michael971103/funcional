package Controller;

import Services.ClientService;
import Entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public List<Client> getAll() {
        return clientService.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Client save(@RequestBody Client client) {
        return clientService.save(client);
    }
}

