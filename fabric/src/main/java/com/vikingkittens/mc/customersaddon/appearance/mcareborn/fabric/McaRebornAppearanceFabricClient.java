package com.vikingkittens.mc.customersaddon.appearance.mcareborn.fabric;

import net.fabricmc.api.ClientModInitializer;

import com.vikingkittens.mc.customers.client.appearance.CustomersVillagerClientAppearances;
import com.vikingkittens.mc.customersaddon.appearance.mcareborn.McaCustomersVillagerAppearance;
import com.vikingkittens.mc.customersaddon.appearance.mcareborn.client.McaCustomersVillagerClientAppearance;

public final class McaRebornAppearanceFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        CustomersVillagerClientAppearances.register(
                McaCustomersVillagerAppearance.ID,
                McaCustomersVillagerClientAppearance::new
        );
    }
}
