package com.contacts.namelist;

import javax.enterprise.context.ApplicationScoped;
import java.util.LinkedList;

@ApplicationScoped
public class Namelist {

    private final LinkedList<String> nameList = new LinkedList<>();

    public String tryAction(String action, String name, String newName){
        String returnMessage = "Something went wrong. Try again!";
        switch (action){
            case "add":
                if (name != null){
                    nameList.add(name);
                    returnMessage = "Added '" + name + "' into namelist.";
                } else {
                    returnMessage = "Cannot add non-existing name 'null'.";
                }
                break;
            case "delete":
                if (name != null && nameList.contains(name)){
                    nameList.remove(name);
                    returnMessage = "Deleted '" + name + "' from namelist.";
                } else {
                    returnMessage = "Cannot remove " + (name != null ?
                            ("name '" + name + "' that is not present in namelist.") : "non-existing name.");
                }
                break;
            case "modify":
                if (name != null && nameList.contains(name) && newName != null){
                    int index = nameList.indexOf(name);
                    nameList.remove(name);
                    nameList.add(index, newName);
                    returnMessage = "Modified name '" + name + "' to '" + newName + "'.";
                } else {
                    if (newName != null){
                        returnMessage = "Cannot modify " + (name != null ?
                                ("name '" + name + "' that is not present in namelist.") : "non-existing name.");
                    } else {
                        returnMessage = "Cannot modify to non-value name.";
                    }
                }
                break;
            case "getList":
                returnMessage = nameList.toString();
                break;
            default:
                returnMessage = "Action '" + action + "' not found. Please try add/modify/delete.";
        }
        return returnMessage;
    }
}
