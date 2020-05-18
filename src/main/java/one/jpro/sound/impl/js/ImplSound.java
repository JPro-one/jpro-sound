package one.jpro.sound.impl.js;

import com.jpro.webapi.WebAPI;

class SoundJproImpl extends GeneralService.Sound {

        WebAPI api;
        String name;

        SoundJProImpl(String name, WebAPI api) {
                this.api = api;
                this.name = name;

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

        public void setLoop(loop: Boolean): Unit = {
            api.executeScript(s"jpro."+name+".loop("+loop+");")
            this.loop = loop;
        }
}
