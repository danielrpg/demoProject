package com.example.demo.controller;

import com.example.demo.command.PersonalCommand;
import com.example.demo.services.PersonalService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/personal")
@Controller
public class PersonalController {

    private PersonalService personalService;

    public PersonalController(PersonalService personalService) {
        this.personalService = personalService;
    }

    @GET
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON_VALUE)
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public Response getPersonal() {
        List<PersonalCommand> employeeList = new ArrayList<>();
        personalService.findAll().forEach(personal -> {
            employeeList.add(new PersonalCommand(personal));
        });
        return Response.ok(employeeList).build();
    }

//    @GET
//    @Path("/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public EmployeeCommand getEmployeeById(@PathParam("id") long id) {
//        Employee employee = service.findById(id);
//        return new EmployeeCommand(employee);
//    }
//
//    @POST
//    @Produces(MediaType.APPLICATION_JSON)
//    public EmployeeCommand addEmployee(EmployeeCommand employeeCommand) {
//        Employee employee = service.save(employeeCommand.toEmployee());
//        return new EmployeeCommand(employee);
//    }
//
//    @PUT
//    @Produces(MediaType.APPLICATION_JSON)
//    public EmployeeCommand updateEmployee(EmployeeCommand employeeCommand) {
//        Employee employee = service.save(employeeCommand.toEmployee());
//        return new EmployeeCommand(employee);
//    }
//
//    @DELETE
//    @Path("/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public void deleteEmployee(@PathParam("id") long id) {
//        service.deleteById(id);
//
//    }


}
