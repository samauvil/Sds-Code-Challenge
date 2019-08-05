package Challenge.SDS.Sam.service;

import Challenge.SDS.Sam.model.Item;
import org.springframework.stereotype.Service;

@Service
public class ShopService
{
    public Item getItem (String name){
        Item cheese = new Item(name, 10 , 5);
    return cheese;
    }
}
