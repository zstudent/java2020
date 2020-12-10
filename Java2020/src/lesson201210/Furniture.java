package lesson201210;

abstract public class Furniture implements Soundable {

	abstract static class Wooden extends Furniture {
	}

	abstract static class Plastic extends Furniture {
	}

	static class WoodenTable extends Wooden {

		@Override
		public String sound() {
			return "scriii";
		}
	}

	static class PlasticChair extends Plastic {

		@Override
		public String sound() {
			return "--";
		}
	}

}
