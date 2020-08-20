
1.Starting Zookeeper server

.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties


2. Starting Starting Kafka server

.\bin\windows\kafka-server-start.bat .\config\server.properties


3.Starting Comsumer Console with given topic name

.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic NewTopic --from-beginning