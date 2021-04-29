package aiss.model.resources;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import aiss.model.flicker.PhotoSearch;
import aiss.model.omdb.MovieSearch;



public class FlickrResource {

	private static final String FLICKR_API_KEY = "c09678d73a8802275d3a330ba6000666";
	//a6d7010be3ebb7b7
	private static final Logger log = Logger.getLogger(FlickrResource.class.getName());

	
	public PhotoSearch getFlickrPhotos(String artist) throws UnsupportedEncodingException{
		
		String uri = "https://api.flickr.com/services/rest/?method=flickr.galleries.getPhotos&api_key="+FLICKR_API_KEY+"&gallery_id=66911286-72157647277042064&format=json&nojsoncallback=1";
		log.log(Level.FINE, "NEWS URI: "+uri);
		ClientResource cr = new ClientResource(uri);
		PhotoSearch m = cr.get(PhotoSearch.class);
	    return m;
		
	}
	
}
