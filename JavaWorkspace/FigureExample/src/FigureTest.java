public class FigureTest {

	public static void main (String[] args) {
		Figure[] figs = new Figure[4];

		figs[0] = new Rectangle(10,10,10,10);
		figs[1] = new Circle(10,10,10);
		figs[2] = new Rectangle(20,20,20,20);
		figs[3] = new Circle(20,20,20);

		for (int index=0; index < figs.length; index++) {

			// clean the following code into more readable forms
			// using polymorphism (use printOut)
			System.out.println(figs[index].getTitle());
			//if (figs[index] instanceof Circle) {
				//System.out.println("   Diameter: " + ((Circle) figs[index]).diameter());
			//} 
			figs[index].printOut();
		}
	}

}
