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
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* compiled from: SafeCollector.common.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
    @DebugMetadata(m32125c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", m32126f = "Emitters.kt", m32127l = {C4632R.styleable.AppCompatTheme_tooltipForegroundColor, C4632R.styleable.AppCompatTheme_windowFixedHeightMinor, 128}, m32128m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 */
    public static final class C67941 extends ContinuationImpl {

        /* renamed from: e */
        public /* synthetic */ Object f67593e;

        /* renamed from: f */
        public int f67594f;

        /* renamed from: h */
        public Object f67596h;

        /* renamed from: i */
        public Object f67597i;

        public C67941(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /* renamed from: m */
        public final Object mo2379m(@NotNull Object obj) {
            this.f67593e = obj;
            this.f67594f |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.this.mo4140a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.Flow
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo4140a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.C67941
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.C67941) r0
            int r1 = r0.f67594f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67594f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f67593e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f67594f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L72
            r8 = 3
            if (r2 == r4) goto L49
            if (r2 == r3) goto L41
            if (r2 != r8) goto L39
            java.lang.Object r8 = r0.f67596h
            kotlinx.coroutines.flow.internal.SafeCollector r8 = (kotlinx.coroutines.flow.internal.SafeCollector) r8
            kotlin.ResultKt.m31892b(r9)     // Catch: java.lang.Throwable -> L37
            r8.mo32124o()
            kotlin.Unit r8 = kotlin.Unit.f63088a
            return r8
        L37:
            r9 = move-exception
            goto L6c
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            java.lang.Object r8 = r0.f67596h
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            kotlin.ResultKt.m31892b(r9)
            goto L93
        L49:
            java.lang.Object r2 = r0.f67597i
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.lang.Object r4 = r0.f67596h
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 r4 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1) r4
            kotlin.ResultKt.m31892b(r9)     // Catch: java.lang.Throwable -> L70
            kotlinx.coroutines.flow.internal.SafeCollector r9 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.CoroutineContext r1 = r0.f63244c
            kotlin.jvm.internal.Intrinsics.m32176e(r1)
            r9.<init>(r2, r1)
            java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Throwable -> L68
            r0.f67596h = r9     // Catch: java.lang.Throwable -> L68
            r0.f67597i = r5     // Catch: java.lang.Throwable -> L68
            r0.f67594f = r8     // Catch: java.lang.Throwable -> L68
            throw r5     // Catch: java.lang.Throwable -> L68
        L68:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L6c:
            r8.mo32124o()
            throw r9
        L70:
            r8 = move-exception
            goto L7e
        L72:
            kotlin.ResultKt.m31892b(r9)
            r0.f67596h = r7     // Catch: java.lang.Throwable -> L7c
            r0.f67597i = r8     // Catch: java.lang.Throwable -> L7c
            r0.f67594f = r4     // Catch: java.lang.Throwable -> L7c
            throw r5     // Catch: java.lang.Throwable -> L7c
        L7c:
            r8 = move-exception
            r4 = r7
        L7e:
            kotlinx.coroutines.flow.ThrowingCollector r9 = new kotlinx.coroutines.flow.ThrowingCollector
            r9.<init>(r8)
            java.util.Objects.requireNonNull(r4)
            r0.f67596h = r8
            r0.f67597i = r5
            r0.f67594f = r3
            java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt__EmittersKt.m34217a(r9, r5, r8, r0)
            if (r9 != r1) goto L93
            return r1
        L93:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.mo4140a(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
