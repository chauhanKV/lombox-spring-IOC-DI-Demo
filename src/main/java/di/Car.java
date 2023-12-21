package di;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Car {
    private String name;
    private Engine engine;

    public Car()
    {
        System.out.println("Car Constructor");
        name = "Tata";
        engine = new Engine("Engine1" , 1200);
    }

    public Car(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public void runCar()
    {
        System.out.println("Running car "+name+ " with engine " + engine.getName());
    }
}
