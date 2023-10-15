package net.lava778.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lava778.tutorialmod.TutorialMod;
import net.lava778.tutorialmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup LEAD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "lead"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.lead"))
                    .icon(() -> new ItemStack(ModItems.LEAD_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_URANIUM);
                        entries.add(ModItems.LEAD_INGOT);
                        entries.add(ModItems.LEAD_SHEET) ;
                        entries.add(ModBlocks.LEAD_BLOCK);
                        entries.add(ModBlocks.DEEPSLATE_URANIUM_ORE);
                        entries.add(ModBlocks.LEAD_CASING);
                        entries.add(ModBlocks.RAW_LEAD_BLOCK);
                        entries.add(ModBlocks.LEAD_ORE);
                        entries.add(ModItems.CRUSHED_LEAD);
                        entries.add(ModItems.LEAD_NUGGET);
                        entries.add(ModItems.RAW_LEAD);

                    }).build());
    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering item groups for" + TutorialMod.MOD_ID);
    }
}
