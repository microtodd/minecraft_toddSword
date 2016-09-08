package org.todd.forge.mods;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main {
	public static final String MODID = "myMods";
	public static final String VERSION = "1.0";
	public static Item toddSword;
	public static final ToolMaterial ToddSwordMaterial = EnumHelper.addToolMaterial("Toddium", 3, 1000, 15.0F, 4.0F, 30);
	
   @EventHandler
   public void init(FMLInitializationEvent event)
   {
    	toddSword = new ToddSword(ToddSwordMaterial);
    	GameRegistry.registerItem(toddSword, "toddSword");
    	
    	// texture for sword
    	Item toddSwordItem = GameRegistry.findItem("mymods","toddSword");
    	ModelResourceLocation toddSwordModel = new ModelResourceLocation("mymods:toddSword", "inventory");
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(toddSword, 0, toddSwordModel);
   }
	
}
