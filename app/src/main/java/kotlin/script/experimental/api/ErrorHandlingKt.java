package kotlin.script.experimental.api;

import kotlin.Metadata;

/* compiled from: errorHandling.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-scripting-common"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ErrorHandlingKt {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <R1, R2> java.lang.Object m33813a(@org.jetbrains.annotations.NotNull kotlin.script.experimental.api.ResultWithDiagnostics<? extends R1> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R1, ? super kotlin.coroutines.Continuation<? super kotlin.script.experimental.api.ResultWithDiagnostics<? extends R2>>, ? extends java.lang.Object> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.script.experimental.api.ResultWithDiagnostics<? extends R2>> r7) {
        /*
            boolean r0 = r7 instanceof kotlin.script.experimental.api.ErrorHandlingKt$onSuccess$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlin.script.experimental.api.ErrorHandlingKt$onSuccess$1 r0 = (kotlin.script.experimental.api.ErrorHandlingKt$onSuccess$1) r0
            int r1 = r0.f66586f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f66586f = r1
            goto L18
        L13:
            kotlin.script.experimental.api.ErrorHandlingKt$onSuccess$1 r0 = new kotlin.script.experimental.api.ErrorHandlingKt$onSuccess$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f66585e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f66586f
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r5 = r0.f66589i
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r0.f66588h
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            java.lang.Object r6 = r0.f66587g
            kotlin.script.experimental.api.ResultWithDiagnostics r6 = (kotlin.script.experimental.api.ResultWithDiagnostics) r6
            boolean r6 = r7 instanceof kotlin.Result.Failure
            if (r6 != 0) goto L34
            goto L65
        L34:
            kotlin.Result$Failure r7 = (kotlin.Result.Failure) r7
            java.lang.Throwable r5 = r7.f63061b
            throw r5
        L39:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L41:
            boolean r2 = r7 instanceof kotlin.Result.Failure
            if (r2 != 0) goto Lac
            boolean r7 = r5 instanceof kotlin.script.experimental.api.ResultWithDiagnostics.Success
            if (r7 == 0) goto La1
            java.util.List r7 = r5.mo33814a()
            r2 = r5
            kotlin.script.experimental.api.ResultWithDiagnostics$Success r2 = (kotlin.script.experimental.api.ResultWithDiagnostics.Success) r2
            R r2 = r2.f66591a
            r0.f66587g = r5
            r0.f66588h = r6
            r0.f66589i = r7
            r0.f66586f = r3
            r6.invoke(r2, r0)
            kotlin.Unit r5 = kotlin.Unit.f63088a
            if (r5 != r1) goto L62
            return r1
        L62:
            r4 = r7
            r7 = r5
            r5 = r4
        L65:
            kotlin.script.experimental.api.ResultWithDiagnostics r7 = (kotlin.script.experimental.api.ResultWithDiagnostics) r7
            java.lang.String r6 = "receiver$0"
            kotlin.jvm.internal.Intrinsics.m32180i(r5, r6)
            java.lang.String r6 = "result"
            kotlin.jvm.internal.Intrinsics.m32180i(r7, r6)
            boolean r6 = r7 instanceof kotlin.script.experimental.api.ResultWithDiagnostics.Success
            if (r6 == 0) goto L89
            kotlin.script.experimental.api.ResultWithDiagnostics$Success r6 = new kotlin.script.experimental.api.ResultWithDiagnostics$Success
            r0 = r7
            kotlin.script.experimental.api.ResultWithDiagnostics$Success r0 = (kotlin.script.experimental.api.ResultWithDiagnostics.Success) r0
            R r0 = r0.f66591a
            java.util.List r7 = r7.mo33814a()
            java.util.List r5 = kotlin.collections.CollectionsKt.m32002O(r5, r7)
            r6.<init>(r0, r5)
        L87:
            r5 = r6
            goto La5
        L89:
            boolean r6 = r7 instanceof kotlin.script.experimental.api.ResultWithDiagnostics.Failure
            if (r6 == 0) goto L9b
            kotlin.script.experimental.api.ResultWithDiagnostics$Failure r6 = new kotlin.script.experimental.api.ResultWithDiagnostics$Failure
            java.util.List r7 = r7.mo33814a()
            java.util.List r5 = kotlin.collections.CollectionsKt.m32002O(r5, r7)
            r6.<init>(r5)
            goto L87
        L9b:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        La1:
            boolean r6 = r5 instanceof kotlin.script.experimental.api.ResultWithDiagnostics.Failure
            if (r6 == 0) goto La6
        La5:
            return r5
        La6:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        Lac:
            kotlin.Result$Failure r7 = (kotlin.Result.Failure) r7
            java.lang.Throwable r5 = r7.f63061b
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.script.experimental.api.ErrorHandlingKt.m33813a(kotlin.script.experimental.api.ResultWithDiagnostics, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
