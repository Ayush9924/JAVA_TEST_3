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
            fos.close();//leak

        } catch (IOException e) {
            System.out.println("Error Could not save");
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

            System.out.println("Backup created");

        } catch (IOException e) {
            System.out.println("Could not create");
        }
    }

    public static void main(String[] args) {

        DigitalDiary diary = new DigitalDiary();
        String diaryFile = "my_diary.txt";
        String backupFile = "diary_backup.txt";
        diary.writeNote(diaryFile, "Today I started learning Java IO.");
        diary.writeNote(diaryFile, "It was a bit confus,but I'm getting th hang of it.");
        diary.writeNote(diaryFile, "I successfully created0 and copied a file");

        diary.createBackup(diaryFile, backupFile);
    }
}
