package kotlin.reflect.jvm.internal.pcollections;

import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.reflect.jvm.internal.pcollections.ConsPStack;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class HashPMap<K, V> {

    /* renamed from: c */
    public static final HashPMap<Object, Object> f66525c;

    /* renamed from: a */
    public final IntTreePMap<ConsPStack<MapEntry<K, V>>> f66526a;

    /* renamed from: b */
    public final int f66527b;

    static {
        IntTreePMap<Object> intTreePMap = IntTreePMap.f66534b;
        f66525c = new HashPMap<>(IntTreePMap.f66534b, 0);
    }

    public HashPMap(IntTreePMap<ConsPStack<MapEntry<K, V>>> intTreePMap, int i2) {
        this.f66526a = intTreePMap;
        this.f66527b = i2;
    }

    /* renamed from: a */
    public V m33791a(Object obj) {
        ConsPStack<Object> m33793a = this.f66526a.f66535a.m33793a(obj.hashCode());
        if (m33793a == null) {
            m33793a = ConsPStack.f66520e;
        }
        while (m33793a != null && m33793a.f66523d > 0) {
            MapEntry mapEntry = (MapEntry) m33793a.f66521b;
            if (mapEntry.f66536b.equals(obj)) {
                return mapEntry.f66537c;
            }
            m33793a = m33793a.f66522c;
        }
        return null;
    }

    @NotNull
    /* renamed from: b */
    public HashPMap<K, V> m33792b(K k2, V v) {
        ConsPStack<Object> m33793a = this.f66526a.f66535a.m33793a(k2.hashCode());
        if (m33793a == null) {
            m33793a = ConsPStack.f66520e;
        }
        int i2 = m33793a.f66523d;
        int i3 = 0;
        ConsPStack<Object> consPStack = m33793a;
        while (consPStack != null && consPStack.f66523d > 0) {
            if (((MapEntry) consPStack.f66521b).f66536b.equals(k2)) {
                break;
            }
            consPStack = consPStack.f66522c;
            i3++;
        }
        i3 = -1;
        if (i3 != -1) {
            if (i3 < 0 || i3 > m33793a.f66523d) {
                throw new IndexOutOfBoundsException();
            }
            try {
                m33793a = m33793a.m33789a(new ConsPStack.Itr(m33793a.m33790b(i3)).next());
            } catch (NoSuchElementException unused) {
                throw new IndexOutOfBoundsException(C0000a.m7d("Index: ", i3));
            }
        }
        MapEntry mapEntry = new MapEntry(k2, v);
        Objects.requireNonNull(m33793a);
        ConsPStack<MapEntry<K, V>> consPStack2 = new ConsPStack<>(mapEntry, m33793a);
        IntTreePMap<ConsPStack<MapEntry<K, V>>> intTreePMap = this.f66526a;
        IntTree<ConsPStack<MapEntry<K, V>>> m33794b = intTreePMap.f66535a.m33794b(k2.hashCode(), consPStack2);
        if (m33794b != intTreePMap.f66535a) {
            intTreePMap = new IntTreePMap<>(m33794b);
        }
        return new HashPMap<>(intTreePMap, (this.f66527b - i2) + consPStack2.f66523d);
    }
}
