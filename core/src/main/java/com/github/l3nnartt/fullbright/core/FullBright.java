package com.github.l3nnartt.fullbright.core;

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

    FullBrightSettings fullBrightSettings = LabyGuice.getInstance(FullBrightSettings.class);
    fullBrightSettings.setGamma(10.0f);

    this.logger().info("Enabled the Addon");
  }

  @Override
  protected Class<FullBrightConfiguration> configurationClass() {
    return FullBrightConfiguration.class;
  }
}
