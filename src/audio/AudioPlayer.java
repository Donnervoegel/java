package audio;

import java.io.File;
import javax.sound.midi.*;

/**
 * @author: Colin
 */
public class AudioPlayer {
    private boolean useExternalSynth;
    private String filename;
    private Sequencer seq;

    public AudioPlayer(String filename) {
	useExternalSynth = false;
	this.filename = filename;

	try {
	    init();
	} catch (Exception e) {
	    System.out.println("Couldn't open audio file...");
	    e.printStackTrace();
	}
    }

    private void init() throws Exception {
        MidiDevice receivingDevice = getReceivingDevice();
        receivingDevice.open();

        Sequence sequence1 = MidiSystem.getSequence(new File(filename));
        seq = MidiSystem.getSequencer(false);
        Transmitter tx1 = seq.getTransmitter();
        Receiver rx1 = receivingDevice.getReceiver();
        tx1.setReceiver(rx1);

        seq.open();
        seq.setSequence(sequence1);
    }

    public void play() {
	if (seq != null)
	    seq.start();
    }

    public void stop() {
	if (seq != null)
	    seq.stop();
    }

    private MidiDevice getReceivingDevice()
        throws MidiUnavailableException {
        for (MidiDevice.Info mdi: MidiSystem.getMidiDeviceInfo()) {
	    MidiDevice dev = MidiSystem.getMidiDevice(mdi);
	    return dev;
            // if (dev.getMaxReceivers() != 0) {
            //     String lcName =
            //         defaultString(mdi.getName()).toLowerCase(Locale.ENGLISH);
            //     if (lcName.contains(useExternalSynth? "usb": "java")) {
	    // 	    System.out.println("GOT HERE!!");
            //         return dev;
            //     }
            // }
        }
        return null;
    }

    private String defaultString(String s) {
	if (s == null)
	    return "";
	return s;
    }
}
