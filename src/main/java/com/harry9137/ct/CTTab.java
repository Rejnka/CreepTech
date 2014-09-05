package com.harry9137.ct;

import com.harry9137.ct.init.modItems;
import com.harry9137.ct.reference.reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CTTab  {
    public static final CreativeTabs CTTab = new CreativeTabs(reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return modItems.itemCreepLeaf;
        }

    };
}
