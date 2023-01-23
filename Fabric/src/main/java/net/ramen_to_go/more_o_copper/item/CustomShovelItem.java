package net.ramen_to_go.more_o_copper.item;

import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class CustomShovelItem extends ShovelItem{
    public CustomShovelItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
