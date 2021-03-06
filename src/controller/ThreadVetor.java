package controller;

public class ThreadVetor extends Thread {
	private int num;
	private int v[] = new int[1000];

	public ThreadVetor(int num, int v[]) {
		this.num = num;
		this.v = v;
	}

	@Override
	public void run() {
		if (num % 2 == 0) {
			par();
		} else {
			impar();
		}

		super.run();
	}

	public void par() {
		double inicio = System.nanoTime();

		for (int i = 0; i < v.length; i++) {

		}

		double fim = System.nanoTime();
		double dur = (fim - inicio) / Math.pow(10, 9);

		System.out.printf("%d: %.9f s%n", num, dur);
	}

	public void impar() {
		double inicio = System.nanoTime();

		for (int a : v) {

		}

		double fim = System.nanoTime();
		double dur = (fim - inicio) / Math.pow(10, 9);

		System.out.printf("%d: %.9f s%n", num, dur);
	}

}
