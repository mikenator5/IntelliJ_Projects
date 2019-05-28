package com.muc;

/**
 * Listens for message
 */
public interface MessageListener {
    /**
     * Class that waits for message to be received
     */
    public void onMessage(String fromLogin, String msgBody);
}
