package aiss.model.resources;

import static org.junit.Assert.*;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.restlet.resource.ResourceException;

import aiss.model.Song;

public class SongResourceTest {

	static Song song1, song2, song3;
	static SongResource sr = new SongResource();
	
	@BeforeClass
	public static void setup() throws Exception {
		
		// Test song 1
		song1 = sr.addSong(new Song("Test title","Test artist","Test album","2016"));
		
		// Test song 2
		song2 = sr.addSong(new Song("Test title 2","Test artist 2","Test album 2","2017"));
		
	}

	@AfterClass
	public static void tearDown() throws Exception {
		sr.deleteSong(song1.getId());
		sr.deleteSong(song3.getId());
	}
	
	@Test
	public void testGetAll() {
		Collection<Song> songs = sr.getAll();
		
		assertNotNull("The collection of songs is null", songs);
		System.out.println("===========\ntestGetAll\n=========");

		// Show result
		System.out.println("Listing all songs:");
		int i=1;
		for (Song s : songs) {
			System.out.println("Song " + i++ + " : " + s.getTitle() + " (ID=" + s.getId() + ")");
		}
	}

	@Test
	public void testGetSong() {
		System.out.println("===========\ntestGetSong\n=========");
		Song s = sr.getSong(song1.getId());
		assertNotNull("The song is not null");
		System.out.println("Song obtained: "+s);
	}

	@Test
	public void testAddSong() {
		System.out.println("===========\ntestAddSong()\n=========");
		Song s = new Song("titleTest", "artistTest", "albumTests", "yearTest");
		Song result = sr.addSong(s);
		assertNotNull("The added song is null", result);
		System.out.println("success in adding song");
		
	}

	@Test
	public void testUpdateSong() {
		System.out.println("===========\ntestUpdateSong()\n=========");

		String songTitle = "Update song test title";
		String songArtist = "Update song test artist";
		String songAlbum = "Update song test album";
		String songYear = "1995";
		
		// Update song
		song1.setTitle(songTitle);
		song1.setArtist(songArtist);
		song1.setAlbum(songAlbum);
		song1.setYear(songYear);
		
		boolean success = sr.updateSong(song1);
		
		assertTrue("Error when updating the song", success);
		
		Song song  = sr.getSong(song1.getId());
		System.out.println(song);
		assertEquals("The song's title has not been updated correctly", songTitle, song.getTitle());
		assertEquals("The song's artist has not been updated correctly", songArtist, song.getArtist());
		assertEquals("The song's album has not been updated correctly", songAlbum, song.getAlbum());
		assertEquals("The song's year has not been updated correctly", songYear, song.getYear());
	}

	@Test(expected = ResourceException.class)
	public void testDeleteSong() {
		System.out.println("===========\ntestDeleteSong()\n=========");

		
		// Delete songs
		boolean success = sr.deleteSong(song2.getId());
		
		assertTrue("Error when deleting the song", success);
		
		Song song  = sr.getSong(song2.getId());
		System.out.println("Deleted song ==> "+song);
		assertNull("The song has not been deleted correctly", song);
	}

}
