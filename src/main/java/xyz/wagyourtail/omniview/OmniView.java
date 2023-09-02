package xyz.wagyourtail.omniview;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OmniSpec implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger(OmniSpec.class);

    @Override
    public void onInitialize() {
        LOGGER.info("I'm watching you :eyes:");
    }
}
