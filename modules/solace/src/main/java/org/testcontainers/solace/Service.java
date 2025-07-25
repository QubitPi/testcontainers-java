package org.testcontainers.solace;

/**
 * Services that are supported by Testcontainers implementation
 */
public enum Service {
    /**
     * Advanced Message Queuing Protocol
     */
    AMQP("amqp", 5672, "amqp", false),
    /**
     * Message Queuing Telemetry Transport
     */
    MQTT("mqtt", 1883, "tcp", false),
    /**
     * Representational State Transfer
     */
    REST("rest", 9000, "http", false),
    /**
     * Solace Message Format
     */
    SMF("smf", 55555, "tcp", true),
    /**
     * Solace Message Format with SSL
     */
    SMF_SSL("smf", 55443, "tcps", true);

    private final String name;

    private final Integer port;

    private final String protocol;

    private final boolean supportSSL;

    Service(String name, Integer port, String protocol, boolean supportSSL) {
        this.name = name;
        this.port = port;
        this.protocol = protocol;
        this.supportSSL = supportSSL;
    }

    /**
     * @return Port assigned for the service
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return Protocol of the service
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return Name of the service
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return Is SSL for this service supported ?
     */
    public boolean isSupportSSL() {
        return this.supportSSL;
    }
}
