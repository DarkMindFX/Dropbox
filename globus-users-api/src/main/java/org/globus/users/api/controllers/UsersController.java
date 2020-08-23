package org.globus.users.api.controllers;

import org.globus.users.api.dal.User;
import org.globus.users.api.dal.UsersDal;
import org.globus.users.api.dto.UserDto;
import org.globus.users.api.exceptions.UserNotFoundException;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.IanaLinkRelations;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/api/v1")
public class UsersController {


    private final UsersDal usersDal;
    private final UserModelAssembler userModelAssembler;

    public UsersController(UsersDal usersDal, UserModelAssembler userModelAssembler) {
        this.usersDal = usersDal;
        this.userModelAssembler = userModelAssembler;
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserDto>> getUsers() {

        List<UserDto> result = new ArrayList<UserDto>();
        usersDal.findAll().forEach( u -> result.add(new UserDto(u.getId(), u.getLogin(), null, u.getEmail())));

        return ResponseEntity.ok(result);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable Long id) throws UserNotFoundException {
        User user = usersDal.findById(id).orElseThrow(() -> new UserNotFoundException(id, null));

        UserDto result = new UserDto(user.getId(), user.getLogin(), null, user.getEmail());

        return ResponseEntity.ok(result);
    }

    @PostMapping("/users")
    public ResponseEntity<EntityModel<UserDto>> addUser(@RequestBody UserDto userDto) {

        User newUser = new User(userDto.getLogin(), userDto.getPwd_hash());
        usersDal.save(newUser);

        UserDto newUserDto = new UserDto(newUser.getId(), newUser.getLogin(), null, newUser.getEmail());

        EntityModel<UserDto> entity = userModelAssembler.toModel(newUserDto);

        return ResponseEntity
                .created(entity.getRequiredLink(IanaLinkRelations.SELF).toUri())
                .body(entity);

    }
}
