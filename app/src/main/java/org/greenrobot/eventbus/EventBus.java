package org.greenrobot.eventbus;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class EventBus {

    /* renamed from: q */
    public static volatile EventBus f68814q;

    /* renamed from: r */
    public static final EventBusBuilder f68815r = new EventBusBuilder();

    /* renamed from: s */
    public static final Map<Class<?>, List<Class<?>>> f68816s = new HashMap();

    /* renamed from: a */
    public final Map<Class<?>, CopyOnWriteArrayList<Subscription>> f68817a;

    /* renamed from: b */
    public final Map<Object, List<Class<?>>> f68818b;

    /* renamed from: c */
    public final Map<Class<?>, Object> f68819c;

    /* renamed from: d */
    public final ThreadLocal<PostingThreadState> f68820d;

    /* renamed from: e */
    public final MainThreadSupport f68821e;

    /* renamed from: f */
    public final Poster f68822f;

    /* renamed from: g */
    public final BackgroundPoster f68823g;

    /* renamed from: h */
    public final AsyncPoster f68824h;

    /* renamed from: i */
    public final SubscriberMethodFinder f68825i;

    /* renamed from: j */
    public final ExecutorService f68826j;

    /* renamed from: k */
    public final boolean f68827k;

    /* renamed from: l */
    public final boolean f68828l;

    /* renamed from: m */
    public final boolean f68829m;

    /* renamed from: n */
    public final boolean f68830n;

    /* renamed from: o */
    public final boolean f68831o;

    /* renamed from: p */
    public final Logger f68832p;

    /* renamed from: org.greenrobot.eventbus.EventBus$2 */
    public static /* synthetic */ class C68712 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f68833a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f68833a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68833a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68833a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68833a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f68833a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public interface PostCallback {
    }

    public static final class PostingThreadState {

        /* renamed from: a */
        public final List<Object> f68834a = new ArrayList();

        /* renamed from: b */
        public boolean f68835b;

        /* renamed from: c */
        public boolean f68836c;

        /* renamed from: d */
        public Object f68837d;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public EventBus() {
        /*
            r4 = this;
            org.greenrobot.eventbus.EventBusBuilder r0 = org.greenrobot.eventbus.EventBus.f68815r
            r4.<init>()
            org.greenrobot.eventbus.EventBus$1 r1 = new org.greenrobot.eventbus.EventBus$1
            r1.<init>(r4)
            r4.f68820d = r1
            java.util.Objects.requireNonNull(r0)
            boolean r1 = org.greenrobot.eventbus.android.AndroidLogger.f68879b
            r2 = 0
            if (r1 == 0) goto L24
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.RuntimeException -> L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            if (r1 == 0) goto L24
            org.greenrobot.eventbus.android.AndroidLogger r1 = new org.greenrobot.eventbus.android.AndroidLogger
            java.lang.String r3 = "EventBus"
            r1.<init>(r3)
            goto L29
        L24:
            org.greenrobot.eventbus.Logger$SystemOutLogger r1 = new org.greenrobot.eventbus.Logger$SystemOutLogger
            r1.<init>()
        L29:
            r4.f68832p = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r4.f68817a = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r4.f68818b = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r4.f68819c = r1
            boolean r1 = org.greenrobot.eventbus.android.AndroidLogger.f68879b
            if (r1 == 0) goto L53
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.RuntimeException -> L49
            goto L4a
        L49:
            r1 = r2
        L4a:
            if (r1 != 0) goto L4d
            goto L53
        L4d:
            org.greenrobot.eventbus.MainThreadSupport$AndroidHandlerMainThreadSupport r3 = new org.greenrobot.eventbus.MainThreadSupport$AndroidHandlerMainThreadSupport
            r3.<init>(r1)
            goto L54
        L53:
            r3 = r2
        L54:
            r4.f68821e = r3
            if (r3 == 0) goto L5d
            org.greenrobot.eventbus.Poster r1 = r3.m34644b(r4)
            goto L5e
        L5d:
            r1 = r2
        L5e:
            r4.f68822f = r1
            org.greenrobot.eventbus.BackgroundPoster r1 = new org.greenrobot.eventbus.BackgroundPoster
            r1.<init>(r4)
            r4.f68823g = r1
            org.greenrobot.eventbus.AsyncPoster r1 = new org.greenrobot.eventbus.AsyncPoster
            r1.<init>(r4)
            r4.f68824h = r1
            r1 = 0
            org.greenrobot.eventbus.SubscriberMethodFinder r3 = new org.greenrobot.eventbus.SubscriberMethodFinder
            r3.<init>(r2, r1, r1)
            r4.f68825i = r3
            r1 = 1
            r4.f68827k = r1
            r4.f68828l = r1
            r4.f68829m = r1
            r4.f68830n = r1
            r4.f68831o = r1
            java.util.concurrent.ExecutorService r0 = r0.f68839a
            r4.f68826j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.greenrobot.eventbus.EventBus.<init>():void");
    }

    /* renamed from: a */
    public static void m34629a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                m34629a(list, cls.getInterfaces());
            }
        }
    }

    /* renamed from: c */
    public static EventBus m34630c() {
        EventBus eventBus = f68814q;
        if (eventBus == null) {
            synchronized (EventBus.class) {
                eventBus = f68814q;
                if (eventBus == null) {
                    eventBus = new EventBus();
                    f68814q = eventBus;
                }
            }
        }
        return eventBus;
    }

    /* renamed from: b */
    public final void m34631b(Subscription subscription, Object obj) {
        if (obj != null) {
            MainThreadSupport mainThreadSupport = this.f68821e;
            m34637i(subscription, obj, mainThreadSupport == null || mainThreadSupport.mo34643a());
        }
    }

    /* renamed from: d */
    public void m34632d(PendingPost pendingPost) {
        Object obj = pendingPost.f68847a;
        Subscription subscription = pendingPost.f68848b;
        pendingPost.f68847a = null;
        pendingPost.f68848b = null;
        pendingPost.f68849c = null;
        List<PendingPost> list = PendingPost.f68846d;
        synchronized (list) {
            if (((ArrayList) list).size() < 10000) {
                ((ArrayList) list).add(pendingPost);
            }
        }
        if (subscription.f68875c) {
            m34633e(subscription, obj);
        }
    }

    /* renamed from: e */
    public void m34633e(Subscription subscription, Object obj) {
        try {
            subscription.f68874b.f68855a.invoke(subscription.f68873a, obj);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unexpected exception", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (!(obj instanceof SubscriberExceptionEvent)) {
                if (this.f68827k) {
                    Logger logger = this.f68832p;
                    Level level = Level.SEVERE;
                    StringBuilder m24u = C0000a.m24u("Could not dispatch event: ");
                    m24u.append(obj.getClass());
                    m24u.append(" to subscribing class ");
                    m24u.append(subscription.f68873a.getClass());
                    logger.mo34642b(level, m24u.toString(), cause);
                }
                if (this.f68829m) {
                    m34634f(new SubscriberExceptionEvent(this, cause, obj, subscription.f68873a));
                    return;
                }
                return;
            }
            if (this.f68827k) {
                Logger logger2 = this.f68832p;
                Level level2 = Level.SEVERE;
                StringBuilder m24u2 = C0000a.m24u("SubscriberExceptionEvent subscriber ");
                m24u2.append(subscription.f68873a.getClass());
                m24u2.append(" threw an exception");
                logger2.mo34642b(level2, m24u2.toString(), cause);
                SubscriberExceptionEvent subscriberExceptionEvent = (SubscriberExceptionEvent) obj;
                Logger logger3 = this.f68832p;
                StringBuilder m24u3 = C0000a.m24u("Initial event ");
                m24u3.append(subscriberExceptionEvent.f68853b);
                m24u3.append(" caused exception in ");
                m24u3.append(subscriberExceptionEvent.f68854c);
                logger3.mo34642b(level2, m24u3.toString(), subscriberExceptionEvent.f68852a);
            }
        }
    }

    /* renamed from: f */
    public void m34634f(Object obj) {
        PostingThreadState postingThreadState = this.f68820d.get();
        List<Object> list = postingThreadState.f68834a;
        list.add(obj);
        if (postingThreadState.f68835b) {
            return;
        }
        MainThreadSupport mainThreadSupport = this.f68821e;
        postingThreadState.f68836c = mainThreadSupport == null || mainThreadSupport.mo34643a();
        postingThreadState.f68835b = true;
        while (!list.isEmpty()) {
            try {
                m34635g(list.remove(0), postingThreadState);
            } finally {
                postingThreadState.f68835b = false;
                postingThreadState.f68836c = false;
            }
        }
    }

    /* renamed from: g */
    public final void m34635g(Object obj, PostingThreadState postingThreadState) throws Error {
        boolean m34636h;
        List list;
        Class<?> cls = obj.getClass();
        if (this.f68831o) {
            Map<Class<?>, List<Class<?>>> map = f68816s;
            synchronized (map) {
                List list2 = (List) ((HashMap) map).get(cls);
                list = list2;
                if (list2 == null) {
                    ArrayList arrayList = new ArrayList();
                    for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                        arrayList.add(cls2);
                        m34629a(arrayList, cls2.getInterfaces());
                    }
                    ((HashMap) f68816s).put(cls, arrayList);
                    list = arrayList;
                }
            }
            int size = list.size();
            m34636h = false;
            for (int i2 = 0; i2 < size; i2++) {
                m34636h |= m34636h(obj, postingThreadState, (Class) list.get(i2));
            }
        } else {
            m34636h = m34636h(obj, postingThreadState, cls);
        }
        if (m34636h) {
            return;
        }
        if (this.f68828l) {
            this.f68832p.mo34641a(Level.FINE, "No subscribers registered for event " + cls);
        }
        if (!this.f68830n || cls == NoSubscriberEvent.class || cls == SubscriberExceptionEvent.class) {
            return;
        }
        m34634f(new NoSubscriberEvent(this, obj));
    }

    /* renamed from: h */
    public final boolean m34636h(Object obj, PostingThreadState postingThreadState, Class<?> cls) {
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.f68817a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<Subscription> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            Subscription next = it.next();
            postingThreadState.f68837d = obj;
            m34637i(next, obj, postingThreadState.f68836c);
        }
        return true;
    }

    /* renamed from: i */
    public final void m34637i(Subscription subscription, Object obj, boolean z) {
        int ordinal = subscription.f68874b.f68856b.ordinal();
        if (ordinal == 0) {
            m34633e(subscription, obj);
            return;
        }
        if (ordinal == 1) {
            if (z) {
                m34633e(subscription, obj);
                return;
            } else {
                this.f68822f.mo34628a(subscription, obj);
                return;
            }
        }
        if (ordinal == 2) {
            Poster poster = this.f68822f;
            if (poster != null) {
                poster.mo34628a(subscription, obj);
                return;
            } else {
                m34633e(subscription, obj);
                return;
            }
        }
        if (ordinal == 3) {
            if (z) {
                this.f68823g.mo34628a(subscription, obj);
                return;
            } else {
                m34633e(subscription, obj);
                return;
            }
        }
        if (ordinal == 4) {
            this.f68824h.mo34628a(subscription, obj);
        } else {
            StringBuilder m24u = C0000a.m24u("Unknown thread mode: ");
            m24u.append(subscription.f68874b.f68856b);
            throw new IllegalStateException(m24u.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r2.f68870e == r5.mo34657c()) goto L31;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m34638j(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.greenrobot.eventbus.EventBus.m34638j(java.lang.Object):void");
    }

    /* renamed from: k */
    public final void m34639k(Object obj, SubscriberMethod subscriberMethod) {
        Class<?> cls = subscriberMethod.f68857c;
        Subscription subscription = new Subscription(obj, subscriberMethod);
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.f68817a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f68817a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(subscription)) {
            StringBuilder m24u = C0000a.m24u("Subscriber ");
            m24u.append(obj.getClass());
            m24u.append(" already registered to event ");
            m24u.append(cls);
            throw new EventBusException(m24u.toString());
        }
        int size = copyOnWriteArrayList.size();
        for (int i2 = 0; i2 <= size; i2++) {
            if (i2 == size || subscriberMethod.f68858d > copyOnWriteArrayList.get(i2).f68874b.f68858d) {
                copyOnWriteArrayList.add(i2, subscription);
                break;
            }
        }
        List<Class<?>> list = this.f68818b.get(obj);
        if (list == null) {
            list = new ArrayList<>();
            this.f68818b.put(obj, list);
        }
        list.add(cls);
        if (subscriberMethod.f68859e) {
            if (!this.f68831o) {
                m34631b(subscription, this.f68819c.get(cls));
                return;
            }
            for (Map.Entry<Class<?>, Object> entry : this.f68819c.entrySet()) {
                if (cls.isAssignableFrom(entry.getKey())) {
                    m34631b(subscription, entry.getValue());
                }
            }
        }
    }

    /* renamed from: l */
    public synchronized void m34640l(Object obj) {
        List<Class<?>> list = this.f68818b.get(obj);
        if (list != null) {
            Iterator<Class<?>> it = list.iterator();
            while (it.hasNext()) {
                CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.f68817a.get(it.next());
                if (copyOnWriteArrayList != null) {
                    int size = copyOnWriteArrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Subscription subscription = copyOnWriteArrayList.get(i2);
                        if (subscription.f68873a == obj) {
                            subscription.f68875c = false;
                            copyOnWriteArrayList.remove(i2);
                            i2--;
                            size--;
                        }
                        i2++;
                    }
                }
            }
            this.f68818b.remove(obj);
        } else {
            this.f68832p.mo34641a(Level.WARNING, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    public String toString() {
        StringBuilder m25v = C0000a.m25v("EventBus[indexCount=", 0, ", eventInheritance=");
        m25v.append(this.f68831o);
        m25v.append("]");
        return m25v.toString();
    }
}
