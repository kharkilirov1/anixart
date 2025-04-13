package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: EmbeddingInterfaceCompat.kt */
@ExperimentalWindowApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Landroidx/window/embedding/EmbeddingInterfaceCompat;", "", "EmbeddingCallbackInterface", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public interface EmbeddingInterfaceCompat {

    /* compiled from: EmbeddingInterfaceCompat.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public interface EmbeddingCallbackInterface {
        /* renamed from: a */
        void mo4429a(@NotNull List<SplitInfo> list);
    }

    /* renamed from: a */
    void mo4425a(@NotNull EmbeddingCallbackInterface embeddingCallbackInterface);
}
