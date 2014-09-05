package com.harry9137.ct.event;

import com.harry9137.ct.utillity.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

import net.minecraft.potion.Potion;
import net.minecraft.world.gen.structure.StructureNetherBridgePieces;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;

public class EnderTeleportEventHooks {

    @SubscribeEvent
    public void enderTeleport(EnderTeleportEvent event){

        if(event.entityLiving.isPotionActive(Potion.moveSpeed)){

           // event.setCanceled(true);

        }

    }
}
