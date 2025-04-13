package org.greenrobot.eventbus;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class SubscriberMethod {

    /* renamed from: a */
    public final Method f68855a;

    /* renamed from: b */
    public final ThreadMode f68856b;

    /* renamed from: c */
    public final Class<?> f68857c;

    /* renamed from: d */
    public final int f68858d;

    /* renamed from: e */
    public final boolean f68859e;

    /* renamed from: f */
    public String f68860f;

    public SubscriberMethod(Method method, Class<?> cls, ThreadMode threadMode, int i2, boolean z) {
        this.f68855a = method;
        this.f68856b = threadMode;
        this.f68857c = cls;
        this.f68858d = i2;
        this.f68859e = z;
    }

    /* renamed from: a */
    public final synchronized void m34648a() {
        if (this.f68860f == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f68855a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f68855a.getName());
            sb.append('(');
            sb.append(this.f68857c.getName());
            this.f68860f = sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubscriberMethod)) {
            return false;
        }
        m34648a();
        SubscriberMethod subscriberMethod = (SubscriberMethod) obj;
        subscriberMethod.m34648a();
        return this.f68860f.equals(subscriberMethod.f68860f);
    }

    public int hashCode() {
        return this.f68855a.hashCode();
    }
}
