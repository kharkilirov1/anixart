package androidx.window.embedding;

import android.annotation.SuppressLint;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: EmbeddingTranslatingCallback.kt */
@ExperimentalWindowApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m31884d2 = {"Landroidx/window/embedding/EmbeddingTranslatingCallback;", "Ljava/util/function/Consumer;", "", "Landroidx/window/extensions/embedding/SplitInfo;", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
@SuppressLint
/* loaded from: classes.dex */
public final class EmbeddingTranslatingCallback implements Consumer<List<? extends androidx.window.extensions.embedding.SplitInfo>> {

    /* renamed from: b */
    @NotNull
    public final EmbeddingInterfaceCompat.EmbeddingCallbackInterface f6712b;

    /* renamed from: c */
    @NotNull
    public final EmbeddingAdapter f6713c;

    public EmbeddingTranslatingCallback(@NotNull EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallbackInterface, @NotNull EmbeddingAdapter adapter) {
        Intrinsics.m32179h(adapter, "adapter");
        this.f6712b = embeddingCallbackInterface;
        this.f6713c = adapter;
    }

    @Override // java.util.function.Consumer
    public void accept(List<? extends androidx.window.extensions.embedding.SplitInfo> list) {
        List<? extends androidx.window.extensions.embedding.SplitInfo> splitInfoList = list;
        Intrinsics.m32179h(splitInfoList, "splitInfoList");
        this.f6712b.mo4429a(this.f6713c.m4424b(splitInfoList));
    }
}
