package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Impl2 {
    @Autowired
    @Qualifier("massageServiceImpl2")
    private IMassageService massageService;
    public List<String> getMessage(){
       return massageService.sendMessage();
    }
}
