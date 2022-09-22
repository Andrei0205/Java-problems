package Construction;

import data.LandOwner;
import data.Plot;
import data.CircleCalculator;
import data.Circle;
import data.CircleCalculatorRole;
import data.RectanglePlot;
import data.SquarePlot;
import data.TaxCalculator;
import data.TaxCalculatorRole;

public class Application {

	private LandOwner john = new LandOwner();
	Plot firstRectangle = new RectanglePlot(20,40);
	Plot firstSquare = new SquarePlot(15);
	CircleCalculatorRole circleCalculator = new CircleCalculator(3.14);
	Plot firstCircle = new Circle(15,circleCalculator);
	TaxCalculatorRole taxCalculator = new TaxCalculator(0.01);
	

	Application() {
		john.addPlot(firstCircle);
		john.addPlot(firstRectangle);
		john.addPlot(firstSquare);
	}

	public static void main(String[] args) {
		
		Application application = new Application();
		application.launch();

	}

	
	private void launch() {
		System.out.println(john.totalArea() + "mp");
		System.out.println(taxCalculator.haveToPay(john) + "ron");
		john.removePlot(2);
		System.out.println("After remove");
		System.out.println(john.totalArea() + "mp");
		System.out.println(taxCalculator.haveToPay(john) + "ron");

		
		
	}

}
