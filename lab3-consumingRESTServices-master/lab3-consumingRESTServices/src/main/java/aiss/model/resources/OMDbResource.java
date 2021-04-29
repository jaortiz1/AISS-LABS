package aiss.model.resources;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import aiss.model.omdb.MovieSearch;

public class OMDbResource {

	private static final String OMDB_API_KEY = "f0e05b55";  // TODO: Change this API KEY for your personal Key
	private static final Logger log = Logger.getLogger(OMDbResource.class.getName());
	
	public MovieSearch getMovies(String query) throws UnsupportedEncodingException {
//		String country = URLEncoder.encode(c, "UTF-8");
//		String keyword = URLEncoder.encode(key, "UTF-8");
		String uri = "http://www.omdbapi.com/?apikey="+OMDB_API_KEY+"&s="+query;
		log.log(Level.FINE, "NEWS URI: "+uri);
		ClientResource cr = new ClientResource(uri);
		MovieSearch m = cr.get(MovieSearch.class);
	    return m;
	}
}
