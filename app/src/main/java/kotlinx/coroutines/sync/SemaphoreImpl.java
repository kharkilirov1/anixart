package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Semaphore.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/sync/SemaphoreImpl;", "Lkotlinx/coroutines/sync/Semaphore;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class SemaphoreImpl implements Semaphore {

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f68430c = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "head");

    /* renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f68431d = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "deqIdx");

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f68432e = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "tail");

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f68433f = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "enqIdx");

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f68434g = AtomicIntegerFieldUpdater.newUpdater(SemaphoreImpl.class, "_availablePermits");

    @NotNull
    public volatile /* synthetic */ int _availablePermits;

    /* renamed from: a */
    public final int f68435a;

    /* renamed from: b */
    @NotNull
    public final Function1<Throwable, Unit> f68436b;

    @NotNull
    private volatile /* synthetic */ long deqIdx = 0;

    @NotNull
    private volatile /* synthetic */ long enqIdx = 0;

    @NotNull
    private volatile /* synthetic */ Object head;

    @NotNull
    private volatile /* synthetic */ Object tail;

    public SemaphoreImpl(int i2, int i3) {
        this.f68435a = i2;
        boolean z = false;
        if (!(i2 > 0)) {
            throw new IllegalArgumentException(Intrinsics.m32187p("Semaphore should have at least 1 permit, but had ", Integer.valueOf(i2)).toString());
        }
        if (i3 >= 0 && i3 <= i2) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(Intrinsics.m32187p("The number of acquired permits should be in 0..", Integer.valueOf(i2)).toString());
        }
        SemaphoreSegment semaphoreSegment = new SemaphoreSegment(0L, null, 2);
        this.head = semaphoreSegment;
        this.tail = semaphoreSegment;
        this._availablePermits = i2 - i3;
        this.f68436b = new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.sync.SemaphoreImpl$onCancellationRelease$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                SemaphoreImpl.this.release();
                return Unit.f63088a;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cf A[EDGE_INSN: B:63:0x00cf->B:55:0x00cf BREAK  A[LOOP:0: B:7:0x0015->B:62:?], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v3, types: [kotlinx.coroutines.internal.Segment] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlinx.coroutines.internal.Symbol] */
    @Override // kotlinx.coroutines.sync.Semaphore
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo34402a(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.SemaphoreImpl.mo34402a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x007d, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [kotlinx.coroutines.internal.Segment] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlinx.coroutines.internal.Symbol] */
    @Override // kotlinx.coroutines.sync.Semaphore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void release() {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.SemaphoreImpl.release():void");
    }
}
