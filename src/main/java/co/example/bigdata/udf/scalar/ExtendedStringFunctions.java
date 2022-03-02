package co.example.bigdata.udf.scalar;

import io.airlift.slice.Slice;
import io.airlift.slice.Slices;
import io.trino.spi.function.Description;
import io.trino.spi.function.ScalarFunction;
import io.trino.spi.function.SqlType;
import io.trino.spi.type.StandardTypes;

public class ExtendedStringFunctions
{
    private ExtendedStringFunctions() {}

    @Description("custom udf from string to string")
    @ScalarFunction("hive_pattern_to_trino")
    @SqlType(StandardTypes.VARCHAR)
    public static Slice hivePatternToTrino(@SqlType(StandardTypes.VARCHAR) Slice string)
    {
        String argument = string.toStringUtf8();
        return Slices.utf8Slice(argument.toLowerCase());
    }
}
