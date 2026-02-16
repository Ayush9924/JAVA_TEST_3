package com.lpu.test3.question3;

import java.io.*;

public class DigitalDiary {

    public void writeNote(String fileName, String note) {

        try {
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }

            FileOutputStream fos = new FileOutputStream(fileName, true);

            String message = note + "\n";

            fos.write(message.getBytes());
            fos.close();

        } catch (IOException e) {
            System.out.println("Error: Could not save note.");
        }
    }

    public void createBackup(String sourceFile, String backupFile) {

        try {
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(backupFile);

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            fis.close();
            fos.close();

            System.out.println("Backup created successfully!");

        } catch (IOException e) {
            System.out.println("Error: Could not create backup.");
        }
    }

    public static void main(String[] args) {

        DigitalDiary diary = new DigitalDiary();

        String diaryFile = "my_diary.txt";
        String backupFile = "diary_backup.txt";

        diary.writeNote(diaryFile, "Today I started learning Java File I/O.");
        diary.writeNote(diaryFile, "It was a bit confusing, but I'm getting the hang of it.");
        diary.writeNote(diaryFile, "I successfully created and copied a file!");

        diary.createBackup(diaryFile, backupFile);
    }
}
