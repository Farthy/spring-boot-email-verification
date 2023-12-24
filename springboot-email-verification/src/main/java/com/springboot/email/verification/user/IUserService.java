package com.springboot.email.verification.user;

import com.springboot.email.verification.registration.RegistrationRequest;
import com.springboot.email.verification.registration.token.VerificationToken;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    List<User> getUser();
    User registerUser(RegistrationRequest request);
    Optional<User> findByEmail(String email);

    void saveUserVerificationToken(User theUser, String verificationToken);

    String validateToken(String theToken);
}

