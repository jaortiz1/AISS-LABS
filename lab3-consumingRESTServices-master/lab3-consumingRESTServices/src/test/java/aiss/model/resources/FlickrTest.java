package aiss.model.resources;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.junit.Test;

import aiss.model.flicker.Photo;
import aiss.model.flicker.PhotoSearch;
import aiss.model.omdb.MovieSearch;
import aiss.model.omdb.Search;

public class FlickrTest {
	@Test
	public void getPhotosTest() throws UnsupportedEncodingException {
		FlickrResource r = new FlickrResource();
		PhotoSearch p = r.getFlickrPhotos("Star wars");
		List<Photo> photos =p.getPhotos().getPhoto();
		assertNotNull("El valor es nullo", p);
		assertNotNull("la busqueda devolvio nullo");
		Integer i = 0;
		for (Photo px : photos) {
			System.out.println(i+") "+px.getTitle());
			i++;
			
		}

	
	}
}
