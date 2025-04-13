package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: ExceptionsConstructor.kt */
@Metadata(m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, m31884d2 = {"<anonymous>", "", "e", "invoke", "kotlinx/coroutines/internal/ExceptionsConstructorKt$safeCtor$1"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
/* renamed from: kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$3 */
/* loaded from: classes3.dex */
public final class C6851x18164155 extends Lambda implements Function1<Throwable, Throwable> {

    /* renamed from: b */
    public final /* synthetic */ Constructor f68256b;

    @Override // kotlin.jvm.functions.Function1
    public Throwable invoke(Throwable th) {
        Object obj;
        Object newInstance;
        Throwable th2 = th;
        try {
            newInstance = this.f68256b.newInstance(th2.getMessage());
        } catch (Throwable th3) {
            obj = ResultKt.m31891a(th3);
        }
        if (newInstance == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
        Throwable th4 = (Throwable) newInstance;
        th4.initCause(th2);
        obj = th4;
        boolean z = obj instanceof Result.Failure;
        Object obj2 = obj;
        if (z) {
            obj2 = null;
        }
        return (Throwable) obj2;
    }
}
