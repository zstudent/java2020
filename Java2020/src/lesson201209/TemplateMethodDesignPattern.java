package lesson201209;

public class TemplateMethodDesignPattern {

	public static void main(String[] args) {
		AA aa = new AA();
		aa.process();
	}

}


abstract class Origin {
	
	int x, y, z;
	
	public void process() {
		xx();
		yy();
		zz();
	}
	
	protected abstract void yy();

	private void xx() {
		x++;
	}

	private void zz() {
		z++;
	}

}

class AA extends Origin {


	protected void yy() {
		y++;
	}

	
}

class BBWithTemplateMethod extends Origin {
	@Override
	protected void yy() {
		y--;
	}
}

class BBMoreOrLessGood extends AA {
	@Override
	public void process() {
		super.process();
		y -= 2;  // make a correction
	}
}

class BBNotSoGood extends AA {
	
	@Override
	public void process() {
		x++;
		y--;
		z++;
	}
	
}



// COPY/PASTE:  do not use it!
class BB { 
	int x, y, z;
	
	public void process() {
		x++;
		y--;
		z++;
	}
	
}

