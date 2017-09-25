/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguros.service;

import com.google.gson.Gson;
import com.seguros.model.Campo;
import com.seguros.model.Plantilla;
//import com.sun.jersey.core.header.FormDataContentDisposition;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;  

@Path("/plantillas")
public class PlantillasService {

    @GET
    @Path("/{param}")
    public Response getMsg(@PathParam("param") String msg) {
        String output = "Jersey say : " + msg;
        return Response.status(200).entity(output).build();
    }

    @GET
    @Path("/getAll")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(@PathParam("param") String msg) {
        List<Plantilla> plantillas = new ArrayList<>();
        List<Campo> campos = new ArrayList<>();
        campos.add(new Campo(new BigInteger("1"), "Prima"));
        campos.add(new Campo(new BigInteger("2"), "Asegurado"));
        campos.add(new Campo(new BigInteger("3"), "Tipo"));

        Plantilla plantilla1 = new Plantilla();
        plantilla1.setId(new BigInteger("1"));
        plantilla1.setNombre("ENDOSO");
        plantilla1.setUrl("C:\\Documentos\\Endoso.jxml");
        plantilla1.setCampos(campos);
        plantillas.add(plantilla1);

        Plantilla plantilla2 = new Plantilla();
        plantilla2.setId(new BigInteger("2"));
        plantilla2.setNombre("Poliza");
        plantilla2.setUrl("C:\\Documentos\\Poliza.jxml");
        plantilla2.setCampos(campos);
        plantillas.add(plantilla2);

        Plantilla plantilla3 = new Plantilla();
        plantilla3.setId(new BigInteger("3"));
        plantilla3.setNombre("Cedula");
        plantilla3.setUrl("C:\\Documentos\\cedula.jxml");
        plantilla3.setCampos(campos);
        plantillas.add(plantilla3);

        String json = new Gson().toJson(plantillas);
        System.out.println(json);

        String output = "Jersey say : " + msg;
        return Response.status(200).entity(json).build();
    }
    

    @POST
    @Path("/upload")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public Response uploadFile(@FormDataParam("file") InputStream uploadedInputStream, @FormDataParam("file") FormDataContentDisposition fileDetail) {
//    public Response uploadFile(
//            @FormDataParam("file") InputStream uploadedInputStream,
//            @FormDataParam("file") FormDataContentDisposition fileDetail) {
//        String fileLocation = "e://" + fileDetail.getFileName();
//        //saving file  
//        try {
//            FileOutputStream out = new FileOutputStream(new File(fileLocation));
//            int read = 0;
//            byte[] bytes = new byte[1024];
//            out = new FileOutputStream(new File(fileLocation));
//            while ((read = uploadedInputStream.read(bytes)) != -1) {
//                out.write(bytes, 0, read);
//            }
//            out.flush();
//            out.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String output = "File successfully uploaded to : " + fileLocation;
//        return Response.status(200).entity(output).build();
        return Response.status(200).entity("ok").build();
    }
}
