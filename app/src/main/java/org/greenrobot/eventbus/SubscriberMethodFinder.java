package org.greenrobot.eventbus;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.meta.SubscriberInfo;
import org.greenrobot.eventbus.meta.SubscriberInfoIndex;
import p000a.C0000a;

/* loaded from: classes3.dex */
class SubscriberMethodFinder {

    /* renamed from: d */
    public static final Map<Class<?>, List<SubscriberMethod>> f68861d = new ConcurrentHashMap();

    /* renamed from: e */
    public static final FindState[] f68862e = new FindState[4];

    /* renamed from: a */
    public List<SubscriberInfoIndex> f68863a = null;

    /* renamed from: b */
    public final boolean f68864b;

    /* renamed from: c */
    public final boolean f68865c;

    public static class FindState {

        /* renamed from: a */
        public final List<SubscriberMethod> f68866a = new ArrayList();

        /* renamed from: b */
        public final Map<Class, Object> f68867b = new HashMap();

        /* renamed from: c */
        public final Map<String, Class> f68868c = new HashMap();

        /* renamed from: d */
        public final StringBuilder f68869d = new StringBuilder(128);

        /* renamed from: e */
        public Class<?> f68870e;

        /* renamed from: f */
        public boolean f68871f;

        /* renamed from: g */
        public SubscriberInfo f68872g;

        /* renamed from: a */
        public boolean m34652a(Method method, Class<?> cls) {
            Object put = this.f68867b.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (!m34653b((Method) put, cls)) {
                    throw new IllegalStateException();
                }
                this.f68867b.put(cls, this);
            }
            return m34653b(method, cls);
        }

        /* renamed from: b */
        public final boolean m34653b(Method method, Class<?> cls) {
            this.f68869d.setLength(0);
            this.f68869d.append(method.getName());
            StringBuilder sb = this.f68869d;
            sb.append('>');
            sb.append(cls.getName());
            String sb2 = this.f68869d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class put = this.f68868c.put(sb2, declaringClass);
            if (put == null || put.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f68868c.put(sb2, put);
            return false;
        }

        /* renamed from: c */
        public void m34654c() {
            if (this.f68871f) {
                this.f68870e = null;
                return;
            }
            Class<? super Object> superclass = this.f68870e.getSuperclass();
            this.f68870e = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.") || name.startsWith("androidx.")) {
                this.f68870e = null;
            }
        }
    }

    public SubscriberMethodFinder(List<SubscriberInfoIndex> list, boolean z, boolean z2) {
        this.f68864b = z;
        this.f68865c = z2;
    }

    /* renamed from: a */
    public final void m34649a(FindState findState) {
        Method[] methods;
        try {
            try {
                methods = findState.f68870e.getDeclaredMethods();
            } catch (Throwable unused) {
                methods = findState.f68870e.getMethods();
                findState.f68871f = true;
            }
            for (Method method : methods) {
                int modifiers = method.getModifiers();
                if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1) {
                        Subscribe subscribe = (Subscribe) method.getAnnotation(Subscribe.class);
                        if (subscribe != null) {
                            Class<?> cls = parameterTypes[0];
                            if (findState.m34652a(method, cls)) {
                                findState.f68866a.add(new SubscriberMethod(method, cls, subscribe.threadMode(), subscribe.priority(), subscribe.sticky()));
                            }
                        }
                    } else if (this.f68864b && method.isAnnotationPresent(Subscribe.class)) {
                        StringBuilder m28y = C0000a.m28y("@Subscribe method ", method.getDeclaringClass().getName() + "." + method.getName(), "must have exactly 1 parameter but has ");
                        m28y.append(parameterTypes.length);
                        throw new EventBusException(m28y.toString());
                    }
                } else if (this.f68864b && method.isAnnotationPresent(Subscribe.class)) {
                    throw new EventBusException(C0000a.m14k(method.getDeclaringClass().getName() + "." + method.getName(), " is a illegal @Subscribe method: must be public, non-static, and non-abstract"));
                }
            }
        } catch (LinkageError e2) {
            StringBuilder m24u = C0000a.m24u("Could not inspect methods of ");
            m24u.append(findState.f68870e.getName());
            String sb = m24u.toString();
            throw new EventBusException(this.f68865c ? C0000a.m14k(sb, ". Please consider using EventBus annotation processor to avoid reflection.") : C0000a.m14k(sb, ". Please make this class visible to EventBus annotation processor to avoid reflection."), e2);
        }
    }

    /* renamed from: b */
    public final List<SubscriberMethod> m34650b(FindState findState) {
        ArrayList arrayList = new ArrayList(findState.f68866a);
        findState.f68866a.clear();
        findState.f68867b.clear();
        findState.f68868c.clear();
        int i2 = 0;
        findState.f68869d.setLength(0);
        findState.f68870e = null;
        findState.f68871f = false;
        findState.f68872g = null;
        synchronized (f68862e) {
            while (true) {
                if (i2 >= 4) {
                    break;
                }
                FindState[] findStateArr = f68862e;
                if (findStateArr[i2] == null) {
                    findStateArr[i2] = findState;
                    break;
                }
                i2++;
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final FindState m34651c() {
        synchronized (f68862e) {
            for (int i2 = 0; i2 < 4; i2++) {
                FindState[] findStateArr = f68862e;
                FindState findState = findStateArr[i2];
                if (findState != null) {
                    findStateArr[i2] = null;
                    return findState;
                }
            }
            return new FindState();
        }
    }
}
