package vsu.cs.c3.g4.irentor.server.api;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vsu.cs.c3.g4.irentor.server.service.UsersService;

@RestController
@RequestMapping("/api")
@Api(description = "items in orders controller")
public class UsersController {
    private UsersService usersService;

    @GetMapping("/api")
    String test() {
        return "it is working";
    }
}
