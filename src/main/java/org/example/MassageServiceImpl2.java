package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
//@Component
@Service
@Qualifier("massageServiceImpl2")
public class MassageServiceImpl2 implements IMassageService {
private Resource resource;

    public MassageServiceImpl2(Resource resource) {
        this.resource = resource;
    }

    @Override
    public List<String> sendMessage() {
        System.out.println("MassageServiceImpl2");
        return  resource.sendMessageList();
    }
}
