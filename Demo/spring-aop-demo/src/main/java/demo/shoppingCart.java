package demo;

import org.springframework.stereotype.Component;


@Component
public class shoppingCart {
    public void checkout(String str)
    {
        System.out.println("Checking method from shopping cart class");
    }

    public int quantity()
    {
        return 1;
    }


}
