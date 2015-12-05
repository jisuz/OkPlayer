package org.succlz123.okplayer.listener;

/**
 * ExpPlayer核心事件监听
 * Created by succlz123 on 15/11/29.
 */
public interface OkPlayerListener {

    void onStateChanged(boolean playWhenReady, int playbackState);

    void onError(Exception e);

    void onVideoSizeChanged(int width, int height, int unappliedRotationDegrees, float pixelWidthHeightRatio);
}