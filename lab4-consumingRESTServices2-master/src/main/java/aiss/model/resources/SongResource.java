package aiss.model.resources;

import java.util.Arrays;
import java.util.Collection;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.Playlist;
import aiss.model.Song;

public class SongResource {

	private String uri = "http://playlist-api.appspot.com/api/songs";
	//private String uri = "http://localhost:8095/api/songs";

	
	public Collection<Song> getAll() {
		System.out.println("==================");
		System.out.println("getAllSongs");
		System.out.println("==================");
		ClientResource cr = null;
		Song [] songs = null;
		try {
			cr = new ClientResource(uri);
			songs = cr.get(Song[].class);
			
			
		} catch (ResourceException re) {
			System.err.println("Error when retrieving all songs: " + cr.getResponse().getStatus());
			throw re;
		}
		for (int i = 0; i < songs.length; i++) {
			System.out.println((i+1)+songs[i].getTitle());
		}
		return Arrays.asList(songs);
	}
	

	public Song getSong(String songId) {
		System.out.println("==================");
		System.out.println("getSong");
		System.out.println("==================");
		ClientResource cr = null;
		Song  s = null;
		try {
			cr = new ClientResource(uri);
			s= cr.get(Song.class);
			System.out.println("Song with id "+songId+ "===> "+s);
			
		} catch (ResourceException re) {
			System.err.println("Error when retrieving one songs: " + cr.getResponse().getStatus());
			throw re;
		}
		System.out.println(s);
		
		return s;
	}
	

	public Song addSong(Song song) {
		System.out.println("==================");
		System.out.println("addSong");
		System.out.println("==================");
		ClientResource cr = null;
		Song resultSong = null;
		try {
			cr = new ClientResource(uri);
			cr.setEntityBuffering(true);		// Needed for using RESTlet from JUnit tests
			resultSong = cr.post(song,Song.class);
			System.out.println("Song added ==> "+resultSong);
			
		} catch (ResourceException re) {
			System.err.println("Error when adding the song: " + cr.getResponse().getStatus());
		}
		System.out.println(resultSong);
		return resultSong;

	}
	
	public boolean updateSong(Song song) {
		ClientResource cr = null;
		boolean success = true;
		System.out.println("==================");
		System.out.println("updateSong");
		System.out.println("==================");
		try {
			cr = new ClientResource(uri);
			cr.setEntityBuffering(true);		// Needed for using RESTlet from JUnit tests
			cr.put(song);
			System.out.println("Have been update the song "+song.toString()+"? ==>"+success);
			
			
		} catch (ResourceException re) {
			System.err.println("Error when updating the song: " + cr.getResponse().getStatus());
			success = false;
		}
		System.out.println(success);
		
		return success;
	}
	

	public boolean deleteSong(String songId) {
		ClientResource cr = null;
		boolean success = true;
		System.out.println("==================");
		System.out.println("updateSong");
		System.out.println("==================");
		try {
			cr = new ClientResource(uri + "/" + songId);
			cr.setEntityBuffering(true);		// Needed for using RESTlet from JUnit tests
			cr.delete();
			System.out.println("Have been update the song "+songId+"? ==>"+success);
			System.out.println(success);
			
		} catch (ResourceException re) {
			System.err.println("Error when deleting the song: " + cr.getResponse().getStatus());
			success = false;
			throw re;
			
		}
		
		return success;
		
	}
}
