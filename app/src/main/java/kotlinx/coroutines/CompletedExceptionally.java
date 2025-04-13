package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* compiled from: CompletionState.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/CompletedExceptionally;", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class CompletedExceptionally {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f66955b = AtomicIntegerFieldUpdater.newUpdater(CompletedExceptionally.class, "_handled");

    @NotNull
    private volatile /* synthetic */ int _handled;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Throwable f66956a;

    public CompletedExceptionally(@NotNull Throwable th, boolean z) {
        this.f66956a = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* renamed from: a */
    public final boolean m34004a() {
        return this._handled;
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '[' + this.f66956a + ']';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public CompletedExceptionally(Throwable th, boolean z, int i2) {
        ?? r2 = (i2 & 2) != 0 ? 0 : z;
        this.f66956a = th;
        this._handled = r2;
    }
}
