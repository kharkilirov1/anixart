package com.airbnb.epoxy.preload;

import com.airbnb.epoxy.BaseEpoxyAdapter;
import com.airbnb.epoxy.EpoxyModel;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: PreloadableViewDataProvider.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/airbnb/epoxy/preload/PreloadableViewDataProvider;", "", "CacheKey", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class PreloadableViewDataProvider {

    /* renamed from: a */
    public final Map<CacheKey, List<ViewData<?>>> f7063a;

    /* renamed from: b */
    @NotNull
    public final BaseEpoxyAdapter f7064b;

    /* compiled from: PreloadableViewDataProvider.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/airbnb/epoxy/preload/PreloadableViewDataProvider$CacheKey;", "", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
    public static final /* data */ class CacheKey {

        /* renamed from: a */
        @NotNull
        public final Class<? extends EpoxyModel<?>> f7065a;

        /* renamed from: b */
        public final int f7066b;

        /* renamed from: c */
        public final int f7067c;

        /* renamed from: d */
        @Nullable
        public final Object f7068d;

        public CacheKey(@NotNull Class<? extends EpoxyModel<?>> cls, int i2, int i3, @Nullable Object obj) {
            this.f7065a = cls;
            this.f7066b = i2;
            this.f7067c = i3;
            this.f7068d = obj;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CacheKey)) {
                return false;
            }
            CacheKey cacheKey = (CacheKey) obj;
            return Intrinsics.m32174c(this.f7065a, cacheKey.f7065a) && this.f7066b == cacheKey.f7066b && this.f7067c == cacheKey.f7067c && Intrinsics.m32174c(this.f7068d, cacheKey.f7068d);
        }

        public int hashCode() {
            Class<? extends EpoxyModel<?>> cls = this.f7065a;
            int hashCode = (((((cls != null ? cls.hashCode() : 0) * 31) + this.f7066b) * 31) + this.f7067c) * 31;
            Object obj = this.f7068d;
            return hashCode + (obj != null ? obj.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("CacheKey(epoxyModelClass=");
            m24u.append(this.f7065a);
            m24u.append(", spanSize=");
            m24u.append(this.f7066b);
            m24u.append(", viewType=");
            m24u.append(this.f7067c);
            m24u.append(", signature=");
            m24u.append(this.f7068d);
            m24u.append(")");
            return m24u.toString();
        }
    }

    /* renamed from: a */
    public final <T extends EpoxyModel<?>> CacheKey m4632a(EpoxyModelPreloader<T, ?, ?> epoxyModelPreloader, T t, int i2) {
        BaseEpoxyAdapter baseEpoxyAdapter = this.f7064b;
        int i3 = baseEpoxyAdapter.f6863b;
        return new CacheKey(t.getClass(), i3 > 1 ? t.m4528r2(i3, i2, baseEpoxyAdapter.getItemCount()) : 1, t.mo4502f2(), epoxyModelPreloader.mo4631b(t));
    }
}
