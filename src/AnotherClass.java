
class AnotherClass {

	public static int add(Object xx, Object yy) {
		try {
			int x = (Integer) xx;
			int y = (Integer) yy;
			return x + y;
		} catch (Exception e) {
			return 0;
		}
	}

}
