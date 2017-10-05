import java.util.ArrayList;

public class RecipeBook {

	private ArrayList<CookingRecipe> recipes;
	
	public RecipeBook(String bookName) {
		recipes = new ArrayList<CookingRecipe>();
	}
	
	public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients){
		for(CookingRecipe c:recipes){
			if(c.getName().equals(name)){
				return null;
			}
		}
		CookingRecipe newRec = new CookingRecipe(name);
		for(RecipeIngredient r:ingredients){
			newRec.addOrUpdateRecipeIngredient(r, r.getQuantity());
		}
		return newRec;
	}

	public CookingRecipe removeRecipe(String name){
		for(int i = 0;i<recipes.size();i++){
			if(recipes.get(i).getName().equals(name)){
				CookingRecipe place = recipes.get(i);
				recipes.remove(i);
				return place;
			}
		}
		return null;
	}
	
	public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients){
		ArrayList<CookingRecipe> recs = new ArrayList<CookingRecipe>();
		for(CookingRecipe rec1:recipes){
			if(rec1.getRecIngredients().contains(ingredients)){
				recs.add(rec1);
			}
		}
		if(recs.size()==0)
			return null;
		CookingRecipe[] cFinal = new CookingRecipe[recs.size()];
		recs.toArray(cFinal);
		return cFinal;
	}
	
	public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients){
		ArrayList<CookingRecipe> recs = new ArrayList<CookingRecipe>();
		for(CookingRecipe rec1:recipes){
			if(rec1.getNumberOfIngredients() == numberOfIngredients){
				recs.add(rec1);
			}
		}
		if(recs.size()==0)
			return null;
		CookingRecipe[] cFinal = new CookingRecipe[recs.size()];
		recs.toArray(cFinal);
		return cFinal;
	}
	
	public CookingRecipe[] findRecipesLowCalories(){
		float min = recipes.get(0).calculateCalories();
		ArrayList<CookingRecipe> recs = new ArrayList<CookingRecipe>();
		recs.add(recipes.get(0));
		for(CookingRecipe rec1:recipes){
			if(rec1.calculateCalories() < min){
				recipes.clear();
				recs.add(rec1);
			}
			else if(rec1.calculateCalories() == min){
				recs.add(rec1);
			}
		}
		if(recs.size()==0)
			return null;
		CookingRecipe[] cFinal = new CookingRecipe[recs.size()];
		recs.toArray(cFinal);
		return cFinal;
	}
	
}
