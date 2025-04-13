package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;

/* compiled from: StackTraceRecovery.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\f\b\u0000\u0010\u0001\"\u00020\u00002\u00020\u0000*\f\b\u0000\u0010\u0003\"\u00020\u00022\u00020\u0002¨\u0006\u0004"}, m31884d2 = {"Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "CoroutineStackFrame", "Ljava/lang/StackTraceElement;", "StackTraceElement", "kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class StackTraceRecoveryKt {

    /* renamed from: a */
    public static final String f68302a;

    /* renamed from: b */
    public static final String f68303b;

    static {
        Object m31891a;
        Object m31891a2;
        try {
            m31891a = Class.forName("kotlin.coroutines.jvm.internal.BaseContinuationImpl").getCanonicalName();
        } catch (Throwable th) {
            m31891a = ResultKt.m31891a(th);
        }
        if (Result.m31890a(m31891a) != null) {
            m31891a = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f68302a = (String) m31891a;
        try {
            m31891a2 = StackTraceRecoveryKt.class.getCanonicalName();
        } catch (Throwable th2) {
            m31891a2 = ResultKt.m31891a(th2);
        }
        if (Result.m31890a(m31891a2) != null) {
            m31891a2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f68303b = (String) m31891a2;
    }
}
