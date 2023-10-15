package net.lava778.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.lava778.tutorialmod.block.ModBlocks;
import net.lava778.tutorialmod.item.ModItemGroups;
import net.lava778.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		TutorialMod.LOGGER.info("THIS IS PRINTED");
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();

	}
}