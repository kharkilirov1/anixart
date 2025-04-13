package androidx.window.layout;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WindowInfoTrackerImpl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m31884d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/window/layout/WindowLayoutInfo;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", m32126f = "WindowInfoTrackerImpl.kt", m32127l = {54, 55}, m32128m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WindowInfoTrackerImpl$windowLayoutInfo$1 extends SuspendLambda implements Function2<FlowCollector<? super WindowLayoutInfo>, Continuation<? super Unit>, Object> {

    /* renamed from: f */
    public Object f6800f;

    /* renamed from: g */
    public Object f6801g;

    /* renamed from: h */
    public int f6802h;

    /* renamed from: i */
    public /* synthetic */ Object f6803i;

    /* renamed from: j */
    public final /* synthetic */ WindowInfoTrackerImpl f6804j;

    /* renamed from: k */
    public final /* synthetic */ Activity f6805k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerImpl$windowLayoutInfo$1(WindowInfoTrackerImpl windowInfoTrackerImpl, Activity activity, Continuation<? super WindowInfoTrackerImpl$windowLayoutInfo$1> continuation) {
        super(2, continuation);
        this.f6804j = windowInfoTrackerImpl;
        this.f6805k = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this.f6804j, this.f6805k, continuation);
        windowInfoTrackerImpl$windowLayoutInfo$1.f6803i = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(FlowCollector<? super WindowLayoutInfo> flowCollector, Continuation<? super Unit> continuation) {
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this.f6804j, this.f6805k, continuation);
        windowInfoTrackerImpl$windowLayoutInfo$1.f6803i = flowCollector;
        return windowInfoTrackerImpl$windowLayoutInfo$1.mo2379m(Unit.f63088a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b A[Catch: all -> 0x009c, TRY_LEAVE, TryCatch #1 {all -> 0x009c, blocks: (B:11:0x0061, B:16:0x0073, B:18:0x007b), top: B:10:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0090 -> B:10:0x0061). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo2379m(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.f6802h
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L39
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            java.lang.Object r1 = r9.f6801g
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r9.f6800f
            androidx.core.util.Consumer r4 = (androidx.core.util.Consumer) r4
            java.lang.Object r5 = r9.f6803i
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
            kotlin.ResultKt.m31892b(r10)     // Catch: java.lang.Throwable -> L37
            r10 = r5
            goto L60
        L1d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L25:
            java.lang.Object r1 = r9.f6801g
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r9.f6800f
            androidx.core.util.Consumer r4 = (androidx.core.util.Consumer) r4
            java.lang.Object r5 = r9.f6803i
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
            kotlin.ResultKt.m31892b(r10)     // Catch: java.lang.Throwable -> L37
            r6 = r5
            r5 = r9
            goto L73
        L37:
            r10 = move-exception
            goto L9e
        L39:
            kotlin.ResultKt.m31892b(r10)
            java.lang.Object r10 = r9.f6803i
            kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
            r1 = 10
            kotlinx.coroutines.channels.BufferOverflow r4 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
            r5 = 0
            r6 = 4
            kotlinx.coroutines.channels.Channel r1 = kotlinx.coroutines.channels.ChannelKt.m34176a(r1, r4, r5, r6)
            androidx.window.layout.b r4 = new androidx.window.layout.b
            r4.<init>(r1)
            androidx.window.layout.WindowInfoTrackerImpl r5 = r9.f6804j
            androidx.window.layout.WindowBackend r5 = r5.f6799c
            android.app.Activity r6 = r9.f6805k
            androidx.window.layout.c r7 = androidx.window.layout.ExecutorC0688c.f6811c
            r5.mo4436b(r6, r7, r4)
            kotlinx.coroutines.channels.AbstractChannel r1 = (kotlinx.coroutines.channels.AbstractChannel) r1     // Catch: java.lang.Throwable -> L37
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L37
        L60:
            r5 = r9
        L61:
            r5.f6803i = r10     // Catch: java.lang.Throwable -> L9c
            r5.f6800f = r4     // Catch: java.lang.Throwable -> L9c
            r5.f6801g = r1     // Catch: java.lang.Throwable -> L9c
            r5.f6802h = r3     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r6 = r1.mo34140a(r5)     // Catch: java.lang.Throwable -> L9c
            if (r6 != r0) goto L70
            return r0
        L70:
            r8 = r6
            r6 = r10
            r10 = r8
        L73:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L9c
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L9c
            if (r10 == 0) goto L92
            java.lang.Object r10 = r1.next()     // Catch: java.lang.Throwable -> L9c
            androidx.window.layout.WindowLayoutInfo r10 = (androidx.window.layout.WindowLayoutInfo) r10     // Catch: java.lang.Throwable -> L9c
            r5.f6803i = r6     // Catch: java.lang.Throwable -> L9c
            r5.f6800f = r4     // Catch: java.lang.Throwable -> L9c
            r5.f6801g = r1     // Catch: java.lang.Throwable -> L9c
            r5.f6802h = r2     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r10 = r6.mo4139f(r10, r5)     // Catch: java.lang.Throwable -> L9c
            if (r10 != r0) goto L90
            return r0
        L90:
            r10 = r6
            goto L61
        L92:
            androidx.window.layout.WindowInfoTrackerImpl r10 = r5.f6804j
            androidx.window.layout.WindowBackend r10 = r10.f6799c
            r10.mo4435a(r4)
            kotlin.Unit r10 = kotlin.Unit.f63088a
            return r10
        L9c:
            r10 = move-exception
            goto L9f
        L9e:
            r5 = r9
        L9f:
            androidx.window.layout.WindowInfoTrackerImpl r0 = r5.f6804j
            androidx.window.layout.WindowBackend r0 = r0.f6799c
            r0.mo4435a(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1.mo2379m(java.lang.Object):java.lang.Object");
    }
}
