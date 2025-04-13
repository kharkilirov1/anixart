package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class SpreadBuilder {

    /* renamed from: a */
    public final ArrayList<Object> f63354a;

    public SpreadBuilder(int i2) {
        this.f63354a = new ArrayList<>(i2);
    }

    /* renamed from: a */
    public void m32210a(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f63354a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f63354a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f63354a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f63354a.add(it.next());
            }
            return;
        }
        if (!(obj instanceof Iterator)) {
            StringBuilder m24u = C0000a.m24u("Don't know how to spread ");
            m24u.append(obj.getClass());
            throw new UnsupportedOperationException(m24u.toString());
        }
        Iterator it2 = (Iterator) obj;
        while (it2.hasNext()) {
            this.f63354a.add(it2.next());
        }
    }

    /* renamed from: b */
    public int m32211b() {
        return this.f63354a.size();
    }
}
