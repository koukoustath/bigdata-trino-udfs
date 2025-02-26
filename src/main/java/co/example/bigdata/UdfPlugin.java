package co.example.bigdata;

import co.example.bigdata.udf.scalar.ExtendedStringFunctions;
import com.google.common.collect.ImmutableSet;
import io.trino.spi.Plugin;

import java.util.Set;

public class UdfPlugin implements Plugin
{
    @Override
    public Set<Class<?>> getFunctions()
    {
        return ImmutableSet.<Class<?>>builder()
                .add(ExtendedStringFunctions.class)
                .build();
    }
}
