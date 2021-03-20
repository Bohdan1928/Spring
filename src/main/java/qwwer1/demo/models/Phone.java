package qwwer1.demo.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String phoneProducer;
    private int model;

    public Phone() {

    }

    public Phone(int id, String phoneProducer, int model) {
        this.id = id;
        this.phoneProducer = phoneProducer;
        this.model = model;
    }

    public Phone(String phoneProducer, int model) {
        this.phoneProducer = phoneProducer;
        this.model = model;
    }

    public Phone(String phoneProducer) {
        this.phoneProducer = phoneProducer;
    }

    public Phone(int model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneProducer() {
        return phoneProducer;
    }

    public void setPhoneProducer(String phoneProducer) {
        this.phoneProducer = phoneProducer;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return id == phone.id && Objects.equals(phoneProducer, phone.phoneProducer) && Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, phoneProducer, model);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", phoneProducer='" + phoneProducer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
