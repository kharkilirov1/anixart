package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.vl1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class rm1 implements vl1 {

    /* renamed from: a */
    private final int[] f54364a = new int[2];

    @Override // com.yandex.mobile.ads.impl.vl1
    /* renamed from: a */
    public final JSONObject mo26692a(View view) {
        if (view == null) {
            return gm1.m24943a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f54364a);
        int[] iArr = this.f54364a;
        return gm1.m24943a(iArr[0], iArr[1], width, height);
    }

    @Override // com.yandex.mobile.ads.impl.vl1
    /* renamed from: a */
    public final void mo26693a(View view, JSONObject jSONObject, vl1.InterfaceC5926a interfaceC5926a, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i2 = 0;
            if (!z) {
                while (i2 < viewGroup.getChildCount()) {
                    ((x71) interfaceC5926a).m29695a(viewGroup.getChildAt(i2), this, jSONObject, z2);
                    i2++;
                }
                return;
            }
            HashMap hashMap = new HashMap();
            while (i2 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i2);
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
                i2++;
            }
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList2);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
                while (it2.hasNext()) {
                    ((x71) interfaceC5926a).m29695a((View) it2.next(), this, jSONObject, z2);
                }
            }
        }
    }
}
