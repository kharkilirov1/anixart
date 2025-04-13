package androidx.window.embedding;

import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ExtensionEmbeddingBackend.kt */
@ExperimentalWindowApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend;", "Landroidx/window/embedding/EmbeddingBackend;", "Companion", "EmbeddingCallbackImpl", "SplitListenerWrapper", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ExtensionEmbeddingBackend implements EmbeddingBackend {

    /* renamed from: d */
    @Nullable
    public static volatile ExtensionEmbeddingBackend f6715d;

    /* renamed from: a */
    @GuardedBy
    @VisibleForTesting
    @Nullable
    public EmbeddingInterfaceCompat f6717a;

    /* renamed from: b */
    @NotNull
    public final CopyOnWriteArrayList<SplitListenerWrapper> f6718b;

    /* renamed from: c */
    @NotNull
    public static final Companion f6714c = new Companion(null);

    /* renamed from: e */
    @NotNull
    public static final ReentrantLock f6716e = new ReentrantLock();

    /* compiled from: ExtensionEmbeddingBackend.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m31884d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$Companion;", "", "", "TAG", "Ljava/lang/String;", "Landroidx/window/embedding/ExtensionEmbeddingBackend;", "globalInstance", "Landroidx/window/embedding/ExtensionEmbeddingBackend;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: ExtensionEmbeddingBackend.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$EmbeddingCallbackImpl;", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public final class EmbeddingCallbackImpl implements EmbeddingInterfaceCompat.EmbeddingCallbackInterface {

        /* renamed from: a */
        @Nullable
        public List<SplitInfo> f6719a;

        public EmbeddingCallbackImpl() {
        }

        @Override // androidx.window.embedding.EmbeddingInterfaceCompat.EmbeddingCallbackInterface
        /* renamed from: a */
        public void mo4429a(@NotNull List<SplitInfo> list) {
            this.f6719a = list;
            Iterator<SplitListenerWrapper> it = ExtensionEmbeddingBackend.this.f6718b.iterator();
            while (it.hasNext()) {
                SplitListenerWrapper next = it.next();
                Objects.requireNonNull(next);
                ArrayList arrayList = new ArrayList();
                Iterator<T> it2 = list.iterator();
                if (it2.hasNext()) {
                    Objects.requireNonNull((SplitInfo) it2.next());
                    Intrinsics.m32179h(null, "activity");
                    throw null;
                }
                if (!Intrinsics.m32174c(arrayList, next.f6721a)) {
                    next.f6721a = arrayList;
                    throw null;
                }
            }
        }
    }

    /* compiled from: ExtensionEmbeddingBackend.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$SplitListenerWrapper;", "", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class SplitListenerWrapper {

        /* renamed from: a */
        @Nullable
        public List<SplitInfo> f6721a;
    }

    @VisibleForTesting
    public ExtensionEmbeddingBackend(@Nullable EmbeddingInterfaceCompat embeddingInterfaceCompat) {
        this.f6717a = embeddingInterfaceCompat;
        EmbeddingCallbackImpl embeddingCallbackImpl = new EmbeddingCallbackImpl();
        this.f6718b = new CopyOnWriteArrayList<>();
        EmbeddingInterfaceCompat embeddingInterfaceCompat2 = this.f6717a;
        if (embeddingInterfaceCompat2 != null) {
            embeddingInterfaceCompat2.mo4425a(embeddingCallbackImpl);
        }
        new CopyOnWriteArraySet();
    }
}
