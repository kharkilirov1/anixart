package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.yandex.mobile.ads.impl.tf */
/* loaded from: classes3.dex */
public final class C5799tf {

    /* renamed from: e */
    public static final Comparator<byte[]> f55103e = new a();

    /* renamed from: a */
    private final ArrayList f55104a = new ArrayList();

    /* renamed from: b */
    private final ArrayList f55105b = new ArrayList(64);

    /* renamed from: c */
    private int f55106c = 0;

    /* renamed from: d */
    private final int f55107d = RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: com.yandex.mobile.ads.impl.tf$a */
    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        public final int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    /* renamed from: a */
    public final synchronized byte[] m28647a(int i2) {
        for (int i3 = 0; i3 < this.f55105b.size(); i3++) {
            byte[] bArr = (byte[]) this.f55105b.get(i3);
            if (bArr.length >= i2) {
                this.f55106c -= bArr.length;
                this.f55105b.remove(i3);
                this.f55104a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i2];
    }

    /* renamed from: a */
    public final synchronized void m28646a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f55107d) {
                this.f55104a.add(bArr);
                int binarySearch = Collections.binarySearch(this.f55105b, bArr, f55103e);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f55105b.add(binarySearch, bArr);
                this.f55106c += bArr.length;
                synchronized (this) {
                    while (this.f55106c > this.f55107d) {
                        byte[] bArr2 = (byte[]) this.f55104a.remove(0);
                        this.f55105b.remove(bArr2);
                        this.f55106c -= bArr2.length;
                    }
                }
            }
        }
    }
}
