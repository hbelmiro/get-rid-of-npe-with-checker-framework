package br.com.helberbelmiro.getridofnpewithcheckerframework;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

public class MyClass {

    private @Nullable Integer number;

    private @NonNull String text;

    public MyClass(@NonNull String text) {
        this.text = text;
    }

    public @Nullable Integer getNumber() {
        return this.number;
    }

    public void setNumber(@Nullable Integer number) {
        this.number = number;
    }

    public @NonNull String getText() {
        return this.text;
    }

    public void setText(@NonNull String text) {
        this.text = text;
    }

}
