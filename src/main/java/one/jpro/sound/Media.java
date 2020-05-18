package one.jpro.sound;

import com.jpro.webapi.WebAPI;
import javafx.stage.Stage;
import one.jpro.sound.impl.js.ImplMedia;

import java.net.URL;

public interface Media {
    static Media getMedia(URL url, Stage context) {
        if(WebAPI.isBrowser()) {
            return new ImplMedia(context, url);
        } else {
            return null;
        }
    }
}
