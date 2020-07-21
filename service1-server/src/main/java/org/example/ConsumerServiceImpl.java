package org.example;

import com.example.ProviderService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Reference(mock = "fail:return+null")
    private ProviderService providerService;

    @Override
    public String service() {
        return "Consumer invoke " + providerService.service();
    }
}
