package kotlinx.coroutines.internal;

import androidx.room.util.C0576a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: MainDispatchers.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/internal/MissingMainCoroutineDispatcher;", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class MissingMainCoroutineDispatcher extends MainCoroutineDispatcher implements Delay {

    /* renamed from: c */
    @Nullable
    public final Throwable f68293c = null;

    /* renamed from: d */
    @Nullable
    public final String f68294d = null;

    public MissingMainCoroutineDispatcher(Throwable th, String str, int i2) {
    }

    /* renamed from: Z */
    public final Void m34316Z() {
        String str;
        if (this.f68293c == null) {
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        }
        String str2 = this.f68294d;
        if (str2 == null || (str = Intrinsics.m32187p(". ", str2)) == null) {
            str = "";
        }
        throw new IllegalStateException(Intrinsics.m32187p("Module with the Main dispatcher had failed to initialize", str), this.f68293c);
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: g */
    public void mo34030g(long j2, CancellableContinuation cancellableContinuation) {
        m34316Z();
        throw null;
    }

    @Override // kotlinx.coroutines.Delay
    @NotNull
    /* renamed from: l */
    public DisposableHandle mo34028l(long j2, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        m34316Z();
        throw null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: m */
    public void mo3221m(CoroutineContext coroutineContext, Runnable runnable) {
        m34316Z();
        throw null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: q */
    public boolean mo3222q(@NotNull CoroutineContext coroutineContext) {
        m34316Z();
        throw null;
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("Dispatchers.Main[missing");
        Throwable th = this.f68293c;
        return C0576a.m4118q(m24u, th != null ? Intrinsics.m32187p(", cause=", th) : "", ']');
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    @NotNull
    /* renamed from: v */
    public MainCoroutineDispatcher mo34115v() {
        return this;
    }
}
