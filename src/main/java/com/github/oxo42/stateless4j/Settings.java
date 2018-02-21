package com.github.oxo42.stateless4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Settings {
    public static final Logger DEBUG_LOGGER = LoggerFactory.getLogger("Stateless4j");
    public static boolean LOG_TRANSITIONS = true,
            LOG_PARAMS = true,
            LOG_ENTRIES = true,
            LOG_EXITS = true;

}
