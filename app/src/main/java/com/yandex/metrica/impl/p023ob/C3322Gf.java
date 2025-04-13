package com.yandex.metrica.impl.p023ob;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3822ag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.Gf */
/* loaded from: classes2.dex */
public class C3322Gf {

    /* renamed from: c */
    private static final int[] f43005c = {0, 1, 2, 3};

    /* renamed from: a */
    private final SparseArray<HashMap<String, C3822ag.a>> f43006a;

    /* renamed from: b */
    private int f43007b;

    public C3322Gf() {
        this(f43005c);
    }

    @Nullable
    /* renamed from: a */
    public C3822ag.a m18167a(int i2, @NonNull String str) {
        return this.f43006a.get(i2).get(str);
    }

    /* renamed from: b */
    public void m18169b() {
        this.f43007b++;
    }

    @NonNull
    /* renamed from: c */
    public C3822ag m18170c() {
        C3822ag c3822ag = new C3822ag();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.f43006a.size(); i2++) {
            SparseArray<HashMap<String, C3822ag.a>> sparseArray = this.f43006a;
            Iterator<C3822ag.a> it = sparseArray.get(sparseArray.keyAt(i2)).values().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        c3822ag.f44744b = (C3822ag.a[]) arrayList.toArray(new C3822ag.a[arrayList.size()]);
        return c3822ag;
    }

    @VisibleForTesting
    public C3322Gf(int[] iArr) {
        this.f43006a = new SparseArray<>();
        this.f43007b = 0;
        for (int i2 : iArr) {
            this.f43006a.put(i2, new HashMap<>());
        }
    }

    /* renamed from: a */
    public void m18168a(@NonNull C3822ag.a aVar) {
        this.f43006a.get(aVar.f44747c).put(new String(aVar.f44746b), aVar);
    }

    /* renamed from: a */
    public int m18166a() {
        return this.f43007b;
    }
}
