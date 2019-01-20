package net.tealsquirrel.mute.network;

import org.springframework.stereotype.Component;

/**
 * Manages incoming connections to the application.
 */
public interface ConnectionManager {

    /**
     * Sets up server to begin listening for connections.
     * @param port  the port number to listen on
     */
    void beginListeningForConnectionsOnPort(int port);

    /**
     * Accepts new connections.
     */
    void acceptNewConnection();

    /**
     * Removes connections.
     */
    void removeConnection();

}
