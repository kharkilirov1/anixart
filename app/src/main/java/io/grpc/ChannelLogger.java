package io.grpc;

import javax.annotation.concurrent.ThreadSafe;

@ExperimentalApi
@ThreadSafe
/* loaded from: classes3.dex */
public abstract class ChannelLogger {

    public enum ChannelLogLevel {
        DEBUG,
        INFO,
        /* JADX INFO: Fake field, exist only in values array */
        WARNING,
        /* JADX INFO: Fake field, exist only in values array */
        ERROR
    }

    /* renamed from: a */
    public abstract void mo30810a(ChannelLogLevel channelLogLevel, String str);

    /* renamed from: b */
    public abstract void mo30811b(ChannelLogLevel channelLogLevel, String str, Object... objArr);
}
