package me.cylorun.data;


import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.gson.Gson;
public class KeySendOptions {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Path CONFIG_PATH = Paths.get(System.getProperty("user.dir")).resolve("config.json").toAbsolutePath();
    private static KeySendOptions instance;


    public static KeySendOptions load() throws IOException {
        if (Files.exists(CONFIG_PATH)) {
            instance = GSON.fromJson(new String(Files.readAllBytes(CONFIG_PATH)), KeySendOptions.class);
        } else {
            instance = new KeySendOptions();
        }
        return instance;
    }

    public static void save() {
        FileWriter writer = null;
        try {
            writer = new FileWriter(CONFIG_PATH.toFile());

            GSON.toJson(instance, writer);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static KeySendOptions getInstance() {
        return instance;
    }
}

