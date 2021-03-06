package infrastructure.repositories;

import utils.UserCredentials;

public interface UserRepository {

    boolean exist(UserCredentials userCredentials);

    String role(UserCredentials userCredentials) throws Exception;

}
