package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.Util;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p000a.C0000a;

@RequiresApi
/* loaded from: classes.dex */
public class SizeConfigStrategy implements LruPoolStrategy {

    /* renamed from: d */
    public static final Bitmap.Config[] f8356d;

    /* renamed from: e */
    public static final Bitmap.Config[] f8357e;

    /* renamed from: f */
    public static final Bitmap.Config[] f8358f;

    /* renamed from: g */
    public static final Bitmap.Config[] f8359g;

    /* renamed from: h */
    public static final Bitmap.Config[] f8360h;

    /* renamed from: a */
    public final KeyPool f8361a = new KeyPool();

    /* renamed from: b */
    public final GroupedLinkedMap<Key, Bitmap> f8362b = new GroupedLinkedMap<>();

    /* renamed from: c */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f8363c = new HashMap();

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$1 */
    public static /* synthetic */ class C07971 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8364a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f8364a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8364a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8364a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8364a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @VisibleForTesting
    public static final class Key implements Poolable {

        /* renamed from: a */
        public final KeyPool f8365a;

        /* renamed from: b */
        public int f8366b;

        /* renamed from: c */
        public Bitmap.Config f8367c;

        public Key(KeyPool keyPool) {
            this.f8365a = keyPool;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.Poolable
        /* renamed from: a */
        public void mo5072a() {
            this.f8365a.m5075c(this);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return this.f8366b == key.f8366b && Util.m5345b(this.f8367c, key.f8367c);
        }

        public int hashCode() {
            int i2 = this.f8366b * 31;
            Bitmap.Config config = this.f8367c;
            return i2 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return SizeConfigStrategy.m5097g(this.f8366b, this.f8367c);
        }
    }

    @VisibleForTesting
    public static class KeyPool extends BaseKeyPool<Key> {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.BaseKeyPool
        /* renamed from: a */
        public Key mo5073a() {
            return new Key(this);
        }

        /* renamed from: d */
        public Key m5100d(int i2, Bitmap.Config config) {
            Key m5074b = m5074b();
            m5074b.f8366b = i2;
            m5074b.f8367c = config;
            return m5074b;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f8356d = configArr;
        f8357e = configArr;
        f8358f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f8359g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f8360h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* renamed from: g */
    public static String m5097g(int i2, Bitmap.Config config) {
        return "[" + i2 + "](" + config + ")";
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    /* renamed from: a */
    public String mo5067a(int i2, int i3, Bitmap.Config config) {
        return m5097g(Util.m5346c(i2, i3, config), config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    /* renamed from: b */
    public int mo5068b(Bitmap bitmap) {
        return Util.m5347d(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    /* renamed from: c */
    public void mo5069c(Bitmap bitmap) {
        Key m5100d = this.f8361a.m5100d(Util.m5347d(bitmap), bitmap.getConfig());
        this.f8362b.m5082b(m5100d, bitmap);
        NavigableMap<Integer, Integer> m5099h = m5099h(bitmap.getConfig());
        Integer num = (Integer) m5099h.get(Integer.valueOf(m5100d.f8366b));
        m5099h.put(Integer.valueOf(m5100d.f8366b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    @Nullable
    /* renamed from: d */
    public Bitmap mo5070d(int i2, int i3, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int m5346c = Util.m5346c(i2, i3, config);
        Key m5074b = this.f8361a.m5074b();
        m5074b.f8366b = m5346c;
        m5074b.f8367c = config;
        int i4 = 0;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i5 = C07971.f8364a[config.ordinal()];
            configArr = i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? new Bitmap.Config[]{config} : f8360h : f8359g : f8358f : f8356d;
        } else {
            configArr = f8357e;
        }
        int length = configArr.length;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i4];
            Integer ceilingKey = m5099h(config2).ceilingKey(Integer.valueOf(m5346c));
            if (ceilingKey == null || ceilingKey.intValue() > m5346c * 8) {
                i4++;
            } else if (ceilingKey.intValue() != m5346c || (config2 != null ? !config2.equals(config) : config != null)) {
                this.f8361a.m5075c(m5074b);
                m5074b = this.f8361a.m5100d(ceilingKey.intValue(), config2);
            }
        }
        Bitmap m5081a = this.f8362b.m5081a(m5074b);
        if (m5081a != null) {
            m5098f(Integer.valueOf(m5074b.f8366b), m5081a);
            m5081a.reconfigure(i2, i3, config);
        }
        return m5081a;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    /* renamed from: e */
    public String mo5071e(Bitmap bitmap) {
        return m5097g(Util.m5347d(bitmap), bitmap.getConfig());
    }

    /* renamed from: f */
    public final void m5098f(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> m5099h = m5099h(bitmap.getConfig());
        Integer num2 = (Integer) m5099h.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                m5099h.remove(num);
                return;
            } else {
                m5099h.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo5071e(bitmap) + ", this: " + this);
    }

    /* renamed from: h */
    public final NavigableMap<Integer, Integer> m5099h(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f8363c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f8363c.put(config, treeMap);
        return treeMap;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    @Nullable
    public Bitmap removeLast() {
        Bitmap m5083c = this.f8362b.m5083c();
        if (m5083c != null) {
            m5098f(Integer.valueOf(Util.m5347d(m5083c)), m5083c);
        }
        return m5083c;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("SizeConfigStrategy{groupedMap=");
        m24u.append(this.f8362b);
        m24u.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f8363c.entrySet()) {
            m24u.append(entry.getKey());
            m24u.append('[');
            m24u.append(entry.getValue());
            m24u.append("], ");
        }
        if (!this.f8363c.isEmpty()) {
            m24u.replace(m24u.length() - 2, m24u.length(), "");
        }
        m24u.append(")}");
        return m24u.toString();
    }
}
