package com.ingesup.devmobile.labo.cocktails.models;

import java.util.HashMap;

import com.ingesup.devmobile.labo.cocktails.R;

public class IngredientImages {
	private HashMap<String, Integer> drawables;

	public IngredientImages() {
		super();
		
		drawables = new HashMap<String, Integer>();
		drawables.put("benedictine", R.drawable.ingredient_benedictine);
		drawables.put("bourbon", R.drawable.ingredient_bourbon);
		drawables.put("boisson_energisante", R.drawable.ingredient_boisson_energisante);
		drawables.put("vodka", R.drawable.ingredient_boisson_energisante);
		drawables.put("brandy", R.drawable.ingredient_brandy);
		drawables.put("calvados", R.drawable.ingredient_calvados);
		drawables.put("campari", R.drawable.ingredient_campari);
		drawables.put("liqueur_de_framboise", R.drawable.ingredient_campari);
		drawables.put("jus_de_pomme", R.drawable.ingredient_campari);
		drawables.put("default", R.drawable.ingredient_default);
		drawables.put("ananas", R.drawable.ingredient_ananas);
		drawables.put("bananes", R.drawable.ingredient_bananes);
		drawables.put("chocolat", R.drawable.ingredient_chocolat);
		drawables.put("cola", R.drawable.ingredient_cola);
		drawables.put("gin", R.drawable.ingredient_gin);
		drawables.put("lait", R.drawable.ingredient_lait);
		drawables.put("soda", R.drawable.ingredient_soda);
		drawables.put("cognac", R.drawable.ingredient_cognac);
		
	}
	
	public int getIngredientDrawable(String ingredientName) {
		String anIngredientName = Utils.getNormalizedString(ingredientName);
		if(drawables.containsKey(anIngredientName)) {
			return drawables.get(anIngredientName);
		}
		return drawables.get("default");
	}
}
