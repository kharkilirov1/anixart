package kotlinx.coroutines.flow;

import com.yandex.mobile.ads.C4632R;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SafeCollector.common.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m31884d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* compiled from: SafeCollector.common.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
    @DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", m32126f = "Errors.kt", m32127l = {C4632R.styleable.AppCompatTheme_windowActionBar, C4632R.styleable.AppCompatTheme_windowActionModeOverlay}, m32128m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 */
    public static final class C68001 extends ContinuationImpl {

        /* renamed from: e */
        public /* synthetic */ Object f67639e;

        /* renamed from: f */
        public int f67640f;

        /* renamed from: h */
        public Object f67642h;

        /* renamed from: i */
        public Object f67643i;

        /* renamed from: j */
        public Object f67644j;

        /* renamed from: k */
        public long f67645k;

        public C68001(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /* renamed from: m */
        public final Object mo2379m(@NotNull Object obj) {
            this.f67639e = obj;
            this.f67640f |= Integer.MIN_VALUE;
            return FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.this.mo4140a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0080 -> B:13:0x0081). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.Flow
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo4140a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.C68001
            if (r0 == 0) goto L13
            r0 = r11
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.C68001) r0
            int r1 = r0.f67640f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67640f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f67639e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f67640f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L5f
            if (r2 == r5) goto L50
            if (r2 != r4) goto L48
            long r6 = r0.f67645k
            java.lang.Object r10 = r0.f67644j
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            java.lang.Object r2 = r0.f67643i
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.lang.Object r8 = r0.f67642h
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r8 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) r8
            kotlin.ResultKt.m31892b(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L47
            r10 = 1
            long r6 = r6 + r10
            r10 = r2
            r11 = r8
            r2 = 1
            goto L81
        L47:
            throw r10
        L48:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L50:
            long r6 = r0.f67645k
            java.lang.Object r10 = r0.f67643i
            kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
            java.lang.Object r2 = r0.f67642h
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r2 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) r2
            kotlin.ResultKt.m31892b(r11)
            r8 = r2
            goto L7b
        L5f:
            kotlin.ResultKt.m31892b(r11)
            r6 = 0
            r11 = r9
        L65:
            java.util.Objects.requireNonNull(r11)
            r0.f67642h = r11
            r0.f67643i = r10
            r0.f67644j = r3
            r0.f67645k = r6
            r0.f67640f = r5
            java.lang.Object r2 = kotlinx.coroutines.flow.FlowKt.m34209a(r3, r10, r0)
            if (r2 != r1) goto L79
            return r1
        L79:
            r8 = r11
            r11 = r2
        L7b:
            r2 = 0
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            if (r11 != 0) goto L86
            r11 = r8
        L81:
            if (r2 != 0) goto L65
            kotlin.Unit r10 = kotlin.Unit.f63088a
            return r10
        L86:
            java.util.Objects.requireNonNull(r8)
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r6)
            r0.f67642h = r8
            r0.f67643i = r10
            r0.f67644j = r11
            r0.f67645k = r6
            r0.f67640f = r4
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.mo4140a(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
