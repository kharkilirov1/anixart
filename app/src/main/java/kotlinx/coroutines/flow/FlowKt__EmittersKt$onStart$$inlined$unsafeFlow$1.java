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
public final class FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* compiled from: SafeCollector.common.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
    @DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", m32126f = "Emitters.kt", m32127l = {C4632R.styleable.AppCompatTheme_viewInflaterClass, C4632R.styleable.AppCompatTheme_windowFixedHeightMajor}, m32128m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 */
    public static final class C67961 extends ContinuationImpl {

        /* renamed from: e */
        public /* synthetic */ Object f67604e;

        /* renamed from: f */
        public int f67605f;

        /* renamed from: h */
        public Object f67607h;

        /* renamed from: i */
        public Object f67608i;

        /* renamed from: j */
        public Object f67609j;

        public C67961(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /* renamed from: m */
        public final Object mo2379m(@NotNull Object obj) {
            this.f67604e = obj;
            this.f67605f |= Integer.MIN_VALUE;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.this.mo4140a(null, this);
            return Unit.f63088a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.flow.internal.SafeCollector] */
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
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.C67961
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.C67961) r0
            int r1 = r0.f67605f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67605f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f67604e
            int r1 = r0.f67605f
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L53
            r5 = 2
            if (r1 == r2) goto L33
            if (r1 != r5) goto L2b
            kotlin.ResultKt.m31892b(r6)
            kotlin.Unit r5 = kotlin.Unit.f63088a
            return r5
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            java.lang.Object r1 = r0.f67609j
            kotlinx.coroutines.flow.internal.SafeCollector r1 = (kotlinx.coroutines.flow.internal.SafeCollector) r1
            java.lang.Object r2 = r0.f67608i
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.lang.Object r2 = r0.f67607h
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 r2 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1) r2
            kotlin.ResultKt.m31892b(r6)     // Catch: java.lang.Throwable -> L51
            r1.mo32124o()
            java.util.Objects.requireNonNull(r2)
            r0.f67607h = r3
            r0.f67608i = r3
            r0.f67609j = r3
            r0.f67605f = r5
            throw r3
        L51:
            r5 = move-exception
            goto L69
        L53:
            kotlin.ResultKt.m31892b(r6)
            kotlinx.coroutines.flow.internal.SafeCollector r1 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.CoroutineContext r6 = r0.f63244c
            kotlin.jvm.internal.Intrinsics.m32176e(r6)
            r1.<init>(r5, r6)
            r0.f67607h = r4     // Catch: java.lang.Throwable -> L51
            r0.f67608i = r5     // Catch: java.lang.Throwable -> L51
            r0.f67609j = r1     // Catch: java.lang.Throwable -> L51
            r0.f67605f = r2     // Catch: java.lang.Throwable -> L51
            throw r3     // Catch: java.lang.Throwable -> L51
        L69:
            r1.mo32124o()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.mo4140a(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
