package com.bumptech.glide.load.engine.bitmap_recycle;

import java.util.Map;
import java.util.TreeMap;
import p000a.C0000a;

/* loaded from: classes.dex */
class PrettyPrintTreeMap<K, V> extends TreeMap<K, V> {
    @Override // java.util.AbstractMap
    public String toString() {
        StringBuilder m24u = C0000a.m24u("( ");
        for (Map.Entry<K, V> entry : entrySet()) {
            m24u.append('{');
            m24u.append(entry.getKey());
            m24u.append(':');
            m24u.append(entry.getValue());
            m24u.append("}, ");
        }
        if (!isEmpty()) {
            m24u.replace(m24u.length() - 2, m24u.length(), "");
        }
        m24u.append(" )");
        return m24u.toString();
    }
}
