package vsu.cs.c3.g4.irentor.server.api;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vsu.cs.c3.g4.irentor.server.service.CustomersService;
import vsu.cs.c3.g4.irentor.server.service.UsersService;

@RestController
@RequestMapping("/api")
@Api(description = "customers controller")
public class CustomersController {
    private CustomersService customersService;
    private UsersService usersService;

    @GetMapping("/api")
    String test() {
        return "it is working";
    }
}
