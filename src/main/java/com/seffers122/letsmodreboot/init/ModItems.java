package com.seffers122.letsmodreboot.init;

import com.seffers122.letsmodreboot.item.ItemLMRB;
import com.seffers122.letsmodreboot.item.ItemMapleLeaf;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems 
{
	public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();
	public static void init(){
		GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
	}
}
