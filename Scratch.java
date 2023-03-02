import java.io.File;

class Scratch {
    public static void main(String[] args) {
        File curDir = new File(".");
        getAllFiles(curDir);
    }

    private static void getAllFiles(File curDir) {



        File[] filesList = curDir.listFiles();

        for(File f : filesList){

            if(f.isDirectory())

                getAllFiles(f);

            if(f.isFile()){

                System.out.println(f.getName());

            }
        }
    }
}