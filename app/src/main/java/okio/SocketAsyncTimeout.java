package okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: JvmOkio.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lokio/SocketAsyncTimeout;", "Lokio/AsyncTimeout;", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
final class SocketAsyncTimeout extends AsyncTimeout {

    /* renamed from: a */
    public final Socket f68806a;

    public SocketAsyncTimeout(@NotNull Socket socket) {
        this.f68806a = socket;
    }

    @Override // okio.AsyncTimeout
    @NotNull
    public IOException newTimeoutException(@Nullable IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // okio.AsyncTimeout
    public void timedOut() {
        try {
            this.f68806a.close();
        } catch (AssertionError e2) {
            if (!Okio.m34603e(e2)) {
                throw e2;
            }
            Logger logger = Okio__JvmOkioKt.f68773a;
            Level level = Level.WARNING;
            StringBuilder m24u = C0000a.m24u("Failed to close timed out socket ");
            m24u.append(this.f68806a);
            logger.log(level, m24u.toString(), (Throwable) e2);
        } catch (Exception e3) {
            Logger logger2 = Okio__JvmOkioKt.f68773a;
            Level level2 = Level.WARNING;
            StringBuilder m24u2 = C0000a.m24u("Failed to close timed out socket ");
            m24u2.append(this.f68806a);
            logger2.log(level2, m24u2.toString(), (Throwable) e3);
        }
    }
}
