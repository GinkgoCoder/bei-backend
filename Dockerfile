FROM openjdk:11

ADD target/bei.jar ~/

HEALTHCHECK --interval=5s --timeout=1s --retries=3\
    CMD curl 127.0.0.1:8080 || exit 1

ENTRYPOINT ["java", "-jar", "~/bei.jar"]
