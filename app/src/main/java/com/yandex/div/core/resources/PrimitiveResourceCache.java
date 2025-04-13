package com.yandex.div.core.resources;

import android.content.res.Resources;
import android.util.TypedValue;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PrimitiveResourceCache.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/resources/PrimitiveResourceCache;", "Lcom/yandex/div/core/resources/ResourcesWrapper;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class PrimitiveResourceCache extends ResourcesWrapper {

    /* renamed from: b */
    @NotNull
    public final ConcurrentHashMap<Integer, Boolean> f31315b;

    /* renamed from: c */
    @NotNull
    public final ConcurrentHashMap<Integer, Float> f31316c;

    /* renamed from: d */
    @NotNull
    public final ConcurrentHashMap<Integer, Integer> f31317d;

    /* renamed from: e */
    @NotNull
    public final ConcurrentHashMap<Integer, Integer> f31318e;

    /* renamed from: f */
    @NotNull
    public final ConcurrentHashMap<Integer, Integer> f31319f;

    /* renamed from: g */
    @Nullable
    public TypedValue f31320g;

    /* renamed from: h */
    @NotNull
    public final Object f31321h;

    public PrimitiveResourceCache(@NotNull Resources resources) {
        super(resources);
        this.f31315b = new ConcurrentHashMap<>();
        this.f31316c = new ConcurrentHashMap<>();
        this.f31317d = new ConcurrentHashMap<>();
        this.f31318e = new ConcurrentHashMap<>();
        this.f31319f = new ConcurrentHashMap<>();
        this.f31320g = new TypedValue();
        this.f31321h = new Object();
    }

    /* renamed from: a */
    public final TypedValue m16703a() {
        TypedValue typedValue;
        synchronized (this.f31321h) {
            typedValue = this.f31320g;
            if (typedValue != null) {
                this.f31320g = null;
            } else {
                typedValue = null;
            }
        }
        return typedValue == null ? new TypedValue() : typedValue;
    }

    /* renamed from: b */
    public final void m16704b(TypedValue typedValue) {
        synchronized (this.f31321h) {
            if (this.f31320g == null) {
                this.f31320g = typedValue;
            }
        }
    }

    @Override // com.yandex.div.core.resources.ResourcesWrapper, android.content.res.Resources
    public boolean getBoolean(int i2) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = this.f31315b;
        Boolean bool = concurrentHashMap.get(Integer.valueOf(i2));
        if (bool == null) {
            TypedValue m16703a = m16703a();
            try {
                boolean z = true;
                this.f31322a.getValue(i2, m16703a, true);
                int i3 = m16703a.type;
                if (!(i3 >= 16 && i3 <= 31)) {
                    throw new Resources.NotFoundException("Resource ID #0x" + ((Object) Integer.toHexString(i2)) + " type #0x" + ((Object) Integer.toHexString(m16703a.type)) + " is not valid");
                }
                if (m16703a.data == 0) {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                if (m16703a.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i2), valueOf);
                }
                m16704b(m16703a);
                bool = valueOf;
            } catch (Throwable th) {
                m16704b(m16703a);
                throw th;
            }
        }
        return bool.booleanValue();
    }

    @Override // com.yandex.div.core.resources.ResourcesWrapper, android.content.res.Resources
    public float getDimension(int i2) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Float> concurrentHashMap = this.f31316c;
        Float f2 = concurrentHashMap.get(Integer.valueOf(i2));
        if (f2 == null) {
            TypedValue m16703a = m16703a();
            try {
                boolean z = true;
                this.f31322a.getValue(i2, m16703a, true);
                if (m16703a.type != 5) {
                    z = false;
                }
                if (!z) {
                    throw new Resources.NotFoundException("Resource ID #0x" + ((Object) Integer.toHexString(i2)) + " type #0x" + ((Object) Integer.toHexString(m16703a.type)) + " is not valid");
                }
                Float valueOf = Float.valueOf(TypedValue.complexToDimension(m16703a.data, getDisplayMetrics()));
                if (m16703a.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i2), valueOf);
                }
                m16704b(m16703a);
                f2 = valueOf;
            } catch (Throwable th) {
                m16704b(m16703a);
                throw th;
            }
        }
        return f2.floatValue();
    }

    @Override // com.yandex.div.core.resources.ResourcesWrapper, android.content.res.Resources
    public int getDimensionPixelOffset(int i2) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.f31317d;
        Integer num = concurrentHashMap.get(Integer.valueOf(i2));
        if (num == null) {
            TypedValue m16703a = m16703a();
            try {
                boolean z = true;
                this.f31322a.getValue(i2, m16703a, true);
                if (m16703a.type != 5) {
                    z = false;
                }
                if (!z) {
                    throw new Resources.NotFoundException("Resource ID #0x" + ((Object) Integer.toHexString(i2)) + " type #0x" + ((Object) Integer.toHexString(m16703a.type)) + " is not valid");
                }
                Integer valueOf = Integer.valueOf(TypedValue.complexToDimensionPixelOffset(m16703a.data, getDisplayMetrics()));
                if (m16703a.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i2), valueOf);
                }
                m16704b(m16703a);
                num = valueOf;
            } catch (Throwable th) {
                m16704b(m16703a);
                throw th;
            }
        }
        return num.intValue();
    }

    @Override // com.yandex.div.core.resources.ResourcesWrapper, android.content.res.Resources
    public int getDimensionPixelSize(int i2) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.f31318e;
        Integer num = concurrentHashMap.get(Integer.valueOf(i2));
        if (num == null) {
            TypedValue m16703a = m16703a();
            try {
                boolean z = true;
                this.f31322a.getValue(i2, m16703a, true);
                if (m16703a.type != 5) {
                    z = false;
                }
                if (!z) {
                    throw new Resources.NotFoundException("Resource ID #0x" + ((Object) Integer.toHexString(i2)) + " type #0x" + ((Object) Integer.toHexString(m16703a.type)) + " is not valid");
                }
                Integer valueOf = Integer.valueOf(TypedValue.complexToDimensionPixelSize(m16703a.data, getDisplayMetrics()));
                if (m16703a.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i2), valueOf);
                }
                m16704b(m16703a);
                num = valueOf;
            } catch (Throwable th) {
                m16704b(m16703a);
                throw th;
            }
        }
        return num.intValue();
    }

    @Override // com.yandex.div.core.resources.ResourcesWrapper, android.content.res.Resources
    public int getInteger(int i2) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.f31319f;
        Integer num = concurrentHashMap.get(Integer.valueOf(i2));
        if (num == null) {
            TypedValue m16703a = m16703a();
            try {
                boolean z = true;
                this.f31322a.getValue(i2, m16703a, true);
                int i3 = m16703a.type;
                if (i3 < 16 || i3 > 31) {
                    z = false;
                }
                if (!z) {
                    throw new Resources.NotFoundException("Resource ID #0x" + ((Object) Integer.toHexString(i2)) + " type #0x" + ((Object) Integer.toHexString(m16703a.type)) + " is not valid");
                }
                Integer valueOf = Integer.valueOf(m16703a.data);
                if (m16703a.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i2), valueOf);
                }
                m16704b(m16703a);
                num = valueOf;
            } catch (Throwable th) {
                m16704b(m16703a);
                throw th;
            }
        }
        return num.intValue();
    }
}
