package via.sep3.logicserver.shared.Exceptions;

public class DAOException extends Exception {

    public DAOException(String error) {
        super(error);
    }

    public DAOException(String error, Throwable err) {
        super(error, err);
    }
}
