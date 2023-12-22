package di;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Engine {
    private String name;
    private Integer cc;

    public Engine() {
        System.out.println("Engine No Arg Constructor is getting called");
    }

    public void engineInit()
    {
        System.out.println("init method");
    }

    public void engineDestory()
    {
        System.out.println("bean destroyed");
    }
}
