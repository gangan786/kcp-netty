package io.jpower.kcp.netty;

import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelConfig;
import io.netty.channel.MessageSizeEstimator;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.channel.WriteBufferWaterMark;

import java.net.StandardSocketOptions;

/**
 * @author <a href="mailto:szhnet@gmail.com">szh</a>
 */
public interface UkcpClientChannelConfig extends ChannelConfig, UkcpChannelConfig {

    boolean isNodelay();

    UkcpClientChannelConfig setNodelay(boolean nodelay);

    int getInterval();

    UkcpClientChannelConfig setInterval(int interval);

    int getFastResend();

    UkcpClientChannelConfig setFastResend(int resend);

    boolean isNocwnd();

    UkcpClientChannelConfig setNocwnd(boolean nc);

    int getMtu();

    UkcpClientChannelConfig setMtu(int mtu);

    boolean isStream();

    UkcpClientChannelConfig setStream(boolean stream);

    /**
     * Gets the {@link StandardSocketOptions#SO_RCVBUF} option.
     */
    int getUdpReceiveBufferSize();

    /**
     * Sets the {@link StandardSocketOptions#SO_RCVBUF} option.
     */
    UkcpClientChannelConfig setUdpReceiveBufferSize(int receiveBufferSize);

    /**
     * Gets the {@link StandardSocketOptions#SO_SNDBUF} option.
     */
    int getUdpSendBufferSize();

    /**
     * Sets the {@link StandardSocketOptions#SO_SNDBUF} option.
     */
    UkcpClientChannelConfig setUdpSendBufferSize(int sendBufferSize);

    /**
     * Gets the {@link StandardSocketOptions#IP_TOS} option.
     */
    int getUdpTrafficClass();

    /**
     * Sets the {@link StandardSocketOptions#IP_TOS} option.
     */
    UkcpClientChannelConfig setUdpTrafficClass(int trafficClass);

    /**
     * Gets the {@link StandardSocketOptions#SO_REUSEADDR} option.
     */
    boolean isReuseAddress();

    /**
     * Gets the {@link StandardSocketOptions#SO_REUSEADDR} option.
     */
    UkcpClientChannelConfig setReuseAddress(boolean reuseAddress);

    @Override
    @Deprecated
    UkcpClientChannelConfig setMaxMessagesPerRead(int maxMessagesPerRead);

    @Override
    UkcpClientChannelConfig setWriteSpinCount(int writeSpinCount);

    @Override
    UkcpClientChannelConfig setConnectTimeoutMillis(int connectTimeoutMillis);

    @Override
    UkcpClientChannelConfig setAllocator(ByteBufAllocator allocator);

    @Override
    UkcpClientChannelConfig setRecvByteBufAllocator(RecvByteBufAllocator allocator);

    @Override
    UkcpClientChannelConfig setAutoRead(boolean autoRead);

    @Override
    UkcpClientChannelConfig setAutoClose(boolean autoClose);

    @Override
    UkcpClientChannelConfig setMessageSizeEstimator(MessageSizeEstimator estimator);

    @Override
    UkcpClientChannelConfig setWriteBufferWaterMark(WriteBufferWaterMark writeBufferWaterMark);

}
