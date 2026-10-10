package com.vikingkittens.mc.customersaddon.appearance.mcareborn;


import java.util.List;

import org.mockito.MockedStatic;

import net.minecraft.SharedConstants;
import net.minecraft.server.Bootstrap;

import net.neoforged.fml.loading.LoadingModList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.when;

public final class McaRebornTestBootstrap {
    private static boolean initialized;

    private McaRebornTestBootstrap() {}

    public static synchronized void bootstrap() {
        if (initialized) {
            return;
        }
        LoadingModList modList = mock(LoadingModList.class);
        when(modList.getModFiles()).thenReturn(List.of());
        try (MockedStatic<LoadingModList> mocked = mockStatic(LoadingModList.class)) {
            mocked.when(LoadingModList::get).thenReturn(modList);
            SharedConstants.tryDetectVersion();
            Bootstrap.bootStrap();
        }
        initialized = true;
    }
}
