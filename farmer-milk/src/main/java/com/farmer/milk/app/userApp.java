package com.farmer.milk.app;

import com.farmer.milk.model.UserDetails;
import com.farmer.milk.utility.Constants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name=Constants.USER_APP,description = "All UserDetails Services API")
public interface UserApp {

@Operation(summary = "UserDetails Registration",description = "This API is used for user registration UserDetails need to provide EMail Id and Mobile Number. ")
    @ApiResponses(value = {
            @ApiResponse(description ="Success",responseCode ="200"),
            @ApiResponse(description ="Successfully Created",responseCode ="201"),
            @ApiResponse(description ="Bad Request",responseCode ="400"),
            @ApiResponse(description ="UnAuthorized Request",responseCode ="401"),
            @ApiResponse(description ="Internal Server Error",responseCode ="500")}
    )
    ResponseEntity<?> registerUser(UserDetails user);

    @Operation(summary = "UserDetails login",description = "This API is used login user to Application need to provide EMail Id and Password. ")
    @ApiResponses(value = {
            @ApiResponse(description ="Success",responseCode ="200"),
            @ApiResponse(description ="Successfully Created",responseCode ="201"),
            @ApiResponse(description ="Bad Request",responseCode ="400"),
            @ApiResponse(description ="UnAuthorized Request",responseCode ="401"),
            @ApiResponse(description ="Internal Server Error",responseCode ="500")}
    )
    ResponseEntity<?> loginUser(@Parameter(name = "emailId") String emailId,@Parameter(name="password") String password);
}
