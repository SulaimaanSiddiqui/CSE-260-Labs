
public class TestRecipeBook {

	public static void main(String[] args){
		Ingredient banana = new Ingredient("ba","n",1);
		Ingredient grape = new Ingredient("ga","n",1);
		Ingredient orange = new Ingredient("or","n",1);
		RecipeIngredient b1 = new RecipeIngredient("ba","n",1, (float)4.0);
		RecipeIngredient b2 = new RecipeIngredient("ba","n",1, (float)4.0);
		RecipeIngredient b3 = new RecipeIngredient("ba","n",1, (float)4.0);
		CookingRecipe rec = new CookingRecipe("rec");
		rec.addOrUpdateRecipeIngredient(banana, (float)4.0);
		rec.addOrUpdateRecipeIngredient(grape, (float)4.0);
		rec.addOrUpdateRecipeIngredient(orange, (float)4.0);
		System.out.println(rec);
		System.out.println(rec.getRecipeIngredient(banana));
		rec.removeRecipeIngredient(banana);
		System.out.println(rec);
		System.out.println(rec.calculateCalories());
		System.out.println(rec.getNumberOfIngredients());
		RecipeIngredient[] greds = {b1,b2,b3};
		RecipeBook book = new RecipeBook("Book", greds);
	}

}
