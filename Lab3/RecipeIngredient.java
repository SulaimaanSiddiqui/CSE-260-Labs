
public class RecipeIngredient extends Ingredient {
	
	private float amount;
	
	
	public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity) {
		super(name, measuringUnit, caloriesPerUnit);
		amount = quantity;
	}
	
	public void setQuantity(float q){
		amount = q;
	}

	public float getQuantity(){
		return amount;
	}
	
	public String toString(){
		return(super.getName() + " ");
	}
}
