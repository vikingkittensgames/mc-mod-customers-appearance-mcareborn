package com.vikingkittens.mc.customersaddon.appearance.mcareborn.fabric;

import net.fabricmc.api.ModInitializer;

import com.vikingkittens.mc.customers.appearance.CustomersVillagerAppearanceRegistries;
import com.vikingkittens.mc.customersaddon.appearance.mcareborn.McaCustomersVillagerAppearance;

public final class McaRebornAppearanceFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CustomersVillagerAppearanceRegistries.appearances().register(
                McaCustomersVillagerAppearance.ID,
                McaCustomersVillagerAppearance::new
        );
    }
}
