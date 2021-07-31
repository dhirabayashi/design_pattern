package com.github.dhirabayashi.designpattern.bridge;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileDisplayImpl implements DisplayImpl, Closeable {
    private final String filename;
    private BufferedReader reader;
    private List<String> content;

    public FileDisplayImpl(String filename) {
        this.filename = filename;
    }

    @Override
    public void rawOpen() {
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename), StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void rawPrint() {
        if(content == null) {
            content = new ArrayList<>();
            try {
                String line;
                while((line = reader.readLine()) != null) {
                    content.add(line);
                }
                reader.mark(0);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
        content.forEach(System.out::println);
    }

    @Override
    public void rawClose() {
        content = null;
        try {
            if(reader != null) {
                reader.close();
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void close() throws IOException {
        rawClose();
    }
}
