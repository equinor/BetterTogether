package com.bettertogether.app;

import db.RewardType;

public interface DataUpdateListener {

    void tokenReceived(String token);

    void responseError(int code, String message);

    void updateGrid();

    void updateStatus();

    void rewardReached(RewardType type);
}
