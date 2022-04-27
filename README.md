# bigdata-trino-udfs
A repo containing trino UDFs

To test it in a local trino setup check: https://hub.docker.com/r/trinodb/trino

## Package jar:

    mvn clean package

## Test Deployment:

    docker run -p 8080:8080 -v "/path/to/repo/bigdata-trino-udfs/target/trino-udfs-0.0.1.jar":/usr/lib/trino/plugin/udfs/trino-udfs-0.0.1.jar --name trino trinodb/trino

    docker exec -it trino trino --catalog tpch --schema sf1
