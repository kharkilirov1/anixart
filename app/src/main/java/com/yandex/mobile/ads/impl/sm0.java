package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.impl.InterfaceC6025xf;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes3.dex */
final class sm0 {

    /* renamed from: com.yandex.mobile.ads.impl.sm0$a */
    public static class C5753a {

        /* renamed from: a */
        private final String f54763a;

        /* renamed from: b */
        private final qh1 f54764b;

        public /* synthetic */ C5753a(String str, qh1 qh1Var, int i2) {
            this(str, qh1Var);
        }

        private C5753a(String str, qh1 qh1Var) {
            this.f54763a = str;
            this.f54764b = qh1Var;
        }
    }

    /* renamed from: a */
    public static void m28327a(long j2, zv0<?> zv0Var, byte[] bArr, int i2) {
        if (rh1.f54313a || j2 > 3000) {
            Object[] objArr = new Object[5];
            objArr[0] = zv0Var;
            objArr[1] = Long.valueOf(j2);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
            objArr[3] = Integer.valueOf(i2);
            objArr[4] = Integer.valueOf(zv0Var.m30323i().m23921a());
            n60.m26809b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    /* renamed from: a */
    public static km0 m28326a(zv0<?> zv0Var, long j2, List<C5049ey> list) {
        InterfaceC6025xf.a m30320d = zv0Var.m30320d();
        if (m30320d == null) {
            return new km0(304, (byte[]) null, true, j2, list);
        }
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator<C5049ey> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().m24278a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<C5049ey> list2 = m30320d.f56469h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (C5049ey c5049ey : m30320d.f56469h) {
                    if (!treeSet.contains(c5049ey.m24278a())) {
                        arrayList.add(c5049ey);
                    }
                }
            }
        } else if (!m30320d.f56468g.isEmpty()) {
            for (Map.Entry<String, String> entry : m30320d.f56468g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new C5049ey(entry.getKey(), entry.getValue()));
                }
            }
        }
        return new km0(304, m30320d.f56462a, true, j2, (List<C5049ey>) arrayList);
    }

    /* renamed from: a */
    public static byte[] m28328a(InputStream inputStream, int i2, C5799tf c5799tf) throws IOException {
        byte[] bArr;
        lr0 lr0Var = new lr0(c5799tf, i2);
        try {
            bArr = c5799tf.m28647a(RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    lr0Var.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        boolean z = rh1.f54313a;
                        n60.m26812e("Error occurred when closing InputStream", new Object[0]);
                    }
                    c5799tf.m28646a(bArr);
                    lr0Var.close();
                    throw th;
                }
            }
            byte[] byteArray = lr0Var.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                boolean z2 = rh1.f54313a;
                n60.m26812e("Error occurred when closing InputStream", new Object[0]);
            }
            c5799tf.m28646a(bArr);
            lr0Var.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
        }
    }
}
