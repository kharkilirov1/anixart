package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DebugCoroutineInfoImpl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class DebugCoroutineInfoImpl {
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0050 -> B:11:0x0068). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0062 -> B:10:0x0065). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m34202a(kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r4, kotlin.sequences.SequenceScope r5, kotlin.coroutines.jvm.internal.CoroutineStackFrame r6, kotlin.coroutines.Continuation r7) {
        /*
            java.util.Objects.requireNonNull(r4)
            boolean r6 = r7 instanceof kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1
            if (r6 == 0) goto L16
            r6 = r7
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r6 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1) r6
            int r0 = r6.f67426j
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L16
            int r0 = r0 - r1
            r6.f67426j = r0
            goto L1b
        L16:
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r6 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1
            r6.<init>(r4, r7)
        L1b:
            java.lang.Object r7 = r6.f67424h
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.f67426j
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 != r2) goto L36
            java.lang.Object r4 = r6.f67423g
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r4 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r4
            java.lang.Object r5 = r6.f67422f
            kotlin.sequences.SequenceScope r5 = (kotlin.sequences.SequenceScope) r5
            java.lang.Object r1 = r6.f67421e
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r1 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl) r1
            kotlin.ResultKt.m31892b(r7)
            goto L65
        L36:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3e:
            kotlin.ResultKt.m31892b(r7)
            r7 = 0
            r3 = r5
            r5 = r4
            r4 = r7
            r7 = r6
            r6 = r3
        L47:
            if (r4 != 0) goto L4c
            kotlin.Unit r0 = kotlin.Unit.f63088a
            goto L71
        L4c:
            java.lang.StackTraceElement r1 = r4.mo32120s()
            if (r1 != 0) goto L53
            goto L68
        L53:
            r7.f67421e = r5
            r7.f67422f = r6
            r7.f67423g = r4
            r7.f67426j = r2
            java.lang.Object r1 = r6.mo33827a(r1, r7)
            if (r1 != r0) goto L62
            goto L71
        L62:
            r1 = r5
            r5 = r6
            r6 = r7
        L65:
            r7 = r6
            r6 = r5
            r5 = r1
        L68:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r4 = r4.mo32119h()
            if (r4 == 0) goto L6f
            goto L47
        L6f:
            kotlin.Unit r0 = kotlin.Unit.f63088a
        L71:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.m34202a(kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl, kotlin.sequences.SequenceScope, kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public String toString() {
        throw null;
    }
}
