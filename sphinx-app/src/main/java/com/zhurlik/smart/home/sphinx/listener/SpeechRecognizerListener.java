package com.zhurlik.smart.home.sphinx.listener;

import com.zhurlik.smart.home.sphinx.event.SpeechRecognizerEvent;
import edu.cmu.sphinx.api.StreamSpeechRecognizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.io.PipedInputStream;

import static com.zhurlik.smart.home.sphinx.event.SpeechRecognizerEvent.Code;

/**
 * A listener for handling SpeechRecognizer events.
 *
 * @author zhurlik@gmail.com
 */
@Component
public class SpeechRecognizerListener implements ApplicationListener<SpeechRecognizerEvent> {
    private final static Logger LOGGER = LoggerFactory.getLogger(SpeechRecognizerListener.class);

    @Autowired
    private StreamSpeechRecognizer streamSpeechRecognizer;

    @Autowired
    private PipedInputStream in;

    @Override
    public void onApplicationEvent(final SpeechRecognizerEvent event) {
        final Code code = (Code) event.getSource();
        switch (code) {
            case STOP:
                stop();
                break;
            case START:
                start();
                break;
            default:
                throw new UnsupportedOperationException("Unsupported event for Speech Recognizer");
        }
    }

    private void start() {
        LOGGER.debug(">> Starting Speech Recognizer...");
        streamSpeechRecognizer.startRecognition(in);
    }

    private void stop() {
        LOGGER.debug(">> Stopping Speech Recognizer...");
        streamSpeechRecognizer.stopRecognition();
    }
}