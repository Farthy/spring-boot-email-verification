package com.springboot.email.verification.registration;

import org.hibernate.annotations.NaturalId;

public record RegistrationRequest(
        String firstName,
        String LastName,
        String email,
        String password,
        String role) {
}
