# bigdata-trino-udfs
A repo containing custom UDFs

To test it in a local trino setup check: https://hub.docker.com/r/trinodb/trino

### Package jar:
    mvn clean package

#### Output:
    target/bigdata-trino-udfs.jar

### Deploy:
    docker run -p 8080:8080 -v "/path/to/repo/bigdata-trino-udfs/target/bigdata-trino-udfs.jar":/usr/lib/trino/plugin/udfs/bigdata-trino-udfs.jar --name trino trinodb/trino
