package androidx.lifecycle;

import java.io.Closeable;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewModel.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Landroidx/lifecycle/CloseableCoroutineScope;", "Ljava/io/Closeable;", "Lkotlinx/coroutines/CoroutineScope;", "lifecycle-viewmodel-ktx_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class CloseableCoroutineScope implements Closeable, CoroutineScope {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        JobKt.m34070b(null, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* renamed from: getCoroutineContext */
    public CoroutineContext getF68244b() {
        return null;
    }
}
