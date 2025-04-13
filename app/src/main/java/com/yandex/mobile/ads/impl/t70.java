package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.InterfaceC6256u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class t70 {
    @NonNull
    /* renamed from: a */
    public static ArrayList m28468a(@NonNull Context context, @NonNull AdResponse adResponse, @NonNull InterfaceC6256u interfaceC6256u, @NonNull InterfaceC5541ok interfaceC5541ok, @NonNull oj0 oj0Var, @NonNull C5612q0 c5612q0, @NonNull List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC5366kx) it.next()).mo26066a(context, adResponse, interfaceC6256u, interfaceC5541ok, oj0Var));
        }
        return arrayList;
    }
}
