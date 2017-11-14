

class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LapTop mylabtop = new LapTop(new Adapter(new Power(220)));
		mylabtop.powerOn();

	}

}