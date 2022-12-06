import java.util.Scanner;

class Point {
	int x1, y1;
	private int x, y;

	public Point(int x, int y) {
		this.x1 = x;
		this.y1 = y;
	}

	public void print() {
		System.out.println(x1 + " " + y1);
	}

	public int getX() {
		return x1;
	}

	public int getY() {
		return y1;
	}
}

class Triangle {
	Point[] p1;
	private Point[] p;

	public Triangle(int[] param) {
		p1 = new Point[3];
		for (int i = 0, j = 0; i < p1.length; i++, j += 2) {
			p1[i] = new Point(param[j], param[j + 1]);
		}
	}

	public void print() {
		for (int i = 0; i < p1.length; i++) {
			p1[i].print();
		}
	}

	public void getCoG() {
		int x = 0, y = 0;
		for (int i = 0; i < p1.length; i++) {
			x += p1[i].getX();
			y += p1[i].getY();
		}
		System.out.printf("(%.1f, %.1f)\n", (double) x / 3, (double) y / 3);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] p = new int[6];
		for (int i = 0; i < p.length; i++) {
			p[i] = sc.nextInt();
		}
		sc.close();

//		for (int i = 0; i < p.length; i++) {
//			System.out.print(p[i] + " ");
//		}

		Triangle tri = new Triangle(p);
//		tri.print();
		tri.getCoG();
	}
}