package br.com.helberbelmiro.getridofnpewithcheckerframework;

import org.checkerframework.checker.nullness.qual.NonNull;

import javax.persistence.Entity;

@SuppressWarnings({"unused", "initialization.fields.uninitialized"})
@Entity
public class MyEntity {
    private Integer number;

    private MyEntity() {
        // JPA calls this private constructor using reflection.
    }

    public MyEntity(@NonNull Integer number) {
        this.number = number;
    }

    public @NonNull Integer getNumber() {
        return number;
    }

    public void setNumber(@NonNull Integer number) {
        this.number = number;
    }
}
