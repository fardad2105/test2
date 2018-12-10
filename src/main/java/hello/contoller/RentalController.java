package hello.contoller;


import hello.service.CustomerServiceImple;
import hello.service.InventoryServiceImple;
import hello.service.RentalServiceImple;

import hello.tables.pojos.Customer;
import hello.tables.pojos.Film;
import hello.tables.pojos.Inventory;
import hello.tables.pojos.Rental;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
public class RentalController {

   @Autowired
   RentalServiceImple rentalService;

   @Autowired
   CustomerServiceImple customerService;

   @Autowired
   InventoryServiceImple inventoryService;

   @RequestMapping("/rental")
   public List<Rental> movieList() {

      return rentalService.findAll();
   }


   @RequestMapping("/rent")
   public boolean movie(@RequestParam(value="id_film", defaultValue="-1") int id_film,@RequestParam(value="email", defaultValue="google") String email,@RequestParam(value="id_store", defaultValue="-1") int id_store) {

      Customer cust = customerService.findByEmail(email);
      if (cust == null) {
         System.err.println("Customer Not Found");
         return false;
      }
      List<Inventory> listInv = inventoryService.findBySF(id_store,id_film);
      for(Inventory inv : listInv)
      {
         System.out.println(inv);
         boolean isIn = rentalService.isInRentBy(inv.getInventoryId());
         System.out.println(isIn);
         if (!isIn)
         {
            Rental rent = new Rental();
            rent.setCustomerId(cust.getCustomerId().shortValue());
            rent.setInventoryId(inv.getInventoryId());

            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            rent.setRentalDate(timestamp);
            rent.setStaffId((short) 1);

            rentalService.save(rent);
            return true;
         }
      }
      return false;
   }

}
