package com.muc;

/**
 * Checks for current user status
 */
public interface UserStatusListener {
    /**
     * Is the user online?
     * @param login
     */
    public void online(String login);

    /**
     * Is the user offline?
     * @param login
     */
    public void offline(String login);
}
