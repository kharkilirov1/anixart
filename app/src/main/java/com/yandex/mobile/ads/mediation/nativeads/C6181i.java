package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.C5506nq;
import com.yandex.mobile.ads.impl.z10;
import com.yandex.mobile.ads.impl.zp0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.i */
/* loaded from: classes3.dex */
final class C6181i {

    /* renamed from: a */
    @NonNull
    private final C5506nq f57550a = new C5506nq();

    /* renamed from: b */
    @NonNull
    private final C6175c f57551b = new C6175c();

    /* renamed from: c */
    @NonNull
    private final Point f57552c;

    public C6181i(@NonNull Context context) {
        this.f57552c = zp0.m30265b(context);
    }

    @NonNull
    /* renamed from: a */
    public final HashSet m30432a(@NonNull ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MediatedNativeAdImage mediatedNativeAdImage = (MediatedNativeAdImage) it.next();
            String url = mediatedNativeAdImage.getUrl();
            int width = mediatedNativeAdImage.getWidth();
            int height = mediatedNativeAdImage.getHeight();
            if (!TextUtils.isEmpty(url)) {
                Objects.requireNonNull(this.f57551b);
                if (!(width > 0 && height > 0)) {
                    z10 z10Var = new z10();
                    z10Var.m30040b(url);
                    z10Var.m30039b(this.f57552c.x);
                    z10Var.m30035a(this.f57552c.y);
                    hashSet.add(z10Var);
                }
            }
        }
        return hashSet;
    }

    @NonNull
    /* renamed from: b */
    public final HashMap m30433b(@NonNull ArrayList arrayList) {
        Bitmap bitmap;
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MediatedNativeAdImage mediatedNativeAdImage = (MediatedNativeAdImage) it.next();
            Drawable drawable = mediatedNativeAdImage.getDrawable();
            String url = mediatedNativeAdImage.getUrl();
            if (drawable != null && !TextUtils.isEmpty(url)) {
                Objects.requireNonNull(this.f57550a);
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                } else {
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    if (intrinsicWidth <= 0) {
                        intrinsicWidth = 128;
                    }
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight > 0 ? intrinsicHeight : 128, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                    bitmap = createBitmap;
                }
                if (bitmap != null) {
                    hashMap.put(url, bitmap);
                }
            }
        }
        return hashMap;
    }
}
