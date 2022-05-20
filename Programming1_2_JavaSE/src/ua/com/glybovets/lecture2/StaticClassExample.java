package ua.com.glybovets.lecture2;

public class StaticClassExample {
	
	//Статична змінна, яка зберігає кількість екземплярів 
	//даного класу
	private static int objectsCreated = 0;
	
	//просто ще одна статична змінна
	//поле класу
	public static int a;
	
	//не статична змінна, що є
	//полем об'єкту
	public int number;
	
	//конструктор
	public StaticClassExample(){
		objectsCreated++;
	}

	/**
	 * так як поле objectsCreated захищене, то для нього існує
	 * метод, що повертає його значення
	 * і цей метод є також статичним
	 * тобто метод належить класу, а не об'єкту
	 * @return кількість об'єктів класу, що вже створені
	 */
	public static int numberOfCreatedObjects(){
		return objectsCreated;
	}
	
	/**
	 * метод робить якісь обрахунки
	 * @return якесь ціле число
	 */
	public int getSomething(){
		return a*number;
	}

}
