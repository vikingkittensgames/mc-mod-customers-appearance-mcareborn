package com.vikingkittens.mc.customersaddon.appearance.mcareborn;

import net.neoforged.fml.common.Mod;

import com.vikingkittens.mc.customers.appearance.CustomersVillagerAppearanceRegistries;

@Mod(McaRebornAppearanceNeoForge.MOD_ID)
public final class McaRebornAppearanceNeoForge {
    public static final String MOD_ID = "customers_mcareborn_appearance";

    public McaRebornAppearanceNeoForge() {
        CustomersVillagerAppearanceRegistries.appearances().register(
                McaCustomersVillagerAppearance.ID,
                McaCustomersVillagerAppearance::new
        );
    }
}
