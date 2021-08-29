package us.stallings.employeemanager.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String messsage) {
        super(messsage);
    }
}
