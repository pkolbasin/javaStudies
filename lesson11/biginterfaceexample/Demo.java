package lesson11.biginterfaceexample;

public class Demo {
    public static void main(String[] args) {
        File file1 = new File("test", "C:/user/home", "txt", 11);
        File file2 = new File("test", "C:/user/home", "txt", Integer.MAX_VALUE);
        File file3 = new File("video", "C:/user/home", "txt", 0);

        File file5 = new File("myhome", "C:/user/home", "jpg", -120);

        File[] files = new File[]{file1, file3, null};
        File[] files1 = new File[]{file1, file3, null, file5};
        File[] files2 = new File[]{file1, file2, file3, null, file5};
        Storage storage = new Storage(files);
        Storage storage1 = new Storage(files1);
        Storage storage2 = new Storage(files2);
        FileReader fileReader = new FileReader();
        SimpleReader simpleReader = new SimpleReader();
        read(storage, fileReader);
        read(storage, simpleReader);


        // что, если размер 0
        fileReader.readFilesFromStorage(storage);
        // if < 0
        fileReader.readFilesFromStorage(storage1);
        // if max integer
        fileReader.readFilesFromStorage(storage2);

    }

    private static void read(Storage storage, Readable readable) {
        System.out.println("method is starting");
        readable.readFilesFromStorage(storage);
    }
}
