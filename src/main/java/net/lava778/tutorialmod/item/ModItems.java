package net.lava778.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lava778.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

// declares new items, textures and english/other language names must be declared in seperate JSON files
    public static final Item LEAD_INGOT = registerItem("lead_ingot", new Item(new FabricItemSettings()));
    public static final  Item RAW_URANIUM = registerItem("raw_uranium", new Item(new FabricItemSettings()));
    public static final  Item LEAD_SHEET = registerItem("lead_sheet", new Item(new FabricItemSettings()));
    public static final  Item RAW_LEAD = registerItem("raw_lead", new Item(new FabricItemSettings()));
    public static final  Item LEAD_NUGGET = registerItem("lead_nugget", new Item(new FabricItemSettings()));
    public static final  Item CRUSHED_LEAD = registerItem("crushed_lead", new Item(new FabricItemSettings()));




    // add items to Ingredient tab
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){

        entries.add(LEAD_INGOT);
        entries.add(RAW_URANIUM);
        entries.add(LEAD_SHEET);
    }
    private static Item registerItem(String name, Item item)  {
        // make sure Registry is net.minecraft registry nothing else
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Loading mod items for " + TutorialMod.MOD_ID );
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);

    }

}
