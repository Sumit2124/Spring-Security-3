package com.spring.Security.Exception;

public class UserNotFoundException extends RuntimeException
{

    public UserNotFoundException()
    {
        super("User is not found");
    }
    public UserNotFoundException(String msg)
    {
        super(msg);
    }

}
