import menu.Menu;
import model.AbstractCar;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.concurrent.atomic.AtomicReference;

public class Application {
    public Application() {
        AtomicReference<AbstractCar> bank = new AtomicReference<AbstractCar>();

        try {
            Menu mainMenu = new Menu("Main Menu", "Taksopark structure");
            Menu subMenu = new Menu("Load DATA", "load data");
            Menu subMenu2 = new Menu("DATA operations", "data operations");
            Menu subMenu3 = new Menu("Save DATA", "save data");


            //sub menu
            mainMenu.putAction("load data", () -> subMenu.activateMenu());
            mainMenu.putAction("data operations", () -> subMenu2.activateMenu());
            mainMenu.putAction("save data", () -> subMenu3.activateMenu());


            subMenu.putAction("main menu", () -> mainMenu.activateMenu());


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
