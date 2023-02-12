package com.example.demo.chunk.reader;

import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.support.AbstractItemStreamItemReader;
import org.springframework.lang.Nullable;

public class TestReader extends AbstractItemStreamItemReader<String> {

    @Override
    @Nullable
    public String read() throws Exception, UnexpectedInputException, ParseException,
            NonTransientResourceException {
        // TODO Auto-generated method stub
        return null;
    }

}
