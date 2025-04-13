package kotlinx.coroutines.flow;

import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SafeCollector.common.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m31884d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class FlowKt__LimitKt$take$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* compiled from: SafeCollector.common.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
    @DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", m32126f = "Limit.kt", m32127l = {C4632R.styleable.AppCompatTheme_tooltipFrameBackground}, m32128m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 */
    public static final class C68011 extends ContinuationImpl {

        /* renamed from: e */
        public /* synthetic */ Object f67662e;

        /* renamed from: f */
        public int f67663f;

        /* renamed from: h */
        public Object f67665h;

        public C68011(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /* renamed from: m */
        public final Object mo2379m(@NotNull Object obj) {
            this.f67662e = obj;
            this.f67663f |= Integer.MIN_VALUE;
            FlowKt__LimitKt$take$$inlined$unsafeFlow$1.this.mo4140a(null, this);
            return Unit.f63088a;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(4:10|11|12|13)(2:15|16))(4:17|18|19|20)))|25|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0029, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (r6.f68087b != r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        throw r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // kotlinx.coroutines.flow.Flow
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo4140a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.C68011
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.C68011) r0
            int r1 = r0.f67663f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67663f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f67662e
            int r1 = r0.f67663f
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            java.lang.Object r5 = r0.f67665h
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
            kotlin.ResultKt.m31892b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L29
            goto L40
        L29:
            r6 = move-exception
            goto L3c
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.m31892b(r6)
            r0.f67665h = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L29
            r0.f67663f = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L29
            r5 = 0
            throw r5
        L3c:
            kotlinx.coroutines.flow.FlowCollector<?> r0 = r6.f68087b
            if (r0 != r5) goto L43
        L40:
            kotlin.Unit r5 = kotlin.Unit.f63088a
            return r5
        L43:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.mo4140a(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
