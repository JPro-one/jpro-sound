package one.jpro.sound.impl.js;

import com.jpro.webapi.WebAPI;

class ImplSound {

    WebAPI api;
    String name;

    ImplSound(ImplMedia media, WebAPI api) {
        if(api != media.webapi) {
            throw new RuntimeException("Media had a different webapi as the Sound");
        }
        this.api = api;
        this.name = media.audioName;

    }

    public void play() {
        api.executeScript("jpro."+name+"play();");
    }

    public void pause() {
        api.executeScript("jpro."+name+"pause();");
    }

    public void stop() {
        api.executeScript("jpro."+name+"pause();");
    }

    public void setVolume(Double volume) {
        api.executeScript("jpro."+name+".volume("+volume+");");
    }

    public void setLoop(Boolean loop) {
        api.executeScript("jpro."+name+".loop("+loop+");");
    }
}
