package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ti0 {

    /* renamed from: a */
    @NonNull
    private final xh0 f55127a = new xh0();

    @NonNull
    /* renamed from: b */
    public static ArrayList m28666b(@NonNull AdResponse adResponse) {
        qi0 qi0Var = (qi0) adResponse.m21801B();
        List<eh0> m27736d = qi0Var != null ? qi0Var.m27736d() : null;
        if (m27736d == null) {
            m27736d = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<eh0> it = m27736d.iterator();
        while (it.hasNext()) {
            String m24156a = it.next().m24156a();
            if (m24156a != null) {
                arrayList.add(m24156a);
            }
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: c */
    public static ArrayList m28667c(@NonNull AdResponse adResponse) {
        qi0 qi0Var = (qi0) adResponse.m21801B();
        List<eh0> m27736d = qi0Var != null ? qi0Var.m27736d() : null;
        if (m27736d == null) {
            m27736d = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<eh0> it = m27736d.iterator();
        while (it.hasNext()) {
            int m24174g = it.next().m24174g();
            if (m24174g != 0) {
                arrayList.add(cx0.m23548a(m24174g));
            }
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: a */
    public final ArrayList m28668a(@NonNull AdResponse adResponse) {
        qi0 qi0Var = (qi0) adResponse.m21801B();
        List<eh0> m27736d = qi0Var != null ? qi0Var.m27736d() : null;
        if (m27736d == null) {
            m27736d = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<eh0> it = m27736d.iterator();
        while (it.hasNext()) {
            arrayList.addAll(this.f55127a.m29751a(it.next()));
        }
        return arrayList;
    }
}
