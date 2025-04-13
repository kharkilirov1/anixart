package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* compiled from: SplitController.kt */
@ExperimentalWindowApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Landroidx/window/embedding/SplitController;", "", "Companion", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SplitController {

    /* compiled from: SplitController.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m31884d2 = {"Landroidx/window/embedding/SplitController$Companion;", "", "Landroidx/window/embedding/SplitController;", "globalInstance", "Landroidx/window/embedding/SplitController;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "sDebug", "Z", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Companion {
    }

    static {
        new ReentrantLock();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r3.m4428c() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        r2 = new androidx.window.embedding.EmbeddingCompat();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SplitController() {
        /*
            r7 = this;
            r7.<init>()
            androidx.window.embedding.ExtensionEmbeddingBackend$Companion r0 = androidx.window.embedding.ExtensionEmbeddingBackend.f6714c
            androidx.window.embedding.ExtensionEmbeddingBackend r0 = androidx.window.embedding.ExtensionEmbeddingBackend.f6715d
            if (r0 != 0) goto L59
            java.util.concurrent.locks.ReentrantLock r0 = androidx.window.embedding.ExtensionEmbeddingBackend.f6716e
            r0.lock()
            androidx.window.embedding.ExtensionEmbeddingBackend r1 = androidx.window.embedding.ExtensionEmbeddingBackend.f6715d     // Catch: java.lang.Throwable -> L54
            if (r1 != 0) goto L50
            java.lang.String r1 = "EmbeddingBackend"
            r2 = 0
            androidx.window.embedding.EmbeddingCompat$Companion r3 = androidx.window.embedding.EmbeddingCompat.f6709c     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r4 = r3.m4427b()     // Catch: java.lang.Throwable -> L36
            r5 = 0
            r6 = 1
            if (r4 != 0) goto L20
            goto L27
        L20:
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L36
            if (r4 < r6) goto L27
            r5 = 1
        L27:
            if (r5 == 0) goto L40
            boolean r3 = r3.m4428c()     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L40
            androidx.window.embedding.EmbeddingCompat r3 = new androidx.window.embedding.EmbeddingCompat     // Catch: java.lang.Throwable -> L36
            r3.<init>()     // Catch: java.lang.Throwable -> L36
            r2 = r3
            goto L40
        L36:
            r3 = move-exception
            java.lang.String r4 = "Failed to load embedding extension: "
            java.lang.String r3 = kotlin.jvm.internal.Intrinsics.m32187p(r4, r3)     // Catch: java.lang.Throwable -> L54
            android.util.Log.d(r1, r3)     // Catch: java.lang.Throwable -> L54
        L40:
            if (r2 != 0) goto L47
            java.lang.String r3 = "No supported embedding extension found"
            android.util.Log.d(r1, r3)     // Catch: java.lang.Throwable -> L54
        L47:
            androidx.window.embedding.ExtensionEmbeddingBackend$Companion r1 = androidx.window.embedding.ExtensionEmbeddingBackend.f6714c     // Catch: java.lang.Throwable -> L54
            androidx.window.embedding.ExtensionEmbeddingBackend r1 = new androidx.window.embedding.ExtensionEmbeddingBackend     // Catch: java.lang.Throwable -> L54
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L54
            androidx.window.embedding.ExtensionEmbeddingBackend.f6715d = r1     // Catch: java.lang.Throwable -> L54
        L50:
            r0.unlock()
            goto L59
        L54:
            r1 = move-exception
            r0.unlock()
            throw r1
        L59:
            androidx.window.embedding.ExtensionEmbeddingBackend r0 = androidx.window.embedding.ExtensionEmbeddingBackend.f6715d
            kotlin.jvm.internal.Intrinsics.m32176e(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.SplitController.<init>():void");
    }
}
