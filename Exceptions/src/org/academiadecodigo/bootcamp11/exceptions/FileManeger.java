package org.academiadecodigo.bootcamp11.exceptions;

/**
 * Created by codecadet on 04/10/17.
 */
public class FileManeger {

    private boolean user;
    private File file;


    public void logIn() {
        if (user == true) {
            System.out.println("You are already logged in");
            return;
        }
        user = true;
        System.out.println("You have logged in");

    }

    public void logOut() {
        if (user == false) {
            System.out.println("Your not logged in");
            return;
        }
        user = false;
        System.out.println("You have logged out");
    }

    public File getFile(String fileName) throws NotEnoughtPermissionsException, FileNotFoundException {


        if (user == false) {
            throw new NotEnoughtPermissionsException("You are not logged in");
        }
        if (file == null || !fileName.equals(file.getName())) {
            throw new FileNotFoundException("The file dont exist");
        }

        System.out.println(fileName);
        return file;
    }

    public void createFile(String fileName) throws NotEnoughtPermissionsException, NotEnoughtSpaceException {
        if (user == false) {
            throw new NotEnoughtPermissionsException("You are not logged in");
        }
        if (file != null) {
            throw new NotEnoughtSpaceException("You don't have space");
        }
        this.file = new File(fileName);
        System.out.println("File create");
    }

}
