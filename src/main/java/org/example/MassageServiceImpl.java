package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
@Service
@Qualifier("massageServiceImpl")
public class MassageServiceImpl implements IMassageService {

    private Resource resource;
    @Autowired
    public MassageServiceImpl(Resource resource) {
        this.resource = resource;
    }
    @Override
    public List<String> sendMessage() {

        return resource.sendMessageList();
    }
}
