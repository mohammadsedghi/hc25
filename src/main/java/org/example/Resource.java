package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


//@Component
//@Service
public class Resource {

    public List<String> sendMessageList(){
        List<String> list=new ArrayList<>();
       list.add("aaaaaaaaaa");
       list.add("bbbbbbbbb");
       list.add("ccccccccccc");
       return list;
    }
}
