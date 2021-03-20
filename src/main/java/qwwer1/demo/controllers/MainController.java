package qwwer1.demo.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import qwwer1.demo.dao.CarDAO;
import qwwer1.demo.dao.PhoneDAO;
import qwwer1.demo.dao.UserRepository;
import qwwer1.demo.models.Car;
import qwwer1.demo.models.Phone;
import qwwer1.demo.models.User;

import java.util.List;

@RestController
@AllArgsConstructor
public class MainController {
    private final UserRepository userRepository;
    private final CarDAO carDAO;
    private final PhoneDAO phoneDAO;

    @GetMapping("/hello")
    public String hello() {
        System.out.println("!!!!!!!!!!!");
        return "hello";
    }

    @GetMapping("/hi")
    public String hi() {
        System.out.println("!!!!!!!!!!!");
        return "hi";
    }

    @GetMapping("/user")
    public User getUser() {
        User user = new User();
        user.setName("kokos");
        return user;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> userList = userRepository.findAll();
        return userList;
    }

    @GetMapping("/saveUser")
    public void saveUser(@RequestParam String name) {
        User user1 = new User();
        user1.setName(name);
        userRepository.save(user1);
    }

    //GetMapping Cars
    @GetMapping("/cars")
    public List<Car> getCar() {
        List<Car> carList = carDAO.findAll();
        return carList;
    }

    @GetMapping("/saveCar")
    public void saveCar(@RequestParam String producer) {
        Car car = new Car(producer);
        carDAO.save(car);
    }

    //GetMapping Phone
    @GetMapping("/phones")
    public List<Phone> getPhones() {
        List<Phone> phoneList = phoneDAO.findAll();
        return phoneList;
    }
    @GetMapping("/phoneProducer")
    public void savePhoneProducer(@RequestParam String phoneProducer){
        Phone phone = new Phone(phoneProducer);
        phoneDAO.save(phone);
    }
    @GetMapping("/model")
    public void savePhoneModel(@RequestParam int model){
        Phone phone = new Phone(model);
        phoneDAO.save(phone);

    }
    @GetMapping("/phoneProducer&Model")
    public void savePhoneProducerAndModel(@RequestParam int model, String phoneProducer) {
        Phone phone = new Phone(phoneProducer, model);
        phoneDAO.save(phone);
    }
}
