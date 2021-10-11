package services;
import dto.UserDTO;
import exceptions.UseException;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public interface UserService {
    UserDTO createUser(String name, String personalIdentificationNumber) throws UseException;

    UserDTO changeUser(String userId, Consumer<ChangeUser> changeUser) throws UseException;

    UserDTO inactivateUser(String userId) throws UseException;

    Optional<UserDTO> getUser(String userId);

    Stream<UserDTO> find(String searchString, Integer pageNumber, Integer pageSize, SortOrder sortOrder);

    interface ChangeUser {
        void setName(String name);
        void setPersonalIdentificationNumber(String personalIdentificationNumber) throws UseException;
    }

    enum SortOrder {
        None,
        Name,
        PersonalId
    }

}
