package material;

/**
* Question 11
*
* Pizza class that stores information about a single pizza.
*
* Created: Sat Mar 15 2009
*
* @author Kenrick Mock
* @version 1
*/

public class Pizza
{
	private String size;
	private int numCheeseToppings;
	private int numHamToppings;
	private int numPepperoniToppings;

	public Pizza()
	{
		size = "Large";
		numCheeseToppings = 1;
		numHamToppings = 0;
		numPepperoniToppings = 0;
	}

	public Pizza(String pizzaSize, int cheese,
				 int ham, int pepperoni)
	{
		size = pizzaSize;
		numCheeseToppings = cheese;
		numHamToppings = ham;
		numPepperoniToppings = pepperoni;
	}

	public void setPizzaInfo(String newSize, int cheese,
				  int ham, int pepperoni)
	{
		size = newSize;
		numCheeseToppings = cheese;
		numHamToppings = ham;
		numPepperoniToppings = pepperoni;
	}

	public String getSize()
	{
		return size;
	}
	
	
	public void setNumCheeseToppings(int toppings)
	{
		numCheeseToppings = toppings;
	}
	
	public int getNumCheeseToppings()
	{
		return numCheeseToppings;
	}

	public int getNumHamToppings()
	{
		return numHamToppings;
	}

	public int getNumPepperoniToppings()
	{
		return numPepperoniToppings;
	}

	public double calcCost()
	{
		double baseCost = 10;
		if (size.equals("Small"))
		{
			baseCost = 10;
		}
		else if (size.equals("Medium"))
		{
			baseCost = 12;
		}
		else if (size.equals("Large"))
		{
			baseCost = 14;
		}
		else
		{
			System.out.println("Error, unknown size.");
			return 0;
		}
		return baseCost +
		  (numHamToppings + numCheeseToppings +
		   numPepperoniToppings)*2;
	}

	public String getDescription()
	{
		return "Size: " + size + ", Cheese Toppings: "
				+ numCheeseToppings +
			   " Pepperoni Toppings: " + numPepperoniToppings +
			   " Ham Toppings: " + numHamToppings +
			   ". Cost: " + calcCost();
	}

	public static void main(String[] args)
	{
		// Create a few sample pizzas and output their prices
		Pizza supreme = new Pizza("Large",1,2,1);
		Pizza cheese = new Pizza("Medium",2,0,0);
		Pizza pepperoni = new Pizza("Small",0,0,2);

		System.out.println(supreme.getDescription());
		System.out.println(cheese.getDescription());
		System.out.println(pepperoni.getDescription());
	}
} // Question 11
