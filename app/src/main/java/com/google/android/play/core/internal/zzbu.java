package com.google.android.play.core.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzbu<T> extends zzbv<T[]> {
    public zzbu(Object obj, Field field, Class<T> cls) {
        super(obj, field, Array.newInstance((Class<?>) cls, 0).getClass());
    }

    /* renamed from: c */
    public final void m10863c(Collection<T> collection) {
        Object[] objArr = (Object[]) m10865a();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance(this.f20135b.getType().getComponentType(), collection.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            objArr2[length] = it.next();
            length++;
        }
        m10866b(objArr2);
    }

    /* renamed from: d */
    public final void m10864d(Collection<T> collection) {
        Object[] objArr = (Object[]) m10865a();
        int i2 = 0;
        Object[] objArr2 = (Object[]) Array.newInstance(this.f20135b.getType().getComponentType(), collection.size() + (objArr == null ? 0 : objArr.length));
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            objArr2[i2] = it.next();
            i2++;
        }
        m10866b(objArr2);
    }
}
