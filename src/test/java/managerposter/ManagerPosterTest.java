package managerposter;

// import static org.junit.Assert.assertArrayEquals;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;


public class ManagerPosterTest {
	
	@Test
	public void shouldFindAll() {
		ManagerPoster manager = new ManagerPoster();
		PostersItems first = new PostersItems (1, "Фильм 1");
		PostersItems second = new PostersItems (2, "Фильм 2");
		
		manager.add(first);
		manager.add(second);
		
		PostersItems[] actual = manager.findAll();
		PostersItems[] expected = new PostersItems[] {first, second};
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void shouldFindLast() {
		ManagerPoster manager = new ManagerPoster();
		PostersItems item1 = new PostersItems (1, "Фильм 1");
		PostersItems item2 = new PostersItems (2, "Фильм 2");
		PostersItems item3 = new PostersItems (3, "Фильм 3");
		PostersItems item4 = new PostersItems (4, "Фильм 4");
		PostersItems item5 = new PostersItems (5, "Фильм 5");
		PostersItems item6 = new PostersItems (6, "Фильм 6");
		PostersItems item7 = new PostersItems (7, "Фильм 7");
		PostersItems item8 = new PostersItems (8, "Фильм 8");
		PostersItems item9 = new PostersItems (9, "Фильм 9");
		PostersItems item10 = new PostersItems (10, "Фильм 10");
		PostersItems item11 = new PostersItems (11, "Фильм 11");
		
		manager.add(item1);
		manager.add(item2);
		manager.add(item3);
		manager.add(item4);
		manager.add(item5);
		manager.add(item6);
		manager.add(item7);
		manager.add(item8);
		manager.add(item9);
		manager.add(item10);
		manager.add(item11);
		
		PostersItems[] actual = manager.findLast();
		PostersItems[] expected = new PostersItems[] {item11, item10, item9, item8, item7,
				item6, item5, item4, item3, item2};
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void shouldFindLastFive() {
		ManagerPoster manager = new ManagerPoster(5);
		PostersItems item1 = new PostersItems (1, "Фильм 1");
		PostersItems item2 = new PostersItems (2, "Фильм 2");
		PostersItems item3 = new PostersItems (3, "Фильм 3");
		PostersItems item4 = new PostersItems (4, "Фильм 4");
		PostersItems item5 = new PostersItems (5, "Фильм 5");
		PostersItems item6 = new PostersItems (6, "Фильм 6");
		PostersItems item7 = new PostersItems (7, "Фильм 7");
		PostersItems item8 = new PostersItems (8, "Фильм 8");
		PostersItems item9 = new PostersItems (9, "Фильм 9");
		PostersItems item10 = new PostersItems (10, "Фильм 10");
		PostersItems item11 = new PostersItems (11, "Фильм 11");
		
		manager.add(item1);
		manager.add(item2);
		manager.add(item3);
		manager.add(item4);
		manager.add(item5);
		manager.add(item6);
		manager.add(item7);
		manager.add(item8);
		manager.add(item9);
		manager.add(item10);
		manager.add(item11);
		
		PostersItems[] actual = manager.findLast();
		PostersItems[] expected = new PostersItems[] {item11, item10, item9, item8, item7};
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void shouldFindLastLengthLessLimit() {
		ManagerPoster manager = new ManagerPoster(5);
		PostersItems item1 = new PostersItems (1, "Фильм 1");
		PostersItems item2 = new PostersItems (2, "Фильм 2");
		PostersItems item3 = new PostersItems (3, "Фильм 3");
		
		manager.add(item1);
		manager.add(item2);
		manager.add(item3);
		
		
		PostersItems[] actual = manager.findLast();
		PostersItems[] expected = new PostersItems[] {item3, item2, item1};
		
		assertArrayEquals(expected, actual);
	}
}
