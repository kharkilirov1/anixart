package retrofit2;

import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* compiled from: KotlinExtensions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"retrofit"}, m31885k = 2, m31886mv = {1, 4, 0})
@JvmName
/* loaded from: classes3.dex */
public final class KotlinExtensions {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m35020a(@org.jetbrains.annotations.NotNull final java.lang.Exception r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.f69442f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f69442f = r1
            goto L18
        L13:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f69441e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f69442f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f69443g
            java.lang.Exception r4 = (java.lang.Exception) r4
            kotlin.ResultKt.m31892b(r5)
            kotlin.Unit r4 = kotlin.Unit.f63088a
            return r4
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.ResultKt.m31892b(r5)
            r0.f69443g = r4
            r0.f69442f = r3
            kotlinx.coroutines.CoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.f66988a
            kotlin.coroutines.CoroutineContext r2 = r0.getF66928c()
            retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1 r3 = new retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1
            r3.<init>()
            r5.mo3221m(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.m35020a(java.lang.Exception, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
