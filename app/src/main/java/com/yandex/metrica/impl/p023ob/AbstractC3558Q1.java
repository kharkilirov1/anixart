package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.util.SparseArray;
import com.yandex.metrica.YandexMetrica;

/* renamed from: com.yandex.metrica.impl.ob.Q1 */
/* loaded from: classes2.dex */
public abstract class AbstractC3558Q1 {

    /* renamed from: com.yandex.metrica.impl.ob.Q1$a */
    public interface a {
        /* renamed from: a */
        void mo18124a(Context context);
    }

    /* renamed from: a */
    public abstract int mo18121a(C4340ue c4340ue);

    /* renamed from: a */
    public abstract SparseArray<a> mo18122a();

    /* renamed from: a */
    public synchronized void m18775a(Context context) {
        C4340ue c4340ue = new C4340ue(context);
        int mo18121a = mo18121a(c4340ue);
        int libraryApiLevel = YandexMetrica.getLibraryApiLevel();
        if (mo18121a != libraryApiLevel) {
            if (mo18121a > 0 && mo18121a < libraryApiLevel) {
                SparseArray<a> mo18122a = mo18122a();
                while (true) {
                    mo18121a++;
                    if (mo18121a > libraryApiLevel) {
                        break;
                    }
                    a aVar = mo18122a.get(mo18121a);
                    if (aVar != null) {
                        aVar.mo18124a(context);
                    }
                }
            }
            mo18123a(c4340ue, libraryApiLevel);
            c4340ue.m20659b();
        }
    }

    /* renamed from: a */
    public abstract void mo18123a(C4340ue c4340ue, int i2);
}
