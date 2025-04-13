package com.yandex.mobile.ads.instream.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.impl.xg0;
import com.yandex.mobile.ads.impl.xh1;

/* loaded from: classes3.dex */
public class InstreamMuteView extends ImageView implements xg0 {

    /* renamed from: a */
    @NonNull
    private final xh1 f57461a;

    /* renamed from: b */
    private boolean f57462b;

    public InstreamMuteView(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    @SuppressLint
    /* renamed from: a */
    private static xh1 m30405a(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4632R.styleable.YandexAdsInternalInstreamMuteView);
        int resourceId = obtainStyledAttributes.getResourceId(C4632R.styleable.YandexAdsInternalInstreamMuteView_yandex_sound_on, C4632R.drawable.yandex_ads_internal_ic_sound_on_default);
        int resourceId2 = obtainStyledAttributes.getResourceId(C4632R.styleable.YandexAdsInternalInstreamMuteView_yandex_sound_off, C4632R.drawable.yandex_ads_internal_ic_sound_off_default);
        obtainStyledAttributes.recycle();
        return new xh1(resourceId2, resourceId);
    }

    @Override // com.yandex.mobile.ads.impl.xg0
    public void setMuted(boolean z) {
        this.f57462b = z;
        this.f57461a.m29752a(this, z);
    }

    public InstreamMuteView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InstreamMuteView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f57461a = m30405a(context, attributeSet);
        m30406a();
    }

    @RequiresApi
    public InstreamMuteView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f57461a = m30405a(context, attributeSet);
        m30406a();
    }

    /* renamed from: a */
    private void m30406a() {
        setMuted(this.f57462b);
    }
}
