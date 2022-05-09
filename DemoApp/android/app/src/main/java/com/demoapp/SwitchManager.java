package com.demoapp;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class SwitchManager extends SimpleViewManager<Switch> {
    @Override
    public String getName() {
        return "Switch";
    }
    @Override
    protected Switch createViewInstance(ThemedReactContext reactContext) {
        return new Switch(reactContext);
    }
    @ReactProp(name="isTurnedOn")
    public void setSwitchStatus(Switch switchView, Boolean isTurnedOn) {
        switchView.setIsTurnedOn(isTurnedOn);
    }
}