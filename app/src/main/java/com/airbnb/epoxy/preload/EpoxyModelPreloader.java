package com.airbnb.epoxy.preload;

import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.preload.PreloadRequestHolder;
import com.airbnb.epoxy.preload.ViewMetadata;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EpoxyModelPreloader.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0001*\n\b\u0001\u0010\u0004*\u0004\u0018\u00010\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u00020\u0007:\u0001\b¨\u0006\t"}, m31884d2 = {"Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;", "Lcom/airbnb/epoxy/EpoxyModel;", "T", "Lcom/airbnb/epoxy/preload/ViewMetadata;", "U", "Lcom/airbnb/epoxy/preload/PreloadRequestHolder;", "P", "", "Companion", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
/* loaded from: classes.dex */
public abstract class EpoxyModelPreloader<T extends EpoxyModel<?>, U extends ViewMetadata, P extends PreloadRequestHolder> {

    /* compiled from: EpoxyModelPreloader.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/airbnb/epoxy/preload/EpoxyModelPreloader$Companion;", "", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
    public static final class Companion {
    }

    /* renamed from: a */
    public abstract void mo4630a(@NotNull T t, @NotNull P p, @NotNull ViewData<? extends U> viewData);

    @Nullable
    /* renamed from: b */
    public Object mo4631b(@NotNull T t) {
        return null;
    }
}
