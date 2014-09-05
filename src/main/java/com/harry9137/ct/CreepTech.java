package com.harry9137.ct;

import com.harry9137.ct.proxy.IProxy;
import com.harry9137.ct.reference.reference;

import com.harry9137.ct.utillity.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = reference.MOD_ID, name = reference.MOD_NAME, version = reference.MOD_VERSION)
public class CreepTech {

    @Mod.Instance
    public static CreepTech instance;

    @SidedProxy(clientSide = reference.CLIENT_PROXY_CLASS, serverSide = reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        LogHelper.info("Pre-Init Started");


        LogHelper.info("Pre-Init Complete");

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

        LogHelper.info("Init Started");


        LogHelper.info("Init Complete");

    }

    @Mod.EventHandler
    public void preInti(FMLPostInitializationEvent event){

        LogHelper.info("Post-Init Started");


        LogHelper.info("Post-Init Complete");

    }
}
