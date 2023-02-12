package com.example.demo.chunk.processor;

import java.util.List;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

public class TestProcessor implements ItemProcessor<String, List<String>> {

    @Override
    @Nullable
    public List<String> process(@NonNull String item) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

}
