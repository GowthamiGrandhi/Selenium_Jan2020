package innerClassDemo;

class Demo {
	void show() {
		System.out.println("Outer class show method executed");
	}
}
public class Demo1 {
		static Demo obj = new Demo() {
			void show() {
				super.show();
				System.out.println("Anonymous inner class emethod executed");
			}
		};
		public static void main(String[] args) {
			obj.show();
		}
	}


