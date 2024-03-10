# bigdata-trino-udfs
A repo containing trino UDFs

To test it in a local trino setup check: https://hub.docker.com/r/trinodb/trino

## Package jar:

    mvn clean package

## Test Deployment:

    docker run -p 8080:8080 -v "/path/to/repo/bigdata-trino-udfs/target/bigdata-trino-udfs.jar":/usr/lib/trino/plugin/udfs/trino-udfs.jar --name trino trinodb/trino

When the trino server has started, in a separate window run:

    docker exec -it trino trino --catalog tpch --schema sf1

Using the following command, the udf `hive_pattern_to_trino` can be found 

    show functions;