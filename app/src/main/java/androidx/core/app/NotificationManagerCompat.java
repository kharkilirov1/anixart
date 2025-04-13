package androidx.core.app;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class NotificationManagerCompat {

    /* renamed from: d */
    @GuardedBy
    public static String f3231d;

    /* renamed from: a */
    public final Context f3234a;

    /* renamed from: b */
    public final NotificationManager f3235b;

    /* renamed from: c */
    public static final Object f3230c = new Object();

    /* renamed from: e */
    @GuardedBy
    public static Set<String> f3232e = new HashSet();

    /* renamed from: f */
    public static final Object f3233f = new Object();

    public static class CancelTask implements Task {

        /* renamed from: a */
        public final String f3236a;

        /* renamed from: b */
        public final int f3237b;

        /* renamed from: c */
        public final String f3238c;

        @Override // androidx.core.app.NotificationManagerCompat.Task
        /* renamed from: a */
        public void mo1628a(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            iNotificationSideChannel.mo60p1(this.f3236a, this.f3237b, this.f3238c);
        }

        @NonNull
        public String toString() {
            return "CancelTask[packageName:" + this.f3236a + ", id:" + this.f3237b + ", tag:" + this.f3238c + ", all:false]";
        }
    }

    public static class NotifyTask implements Task {
        @Override // androidx.core.app.NotificationManagerCompat.Task
        /* renamed from: a */
        public void mo1628a(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            iNotificationSideChannel.mo62v2(null, 0, null, null);
        }

        @NonNull
        public String toString() {
            return "NotifyTask[packageName:null, id:0, tag:null]";
        }
    }

    public static class ServiceConnectedEvent {

        /* renamed from: a */
        public final ComponentName f3239a;

        /* renamed from: b */
        public final IBinder f3240b;

        public ServiceConnectedEvent(ComponentName componentName, IBinder iBinder) {
            this.f3239a = componentName;
            this.f3240b = iBinder;
        }
    }

    public static class SideChannelManager implements Handler.Callback, ServiceConnection {

        /* renamed from: b */
        public final Context f3241b;

        /* renamed from: c */
        public final Handler f3242c;

        /* renamed from: d */
        public final Map<ComponentName, ListenerRecord> f3243d;

        /* renamed from: e */
        public Set<String> f3244e;

        public static class ListenerRecord {

            /* renamed from: a */
            public final ComponentName f3245a;

            /* renamed from: c */
            public INotificationSideChannel f3247c;

            /* renamed from: b */
            public boolean f3246b = false;

            /* renamed from: d */
            public ArrayDeque<Task> f3248d = new ArrayDeque<>();

            /* renamed from: e */
            public int f3249e = 0;

            public ListenerRecord(ComponentName componentName) {
                this.f3245a = componentName;
            }
        }

        /* renamed from: a */
        public final void m1629a(ListenerRecord listenerRecord) {
            boolean z;
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder m24u = C0000a.m24u("Processing component ");
                m24u.append(listenerRecord.f3245a);
                m24u.append(", ");
                m24u.append(listenerRecord.f3248d.size());
                m24u.append(" queued tasks");
                Log.d("NotifManCompat", m24u.toString());
            }
            if (listenerRecord.f3248d.isEmpty()) {
                return;
            }
            if (listenerRecord.f3246b) {
                z = true;
            } else {
                boolean bindService = this.f3241b.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(listenerRecord.f3245a), this, 33);
                listenerRecord.f3246b = bindService;
                if (bindService) {
                    listenerRecord.f3249e = 0;
                } else {
                    StringBuilder m24u2 = C0000a.m24u("Unable to bind to listener ");
                    m24u2.append(listenerRecord.f3245a);
                    Log.w("NotifManCompat", m24u2.toString());
                    this.f3241b.unbindService(this);
                }
                z = listenerRecord.f3246b;
            }
            if (!z || listenerRecord.f3247c == null) {
                m1630b(listenerRecord);
                return;
            }
            while (true) {
                Task peek = listenerRecord.f3248d.peek();
                if (peek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + peek);
                    }
                    peek.mo1628a(listenerRecord.f3247c);
                    listenerRecord.f3248d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        StringBuilder m24u3 = C0000a.m24u("Remote service has died: ");
                        m24u3.append(listenerRecord.f3245a);
                        Log.d("NotifManCompat", m24u3.toString());
                    }
                } catch (RemoteException e2) {
                    StringBuilder m24u4 = C0000a.m24u("RemoteException communicating with ");
                    m24u4.append(listenerRecord.f3245a);
                    Log.w("NotifManCompat", m24u4.toString(), e2);
                }
            }
            if (listenerRecord.f3248d.isEmpty()) {
                return;
            }
            m1630b(listenerRecord);
        }

        /* renamed from: b */
        public final void m1630b(ListenerRecord listenerRecord) {
            if (this.f3242c.hasMessages(3, listenerRecord.f3245a)) {
                return;
            }
            int i2 = listenerRecord.f3249e + 1;
            listenerRecord.f3249e = i2;
            if (i2 > 6) {
                StringBuilder m24u = C0000a.m24u("Giving up on delivering ");
                m24u.append(listenerRecord.f3248d.size());
                m24u.append(" tasks to ");
                m24u.append(listenerRecord.f3245a);
                m24u.append(" after ");
                m24u.append(listenerRecord.f3249e);
                m24u.append(" retries");
                Log.w("NotifManCompat", m24u.toString());
                listenerRecord.f3248d.clear();
                return;
            }
            int i3 = (1 << (i2 - 1)) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
            }
            this.f3242c.sendMessageDelayed(this.f3242c.obtainMessage(3, listenerRecord.f3245a), i3);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            Set<String> set;
            int i2 = message.what;
            if (i2 != 0) {
                if (i2 == 1) {
                    ServiceConnectedEvent serviceConnectedEvent = (ServiceConnectedEvent) message.obj;
                    ComponentName componentName = serviceConnectedEvent.f3239a;
                    IBinder iBinder = serviceConnectedEvent.f3240b;
                    ListenerRecord listenerRecord = this.f3243d.get(componentName);
                    if (listenerRecord != null) {
                        listenerRecord.f3247c = INotificationSideChannel.Stub.m63i(iBinder);
                        listenerRecord.f3249e = 0;
                        m1629a(listenerRecord);
                    }
                    return true;
                }
                if (i2 != 2) {
                    if (i2 != 3) {
                        return false;
                    }
                    ListenerRecord listenerRecord2 = this.f3243d.get((ComponentName) message.obj);
                    if (listenerRecord2 != null) {
                        m1629a(listenerRecord2);
                    }
                    return true;
                }
                ListenerRecord listenerRecord3 = this.f3243d.get((ComponentName) message.obj);
                if (listenerRecord3 != null) {
                    if (listenerRecord3.f3246b) {
                        this.f3241b.unbindService(this);
                        listenerRecord3.f3246b = false;
                    }
                    listenerRecord3.f3247c = null;
                }
                return true;
            }
            Task task = (Task) message.obj;
            Context context = this.f3241b;
            Object obj = NotificationManagerCompat.f3230c;
            String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
            synchronized (NotificationManagerCompat.f3230c) {
                if (string != null) {
                    if (!string.equals(NotificationManagerCompat.f3231d)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet.add(unflattenFromString.getPackageName());
                            }
                        }
                        NotificationManagerCompat.f3232e = hashSet;
                        NotificationManagerCompat.f3231d = string;
                    }
                }
                set = NotificationManagerCompat.f3232e;
            }
            if (!set.equals(this.f3244e)) {
                this.f3244e = set;
                List<ResolveInfo> queryIntentServices = this.f3241b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet2 = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (set.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName2 + ", not adding listener record.");
                        } else {
                            hashSet2.add(componentName2);
                        }
                    }
                }
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ComponentName componentName3 = (ComponentName) it.next();
                    if (!this.f3243d.containsKey(componentName3)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                        }
                        this.f3243d.put(componentName3, new ListenerRecord(componentName3));
                    }
                }
                Iterator<Map.Entry<ComponentName, ListenerRecord>> it2 = this.f3243d.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<ComponentName, ListenerRecord> next = it2.next();
                    if (!hashSet2.contains(next.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder m24u = C0000a.m24u("Removing listener record for ");
                            m24u.append(next.getKey());
                            Log.d("NotifManCompat", m24u.toString());
                        }
                        ListenerRecord value = next.getValue();
                        if (value.f3246b) {
                            this.f3241b.unbindService(this);
                            value.f3246b = false;
                        }
                        value.f3247c = null;
                        it2.remove();
                    }
                }
            }
            for (ListenerRecord listenerRecord4 : this.f3243d.values()) {
                listenerRecord4.f3248d.add(task);
                m1629a(listenerRecord4);
            }
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f3242c.obtainMessage(1, new ServiceConnectedEvent(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f3242c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    public interface Task {
        /* renamed from: a */
        void mo1628a(INotificationSideChannel iNotificationSideChannel) throws RemoteException;
    }

    public NotificationManagerCompat(Context context) {
        this.f3234a = context;
        this.f3235b = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: a */
    public boolean m1627a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f3235b.areNotificationsEnabled();
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f3234a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f3234a.getApplicationInfo();
        String packageName = this.f3234a.getApplicationContext().getPackageName();
        int i2 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i2), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
