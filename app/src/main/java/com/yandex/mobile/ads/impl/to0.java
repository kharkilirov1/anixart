package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class to0 {

    /* renamed from: a */
    @NonNull
    private final vo0 f55162a = new vo0();

    /* renamed from: b */
    @NonNull
    private final uo0 f55163b = new uo0();

    /* renamed from: c */
    @NonNull
    private final so0 f55164c = new so0();

    /* renamed from: d */
    @NonNull
    private final xz0 f55165d = xz0.m29823b();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List] */
    /* renamed from: a */
    public final int m28695a(@NonNull View view, @NonNull Rect rect) {
        cz0 m29824a = this.f55165d.m29824a(view.getContext());
        if (m29824a == null || !m29824a.m23581T()) {
            return 0;
        }
        ArrayList<View> m29247a = this.f55162a.m29247a(view);
        Objects.requireNonNull(this.f55163b);
        ArrayList arrayList = new ArrayList();
        for (View view2 : m29247a) {
            Rect rect2 = new Rect();
            if (view2.getGlobalVisibleRect(rect2)) {
                arrayList.add(rect2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Rect rect3 = (Rect) it.next();
            int i2 = rect3.left;
            int i3 = rect.left;
            rect3.left = Math.min(Math.max(i2, i3), rect.right);
            int i4 = rect3.top;
            int i5 = rect.top;
            rect3.top = Math.min(Math.max(i4, i5), rect.bottom);
            int i6 = rect3.right;
            int i7 = rect.left;
            rect3.right = Math.min(Math.max(i6, i7), rect.right);
            int i8 = rect3.bottom;
            int i9 = rect.top;
            rect3.bottom = Math.min(Math.max(i8, i9), rect.bottom);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Rect rect4 = (Rect) it2.next();
            if (rect4.width() > 0 && rect4.height() > 0) {
                arrayList2.add(rect4);
            }
        }
        int size = arrayList2.size();
        ArrayList arrayList3 = arrayList2;
        if (size > 100) {
            arrayList3 = arrayList2.subList(0, 100);
        }
        Objects.requireNonNull(this.f55164c);
        return so0.m28343a(rect, arrayList3);
    }
}
