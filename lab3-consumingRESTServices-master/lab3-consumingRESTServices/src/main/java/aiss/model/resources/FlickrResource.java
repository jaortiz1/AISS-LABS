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

	
	public PhotoSearch getFlickrPhotos(String query) throws UnsupportedEncodingException{
		String uri = "https://www.flickr.com/services/rest/?method=flickr.photos.getRecent&api_key=" + URLEncoder.encode(FLICKR_API_KEY, "UTF-8") + "&format=json&nojsoncallback=1&text="+query;
		uri = "https://www.flickr.com/services/rest/?method=flickr.photos.getRecent&api_key="+FLICKR_API_KEY+"&format=json&nojsoncallback=1&text="+query+"&content_type=1&page=1&per_page=20";
		log.log(Level.FINE, "MOVIES URI: " + uri);
		ClientResource cr = new ClientResource(uri);
		return cr.get(PhotoSearch.class);
	}
	
}
