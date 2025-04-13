package androidx.window.embedding;

import android.util.Log;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EmbeddingCompat.kt */
@ExperimentalWindowApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Landroidx/window/embedding/EmbeddingCompat;", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "Companion", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class EmbeddingCompat implements EmbeddingInterfaceCompat {

    /* renamed from: c */
    @NotNull
    public static final Companion f6709c = new Companion(null);

    /* renamed from: a */
    @NotNull
    public final ActivityEmbeddingComponent f6710a;

    /* renamed from: b */
    @NotNull
    public final EmbeddingAdapter f6711b;

    /* compiled from: EmbeddingCompat.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31884d2 = {"Landroidx/window/embedding/EmbeddingCompat$Companion;", "", "", "DEBUG", "Z", "", "TAG", "Ljava/lang/String;", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        /* renamed from: a */
        public final ActivityEmbeddingComponent m4426a() {
            if (!m4428c()) {
                return new EmptyEmbeddingComponent();
            }
            ActivityEmbeddingComponent activityEmbeddingComponent = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent();
            return activityEmbeddingComponent == null ? new EmptyEmbeddingComponent() : activityEmbeddingComponent;
        }

        @Nullable
        /* renamed from: b */
        public final Integer m4427b() {
            try {
                return Integer.valueOf(WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel());
            } catch (NoClassDefFoundError unused) {
                Log.d("EmbeddingCompat", "Embedding extension version not found");
                return null;
            } catch (UnsupportedOperationException unused2) {
                Log.d("EmbeddingCompat", "Stub Extension");
                return null;
            }
        }

        /* renamed from: c */
        public final boolean m4428c() {
            try {
                return WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent() != null;
            } catch (NoClassDefFoundError unused) {
                Log.d("EmbeddingCompat", "Embedding extension version not found");
                return false;
            } catch (UnsupportedOperationException unused2) {
                Log.d("EmbeddingCompat", "Stub Extension");
                return false;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public EmbeddingCompat() {
        ActivityEmbeddingComponent m4426a = f6709c.m4426a();
        EmbeddingAdapter embeddingAdapter = new EmbeddingAdapter();
        this.f6710a = m4426a;
        this.f6711b = embeddingAdapter;
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    /* renamed from: a */
    public void mo4425a(@NotNull EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallbackInterface) {
        this.f6710a.setSplitInfoCallback(new EmbeddingTranslatingCallback(embeddingCallbackInterface, this.f6711b));
    }
}
