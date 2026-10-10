package com.vikingkittens.mc.customersaddon.appearance.mcareborn.client;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

import com.vikingkittens.mc.customers.client.appearance.CustomersVillagerClientAppearances;
import com.vikingkittens.mc.customersaddon.appearance.mcareborn.McaCustomersVillagerAppearance;
import com.vikingkittens.mc.customersaddon.appearance.mcareborn.McaRebornAppearanceNeoForge;

@EventBusSubscriber(modid = McaRebornAppearanceNeoForge.MOD_ID, value = Dist.CLIENT)
public final class McaRebornAppearanceNeoForgeClientEvents {
    private McaRebornAppearanceNeoForgeClientEvents() {}

    @SubscribeEvent
    public static void registerAppearance(EntityRenderersEvent.RegisterRenderers event) {
        CustomersVillagerClientAppearances.register(
                McaCustomersVillagerAppearance.ID,
                McaCustomersVillagerClientAppearance::new
        );
    }
}
