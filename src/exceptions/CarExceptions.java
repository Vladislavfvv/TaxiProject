package exceptions;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CarExceptions extends Exception{
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_RED = "\u001B[31m";

    public CarExceptions(String message, Object o){
        super(String.format("Error: %s\t from Object: %s ", message, o.getClass()));
    }
    public void printMessage(){System.out.println(ANSI_RED + this.getMessage() + ANSI_RESET);}

    public void logException(){
        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;
        try{
            fh = new FileHandler("MyLogFile.log", true);
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            logger.info(this.getMessage());
        } catch(SecurityException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
