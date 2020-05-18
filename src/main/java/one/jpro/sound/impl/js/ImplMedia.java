package one.jpro.sound.impl.js;

import com.jpro.webapi.WebAPI;
import javafx.stage.Stage;
import one.jpro.sound.Media;
import one.jpro.sound.AudioClip;

import java.net.URL;

public class ImplMedia implements Media, AudioClip {

    int idCounter = 0;
    public String getRandomName() {
        idCounter += 1;
        return "audio-" + idCounter;
    }

    public WebAPI webapi;
    public String audioName;


    public ImplMedia(Stage stage, URL url) {
        webapi = WebAPI.getWebAPI(stage);
        audioName = getRandomName();
        String publicFile = webapi.createPublicFile(url);
        webapi.loadJSFile(getClass().getResource("/js/howler/howler-2.2.0.min.js"));
        webapi.registerValue(audioName, "new Howl({" +
            "src: ['$publicFile']" +
            "});");
    }



    public void play() {
        new ImplSound(this, webapi).play();
    }
}
