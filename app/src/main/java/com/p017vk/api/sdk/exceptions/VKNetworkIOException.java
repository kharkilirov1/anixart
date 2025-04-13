package com.p017vk.api.sdk.exceptions;

import androidx.room.util.C0576a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: VKNetworkIOException.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/vk/api/sdk/exceptions/VKNetworkIOException;", "Ljava/io/IOException;", "Companion", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public class VKNetworkIOException extends IOException {

    /* compiled from: VKNetworkIOException.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/vk/api/sdk/exceptions/VKNetworkIOException$Companion;", "", "", "serialVersionUID", "J", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
    }

    @JvmOverloads
    public VKNetworkIOException() {
        super("", null);
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("NetworkIO(noNetwork=");
        int i2 = 1;
        m24u.append(((getCause() instanceof UnknownHostException) || (getCause() instanceof SocketException)) ? 1 : 0);
        m24u.append(',');
        m24u.append("interrupted=");
        if (!(getCause() instanceof InterruptedIOException) && !(getCause() instanceof InterruptedException)) {
            i2 = 0;
        }
        m24u.append(i2);
        m24u.append(',');
        Throwable cause = getCause();
        return C0576a.m4118q(m24u, cause != null ? cause.toString() : null, ')');
    }

    public VKNetworkIOException(@Nullable Throwable th) {
        super("", th);
    }
}
