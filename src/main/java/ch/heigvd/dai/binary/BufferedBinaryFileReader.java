package ch.heigvd.dai.binary;

import ch.heigvd.dai.Readable;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedBinaryFileReader implements Readable {

    @Override
    public void read(String filename) throws IOException {
        // TODO : implement this method

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filename))) {
            int nbrOfCharRead = bufferedInputStream.read();
        }
    }
}
