package org.globus.users.api.controllers;

import org.globus.users.api.dto.UserDto;
import org.globus.users.api.exceptions.UserNotFoundException;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
class UserModelAssembler implements RepresentationModelAssembler<UserDto, EntityModel<UserDto>> {

    @Override
    public EntityModel<UserDto> toModel(UserDto user) {
        try {
            return EntityModel.of( user,
                    linkTo(methodOn(UsersController.class).getUser(user.getId())).withSelfRel(),
                    linkTo(methodOn(UsersController.class).getUsers()).withRel("users"));
        }
        catch (UserNotFoundException e) {
            return null;
        }
    }
}
