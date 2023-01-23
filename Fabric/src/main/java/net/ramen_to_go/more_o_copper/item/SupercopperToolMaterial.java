package net.ramen_to_go.more_o_copper.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.ramen_to_go.more_o_copper.MoreOCopper;



public class SupercopperToolMaterial implements ToolMaterial {

    public static final SupercopperToolMaterial SUPERCOPPER_TOOL_MATERIAL = new SupercopperToolMaterial();
    
    @Override
    public int getDurability() {
        return 1682;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 14.0f;
    }

    @Override
    public float getAttackDamage() {
        return 1.3f;
    }

    @Override
    public int getMiningLevel() {
        return MiningLevels.NETHERITE;
    }

    @Override
    public int getEnchantability() {
        return 13;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(MoreOCopper.SUPERCOPPER_INGOT);
    }

}