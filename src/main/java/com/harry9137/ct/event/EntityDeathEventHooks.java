package com.harry9137.ct.event;

import com.harry9137.ct.init.modItems;
import com.harry9137.ct.utillity.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class EntityDeathEventHooks {
    @SubscribeEvent
    public void onDeath(LivingDropsEvent event){
        if(event.entityLiving.getCommandSenderName().equals("Creeper")){
            EntityItem item = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, new ItemStack(modItems.itemCreepLeaf, 1));
            event.drops.add(item);
        }
    }
}
