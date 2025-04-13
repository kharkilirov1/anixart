package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HandlerDispatcher.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m31884d2 = {"Landroid/view/Choreographer;", "choreographer", "Landroid/view/Choreographer;", "kotlinx-coroutines-android"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class HandlerDispatcherKt {

    /* renamed from: a */
    public static final /* synthetic */ int f67078a = 0;

    @Nullable
    private static volatile Choreographer choreographer;

    static {
        Object m31891a;
        try {
            m31891a = new HandlerContext(m34124b(Looper.getMainLooper(), true), null, false);
        } catch (Throwable th) {
            m31891a = ResultKt.m31891a(th);
        }
    }

    /* renamed from: a */
    public static final void m34123a(CancellableContinuation cancellableContinuation) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            Intrinsics.m32176e(choreographer2);
            choreographer = choreographer2;
        }
        final CancellableContinuation cancellableContinuation2 = null;
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: kotlinx.coroutines.android.b
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                CancellableContinuation cancellableContinuation3 = CancellableContinuation.this;
                int i2 = HandlerDispatcherKt.f67078a;
                CoroutineDispatcher coroutineDispatcher = Dispatchers.f66988a;
                cancellableContinuation3.mo33969x(MainDispatcherLoader.f68292a, Long.valueOf(j2));
            }
        });
    }

    @VisibleForTesting
    @NotNull
    /* renamed from: b */
    public static final Handler m34124b(@NotNull Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) invoke;
    }
}
