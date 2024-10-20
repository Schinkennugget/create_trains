package com.schinkennugget.client;

import com.schinkennugget.CreateTrains;
import dev.felnull.specialmodelloader.api.event.SpecialModelLoaderEvents;
import net.fabricmc.api.ClientModInitializer;

public class CreateTrainsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        SpecialModelLoaderEvents.LOAD_SCOPE.register(location -> CreateTrains.MOD_ID.equals(location.getNamespace()));
    }
}
