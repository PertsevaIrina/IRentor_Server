package vsu.cs.c3.g4.irentor.server.api;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vsu.cs.c3.g4.irentor.server.service.ItemsInOrdersService;
import vsu.cs.c3.g4.irentor.server.service.ItemsService;
import vsu.cs.c3.g4.irentor.server.service.OrdersService;

@RestController
@RequestMapping("/api")
@Api(description = "items in orders controller")
public class ItemsInOrdersController {
    private ItemsInOrdersService itemsInOrdersService;
    private ItemsService itemsService;
    private OrdersService ordersService;

    @GetMapping("/api")
    String test() {
        return "it is working";
    }
}
