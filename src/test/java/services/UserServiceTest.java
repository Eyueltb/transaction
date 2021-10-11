package services;

import dto.UserDTO;
import exceptions.UseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {
    @Autowired UserService userService;
    private String userId;
    private UserDTO user;

    @BeforeEach
    void setUp() {

    }

    @Test
    void create_user_success() throws UseException {
        // Given

        // When

        // Then

    }

}