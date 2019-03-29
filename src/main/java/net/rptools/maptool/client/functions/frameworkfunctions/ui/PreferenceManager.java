package net.rptools.maptool.client.functions.frameworkfunctions.ui;

import java.util.prefs.Preferences;

import net.rptools.maptool.client.AppConstants;

public class PreferenceManager {

  private static final Preferences prefs = Preferences.userRoot().node(AppConstants.APP_NAME + "/extended-prefs");
  private static final String KEY_DELIMITER = ".";
      
  public static void savePreference(String value, String ... keys) {
    String key = String.join(KEY_DELIMITER, keys);
    prefs.put(key, value);
  }
  
  public static void savePreference(Boolean value, String ... keys) {
    String key = String.join(KEY_DELIMITER, keys);
    prefs.putBoolean(key, value);
  }
  
  public static void savePreference(byte[] value, String ... keys) {
    String key = String.join(KEY_DELIMITER, keys);
    prefs.putByteArray(key, value);
  }
  
  public static void savePreference(Double value, String ... keys) {
    String key = String.join(KEY_DELIMITER, keys);
    prefs.putDouble(key, value);
  }
  
  public static void savePreference(Float value, String ... keys) {
    String key = String.join(KEY_DELIMITER, keys);
    prefs.putFloat(key, value);
  }
  
  public static void savePreference(Integer value, String ... keys) {
    String key = String.join(KEY_DELIMITER, keys);
    prefs.putInt(key, value);
  }
  
  public static void savePreference(Long value, String ... keys) {
    String key = String.join(KEY_DELIMITER, keys);
    prefs.putLong(key, value);
  }
  
  public static String loadPreference(String defaultValue, String ... keys) {
    String key = String.join(KEY_DELIMITER, keys);
    return prefs.get(key, defaultValue);
  }

  public static Boolean loadPreference(Boolean defaultValue, String ... keys) {
    String key = String.join(KEY_DELIMITER, keys);
    return prefs.getBoolean(key, defaultValue);
  }
  
  public static byte[] loadPreference(byte[] defaultValue, String ... keys) {
    String key = String.join(KEY_DELIMITER, keys);
    return prefs.getByteArray(key, defaultValue);
  }
  
  public static Double loadPreference(Double defaultValue, String ... keys) {
    String key = String.join(KEY_DELIMITER, keys);
    return prefs.getDouble(key, defaultValue);
  }
  
  public static Float loadPreference(Float defaultValue, String ... keys) {
    String key = String.join(KEY_DELIMITER, keys);
    return prefs.getFloat(key, defaultValue);
  }
  
  public static Integer loadPreference(Integer defaultValue, String ... keys) {
    String key = String.join(KEY_DELIMITER, keys);
    return prefs.getInt(key, defaultValue);
  }
  
  public static Long loadPreference(Long defaultValue, String ... keys) {
    String key = String.join(KEY_DELIMITER, keys);
    return prefs.getLong(key, defaultValue);
  }
}