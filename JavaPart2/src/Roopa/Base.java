package Roopa;

public class Base implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running");
	}
	public static void main(String args[]) {
		Thread t = new Thread(new Base());
		t.run();
		t.run();
		t.start();
	}

}
