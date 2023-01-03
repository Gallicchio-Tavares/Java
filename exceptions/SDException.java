package exceptions;

public class SDException extends RuntimeException{ // sde = sem dinheiro exception
    public SDException(String msg){
        super(msg);
    }
}
