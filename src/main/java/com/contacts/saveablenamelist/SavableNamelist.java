package com.contacts.saveablenamelist;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SavableNamelist {

    public String tryAction(String action, String name, String newName){
        switch (action){
            case "add":
            case "delete":
                if (name != null){
                    return name + 22;
                }
                break;
            case "modify":
                if (name != null && newName != null){
                    return name + newName + "444444555666";
                }
                break;
            default:
                return "Action '" + action + "' or name '" +
                        (name != null ? name : "")  +
                        (newName != null ? ("/" + newName) : "") +
                        "' does not exist.";
        }
        return "";
    }

    public String add(String name){
        return name + "22";
    }

    public String modify(String name, String newname){
        return "22";
    }

    public String delete(String name){
        return name + "22";
    }

}
