package Challenge.SDS.Sam.controller;

import Challenge.SDS.Sam.model.Item;
import Challenge.SDS.Sam.service.ShopService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/shop")
public class ShopController
{

    private final ShopService service = new ShopService();


    @GetMapping(value = "/item/{name}")
//    @ResponseBody
    public Item getItem(@PathVariable("name") String name)
    {
        return service.getItem(name);

    }
}
