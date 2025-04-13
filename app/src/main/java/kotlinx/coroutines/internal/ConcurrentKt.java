package kotlinx.coroutines.internal;

import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: Concurrent.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\f\b\u0000\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, m31884d2 = {"Ljava/util/concurrent/locks/ReentrantLock;", "ReentrantLock", "kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class ConcurrentKt {

    /* renamed from: a */
    @Nullable
    public static final Method f68240a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f68240a = method;
    }
}
