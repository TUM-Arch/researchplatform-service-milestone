package de.tum.ar.researchplatform.controller;

import de.tum.ar.researchplatform.component.security.HasUserRole;
import de.tum.ar.researchplatform.exception.CustomNotFoundException;
import de.tum.ar.researchplatform.service.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

/**
 * Created by karthik on 5/16/2020
 */
@RestController
@RequestMapping(value = "/api")
public class AuthController {
    @Autowired
    private UserServiceImpl userService;
    /**
     * Endpoint to login
     * @return login response
     */
    @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> login(@RequestHeader(value="userId" , required = true) String userId, @RequestHeader(value="password" , required = true) String password) {
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    /**
     * Endpoint to logout
     * @return logout response
     */
    @GetMapping(value = "/logout", produces = MediaType.APPLICATION_JSON_VALUE)
    @HasUserRole
    public ResponseEntity<String> logout(@RequestHeader(value="userId" , required = true) String userId) throws CustomNotFoundException {
        userService.deleteByTumId(userId);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}
