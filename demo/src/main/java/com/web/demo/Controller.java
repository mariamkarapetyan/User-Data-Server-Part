package com.web.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by ijepijedpojed on 2017-07-09.
 */
@RestController
public class Controller {

    @RequestMapping(path = "/users")
    public ArrayList<User> getUsers(){
        ArrayList<User> list=new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            list.add(new User("n " + i, "e " + i, "ph " + i, "https://dummyimage.com/" + (600 + i) + ".png/09f/fff", "note " + i));
        }

        return list;
    }

}
