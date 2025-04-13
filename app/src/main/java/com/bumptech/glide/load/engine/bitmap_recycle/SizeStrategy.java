package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.Util;
import java.util.NavigableMap;
import p000a.C0000a;

@RequiresApi
/* loaded from: classes.dex */
final class SizeStrategy implements LruPoolStrategy {

    /* renamed from: a */
    public final KeyPool f8368a = new KeyPool();

    /* renamed from: b */
    public final GroupedLinkedMap<Key, Bitmap> f8369b = new GroupedLinkedMap<>();

    /* renamed from: c */
    public final NavigableMap<Integer, Integer> f8370c = new PrettyPrintTreeMap();

    @VisibleForTesting
    public static final class Key implements Poolable {

        /* renamed from: a */
        public final KeyPool f8371a;

        /* renamed from: b */
        public int f8372b;

        public Key(KeyPool keyPool) {
            this.f8371a = keyPool;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.Poolable
        /* renamed from: a */
        public void mo5072a() {
            this.f8371a.m5075c(this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof Key) && this.f8372b == ((Key) obj).f8372b;
        }

        public int hashCode() {
            return this.f8372b;
        }

        public String toString() {
            return SizeStrategy.m5101g(this.f8372b);
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
        public Key m5103d(int i2) {
            Key m5074b = m5074b();
            m5074b.f8372b = i2;
            return m5074b;
        }
    }

    /* renamed from: g */
    public static String m5101g(int i2) {
        return C0000a.m8e("[", i2, "]");
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    /* renamed from: a */
    public String mo5067a(int i2, int i3, Bitmap.Config config) {
        return m5101g(Util.m5346c(i2, i3, config));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    /* renamed from: b */
    public int mo5068b(Bitmap bitmap) {
        return Util.m5347d(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    /* renamed from: c */
    public void mo5069c(Bitmap bitmap) {
        Key m5103d = this.f8368a.m5103d(Util.m5347d(bitmap));
        this.f8369b.m5082b(m5103d, bitmap);
        Integer num = (Integer) this.f8370c.get(Integer.valueOf(m5103d.f8372b));
        this.f8370c.put(Integer.valueOf(m5103d.f8372b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    @Nullable
    /* renamed from: d */
    public Bitmap mo5070d(int i2, int i3, Bitmap.Config config) {
        int m5346c = Util.m5346c(i2, i3, config);
        Key m5103d = this.f8368a.m5103d(m5346c);
        Integer ceilingKey = this.f8370c.ceilingKey(Integer.valueOf(m5346c));
        if (ceilingKey != null && ceilingKey.intValue() != m5346c && ceilingKey.intValue() <= m5346c * 8) {
            this.f8368a.m5075c(m5103d);
            m5103d = this.f8368a.m5103d(ceilingKey.intValue());
        }
        Bitmap m5081a = this.f8369b.m5081a(m5103d);
        if (m5081a != null) {
            m5081a.reconfigure(i2, i3, config);
            m5102f(ceilingKey);
        }
        return m5081a;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    /* renamed from: e */
    public String mo5071e(Bitmap bitmap) {
        return m5101g(Util.m5347d(bitmap));
    }

    /* renamed from: f */
    public final void m5102f(Integer num) {
        Integer num2 = (Integer) this.f8370c.get(num);
        if (num2.intValue() == 1) {
            this.f8370c.remove(num);
        } else {
            this.f8370c.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    @Nullable
    public Bitmap removeLast() {
        Bitmap m5083c = this.f8369b.m5083c();
        if (m5083c != null) {
            m5102f(Integer.valueOf(Util.m5347d(m5083c)));
        }
        return m5083c;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("SizeStrategy:\n  ");
        m24u.append(this.f8369b);
        m24u.append("\n  SortedSizes");
        m24u.append(this.f8370c);
        return m24u.toString();
    }
}
