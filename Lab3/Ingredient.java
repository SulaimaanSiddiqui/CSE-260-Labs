
public class Ingredient {

	private String name;
	private String unit;
	private int cals;
	
	public Ingredient(String name, String measuringUnit, int caloriesPerUnit){
		this.name = name;
		unit = measuringUnit;
		cals = caloriesPerUnit;
	}
	
	public String getName(){
		return name;
	}
	
	public String getUnit(){
		return unit;
	}
	
	public int getCals(){
		return cals;
	}
	
	public boolean equals(Ingredient i){
		if(name.equals(i.getName()) &&
			unit.equals(i.getUnit()) &&
			cals == i.getCals())
				return true;
		return false;
	}
	
}
