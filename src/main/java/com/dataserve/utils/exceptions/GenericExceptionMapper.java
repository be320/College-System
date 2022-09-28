package com.dataserve.utils.exceptions;

import javax.json.bind.JsonbException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.json.simple.JSONObject;

@Provider
public class GenericExceptionMapper extends Throwable implements ExceptionMapper<JsonbException> {
    @Override
    public Response toResponse(JsonbException thrExe) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("errorMessage", "Invalid input provided");
        return Response.status(400).entity(jsonObject.toString())
        .type("application/json").build();
    }

}