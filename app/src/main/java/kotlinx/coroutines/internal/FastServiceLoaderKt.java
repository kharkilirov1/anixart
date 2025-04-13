package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;

/* compiled from: FastServiceLoader.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class FastServiceLoaderKt {

    /* renamed from: a */
    public static final /* synthetic */ int f68260a = 0;

    static {
        Object m31891a;
        try {
            m31891a = Class.forName("android.os.Build");
        } catch (Throwable th) {
            m31891a = ResultKt.m31891a(th);
        }
        boolean z = m31891a instanceof Result.Failure;
    }
}
