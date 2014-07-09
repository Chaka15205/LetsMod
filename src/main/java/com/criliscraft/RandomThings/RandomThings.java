package com.criliscraft.RandomThings;

import com.criliscraft.RandomThings.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="RandomThings", name="Random Things Mod", version="1.7.2-14w28a")

public class RandomThings {

    @Mod.Instance("RandomThings")
    public static RandomThings instance;

    @SidedProxy(clientSide="com.criliscraft.RandomThings.proxy.ClientProxy", serverSide="com.criliscraft.RandomThings.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
