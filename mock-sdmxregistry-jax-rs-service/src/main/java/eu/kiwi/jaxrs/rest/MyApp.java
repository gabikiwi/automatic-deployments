package eu.kiwi.jaxrs.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("rest")
public class MyApp extends Application {

   @Override
    public Set<Class<?>> getClasses() {
	Set<Class<?>> resources = new HashSet<>();
	resources.add(SchemaResource.class);
	resources.add(StructureResource.class);
	return resources;
	
	}
}