package com.tp2.password;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;



class PasswordValidatorTest {

    private final PasswordValidator validator = new PasswordValidator();

    @Test
    void passwordWithLessThan8CharactersShouldBeInvalid() {
        assertEquals(false, validator.isValid("abc"));
    }

    @Test
    void passwordWith8OrMoreCharactersShouldPassLengthValidation() {
        assertEquals(false, validator.isValid("abcdefgh"));
    }

    @Test
    void passwordWithoutUppercaseLetterShouldBeInvalid() {
        assertEquals(false, validator.isValid("abcdefgh1!"));
    }

    @Test
    void passwordWithoutLowercaseLetterShouldBeInvalid() {
        assertEquals(false, validator.isValid("ABCDEFG1!"));
    }

    @Test
    void passwordWithoutNumberShouldBeInvalid() {
        assertEquals(false, validator.isValid("Abcdefgh"));
    }

    @Test
    void passwordWithoutSpecialCharacterShouldBeInvalid() {
        assertEquals(false, validator.isValid("Abcdefg1"));
    }

    @Test
    void passwordMeetingAllCriteriaShouldBeValid() {
        assertEquals(true, validator.isValid("Abcdefg1!"));
    }

//    Missing tests:
//
//- Password with less than 8 characters should be invalid
//- Password with 8 or more characters should pass length validation
//- Password without uppercase letter should be invalid
//- Password without lowercase letter should be invalid
//- Password without number should be invalid
//- Password without special character should be invalid
//- Password meeting all criteria should be valid
}
