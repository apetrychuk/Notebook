import java.util.Scanner;

/**
 * Created by Андрей on 03.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        Notebook notebook = new Notebook();
        View view = new View(notebook);
        Controller controller = new Controller(notebook, view);
        controller.addSubscriber();
    }
}
