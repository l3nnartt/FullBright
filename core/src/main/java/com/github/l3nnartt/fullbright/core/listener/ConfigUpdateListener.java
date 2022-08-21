package com.github.l3nnartt.fullbright.core.listener;

import com.github.l3nnartt.fullbright.core.FullBrightSettings;
import net.labymod.api.event.Subscribe;
import net.labymod.api.event.labymod.config.SettingUpdateEvent;
import net.labymod.api.inject.LabyGuice;

public class ConfigUpdateListener {

  FullBrightSettings fullBrightSettings = LabyGuice.getInstance(FullBrightSettings.class);

  @Subscribe
  public void onSettingUpdate(SettingUpdateEvent event) {
    if (event.setting().getId().equals("enabled")) {
      if (!(boolean) event.getValue()) {
        fullBrightSettings.setGamma(1.0f);
      } else {
        fullBrightSettings.setGamma(10.0f);
      }
    }
  }
}