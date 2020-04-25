package eu.kiwi.jaxrs.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("schema/{structure :datastructure|dataflow|provisionagreement}")
public class SchemaResource {

	@PathParam("structure") private String structure;

	
    @GET
    // @Produces({"application/xml", "application/vnd.sdmx.schema+xml" })
    @Produces(MediaType.TEXT_PLAIN )
    @Path("{agencyID}/{resourceID}/{version}")
    public String getSchema(@PathParam("agencyID") String agencyID, @PathParam("resourceID") String resourceID, @PathParam("version") String version ) {

        return "Inside /schema/ {structure} is " + structure + " {resourceID} is " 
        		+ resourceID + " {agencyID} is " + agencyID + " {version} is " + version;
    }

    @GET
   // @Produces({"application/xml", "application/vnd.sdmx.schema+xml" })
    @Produces(MediaType.TEXT_PLAIN )
    @Path("{agencyID}/{resourceID}")
    public String getSchemaStructureLatest(@PathParam("resourceID") String resourceID, @PathParam("agencyID") String agencyID) {
      
    	return "Inside /schema/ {structure} is " + structure + " {agencyID} is " + agencyID + " {resourceID} is " + resourceID;
    }

}
