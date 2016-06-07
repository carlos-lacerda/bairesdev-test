package cl.danielgutierrez.baires.ex2;

/**
 * @author daniel.gutierrez
 */
public class NoMorePeopleException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public NoMorePeopleException(String message) {
        super(message);
    }
}
