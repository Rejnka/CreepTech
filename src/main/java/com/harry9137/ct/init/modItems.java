package com.harry9137.ct.init;

import com.harry9137.ct.item.itemCT;
import com.harry9137.ct.item.itemCreepLeaf;
import com.harry9137.ct.reference.names;
import cpw.mods.fml.common.registry.GameRegistry;

public class modItems {
    public static final itemCT itemCreepLeaf = new itemCreepLeaf();

    public static void init(){
        GameRegistry.registerItem(itemCreepLeaf, names.items.itemCreepLeaf);
    }
}
