package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.vg1;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.ct */
/* loaded from: classes3.dex */
public final class C4938ct {

    /* renamed from: a */
    @NonNull
    private final vg1 f49353a = new vg1();

    @NonNull
    /* renamed from: a */
    public final <T extends View & vg1.InterfaceC5918a> C4884bt m23508a(@NonNull T t) {
        int i2;
        Objects.requireNonNull(this.f49353a);
        RectF rectF = null;
        if (vg1.m29222a(t)) {
            i2 = tg1.m28653a(t);
            Rect rect = new Rect();
            if (t.getLocalVisibleRect(rect)) {
                rect.offset(t.getLeft(), t.getTop());
            } else {
                rect = null;
            }
            Context context = t.getContext();
            if (rect != null) {
                int round = Math.round(rect.left / context.getResources().getDisplayMetrics().density);
                int round2 = Math.round(rect.top / context.getResources().getDisplayMetrics().density);
                int round3 = Math.round(rect.right / context.getResources().getDisplayMetrics().density);
                int round4 = Math.round(rect.bottom / context.getResources().getDisplayMetrics().density);
                int i3 = round4 - round2;
                if (round3 - round > 0 && i3 > 0) {
                    rectF = new RectF(round, round2, round3, round4);
                }
            }
        } else {
            i2 = 0;
        }
        return new C4884bt(i2, rectF);
    }
}
