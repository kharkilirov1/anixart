package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: ExceptionsConstructor.kt */
@Metadata(m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m31884d2 = {"<anonymous>", "", "e", "invoke"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
/* loaded from: classes3.dex */
public final class ExceptionsConstructorKt$safeCtor$1 extends Lambda implements Function1<Throwable, Throwable> {
    @Override // kotlin.jvm.functions.Function1
    public Throwable invoke(Throwable th) {
        try {
            throw null;
        } catch (Throwable th2) {
            ResultKt.m31891a(th2);
            return null;
        }
    }
}
