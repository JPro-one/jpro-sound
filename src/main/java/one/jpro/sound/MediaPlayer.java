package one.jpro.sound;

import com.jpro.webapi.WebAPI;
import one.jpro.sound.impl.js.ImplMedia;
import one.jpro.sound.impl.js.ImplSound;

public interface MediaPlayer {
    public static MediaPlayer getMediaPlayer(Media media) {
        if(WebAPI.isBrowser()) {
            return new ImplSound((ImplMedia) media, ((ImplMedia) media).webapi);
        } else {
            return null;
        }
    }

    public void setVolume(double volume);
    public void setLoop(boolean loop);
    public void play();
    public void pause();
    public void stop();

}
