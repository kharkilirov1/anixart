package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.internal.SystemPropsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Tasks.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class TasksKt {

    /* renamed from: a */
    @JvmField
    public static final long f68360a = SystemPropsKt.m34335g("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* renamed from: b */
    @JvmField
    public static final int f68361b;

    /* renamed from: c */
    @JvmField
    public static final int f68362c;

    /* renamed from: d */
    @JvmField
    public static final long f68363d;

    /* renamed from: e */
    @JvmField
    @NotNull
    public static SchedulerTimeSource f68364e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public static final TaskContext f68365f;

    /* renamed from: g */
    @JvmField
    @NotNull
    public static final TaskContext f68366g;

    static {
        int m34329a = SystemPropsKt.m34329a();
        f68361b = SystemPropsKt.m34334f("kotlinx.coroutines.scheduler.core.pool.size", m34329a < 2 ? 2 : m34329a, 1, 0, 8, null);
        f68362c = SystemPropsKt.m34334f("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f68363d = TimeUnit.SECONDS.toNanos(SystemPropsKt.m34335g("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null));
        f68364e = NanoTimeSource.f68350a;
        f68365f = new TaskContextImpl(0);
        f68366g = new TaskContextImpl(1);
    }
}
