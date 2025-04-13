package androidx.media;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.app.BundleCompat;
import androidx.core.util.Pair;
import androidx.media.MediaSessionManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class MediaBrowserServiceCompat extends Service {

    /* renamed from: g */
    public static final boolean f4785g = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: b */
    public MediaBrowserServiceImpl f4786b;

    /* renamed from: c */
    public final ConnectionRecord f4787c = new ConnectionRecord("android.media.session.MediaController", -1, -1, null, null);

    /* renamed from: d */
    public final ArrayList<ConnectionRecord> f4788d = new ArrayList<>();

    /* renamed from: e */
    public final ArrayMap<IBinder, ConnectionRecord> f4789e = new ArrayMap<>();

    /* renamed from: f */
    public final ServiceHandler f4790f = new ServiceHandler(this);

    public static final class BrowserRoot {

        /* renamed from: a */
        public final String f4799a;

        /* renamed from: b */
        public final Bundle f4800b;

        public BrowserRoot(@NonNull String str, @Nullable Bundle bundle) {
            if (str == null) {
                throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
            }
            this.f4799a = str;
            this.f4800b = bundle;
        }
    }

    public class ConnectionRecord implements IBinder.DeathRecipient {

        /* renamed from: a */
        public final String f4801a;

        /* renamed from: b */
        public final int f4802b;

        /* renamed from: c */
        public final int f4803c;

        /* renamed from: d */
        public final ServiceCallbacks f4804d;

        /* renamed from: e */
        public final HashMap<String, List<Pair<IBinder, Bundle>>> f4805e = new HashMap<>();

        /* renamed from: f */
        public BrowserRoot f4806f;

        public ConnectionRecord(String str, int i2, int i3, Bundle bundle, ServiceCallbacks serviceCallbacks) {
            this.f4801a = str;
            this.f4802b = i2;
            this.f4803c = i3;
            new MediaSessionManager.RemoteUserInfo(str, i2, i3);
            this.f4804d = serviceCallbacks;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            MediaBrowserServiceCompat.this.f4790f.post(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ConnectionRecord.1
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord = ConnectionRecord.this;
                    MediaBrowserServiceCompat.this.f4789e.remove(connectionRecord.f4804d.asBinder());
                }
            });
        }
    }

    public interface MediaBrowserServiceImpl {
        /* renamed from: a */
        void mo3302a();

        /* renamed from: b */
        IBinder mo3303b(Intent intent);
    }

    @RequiresApi
    public class MediaBrowserServiceImplApi21 implements MediaBrowserServiceImpl {

        /* renamed from: a */
        public final List<Bundle> f4809a = new ArrayList();

        /* renamed from: b */
        public MediaBrowserService f4810b;

        /* renamed from: c */
        public Messenger f4811c;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$1 */
        class RunnableC04371 implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                throw null;
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$3 */
        class RunnableC04393 implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                throw null;
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$4 */
        class RunnableC04404 implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                throw null;
            }
        }

        @RequiresApi
        public class MediaBrowserServiceApi21 extends MediaBrowserService {
            public MediaBrowserServiceApi21(Context context) {
                attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            @SuppressLint
            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i2, Bundle bundle) {
                Bundle bundle2;
                int i3;
                BrowserRoot browserRoot;
                MediaSessionCompat.m195a(bundle);
                MediaBrowserServiceImplApi21 mediaBrowserServiceImplApi21 = MediaBrowserServiceImplApi21.this;
                Bundle bundle3 = bundle == null ? null : new Bundle(bundle);
                Objects.requireNonNull(mediaBrowserServiceImplApi21);
                if (bundle3 == null || bundle3.getInt("extra_client_version", 0) == 0) {
                    bundle2 = null;
                    i3 = -1;
                } else {
                    bundle3.remove("extra_client_version");
                    mediaBrowserServiceImplApi21.f4811c = new Messenger(MediaBrowserServiceCompat.this.f4790f);
                    Bundle bundle4 = new Bundle();
                    bundle4.putInt("extra_service_version", 2);
                    BundleCompat.m1572b(bundle4, "extra_messenger", mediaBrowserServiceImplApi21.f4811c.getBinder());
                    Objects.requireNonNull(MediaBrowserServiceCompat.this);
                    mediaBrowserServiceImplApi21.f4809a.add(bundle4);
                    int i4 = bundle3.getInt("extra_calling_pid", -1);
                    bundle3.remove("extra_calling_pid");
                    i3 = i4;
                    bundle2 = bundle4;
                }
                ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.new ConnectionRecord(str, i3, i2, bundle3, null);
                Objects.requireNonNull(MediaBrowserServiceCompat.this);
                BrowserRoot m3297b = MediaBrowserServiceCompat.this.m3297b(str, i2, bundle3);
                Objects.requireNonNull(MediaBrowserServiceCompat.this);
                if (m3297b == null) {
                    browserRoot = null;
                } else {
                    if (mediaBrowserServiceImplApi21.f4811c != null) {
                        MediaBrowserServiceCompat.this.f4788d.add(connectionRecord);
                    }
                    if (bundle2 == null) {
                        bundle2 = m3297b.f4800b;
                    } else {
                        Bundle bundle5 = m3297b.f4800b;
                        if (bundle5 != null) {
                            bundle2.putAll(bundle5);
                        }
                    }
                    browserRoot = new BrowserRoot(m3297b.f4799a, bundle2);
                }
                if (browserRoot == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(browserRoot.f4799a, browserRoot.f4800b);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                MediaBrowserServiceImplApi21 mediaBrowserServiceImplApi21 = MediaBrowserServiceImplApi21.this;
                ResultWrapper resultWrapper = new ResultWrapper(result);
                Objects.requireNonNull(mediaBrowserServiceImplApi21);
                Result<List<MediaBrowserCompat.MediaItem>> result2 = new Result<List<MediaBrowserCompat.MediaItem>>(mediaBrowserServiceImplApi21, str, resultWrapper) { // from class: androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.2

                    /* renamed from: e */
                    public final /* synthetic */ ResultWrapper f4813e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(str);
                        this.f4813e = resultWrapper;
                    }

                    @Override // androidx.media.MediaBrowserServiceCompat.Result
                    /* renamed from: b */
                    public void mo3300b(@Nullable List<MediaBrowserCompat.MediaItem> list) {
                        ArrayList arrayList;
                        List<MediaBrowserCompat.MediaItem> list2 = list;
                        if (list2 != null) {
                            arrayList = new ArrayList();
                            for (MediaBrowserCompat.MediaItem mediaItem : list2) {
                                Parcel obtain = Parcel.obtain();
                                mediaItem.writeToParcel(obtain, 0);
                                arrayList.add(obtain);
                            }
                        } else {
                            arrayList = null;
                        }
                        this.f4813e.m3306a(arrayList);
                    }
                };
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                ConnectionRecord connectionRecord = mediaBrowserServiceCompat.f4787c;
                mediaBrowserServiceCompat.m3298c(str, result2);
                Objects.requireNonNull(MediaBrowserServiceCompat.this);
            }
        }

        public MediaBrowserServiceImplApi21() {
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        /* renamed from: a */
        public void mo3302a() {
            MediaBrowserServiceApi21 mediaBrowserServiceApi21 = new MediaBrowserServiceApi21(MediaBrowserServiceCompat.this);
            this.f4810b = mediaBrowserServiceApi21;
            mediaBrowserServiceApi21.onCreate();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        /* renamed from: b */
        public IBinder mo3303b(Intent intent) {
            return this.f4810b.onBind(intent);
        }
    }

    @RequiresApi
    public class MediaBrowserServiceImplApi23 extends MediaBrowserServiceImplApi21 {

        public class MediaBrowserServiceApi23 extends MediaBrowserServiceImplApi21.MediaBrowserServiceApi21 {
            public MediaBrowserServiceApi23(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                MediaBrowserServiceImplApi23 mediaBrowserServiceImplApi23 = MediaBrowserServiceImplApi23.this;
                ResultWrapper resultWrapper = new ResultWrapper(result);
                Objects.requireNonNull(mediaBrowserServiceImplApi23);
                Result<MediaBrowserCompat.MediaItem> result2 = new Result<MediaBrowserCompat.MediaItem>(mediaBrowserServiceImplApi23, str, resultWrapper) { // from class: androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.1

                    /* renamed from: e */
                    public final /* synthetic */ ResultWrapper f4816e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(str);
                        this.f4816e = resultWrapper;
                    }

                    @Override // androidx.media.MediaBrowserServiceCompat.Result
                    /* renamed from: b */
                    public void mo3300b(@Nullable MediaBrowserCompat.MediaItem mediaItem) {
                        MediaBrowserCompat.MediaItem mediaItem2 = mediaItem;
                        if (mediaItem2 == null) {
                            this.f4816e.m3306a(null);
                            return;
                        }
                        Parcel obtain = Parcel.obtain();
                        mediaItem2.writeToParcel(obtain, 0);
                        this.f4816e.m3306a(obtain);
                    }
                };
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                ConnectionRecord connectionRecord = mediaBrowserServiceCompat.f4787c;
                Objects.requireNonNull(mediaBrowserServiceCompat);
                result2.f4828d = 2;
                result2.m3305c(null);
                Objects.requireNonNull(MediaBrowserServiceCompat.this);
            }
        }

        public MediaBrowserServiceImplApi23() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        /* renamed from: a */
        public void mo3302a() {
            MediaBrowserServiceApi23 mediaBrowserServiceApi23 = new MediaBrowserServiceApi23(MediaBrowserServiceCompat.this);
            this.f4810b = mediaBrowserServiceApi23;
            mediaBrowserServiceApi23.onCreate();
        }
    }

    @RequiresApi
    public class MediaBrowserServiceImplApi26 extends MediaBrowserServiceImplApi23 {

        public class MediaBrowserServiceApi26 extends MediaBrowserServiceImplApi23.MediaBrowserServiceApi23 {
            public MediaBrowserServiceApi26(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, final Bundle bundle) {
                MediaSessionCompat.m195a(bundle);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                ConnectionRecord connectionRecord = mediaBrowserServiceCompat.f4787c;
                Objects.requireNonNull(mediaBrowserServiceCompat);
                final MediaBrowserServiceImplApi26 mediaBrowserServiceImplApi26 = MediaBrowserServiceImplApi26.this;
                final ResultWrapper resultWrapper = new ResultWrapper(result);
                Objects.requireNonNull(mediaBrowserServiceImplApi26);
                Result<List<MediaBrowserCompat.MediaItem>> result2 = new Result<List<MediaBrowserCompat.MediaItem>>(str) { // from class: androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi26.1
                    @Override // androidx.media.MediaBrowserServiceCompat.Result
                    /* renamed from: b */
                    public void mo3300b(@Nullable List<MediaBrowserCompat.MediaItem> list) {
                        List<MediaBrowserCompat.MediaItem> list2 = list;
                        if (list2 == null) {
                            resultWrapper.m3306a(null);
                            return;
                        }
                        if ((this.f4828d & 1) != 0) {
                            list2 = MediaBrowserServiceCompat.this.m3296a(list2, bundle);
                        }
                        ArrayList arrayList = new ArrayList();
                        for (MediaBrowserCompat.MediaItem mediaItem : list2) {
                            Parcel obtain = Parcel.obtain();
                            mediaItem.writeToParcel(obtain, 0);
                            arrayList.add(obtain);
                        }
                        resultWrapper.m3306a(arrayList);
                    }
                };
                MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                ConnectionRecord connectionRecord2 = mediaBrowserServiceCompat2.f4787c;
                Objects.requireNonNull(mediaBrowserServiceCompat2);
                result2.f4828d = 1;
                mediaBrowserServiceCompat2.m3298c(str, result2);
                Objects.requireNonNull(MediaBrowserServiceCompat.this);
                Objects.requireNonNull(MediaBrowserServiceCompat.this);
            }
        }

        public MediaBrowserServiceImplApi26() {
            super();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        /* renamed from: a */
        public void mo3302a() {
            MediaBrowserServiceApi26 mediaBrowserServiceApi26 = new MediaBrowserServiceApi26(MediaBrowserServiceCompat.this);
            this.f4810b = mediaBrowserServiceApi26;
            mediaBrowserServiceApi26.onCreate();
        }
    }

    @RequiresApi
    public class MediaBrowserServiceImplApi28 extends MediaBrowserServiceImplApi26 {
        public MediaBrowserServiceImplApi28(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            super();
        }
    }

    public class MediaBrowserServiceImplBase implements MediaBrowserServiceImpl {

        /* renamed from: a */
        public Messenger f4823a;

        /* renamed from: b */
        public final /* synthetic */ MediaBrowserServiceCompat f4824b;

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$1 */
        class RunnableC04431 implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                throw null;
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$2 */
        class RunnableC04442 implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                throw null;
            }
        }

        /* renamed from: androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase$3 */
        class RunnableC04453 implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                throw null;
            }
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        /* renamed from: a */
        public void mo3302a() {
            this.f4823a = new Messenger(this.f4824b.f4790f);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        /* renamed from: b */
        public IBinder mo3303b(Intent intent) {
            if ("android.media.browse.MediaBrowserService".equals(intent.getAction())) {
                return this.f4823a.getBinder();
            }
            return null;
        }
    }

    public static class Result<T> {

        /* renamed from: a */
        public final Object f4825a;

        /* renamed from: b */
        public boolean f4826b;

        /* renamed from: c */
        public boolean f4827c;

        /* renamed from: d */
        public int f4828d;

        public Result(Object obj) {
            this.f4825a = obj;
        }

        /* renamed from: a */
        public boolean m3304a() {
            return this.f4826b || this.f4827c;
        }

        /* renamed from: b */
        public void mo3300b(@Nullable T t) {
        }

        /* renamed from: c */
        public void m3305c(@Nullable T t) {
            if (this.f4826b || this.f4827c) {
                StringBuilder m24u = C0000a.m24u("sendResult() called when either sendResult() or sendError() had already been called for: ");
                m24u.append(this.f4825a);
                throw new IllegalStateException(m24u.toString());
            }
            this.f4826b = true;
            mo3300b(null);
        }
    }

    @RequiresApi
    public static class ResultWrapper<T> {

        /* renamed from: a */
        public MediaBrowserService.Result f4829a;

        public ResultWrapper(MediaBrowserService.Result result) {
            this.f4829a = result;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public void m3306a(T t) {
            ArrayList arrayList = null;
            if (!(t instanceof List)) {
                if (!(t instanceof Parcel)) {
                    this.f4829a.sendResult(null);
                    return;
                }
                Parcel parcel = (Parcel) t;
                parcel.setDataPosition(0);
                this.f4829a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
                return;
            }
            MediaBrowserService.Result result = this.f4829a;
            List<Parcel> list = (List) t;
            if (list != null) {
                arrayList = new ArrayList();
                for (Parcel parcel2 : list) {
                    parcel2.setDataPosition(0);
                    arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                    parcel2.recycle();
                }
            }
            result.sendResult(arrayList);
        }
    }

    public class ServiceBinderImpl {
        public ServiceBinderImpl() {
        }
    }

    public interface ServiceCallbacks {
        /* renamed from: a */
        void mo3307a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        IBinder asBinder();

        /* renamed from: b */
        void mo3308b() throws RemoteException;
    }

    public static class ServiceCallbacksCompat implements ServiceCallbacks {

        /* renamed from: a */
        public final Messenger f4869a;

        public ServiceCallbacksCompat(Messenger messenger) {
            this.f4869a = messenger;
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        /* renamed from: a */
        public void mo3307a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            m3309c(3, bundle3);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        public IBinder asBinder() {
            return this.f4869a.getBinder();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.ServiceCallbacks
        /* renamed from: b */
        public void mo3308b() throws RemoteException {
            m3309c(2, null);
        }

        /* renamed from: c */
        public final void m3309c(int i2, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i2;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f4869a.send(obtain);
        }
    }

    public final class ServiceHandler extends Handler {

        /* renamed from: a */
        public final ServiceBinderImpl f4870a;

        public ServiceHandler(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            this.f4870a = mediaBrowserServiceCompat.new ServiceBinderImpl();
        }

        /* renamed from: a */
        public void m3310a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    final Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.m195a(bundle);
                    final ServiceBinderImpl serviceBinderImpl = this.f4870a;
                    final String string = data.getString("data_package_name");
                    final int i2 = data.getInt("data_calling_pid");
                    final int i3 = data.getInt("data_calling_uid");
                    final ServiceCallbacksCompat serviceCallbacksCompat = new ServiceCallbacksCompat(message.replyTo);
                    MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                    Objects.requireNonNull(mediaBrowserServiceCompat);
                    boolean z = false;
                    if (string != null) {
                        String[] packagesForUid = mediaBrowserServiceCompat.getPackageManager().getPackagesForUid(i3);
                        int length = packagesForUid.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length) {
                                if (packagesForUid[i4].equals(string)) {
                                    z = true;
                                } else {
                                    i4++;
                                }
                            }
                        }
                    }
                    if (z) {
                        MediaBrowserServiceCompat.this.f4790f.m3310a(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.1
                            @Override // java.lang.Runnable
                            public void run() {
                                IBinder asBinder = serviceCallbacksCompat.asBinder();
                                MediaBrowserServiceCompat.this.f4789e.remove(asBinder);
                                ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.new ConnectionRecord(string, i2, i3, bundle, serviceCallbacksCompat);
                                Objects.requireNonNull(MediaBrowserServiceCompat.this);
                                connectionRecord.f4806f = MediaBrowserServiceCompat.this.m3297b(string, i3, bundle);
                                Objects.requireNonNull(MediaBrowserServiceCompat.this);
                                if (connectionRecord.f4806f != null) {
                                    try {
                                        MediaBrowserServiceCompat.this.f4789e.put(asBinder, connectionRecord);
                                        asBinder.linkToDeath(connectionRecord, 0);
                                        Objects.requireNonNull(MediaBrowserServiceCompat.this);
                                        return;
                                    } catch (RemoteException unused) {
                                        StringBuilder m24u = C0000a.m24u("Calling onConnect() failed. Dropping client. pkg=");
                                        m24u.append(string);
                                        Log.w("MBServiceCompat", m24u.toString());
                                        MediaBrowserServiceCompat.this.f4789e.remove(asBinder);
                                        return;
                                    }
                                }
                                StringBuilder m24u2 = C0000a.m24u("No root for client ");
                                m24u2.append(string);
                                m24u2.append(" from service ");
                                m24u2.append(getClass().getName());
                                Log.i("MBServiceCompat", m24u2.toString());
                                try {
                                    serviceCallbacksCompat.mo3308b();
                                } catch (RemoteException unused2) {
                                    StringBuilder m24u3 = C0000a.m24u("Calling onConnectFailed() failed. Ignoring. pkg=");
                                    m24u3.append(string);
                                    Log.w("MBServiceCompat", m24u3.toString());
                                }
                            }
                        });
                        return;
                    }
                    throw new IllegalArgumentException("Package/uid mismatch: uid=" + i3 + " package=" + string);
                case 2:
                    final ServiceBinderImpl serviceBinderImpl2 = this.f4870a;
                    final ServiceCallbacksCompat serviceCallbacksCompat2 = new ServiceCallbacksCompat(message.replyTo);
                    MediaBrowserServiceCompat.this.f4790f.m3310a(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.2
                        @Override // java.lang.Runnable
                        public void run() {
                            ConnectionRecord remove = MediaBrowserServiceCompat.this.f4789e.remove(serviceCallbacksCompat2.asBinder());
                            if (remove != null) {
                                remove.f4804d.asBinder().unlinkToDeath(remove, 0);
                            }
                        }
                    });
                    return;
                case 3:
                    final Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.m195a(bundle2);
                    final ServiceBinderImpl serviceBinderImpl3 = this.f4870a;
                    final String string2 = data.getString("data_media_item_id");
                    final IBinder m1571a = BundleCompat.m1571a(data, "data_callback_token");
                    final ServiceCallbacksCompat serviceCallbacksCompat3 = new ServiceCallbacksCompat(message.replyTo);
                    MediaBrowserServiceCompat.this.f4790f.m3310a(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.3
                        @Override // java.lang.Runnable
                        public void run() {
                            ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.f4789e.get(serviceCallbacksCompat3.asBinder());
                            if (connectionRecord == null) {
                                StringBuilder m24u = C0000a.m24u("addSubscription for callback that isn't registered id=");
                                m24u.append(string2);
                                Log.w("MBServiceCompat", m24u.toString());
                                return;
                            }
                            MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                            String str = string2;
                            IBinder iBinder = m1571a;
                            Bundle bundle3 = bundle2;
                            Objects.requireNonNull(mediaBrowserServiceCompat2);
                            List<Pair<IBinder, Bundle>> list = connectionRecord.f4805e.get(str);
                            if (list == null) {
                                list = new ArrayList<>();
                            }
                            for (Pair<IBinder, Bundle> pair : list) {
                                if (iBinder == pair.f3552a && MediaBrowserCompatUtils.m3295a(bundle3, pair.f3553b)) {
                                    return;
                                }
                            }
                            list.add(new Pair<>(iBinder, bundle3));
                            connectionRecord.f4805e.put(str, list);
                            mediaBrowserServiceCompat2.m3299d(str, connectionRecord, bundle3, null);
                        }
                    });
                    return;
                case 4:
                    final ServiceBinderImpl serviceBinderImpl4 = this.f4870a;
                    final String string3 = data.getString("data_media_item_id");
                    final IBinder m1571a2 = BundleCompat.m1571a(data, "data_callback_token");
                    final ServiceCallbacksCompat serviceCallbacksCompat4 = new ServiceCallbacksCompat(message.replyTo);
                    MediaBrowserServiceCompat.this.f4790f.m3310a(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.4
                        @Override // java.lang.Runnable
                        public void run() {
                            ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.f4789e.get(serviceCallbacksCompat4.asBinder());
                            if (connectionRecord == null) {
                                StringBuilder m24u = C0000a.m24u("removeSubscription for callback that isn't registered id=");
                                m24u.append(string3);
                                Log.w("MBServiceCompat", m24u.toString());
                                return;
                            }
                            MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                            String str = string3;
                            IBinder iBinder = m1571a2;
                            Objects.requireNonNull(mediaBrowserServiceCompat2);
                            boolean z2 = false;
                            if (iBinder != null) {
                                List<Pair<IBinder, Bundle>> list = connectionRecord.f4805e.get(str);
                                if (list != null) {
                                    Iterator<Pair<IBinder, Bundle>> it = list.iterator();
                                    while (it.hasNext()) {
                                        if (iBinder == it.next().f3552a) {
                                            it.remove();
                                            z2 = true;
                                        }
                                    }
                                    if (list.size() == 0) {
                                        connectionRecord.f4805e.remove(str);
                                    }
                                }
                            } else if (connectionRecord.f4805e.remove(str) != null) {
                                z2 = true;
                            }
                            if (z2) {
                                return;
                            }
                            StringBuilder m24u2 = C0000a.m24u("removeSubscription called for ");
                            m24u2.append(string3);
                            m24u2.append(" which is not subscribed");
                            Log.w("MBServiceCompat", m24u2.toString());
                        }
                    });
                    return;
                case 5:
                    final ServiceBinderImpl serviceBinderImpl5 = this.f4870a;
                    final String string4 = data.getString("data_media_item_id");
                    final ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                    final ServiceCallbacksCompat serviceCallbacksCompat5 = new ServiceCallbacksCompat(message.replyTo);
                    Objects.requireNonNull(serviceBinderImpl5);
                    if (TextUtils.isEmpty(string4) || resultReceiver == null) {
                        return;
                    }
                    MediaBrowserServiceCompat.this.f4790f.m3310a(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.5
                        @Override // java.lang.Runnable
                        public void run() {
                            if (MediaBrowserServiceCompat.this.f4789e.get(serviceCallbacksCompat5.asBinder()) == null) {
                                StringBuilder m24u = C0000a.m24u("getMediaItem for callback that isn't registered id=");
                                m24u.append(string4);
                                Log.w("MBServiceCompat", m24u.toString());
                                return;
                            }
                            MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                            String str = string4;
                            ResultReceiver resultReceiver2 = resultReceiver;
                            Objects.requireNonNull(mediaBrowserServiceCompat2);
                            Result<MediaBrowserCompat.MediaItem> result = new Result<MediaBrowserCompat.MediaItem>(mediaBrowserServiceCompat2, str, resultReceiver2) { // from class: androidx.media.MediaBrowserServiceCompat.2

                                /* renamed from: e */
                                public final /* synthetic */ ResultReceiver f4796e;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(str);
                                    this.f4796e = resultReceiver2;
                                }

                                @Override // androidx.media.MediaBrowserServiceCompat.Result
                                /* renamed from: b */
                                public void mo3300b(@Nullable MediaBrowserCompat.MediaItem mediaItem) {
                                    MediaBrowserCompat.MediaItem mediaItem2 = mediaItem;
                                    if ((this.f4828d & 2) != 0) {
                                        this.f4796e.m300c(-1, null);
                                        return;
                                    }
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putParcelable("media_item", mediaItem2);
                                    this.f4796e.m300c(0, bundle3);
                                }
                            };
                            result.f4828d = 2;
                            result.m3305c(null);
                            if (!result.m3304a()) {
                                throw new IllegalStateException(C0000a.m14k("onLoadItem must call detach() or sendResult() before returning for id=", str));
                            }
                        }
                    });
                    return;
                case 6:
                    final Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.m195a(bundle3);
                    final ServiceBinderImpl serviceBinderImpl6 = this.f4870a;
                    final ServiceCallbacksCompat serviceCallbacksCompat6 = new ServiceCallbacksCompat(message.replyTo);
                    final String string5 = data.getString("data_package_name");
                    final int i5 = data.getInt("data_calling_pid");
                    final int i6 = data.getInt("data_calling_uid");
                    MediaBrowserServiceCompat.this.f4790f.m3310a(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.6
                        @Override // java.lang.Runnable
                        public void run() {
                            ConnectionRecord connectionRecord;
                            IBinder asBinder = serviceCallbacksCompat6.asBinder();
                            MediaBrowserServiceCompat.this.f4789e.remove(asBinder);
                            Iterator<ConnectionRecord> it = MediaBrowserServiceCompat.this.f4788d.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                ConnectionRecord next = it.next();
                                if (next.f4803c == i6) {
                                    connectionRecord = (TextUtils.isEmpty(string5) || i5 <= 0) ? MediaBrowserServiceCompat.this.new ConnectionRecord(next.f4801a, next.f4802b, next.f4803c, bundle3, serviceCallbacksCompat6) : null;
                                    it.remove();
                                }
                            }
                            if (connectionRecord == null) {
                                connectionRecord = MediaBrowserServiceCompat.this.new ConnectionRecord(string5, i5, i6, bundle3, serviceCallbacksCompat6);
                            }
                            MediaBrowserServiceCompat.this.f4789e.put(asBinder, connectionRecord);
                            try {
                                asBinder.linkToDeath(connectionRecord, 0);
                            } catch (RemoteException unused) {
                                Log.w("MBServiceCompat", "IBinder is already dead.");
                            }
                        }
                    });
                    return;
                case 7:
                    final ServiceBinderImpl serviceBinderImpl7 = this.f4870a;
                    final ServiceCallbacksCompat serviceCallbacksCompat7 = new ServiceCallbacksCompat(message.replyTo);
                    MediaBrowserServiceCompat.this.f4790f.m3310a(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.7
                        @Override // java.lang.Runnable
                        public void run() {
                            IBinder asBinder = serviceCallbacksCompat7.asBinder();
                            ConnectionRecord remove = MediaBrowserServiceCompat.this.f4789e.remove(asBinder);
                            if (remove != null) {
                                asBinder.unlinkToDeath(remove, 0);
                            }
                        }
                    });
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.m195a(bundle4);
                    ServiceBinderImpl serviceBinderImpl8 = this.f4870a;
                    String string6 = data.getString("data_search_query");
                    ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    ServiceCallbacksCompat serviceCallbacksCompat8 = new ServiceCallbacksCompat(message.replyTo);
                    Objects.requireNonNull(serviceBinderImpl8);
                    if (TextUtils.isEmpty(string6) || resultReceiver2 == null) {
                        return;
                    }
                    MediaBrowserServiceCompat.this.f4790f.m3310a(new Runnable(serviceCallbacksCompat8, string6, bundle4, resultReceiver2) { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.8

                        /* renamed from: b */
                        public final /* synthetic */ ServiceCallbacks f4860b;

                        /* renamed from: c */
                        public final /* synthetic */ String f4861c;

                        /* renamed from: d */
                        public final /* synthetic */ ResultReceiver f4862d;

                        {
                            this.f4862d = resultReceiver2;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            if (MediaBrowserServiceCompat.this.f4789e.get(this.f4860b.asBinder()) == null) {
                                StringBuilder m24u = C0000a.m24u("search for callback that isn't registered query=");
                                m24u.append(this.f4861c);
                                Log.w("MBServiceCompat", m24u.toString());
                                return;
                            }
                            MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                            String str = this.f4861c;
                            ResultReceiver resultReceiver3 = this.f4862d;
                            Objects.requireNonNull(mediaBrowserServiceCompat2);
                            Result<List<MediaBrowserCompat.MediaItem>> result = new Result<List<MediaBrowserCompat.MediaItem>>(mediaBrowserServiceCompat2, str, resultReceiver3) { // from class: androidx.media.MediaBrowserServiceCompat.3

                                /* renamed from: e */
                                public final /* synthetic */ ResultReceiver f4797e;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(str);
                                    this.f4797e = resultReceiver3;
                                }

                                @Override // androidx.media.MediaBrowserServiceCompat.Result
                                /* renamed from: b */
                                public void mo3300b(@Nullable List<MediaBrowserCompat.MediaItem> list) {
                                    List<MediaBrowserCompat.MediaItem> list2 = list;
                                    if ((this.f4828d & 4) != 0 || list2 == null) {
                                        this.f4797e.m300c(-1, null);
                                        return;
                                    }
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putParcelableArray("search_results", (Parcelable[]) list2.toArray(new MediaBrowserCompat.MediaItem[0]));
                                    this.f4797e.m300c(0, bundle5);
                                }
                            };
                            result.f4828d = 4;
                            result.m3305c(null);
                            if (!result.m3304a()) {
                                throw new IllegalStateException(C0000a.m14k("onSearch must call detach() or sendResult() before returning for query=", str));
                            }
                        }
                    });
                    return;
                case 9:
                    final Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.m195a(bundle5);
                    final ServiceBinderImpl serviceBinderImpl9 = this.f4870a;
                    final String string7 = data.getString("data_custom_action");
                    final ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    final ServiceCallbacksCompat serviceCallbacksCompat9 = new ServiceCallbacksCompat(message.replyTo);
                    Objects.requireNonNull(serviceBinderImpl9);
                    if (TextUtils.isEmpty(string7) || resultReceiver3 == null) {
                        return;
                    }
                    MediaBrowserServiceCompat.this.f4790f.m3310a(new Runnable() { // from class: androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.9
                        /* JADX WARN: Type inference failed for: r4v0, types: [androidx.media.MediaBrowserServiceCompat$4, androidx.media.MediaBrowserServiceCompat$Result] */
                        @Override // java.lang.Runnable
                        public void run() {
                            if (MediaBrowserServiceCompat.this.f4789e.get(serviceCallbacksCompat9.asBinder()) == null) {
                                StringBuilder m24u = C0000a.m24u("sendCustomAction for callback that isn't registered action=");
                                m24u.append(string7);
                                m24u.append(", extras=");
                                m24u.append(bundle5);
                                Log.w("MBServiceCompat", m24u.toString());
                                return;
                            }
                            MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                            String str = string7;
                            Bundle bundle6 = bundle5;
                            ResultReceiver resultReceiver4 = resultReceiver3;
                            Objects.requireNonNull(mediaBrowserServiceCompat2);
                            ?? r4 = new Result<Bundle>(mediaBrowserServiceCompat2, str, resultReceiver4) { // from class: androidx.media.MediaBrowserServiceCompat.4

                                /* renamed from: e */
                                public final /* synthetic */ ResultReceiver f4798e;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(str);
                                    this.f4798e = resultReceiver4;
                                }

                                @Override // androidx.media.MediaBrowserServiceCompat.Result
                                /* renamed from: b */
                                public void mo3300b(@Nullable Bundle bundle7) {
                                    this.f4798e.m300c(0, bundle7);
                                }

                                /* renamed from: d */
                                public void m3301d(@Nullable Bundle bundle7) {
                                    this.f4798e.m300c(-1, bundle7);
                                }
                            };
                            if (r4.f4826b || r4.f4827c) {
                                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + ((Object) str));
                            }
                            r4.f4827c = true;
                            r4.m3301d(null);
                            if (r4.m3304a()) {
                                return;
                            }
                            throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle6);
                        }
                    });
                    return;
                default:
                    Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                    return;
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j2) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j2);
        }
    }

    /* renamed from: a */
    public List<MediaBrowserCompat.MediaItem> m3296a(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i2 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i3 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i2 == -1 && i3 == -1) {
            return list;
        }
        int i4 = i3 * i2;
        int i5 = i4 + i3;
        if (i2 < 0 || i3 < 1 || i4 >= list.size()) {
            return Collections.emptyList();
        }
        if (i5 > list.size()) {
            i5 = list.size();
        }
        return list.subList(i4, i5);
    }

    @Nullable
    /* renamed from: b */
    public abstract BrowserRoot m3297b(@NonNull String str, int i2, @Nullable Bundle bundle);

    /* renamed from: c */
    public abstract void m3298c(@NonNull String str, @NonNull Result<List<MediaBrowserCompat.MediaItem>> result);

    /* renamed from: d */
    public void m3299d(final String str, final ConnectionRecord connectionRecord, final Bundle bundle, final Bundle bundle2) {
        Result<List<MediaBrowserCompat.MediaItem>> result = new Result<List<MediaBrowserCompat.MediaItem>>(str) { // from class: androidx.media.MediaBrowserServiceCompat.1
            @Override // androidx.media.MediaBrowserServiceCompat.Result
            /* renamed from: b */
            public void mo3300b(@Nullable List<MediaBrowserCompat.MediaItem> list) {
                List<MediaBrowserCompat.MediaItem> list2 = list;
                if (MediaBrowserServiceCompat.this.f4789e.get(connectionRecord.f4804d.asBinder()) != connectionRecord) {
                    if (MediaBrowserServiceCompat.f4785g) {
                        StringBuilder m24u = C0000a.m24u("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
                        m24u.append(connectionRecord.f4801a);
                        m24u.append(" id=");
                        m24u.append(str);
                        Log.d("MBServiceCompat", m24u.toString());
                        return;
                    }
                    return;
                }
                if ((this.f4828d & 1) != 0) {
                    list2 = MediaBrowserServiceCompat.this.m3296a(list2, bundle);
                }
                try {
                    connectionRecord.f4804d.mo3307a(str, list2, bundle, bundle2);
                } catch (RemoteException unused) {
                    StringBuilder m24u2 = C0000a.m24u("Calling onLoadChildren() failed for id=");
                    m24u2.append(str);
                    m24u2.append(" package=");
                    m24u2.append(connectionRecord.f4801a);
                    Log.w("MBServiceCompat", m24u2.toString());
                }
            }
        };
        if (bundle == null) {
            m3298c(str, result);
        } else {
            result.f4828d = 1;
            m3298c(str, result);
        }
        if (!result.m3304a()) {
            throw new IllegalStateException(C0000a.m21r(C0000a.m24u("onLoadChildren must call detach() or sendResult() before returning for package="), connectionRecord.f4801a, " id=", str));
        }
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f4786b.mo3303b(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            this.f4786b = new MediaBrowserServiceImplApi28(this);
        } else if (i2 >= 26) {
            this.f4786b = new MediaBrowserServiceImplApi26();
        } else if (i2 >= 23) {
            this.f4786b = new MediaBrowserServiceImplApi23();
        } else {
            this.f4786b = new MediaBrowserServiceImplApi21();
        }
        this.f4786b.mo3302a();
    }
}
