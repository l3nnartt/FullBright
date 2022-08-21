package com.github.l3nnartt.fullbright.core;

import com.github.l3nnartt.fullbright.core.listener.ConfigUpdateListener;
import com.google.inject.Singleton;
import net.labymod.api.addon.LabyAddon;
import net.labymod.api.inject.LabyGuice;
import net.labymod.api.models.addon.annotation.AddonListener;

@Singleton
@AddonListener
public class FullBright extends LabyAddon<FullBrightConfiguration> {

  @Override
  protected void enable() {
    this.registerSettingCategory();
    this.registerListener(ConfigUpdateListener.class);

    FullBrightSettings fullBrightSettings = LabyGuice.getInstance(FullBrightSettings.class);
    if (this.configuration().enabled().get()) {
      fullBrightSettings.setGamma(10.0f);
    }

    this.logger().info("Addon successfully enabled!");
  }

  @Override
  protected Class<FullBrightConfiguration> configurationClass() {
    return FullBrightConfiguration.class;
  }
}