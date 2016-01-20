package main.java.FactoryMethod;

import java.io.InputStream;

public class GifReader implements ImageReader {
    public GifReader(InputStream in) {
        // check that it's a gif, throw exception if it's not
        // then if it is decode it
    }

    public DecodedImage getDecodedImage() {
        return null;
    }
}
