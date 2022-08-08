package com.github.l3nnartt.fullbright.v1_18;

import com.github.l3nnartt.fullbright.core.FullBrightSettings;
import com.google.inject.Singleton;
import net.labymod.api.models.Implement;
import net.minecraft.client.Minecraft;

@Singleton
@Implement(FullBrightSettings.class)
public class Settings implements FullBrightSettings {

  @Override
  public void setGamma(float gamma) {
    Minecraft.getInstance().options.gamma = gamma;
  }
}