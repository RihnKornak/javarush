package com.javarush.task.task31.task3111;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;


public class SearchFileVisitor extends SimpleFileVisitor<Path> {
    private String partOfName;
    private String partOfContent;
    private int minSize = -1;
    private int maxSize = -1;
    private List<Path> foundFiles  = new ArrayList<Path>();

    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public List<Path> getFoundFiles() {
        return foundFiles;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        int count = 0;
        int maxCount = 0;

        if (partOfName != null) { maxCount++;
            if (file.getFileName().toString().contains(partOfName)) count++;
        }
        if (partOfContent != null) { maxCount++;
            if (new String(Files.readAllBytes(file)).contains(partOfContent)) count++;
        }
        if (minSize > -1) { maxCount++;
            if (Files.size(file) > minSize) count++;
        }
        if (maxSize > -1) {maxCount++;
            if (Files.size(file) < maxSize) count++;
        }
        if (count == maxCount)  foundFiles.add(file);
        return FileVisitResult.CONTINUE;
    }
}
