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
public final class FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* compiled from: SafeCollector.common.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
    @DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1", m32126f = "Emitters.kt", m32127l = {C4632R.styleable.AppCompatTheme_tooltipForegroundColor, C4632R.styleable.AppCompatTheme_windowFixedWidthMajor}, m32128m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1 */
    public static final class C67951 extends ContinuationImpl {

        /* renamed from: e */
        public /* synthetic */ Object f67598e;

        /* renamed from: f */
        public int f67599f;

        /* renamed from: h */
        public Object f67601h;

        /* renamed from: i */
        public Object f67602i;

        /* renamed from: j */
        public Object f67603j;

        public C67951(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /* renamed from: m */
        public final Object mo2379m(@NotNull Object obj) {
            this.f67598e = obj;
            this.f67599f |= Integer.MIN_VALUE;
            FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.this.mo4140a(null, this);
            return Unit.f63088a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // kotlinx.coroutines.flow.Flow
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo4140a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.C67951
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.C67951) r0
            int r1 = r0.f67599f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67599f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f67598e
            int r1 = r0.f67599f
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L6e
            r7 = 2
            if (r1 == r2) goto L3a
            if (r1 != r7) goto L32
            java.lang.Object r7 = r0.f67601h
            kotlinx.coroutines.flow.internal.SafeCollector r7 = (kotlinx.coroutines.flow.internal.SafeCollector) r7
            kotlin.ResultKt.m31892b(r8)     // Catch: java.lang.Throwable -> L30
            r7.mo32124o()
            goto L4d
        L30:
            r8 = move-exception
            goto L6a
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            java.lang.Object r1 = r0.f67603j
            kotlin.jvm.internal.Ref$BooleanRef r1 = (kotlin.jvm.internal.Ref.BooleanRef) r1
            java.lang.Object r2 = r0.f67602i
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.lang.Object r4 = r0.f67601h
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 r4 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1) r4
            kotlin.ResultKt.m31892b(r8)
            boolean r8 = r1.f63347b
            if (r8 != 0) goto L50
        L4d:
            kotlin.Unit r7 = kotlin.Unit.f63088a
            return r7
        L50:
            kotlinx.coroutines.flow.internal.SafeCollector r8 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.CoroutineContext r1 = r0.f63244c
            kotlin.jvm.internal.Intrinsics.m32176e(r1)
            r8.<init>(r2, r1)
            java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Throwable -> L66
            r0.f67601h = r8     // Catch: java.lang.Throwable -> L66
            r0.f67602i = r3     // Catch: java.lang.Throwable -> L66
            r0.f67603j = r3     // Catch: java.lang.Throwable -> L66
            r0.f67599f = r7     // Catch: java.lang.Throwable -> L66
            throw r3     // Catch: java.lang.Throwable -> L66
        L66:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L6a:
            r7.mo32124o()
            throw r8
        L6e:
            kotlin.ResultKt.m31892b(r8)
            kotlin.jvm.internal.Ref$BooleanRef r8 = new kotlin.jvm.internal.Ref$BooleanRef
            r8.<init>()
            r8.f63347b = r2
            r0.f67601h = r6
            r0.f67602i = r7
            r0.f67603j = r8
            r0.f67599f = r2
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.mo4140a(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
