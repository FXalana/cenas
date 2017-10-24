package org.academiadecodigo.bootcamp11.exceptions;

/**
 * Created by codecadet on 04/10/17.
 */
public class Main {
    public static void main(String[] args) {

        FileManeger fileManeger = new FileManeger();

        try {
            fileManeger.logIn();
            fileManeger.createFile("a");
            fileManeger.getFile("a");
            fileManeger.logOut();
        } catch (NotEnoughtPermissionsException z) {
            System.out.println(z.getMessage());
            z.printStackTrace();
        } catch (NotEnoughtSpaceException s) {
            System.out.println(s.getMessage());
            s.printStackTrace();
        } catch (FileNotFoundException x) {
            System.out.println(x.getMessage());
            x.printStackTrace();
        }

    }
}
