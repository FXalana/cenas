package org.academiadecodigo.bootcamp11.exceptions;

/**
 * Created by codecadet on 04/10/17.
 */
public class File {

    private String name;

    public File(String fileName) {
        this.name = fileName;
    }


    public String getName(){
       return this.name ;
   }

}
