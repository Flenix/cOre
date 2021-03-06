package com.silvaniastudios.core.config;

import com.silvaniastudios.core.COre;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = COre.MODID, name = "cOre/Limestone Ore")
@Config.LangKey("core.config.title_limestone")
public class LimestoneConfig {
	
	@Config.Name("World Generation")
	public static WorldGen worldgen = new WorldGen();
	
	@Config.Name("Drops")
	public static Drops drops = new Drops();
	
	@Config.Name("Ore Dictionary")
	public static OreDictionary oredict = new OreDictionary();
	
	@Config.Name("Properties")
	public static Properties properties = new Properties();
	
	@Config.Name("Recipes")
	public static Recipes recipes = new Recipes();
	
	public static class WorldGen {
		@Config.Comment(_ConfigValues.worldGenEnabled)
		public boolean worldGenEnabled = true;
		@Config.Comment(_ConfigValues.minVeinSize)
		public int minVeinSize = 4;
		@Config.Comment(_ConfigValues.maxVeinSize)
		public int maxVeinSize = 9;
		@Config.Comment(_ConfigValues.minWorldHeight)
		public int minWorldHeight = 50;
		@Config.Comment(_ConfigValues.maxWorldHeight)
		public int maxWorldHeight = 120;
		@Config.Comment(_ConfigValues.veinsPerChunk)
		public int veinsPerChunk = 2;
		@Config.Comment(_ConfigValues.veinSpawnChance)
		public int veinSpawnChance = 80;
		@Config.Comment(_ConfigValues.blacklistedDimensions)
		public int[] blacklistedDimensions = new int[]{};
		@Config.Comment(_ConfigValues.restrictBiomes)
		public boolean restrictBiomes = false;
		@Config.Comment(_ConfigValues.allowedBiomes)
		public String[] allowedBiomes = new String[]{};
	}
	
	public static class Drops {
		@Config.Comment(_ConfigValues.primaryDroppedItem)
		public String primaryDroppedItem = "core:dust_limestone";
		@Config.Comment(_ConfigValues.secondaryDroppedItem)
		public String secondaryDroppedItem = "null";
		@Config.Comment(_ConfigValues.primaryDropQtyMin)
		public int primaryDropQtyMin = 3;
		@Config.Comment(_ConfigValues.primaryDropQtyMax)
		public int primaryDropQtyMax = 4;
		@Config.Comment(_ConfigValues.secondaryDropQtyMin)
		public int secondaryDropQtyMin = 0;
		@Config.Comment(_ConfigValues.secondaryDropQtyMax)
		public int secondaryDropQtyMax = 0;
		@Config.Comment(_ConfigValues.primaryDropChance)
		public int primaryDropChance = 100;
		@Config.Comment(_ConfigValues.secondaryDropChance)
		public int secondaryDropChance = 0;
		@Config.Comment(_ConfigValues.dropPrimaryForFakePlayer)
		public boolean dropPrimaryForFakePlayer = true;
		@Config.Comment(_ConfigValues.dropSecondaryForFakePlayer)
		public boolean dropSecondaryForFakePlayer = false;
		@Config.Comment(_ConfigValues.canFortune)
		public boolean canFortune = false;
	}
	
	public static class OreDictionary {
		@Config.Comment(_ConfigValues.oreOreDict)
		public String oreOreDict = "oreLimestone";
		@Config.Comment(_ConfigValues.dustOreDict)
		public String dustOreDict = "dustLimestone";
		@Config.Comment(_ConfigValues.dustTinyOreDict)
		public String dustTinyOreDict = "dustTinyLimestone";
	}
	
	public static class Properties {
		@Config.Comment(_ConfigValues.harvestLevel)
		public int harvestLevel = 0;
		@Config.Comment(_ConfigValues.experienceMin)
		public int experienceMin = 2;
		@Config.Comment(_ConfigValues.experienceMax)
		public int experienceMax = 5;
		@Config.Comment(_ConfigValues.hardnessOre)
		public int hardnessOre = 3;
		@Config.Comment(_ConfigValues.hardnessBlock)
		public int hardnessBlock = 5;
		
		@Config.Comment(_ConfigValues.weight)
		public int weight = 2403;
		@Config.Comment(_ConfigValues.durability)
		public int durability = 1;
		@Config.Comment(_ConfigValues.meltingPoint)
		public int meltingPoint = 825;
		@Config.Comment(_ConfigValues.symbol)
		public String symbol = "CaCO₃";
		@Config.Comment(_ConfigValues.notes)
		public String[] notes = new String[]{""};
	}
	
	public static class Recipes {
		@Config.Comment(_ConfigValues.oreCrusherPrimaryOutputAmount)
		public int oreCrusherPrimaryOutputAmount = 4;
		@Config.Comment(_ConfigValues.energyBaseline)
		public int energyBaseline = 250;
	}

	@Mod.EventBusSubscriber
	private static class EventHandler {
		
		@SubscribeEvent
		public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
			if (event.getModID().equals(COre.MODID)) {
				ConfigManager.sync(COre.MODID, Config.Type.INSTANCE);
			}
		}
	}

}
