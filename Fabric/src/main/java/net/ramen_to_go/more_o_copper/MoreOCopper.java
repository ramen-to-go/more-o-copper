package net.ramen_to_go.more_o_copper;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.ramen_to_go.more_o_copper.item.Supercopper_Ingot;
import net.ramen_to_go.more_o_copper.item.CustomAxeItem;
import net.ramen_to_go.more_o_copper.item.CustomHoeItem;
import net.ramen_to_go.more_o_copper.item.CustomPickaxeItem;
import net.ramen_to_go.more_o_copper.item.CustomShovelItem;
import net.ramen_to_go.more_o_copper.item.CustomSwordItem;
import net.ramen_to_go.more_o_copper.item.SupercopperToolMaterial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreOCopper implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("more_o_copper");

	// Add Super Copper
	public static final Item SUPERCOPPER_INGOT = 
		Registry.register(Registries.ITEM, new Identifier("more_o_copper", "supercopper_ingot"), // Register Item
		new Supercopper_Ingot(new FabricItemSettings())); // Define Item

	// Add Super Copper Tools
	public static ToolItem SUPERCOPPER_SWORD = 
		Registry.register(Registries.ITEM, new Identifier("more_o_copper", "supercopper_sword"), // Register Item
		new CustomSwordItem(SupercopperToolMaterial.SUPERCOPPER_TOOL_MATERIAL, 6, 1.7f, new Item.Settings())); // Define Item

	public static ToolItem SUPERCOPPER_AXE = 
		Registry.register(Registries.ITEM, new Identifier("more_o_copper", "supercopper_axe"), // Register Item
		new CustomAxeItem(SupercopperToolMaterial.SUPERCOPPER_TOOL_MATERIAL, 8, 1.7f, new Item.Settings())); // Define Item

	public static ToolItem SUPERCOPPER_PICKAXE = 
	Registry.register(Registries.ITEM, new Identifier("more_o_copper", "supercopper_pickaxe"), // Register Item
	new CustomPickaxeItem(SupercopperToolMaterial.SUPERCOPPER_TOOL_MATERIAL, 5, 1.2f, new Item.Settings())); // Define Item
	
	public static ToolItem SUPERCOPPER_SHOVEL = 
	Registry.register(Registries.ITEM, new Identifier("more_o_copper", "supercopper_shovel"), // Register Item
	new CustomShovelItem(SupercopperToolMaterial.SUPERCOPPER_TOOL_MATERIAL, 4, 1.0f, new Item.Settings())); // Define Item
	
	public static ToolItem SUPERCOPPER_HOE = 
	Registry.register(Registries.ITEM,new Identifier("more_o_copper", "supercopper_hoe"), // Register Item
	new CustomHoeItem(SupercopperToolMaterial.SUPERCOPPER_TOOL_MATERIAL, 3, 4.0f, new Item.Settings())); // Define Item

	// Add mod ItemGroup - Must be defined Last so all Items are Referenced before being added
	private static final ItemGroup MORE_O_COPPER = FabricItemGroup.builder(new Identifier("more_o_copper", "item_group"))
		.icon(() -> new ItemStack(SUPERCOPPER_INGOT))
		.build();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		// ITEMS MUST BE ADDED IN ORDER SO THEY ARE ORDERED THE RIGHT WAY IN THE ITEMGROUP
		ItemGroupEvents.modifyEntriesEvent(MORE_O_COPPER).register(content -> {
			content.add(SUPERCOPPER_INGOT);
			content.add(SUPERCOPPER_SWORD);
			content.add(SUPERCOPPER_PICKAXE);
			content.add(SUPERCOPPER_AXE);
			content.add(SUPERCOPPER_SHOVEL);
			content.add(SUPERCOPPER_HOE);
		});
	}
}