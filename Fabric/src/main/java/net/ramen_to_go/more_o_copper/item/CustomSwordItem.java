package net.ramen_to_go.more_o_copper.item;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class CustomSwordItem extends SwordItem{
    public CustomSwordItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
