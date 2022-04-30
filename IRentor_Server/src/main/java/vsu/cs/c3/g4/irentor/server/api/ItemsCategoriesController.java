package vsu.cs.c3.g4.irentor.server.api;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vsu.cs.c3.g4.irentor.server.service.ItemsCategoriesService;
import vsu.cs.c3.g4.irentor.server.service.ItemsService;

@RestController
@RequestMapping("/api")
@Api(description = "items categories controller")
public class ItemsCategoriesController {
    private ItemsCategoriesService itemsCategoriesService;
    private ItemsService itemsService;

    @GetMapping("/api")
    String test() {
        return "it is working";
    }
}
