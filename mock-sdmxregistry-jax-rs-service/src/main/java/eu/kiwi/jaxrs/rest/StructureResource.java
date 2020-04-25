package eu.kiwi.jaxrs.rest;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("{structure :datastructure|metadatastructure|categoryscheme|conceptscheme|codelist|hierarchicalcodelist|organisationscheme|agencyscheme|dataproviderscheme|dataconsumerscheme|organisationunitscheme|dataflow|metadataflow|reportingtaxonomy|provisionagreement|structureset|process|categorisation|contentconstraint|attachmentconstraint|structure}")
public class StructureResource {

	@PathParam("structure") private String structure;
	
	//this is global 
	@QueryParam("query") private String queryParamExample;
	
	
	
    @GET
    @Produces(MediaType.TEXT_PLAIN )
    public String getStructureAll(@DefaultValue("full") @QueryParam("detail") String detail, @QueryParam("references") String references) {
       
    	if (references == null) {
        return " There is no references queryparam and {structure} is " + structure + " Query param detail is " + detail ;
    	}
    	else {
    	return "{structure} is " + structure + " Query param detail is " + detail + " Query param referneces is " +  references;
    	}
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    //@Produces({MediaType.TEXT_PLAIN,"application/xml", "application/vnd.sdmx.structure+xml", "application/vnd.sdmx.edistructure" })
    @Path("{agencyID}/{resourceID}/{version}")
    public String getStructure(@PathParam("resourceID") String resourceID, @PathParam("agencyID") String agencyID, @PathParam("version") String version) {
        
        return "{structure} is " + structure + " {resourceID} is " 
        		+ resourceID + " {agencyID} is " + agencyID + " {version} is " + version;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
   // @Produces({MediaType.TEXT_PLAIN,"application/xml", "application/vnd.sdmx.structure+xml", "application/vnd.sdmx.edistructure" })
    @Path("{agencyID}/{resourceID}")
    public String getStructureLatest(@PathParam("resourceID") String resourceID, @PathParam("agencyID") String agencyID) {
     
        return "{structure} is " + structure + " " + "{resourceID} is " 
        		+ resourceID + " " + "{agencyID} is " + agencyID ;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    // @Produces({MediaType.TEXT_PLAIN,"application/xml", "application/vnd.sdmx.structure+xml", "application/vnd.sdmx.edistructure" })
    @Path("{agencyID}")
    public String getStructureAllIdsLatest(@PathParam("agencyID") String agencyID) {
     
        return "{structure} is " + structure + " " + "{agencyID} is " + agencyID ;
    }


}