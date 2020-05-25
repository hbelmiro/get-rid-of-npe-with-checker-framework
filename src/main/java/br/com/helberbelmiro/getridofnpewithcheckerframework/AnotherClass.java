package br.com.helberbelmiro.getridofnpewithcheckerframework;

public class AnotherClass {

    public void useMyClass(MyClass object) {
        Integer number = object.getNumber();
        if (number != null && number > 5) {
            System.out.println("The number is greated than 5");
        }

        if (object.getText().length() > 5) {
            System.out.println("The text has a length greater than 5");
        }
    }

}
