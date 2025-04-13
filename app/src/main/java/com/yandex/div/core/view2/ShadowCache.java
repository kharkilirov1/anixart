package com.yandex.div.core.view2;

import android.graphics.NinePatch;
import android.graphics.Paint;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShadowCache.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/view2/ShadowCache;", "", "ShadowCacheKey", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ShadowCache {

    /* renamed from: a */
    @NotNull
    public static final ShadowCache f31717a = new ShadowCache();

    /* renamed from: b */
    @NotNull
    public static final Paint f31718b = new Paint();

    /* renamed from: c */
    @NotNull
    public static final Map<ShadowCacheKey, NinePatch> f31719c = new LinkedHashMap();

    /* compiled from: ShadowCache.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/ShadowCache$ShadowCacheKey;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class ShadowCacheKey {

        /* renamed from: a */
        @NotNull
        public final float[] f31720a;

        /* renamed from: b */
        public final float f31721b;

        public ShadowCacheKey(@NotNull float[] fArr, float f2) {
            this.f31720a = fArr;
            this.f31721b = f2;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj instanceof ShadowCacheKey) {
                ShadowCacheKey shadowCacheKey = (ShadowCacheKey) obj;
                if ((this.f31721b == shadowCacheKey.f31721b) && Arrays.equals(this.f31720a, shadowCacheKey.f31720a)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f31721b) + (Arrays.hashCode(this.f31720a) * 31);
        }
    }
}
