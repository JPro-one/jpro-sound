package one.jpro.sound;

import com.jpro.webapi.WebAPI;
import javafx.stage.Stage;
import one.jpro.sound.impl.js.ImplMedia;

import java.net.URL;

public interface AudioClip {
    public static AudioClip getAudioClip(URL url, Stage context) {
        if(WebAPI.isBrowser()) {
            return new ImplMedia(context, url);
        } else {
            return null;
        }
    }
    abstract void play();
}
