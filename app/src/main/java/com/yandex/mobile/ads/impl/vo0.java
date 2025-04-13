package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* loaded from: classes3.dex */
final class vo0 {
    @NonNull
    /* renamed from: b */
    private static ArrayList m29246b(@NonNull View view) {
        ArrayList arrayList = new ArrayList();
        if (!tg1.m28660d(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (tg1.m28661e(viewGroup)) {
                    arrayList.add(viewGroup);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                        arrayList2.addAll(m29246b(viewGroup.getChildAt(i2)));
                    }
                    arrayList.addAll(arrayList2);
                }
            } else {
                arrayList.add(view);
            }
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: a */
    public final ArrayList m29247a(@NonNull View view) {
        View view2;
        ViewGroup viewGroup;
        ArrayList<View> arrayList;
        View view3;
        ArrayList arrayList2 = new ArrayList();
        int i2 = tg1.f55120b;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            arrayList = arrayList2;
            view2 = view;
            viewGroup = (ViewGroup) parent;
            view3 = view2;
        } else {
            view2 = view;
            viewGroup = null;
            arrayList = arrayList2;
            view3 = view;
        }
        while (viewGroup != null) {
            int indexOfChild = viewGroup.indexOfChild(view2);
            while (true) {
                indexOfChild++;
                if (indexOfChild >= viewGroup.getChildCount()) {
                    break;
                }
                arrayList.addAll(m29246b(viewGroup.getChildAt(indexOfChild)));
            }
            ViewParent parent2 = viewGroup.getParent();
            if (parent2 instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) parent2;
                view2 = viewGroup;
                viewGroup = viewGroup2;
            } else {
                view2 = viewGroup;
                viewGroup = null;
                arrayList = arrayList;
                view3 = view3;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        float z = view3.getZ();
        for (View view4 : arrayList) {
            if (z <= view4.getZ()) {
                arrayList3.add(view4);
            }
        }
        return arrayList3;
    }
}
