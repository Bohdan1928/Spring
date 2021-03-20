package qwwer1.demo.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String producer;

    public Car() {

    }

    public Car(int id, String producer) {
        this.id = id;
        this.producer = producer;
    }

    public Car(String producer) {
        this.producer = producer;
    }

    public Car(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Objects.equals(producer, car.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, producer);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", producer='" + producer + '\'' +
                '}';
    }
}
