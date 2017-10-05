import java.util.ArrayList;

public class CookingRecipe {
	
	private String name;
	private ArrayList<RecipeIngredient> recIngreds;
	private ArrayList<Ingredient> ingreds;
	
	public CookingRecipe(String name) {
		this.name = name;
		recIngreds = new ArrayList<RecipeIngredient>();
		ingreds = new ArrayList<Ingredient>();
	}
	
	public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity){

		if(ingreds.contains(ingredient))
		{
			for(RecipeIngredient i: recIngreds){
				if(i.equals(ingredient))
					i.setQuantity(quantity);
			}
		}
		else{
			ingreds.add(ingredient);
			RecipeIngredient newIngred = new RecipeIngredient(ingredient.getName(),
					ingredient.getUnit(), ingredient.getCals(), quantity);
			recIngreds.add(newIngred);
		}
	}
	
	public RecipeIngredient getRecipeIngredient(Ingredient ingredient){
		for(RecipeIngredient i: recIngreds){
			if(i.equals(ingredient))
				return i;
		}
		return null;
	}
		
	public RecipeIngredient getRecipeIngredient(String ingredientName){
		for(RecipeIngredient i: recIngreds){
			if(i.getName().equals(ingredientName))
				return i;
		}
		return null;
	}
	
	public RecipeIngredient removeRecipeIngredient(Ingredient ingredient){
		for(int i = 0;i<recIngreds.size();i++){
			if(recIngreds.get(i).equals(ingredient)){
				RecipeIngredient place = recIngreds.get(i);
				recIngreds.remove(i);
				ingreds.remove(i);
				return place;
			}
		}
		return null;
	}
	
	public RecipeIngredient removeRecipeIngredient(String ingredientName){
		for(int i = 0;i<recIngreds.size();i++){
			if(recIngreds.get(i).getName().equals(ingredientName)){
				RecipeIngredient place = recIngreds.get(i);
				recIngreds.remove(i);
				ingreds.remove(i);
				return place;
			}
		}
		return null;
	}
	
	public float calculateCalories(){
		int c = 0;
		for(int i = 0;i<recIngreds.size();i++){
			c+=recIngreds.get(i).getCals();
			}
		return (float)c;
	}
	
	public String getName(){
		return name;
	}
	
	public int getNumberOfIngredients(){
		return ingreds.size();
	}

	public String toString(){
		String s  = name + ": \n";
		for(int i = 0;i<recIngreds.size();i++){
			s+= "\t" + recIngreds.get(i).getName() + "\n";
		}
		return s;
	}
	
	public ArrayList<RecipeIngredient> getRecIngredients(){
		return recIngreds;
	}
	
}
