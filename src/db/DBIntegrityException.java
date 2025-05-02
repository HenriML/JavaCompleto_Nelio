package db;

public class DBIntegrityException extends RuntimeException {

    private static final long serialVersionUID = 1l;

    public DBIntegrityException(String message) {
        super(message);
    }
}
