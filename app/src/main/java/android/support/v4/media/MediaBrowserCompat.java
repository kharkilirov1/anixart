package android.support.v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.app.BundleCompat;
import androidx.media.MediaBrowserCompatUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class MediaBrowserCompat {

    /* renamed from: b */
    public static final boolean f10b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a */
    public final MediaBrowserImpl f11a;

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static MediaDescription m67a(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getDescription();
        }

        @DoNotInline
        /* renamed from: b */
        public static int m68b(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getFlags();
        }
    }

    public static class CallbackHandler extends Handler {

        /* renamed from: a */
        public final WeakReference<MediaBrowserServiceCallbackImpl> f12a;

        /* renamed from: b */
        public WeakReference<Messenger> f13b;

        public CallbackHandler(MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl) {
            this.f12a = new WeakReference<>(mediaBrowserServiceCallbackImpl);
        }

        /* renamed from: a */
        public void m69a(Messenger messenger) {
            this.f13b = new WeakReference<>(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            WeakReference<Messenger> weakReference = this.f13b;
            if (weakReference == null || weakReference.get() == null || this.f12a.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.m195a(data);
            MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl = this.f12a.get();
            Messenger messenger = this.f13b.get();
            try {
                int i2 = message.what;
                if (i2 == 1) {
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.m195a(bundle);
                    mediaBrowserServiceCallbackImpl.mo80c(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                } else if (i2 == 2) {
                    mediaBrowserServiceCallbackImpl.mo82g(messenger);
                } else if (i2 != 3) {
                    Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                } else {
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.m195a(bundle2);
                    Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                    MediaSessionCompat.m195a(bundle3);
                    mediaBrowserServiceCallbackImpl.mo81d(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                if (message.what == 1) {
                    mediaBrowserServiceCallbackImpl.mo82g(messenger);
                }
            }
        }
    }

    public static class ConnectionCallback {

        /* renamed from: a */
        public final MediaBrowser.ConnectionCallback f14a = new ConnectionCallbackApi21();

        /* renamed from: b */
        public ConnectionCallbackInternal f15b;

        @RequiresApi
        public class ConnectionCallbackApi21 extends MediaBrowser.ConnectionCallback {
            public ConnectionCallbackApi21() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnected() {
                ConnectionCallbackInternal connectionCallbackInternal = ConnectionCallback.this.f15b;
                if (connectionCallbackInternal != null) {
                    connectionCallbackInternal.mo74h();
                }
                ConnectionCallback.this.mo70a();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionFailed() {
                ConnectionCallbackInternal connectionCallbackInternal = ConnectionCallback.this.f15b;
                if (connectionCallbackInternal != null) {
                    connectionCallbackInternal.mo75i();
                }
                ConnectionCallback.this.mo71b();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionSuspended() {
                ConnectionCallbackInternal connectionCallbackInternal = ConnectionCallback.this.f15b;
                if (connectionCallbackInternal != null) {
                    connectionCallbackInternal.mo73e();
                }
                ConnectionCallback.this.mo72c();
            }
        }

        public interface ConnectionCallbackInternal {
            /* renamed from: e */
            void mo73e();

            /* renamed from: h */
            void mo74h();

            /* renamed from: i */
            void mo75i();
        }

        /* renamed from: a */
        public void mo70a() {
        }

        /* renamed from: b */
        public void mo71b() {
        }

        /* renamed from: c */
        public void mo72c() {
        }
    }

    public static abstract class CustomActionCallback {
    }

    public static class CustomActionResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        /* renamed from: a */
        public void mo76a(int i2, Bundle bundle) {
        }
    }

    public static abstract class ItemCallback {

        @RequiresApi
        public class ItemCallbackApi23 extends MediaBrowser.ItemCallback {
            public ItemCallbackApi23() {
            }

            @Override // android.media.browse.MediaBrowser.ItemCallback
            public void onError(@NonNull String str) {
                Objects.requireNonNull(ItemCallback.this);
            }

            @Override // android.media.browse.MediaBrowser.ItemCallback
            public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
                ItemCallback itemCallback = ItemCallback.this;
                MediaItem.m89a(mediaItem);
                Objects.requireNonNull(itemCallback);
            }
        }

        public ItemCallback() {
            if (Build.VERSION.SDK_INT >= 23) {
                new ItemCallbackApi23();
            }
        }
    }

    public static class ItemReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        /* renamed from: a */
        public void mo76a(int i2, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.m197j(bundle);
            }
            if (i2 != 0 || bundle == null || !bundle.containsKey("media_item")) {
                Objects.requireNonNull(null);
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable != null && !(parcelable instanceof MediaItem)) {
                Objects.requireNonNull(null);
                throw null;
            }
            Objects.requireNonNull(null);
            throw null;
        }
    }

    public interface MediaBrowserImpl {
        @NonNull
        /* renamed from: a */
        MediaSessionCompat.Token mo77a();

        /* renamed from: b */
        void mo78b();

        /* renamed from: f */
        void mo79f();
    }

    @RequiresApi
    public static class MediaBrowserImplApi21 implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl, ConnectionCallback.ConnectionCallbackInternal {

        /* renamed from: a */
        public final Context f18a;

        /* renamed from: b */
        public final MediaBrowser f19b;

        /* renamed from: c */
        public final Bundle f20c;

        /* renamed from: d */
        public final CallbackHandler f21d = new CallbackHandler(this);

        /* renamed from: e */
        public final ArrayMap<String, Subscription> f22e = new ArrayMap<>();

        /* renamed from: f */
        public ServiceBinderWrapper f23f;

        /* renamed from: g */
        public Messenger f24g;

        /* renamed from: h */
        public MediaSessionCompat.Token f25h;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$1 */
        class RunnableC00021 implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(null);
                throw null;
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$2 */
        class RunnableC00032 implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(null);
                throw null;
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$3 */
        class RunnableC00043 implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(null);
                throw null;
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$4 */
        class RunnableC00054 implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(null);
                throw null;
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$5 */
        class RunnableC00065 implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(null);
                throw null;
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$6 */
        class RunnableC00076 implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(null);
                throw null;
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$7 */
        class RunnableC00087 implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(null);
                throw null;
            }
        }

        public MediaBrowserImplApi21(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            this.f18a = context;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            this.f20c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            connectionCallback.f15b = this;
            this.f19b = new MediaBrowser(context, componentName, connectionCallback.f14a, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        @NonNull
        /* renamed from: a */
        public MediaSessionCompat.Token mo77a() {
            if (this.f25h == null) {
                this.f25h = MediaSessionCompat.Token.m268a(this.f19b.getSessionToken(), null);
            }
            return this.f25h;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        /* renamed from: b */
        public void mo78b() {
            Messenger messenger;
            ServiceBinderWrapper serviceBinderWrapper = this.f23f;
            if (serviceBinderWrapper != null && (messenger = this.f24g) != null) {
                try {
                    serviceBinderWrapper.m91a(7, null, messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            this.f19b.disconnect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        /* renamed from: c */
        public void mo80c(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        /* renamed from: d */
        public void mo81d(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (this.f24g != messenger) {
                return;
            }
            Subscription subscription = this.f22e.get(str);
            if (subscription != null) {
                subscription.m92a(bundle);
            } else if (MediaBrowserCompat.f10b) {
                Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        /* renamed from: e */
        public void mo73e() {
            this.f23f = null;
            this.f24g = null;
            this.f25h = null;
            this.f21d.m69a(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        /* renamed from: f */
        public void mo79f() {
            this.f19b.connect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        /* renamed from: g */
        public void mo82g(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        /* renamed from: h */
        public void mo74h() {
            try {
                Bundle extras = this.f19b.getExtras();
                if (extras == null) {
                    return;
                }
                extras.getInt("extra_service_version", 0);
                IBinder m1571a = BundleCompat.m1571a(extras, "extra_messenger");
                if (m1571a != null) {
                    this.f23f = new ServiceBinderWrapper(m1571a, this.f20c);
                    Messenger messenger = new Messenger(this.f21d);
                    this.f24g = messenger;
                    this.f21d.m69a(messenger);
                    try {
                        ServiceBinderWrapper serviceBinderWrapper = this.f23f;
                        Context context = this.f18a;
                        Messenger messenger2 = this.f24g;
                        Objects.requireNonNull(serviceBinderWrapper);
                        Bundle bundle = new Bundle();
                        bundle.putString("data_package_name", context.getPackageName());
                        bundle.putInt("data_calling_pid", Process.myPid());
                        bundle.putBundle("data_root_hints", serviceBinderWrapper.f49b);
                        serviceBinderWrapper.m91a(6, bundle, messenger2);
                    } catch (RemoteException unused) {
                        Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                    }
                }
                IMediaSession m188i = IMediaSession.Stub.m188i(BundleCompat.m1571a(extras, "extra_session_binder"));
                if (m188i != null) {
                    this.f25h = MediaSessionCompat.Token.m268a(this.f19b.getSessionToken(), m188i);
                }
            } catch (IllegalStateException e2) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e2);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        /* renamed from: i */
        public void mo75i() {
        }
    }

    @RequiresApi
    public static class MediaBrowserImplApi23 extends MediaBrowserImplApi21 {
        public MediaBrowserImplApi23(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }
    }

    @RequiresApi
    public static class MediaBrowserImplApi26 extends MediaBrowserImplApi23 {
        public MediaBrowserImplApi26(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }
    }

    public static class MediaBrowserImplBase implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl {

        /* renamed from: a */
        public final Context f26a;

        /* renamed from: b */
        public final ComponentName f27b;

        /* renamed from: c */
        public final ConnectionCallback f28c;

        /* renamed from: d */
        public final Bundle f29d;

        /* renamed from: e */
        public final CallbackHandler f30e;

        /* renamed from: f */
        public final ArrayMap<String, Subscription> f31f;

        /* renamed from: g */
        public int f32g;

        /* renamed from: h */
        public MediaServiceConnection f33h;

        /* renamed from: i */
        public ServiceBinderWrapper f34i;

        /* renamed from: j */
        public Messenger f35j;

        /* renamed from: k */
        public String f36k;

        /* renamed from: l */
        public MediaSessionCompat.Token f37l;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$3 */
        class RunnableC00113 implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(null);
                throw null;
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$4 */
        class RunnableC00124 implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(null);
                throw null;
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$5 */
        class RunnableC00135 implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(null);
                throw null;
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaBrowserImplBase$6 */
        class RunnableC00146 implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(null);
                throw null;
            }
        }

        public class MediaServiceConnection implements ServiceConnection {
            public MediaServiceConnection() {
            }

            /* renamed from: a */
            public boolean m87a(String str) {
                int i2;
                MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
                if (mediaBrowserImplBase.f33h == this && (i2 = mediaBrowserImplBase.f32g) != 0 && i2 != 1) {
                    return true;
                }
                int i3 = mediaBrowserImplBase.f32g;
                if (i3 == 0 || i3 == 1) {
                    return false;
                }
                StringBuilder m27x = C0000a.m27x(str, " for ");
                m27x.append(MediaBrowserImplBase.this.f27b);
                m27x.append(" with mServiceConnection=");
                m27x.append(MediaBrowserImplBase.this.f33h);
                m27x.append(" this=");
                m27x.append(this);
                Log.i("MediaBrowserCompat", m27x.toString());
                return false;
            }

            /* renamed from: b */
            public final void m88b(Runnable runnable) {
                if (Thread.currentThread() == MediaBrowserImplBase.this.f30e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    MediaBrowserImplBase.this.f30e.post(runnable);
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
                m88b(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection.1
                    @Override // java.lang.Runnable
                    public void run() {
                        boolean z = MediaBrowserCompat.f10b;
                        if (z) {
                            StringBuilder m24u = C0000a.m24u("MediaServiceConnection.onServiceConnected name=");
                            m24u.append(componentName);
                            m24u.append(" binder=");
                            m24u.append(iBinder);
                            Log.d("MediaBrowserCompat", m24u.toString());
                            MediaBrowserImplBase.this.m84e();
                        }
                        if (MediaServiceConnection.this.m87a("onServiceConnected")) {
                            MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
                            mediaBrowserImplBase.f34i = new ServiceBinderWrapper(iBinder, mediaBrowserImplBase.f29d);
                            MediaBrowserImplBase.this.f35j = new Messenger(MediaBrowserImplBase.this.f30e);
                            MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;
                            mediaBrowserImplBase2.f30e.m69a(mediaBrowserImplBase2.f35j);
                            MediaBrowserImplBase.this.f32g = 2;
                            if (z) {
                                try {
                                    Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                                    MediaBrowserImplBase.this.m84e();
                                } catch (RemoteException unused) {
                                    StringBuilder m24u2 = C0000a.m24u("RemoteException during connect for ");
                                    m24u2.append(MediaBrowserImplBase.this.f27b);
                                    Log.w("MediaBrowserCompat", m24u2.toString());
                                    if (MediaBrowserCompat.f10b) {
                                        Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                                        MediaBrowserImplBase.this.m84e();
                                        return;
                                    }
                                    return;
                                }
                            }
                            MediaBrowserImplBase mediaBrowserImplBase3 = MediaBrowserImplBase.this;
                            ServiceBinderWrapper serviceBinderWrapper = mediaBrowserImplBase3.f34i;
                            Context context = mediaBrowserImplBase3.f26a;
                            Messenger messenger = mediaBrowserImplBase3.f35j;
                            Objects.requireNonNull(serviceBinderWrapper);
                            Bundle bundle = new Bundle();
                            bundle.putString("data_package_name", context.getPackageName());
                            bundle.putInt("data_calling_pid", Process.myPid());
                            bundle.putBundle("data_root_hints", serviceBinderWrapper.f49b);
                            serviceBinderWrapper.m91a(1, bundle, messenger);
                        }
                    }
                });
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(final ComponentName componentName) {
                m88b(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MediaBrowserCompat.f10b) {
                            StringBuilder m24u = C0000a.m24u("MediaServiceConnection.onServiceDisconnected name=");
                            m24u.append(componentName);
                            m24u.append(" this=");
                            m24u.append(this);
                            m24u.append(" mServiceConnection=");
                            m24u.append(MediaBrowserImplBase.this.f33h);
                            Log.d("MediaBrowserCompat", m24u.toString());
                            MediaBrowserImplBase.this.m84e();
                        }
                        if (MediaServiceConnection.this.m87a("onServiceDisconnected")) {
                            MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
                            mediaBrowserImplBase.f34i = null;
                            mediaBrowserImplBase.f35j = null;
                            mediaBrowserImplBase.f30e.m69a(null);
                            MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;
                            mediaBrowserImplBase2.f32g = 4;
                            mediaBrowserImplBase2.f28c.mo72c();
                        }
                    }
                });
            }
        }

        /* renamed from: i */
        public static String m83i(int i2) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? C0000a.m7d("UNKNOWN/", i2) : "CONNECT_STATE_SUSPENDED" : "CONNECT_STATE_CONNECTED" : "CONNECT_STATE_CONNECTING" : "CONNECT_STATE_DISCONNECTED" : "CONNECT_STATE_DISCONNECTING";
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        @NonNull
        /* renamed from: a */
        public MediaSessionCompat.Token mo77a() {
            if (this.f32g == 3) {
                return this.f37l;
            }
            throw new IllegalStateException(C0000a.m18o(C0000a.m24u("getSessionToken() called while not connected(state="), this.f32g, ")"));
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        /* renamed from: b */
        public void mo78b() {
            this.f32g = 0;
            this.f30e.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.2
                @Override // java.lang.Runnable
                public void run() {
                    MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
                    Messenger messenger = mediaBrowserImplBase.f35j;
                    if (messenger != null) {
                        try {
                            mediaBrowserImplBase.f34i.m91a(2, null, messenger);
                        } catch (RemoteException unused) {
                            StringBuilder m24u = C0000a.m24u("RemoteException during connect for ");
                            m24u.append(MediaBrowserImplBase.this.f27b);
                            Log.w("MediaBrowserCompat", m24u.toString());
                        }
                    }
                    MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;
                    int i2 = mediaBrowserImplBase2.f32g;
                    mediaBrowserImplBase2.m85h();
                    if (i2 != 0) {
                        MediaBrowserImplBase.this.f32g = i2;
                    }
                    if (MediaBrowserCompat.f10b) {
                        Log.d("MediaBrowserCompat", "disconnect...");
                        MediaBrowserImplBase.this.m84e();
                    }
                }
            });
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        /* renamed from: c */
        public void mo80c(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (m86j(messenger, "onConnect")) {
                if (this.f32g != 2) {
                    StringBuilder m24u = C0000a.m24u("onConnect from service while mState=");
                    m24u.append(m83i(this.f32g));
                    m24u.append("... ignoring");
                    Log.w("MediaBrowserCompat", m24u.toString());
                    return;
                }
                this.f36k = str;
                this.f37l = token;
                this.f32g = 3;
                if (MediaBrowserCompat.f10b) {
                    Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                    m84e();
                }
                this.f28c.mo70a();
                try {
                    for (Map.Entry<String, Subscription> entry : this.f31f.entrySet()) {
                        String key = entry.getKey();
                        Subscription value = entry.getValue();
                        List<SubscriptionCallback> list = value.f50a;
                        List<Bundle> list2 = value.f51b;
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            ServiceBinderWrapper serviceBinderWrapper = this.f34i;
                            IBinder iBinder = list.get(i2).f52a;
                            Bundle bundle2 = list2.get(i2);
                            Messenger messenger2 = this.f35j;
                            Objects.requireNonNull(serviceBinderWrapper);
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("data_media_item_id", key);
                            BundleCompat.m1572b(bundle3, "data_callback_token", iBinder);
                            bundle3.putBundle("data_options", bundle2);
                            serviceBinderWrapper.m91a(3, bundle3, messenger2);
                        }
                    }
                } catch (RemoteException unused) {
                    Log.d("MediaBrowserCompat", "addSubscription failed with RemoteException.");
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        /* renamed from: d */
        public void mo81d(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (m86j(messenger, "onLoadChildren")) {
                boolean z = MediaBrowserCompat.f10b;
                if (z) {
                    StringBuilder m24u = C0000a.m24u("onLoadChildren for ");
                    m24u.append(this.f27b);
                    m24u.append(" id=");
                    m24u.append(str);
                    Log.d("MediaBrowserCompat", m24u.toString());
                }
                Subscription subscription = this.f31f.get(str);
                if (subscription != null) {
                    subscription.m92a(bundle);
                } else if (z) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                }
            }
        }

        /* renamed from: e */
        public void m84e() {
            Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
            Log.d("MediaBrowserCompat", "  mServiceComponent=" + this.f27b);
            Log.d("MediaBrowserCompat", "  mCallback=" + this.f28c);
            Log.d("MediaBrowserCompat", "  mRootHints=" + this.f29d);
            Log.d("MediaBrowserCompat", "  mState=" + m83i(this.f32g));
            Log.d("MediaBrowserCompat", "  mServiceConnection=" + this.f33h);
            Log.d("MediaBrowserCompat", "  mServiceBinderWrapper=" + this.f34i);
            Log.d("MediaBrowserCompat", "  mCallbacksMessenger=" + this.f35j);
            Log.d("MediaBrowserCompat", "  mRootId=" + this.f36k);
            Log.d("MediaBrowserCompat", "  mMediaSessionToken=" + this.f37l);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserImpl
        /* renamed from: f */
        public void mo79f() {
            int i2 = this.f32g;
            if (i2 != 0 && i2 != 1) {
                throw new IllegalStateException(C0000a.m20q(C0000a.m24u("connect() called while neigther disconnecting nor disconnected (state="), m83i(this.f32g), ")"));
            }
            this.f32g = 2;
            this.f30e.post(new Runnable() { // from class: android.support.v4.media.MediaBrowserCompat.MediaBrowserImplBase.1
                @Override // java.lang.Runnable
                public void run() {
                    MediaBrowserImplBase mediaBrowserImplBase = MediaBrowserImplBase.this;
                    if (mediaBrowserImplBase.f32g == 0) {
                        return;
                    }
                    mediaBrowserImplBase.f32g = 2;
                    if (MediaBrowserCompat.f10b && mediaBrowserImplBase.f33h != null) {
                        StringBuilder m24u = C0000a.m24u("mServiceConnection should be null. Instead it is ");
                        m24u.append(MediaBrowserImplBase.this.f33h);
                        throw new RuntimeException(m24u.toString());
                    }
                    if (mediaBrowserImplBase.f34i != null) {
                        StringBuilder m24u2 = C0000a.m24u("mServiceBinderWrapper should be null. Instead it is ");
                        m24u2.append(MediaBrowserImplBase.this.f34i);
                        throw new RuntimeException(m24u2.toString());
                    }
                    if (mediaBrowserImplBase.f35j != null) {
                        StringBuilder m24u3 = C0000a.m24u("mCallbacksMessenger should be null. Instead it is ");
                        m24u3.append(MediaBrowserImplBase.this.f35j);
                        throw new RuntimeException(m24u3.toString());
                    }
                    Intent intent = new Intent("android.media.browse.MediaBrowserService");
                    intent.setComponent(MediaBrowserImplBase.this.f27b);
                    MediaBrowserImplBase mediaBrowserImplBase2 = MediaBrowserImplBase.this;
                    MediaServiceConnection mediaServiceConnection = mediaBrowserImplBase2.new MediaServiceConnection();
                    mediaBrowserImplBase2.f33h = mediaServiceConnection;
                    boolean z = false;
                    try {
                        z = mediaBrowserImplBase2.f26a.bindService(intent, mediaServiceConnection, 1);
                    } catch (Exception unused) {
                        StringBuilder m24u4 = C0000a.m24u("Failed binding to service ");
                        m24u4.append(MediaBrowserImplBase.this.f27b);
                        Log.e("MediaBrowserCompat", m24u4.toString());
                    }
                    if (!z) {
                        MediaBrowserImplBase.this.m85h();
                        MediaBrowserImplBase.this.f28c.mo71b();
                    }
                    if (MediaBrowserCompat.f10b) {
                        Log.d("MediaBrowserCompat", "connect...");
                        MediaBrowserImplBase.this.m84e();
                    }
                }
            });
        }

        @Override // android.support.v4.media.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        /* renamed from: g */
        public void mo82g(Messenger messenger) {
            StringBuilder m24u = C0000a.m24u("onConnectFailed for ");
            m24u.append(this.f27b);
            Log.e("MediaBrowserCompat", m24u.toString());
            if (m86j(messenger, "onConnectFailed")) {
                if (this.f32g == 2) {
                    m85h();
                    this.f28c.mo71b();
                } else {
                    StringBuilder m24u2 = C0000a.m24u("onConnect from service while mState=");
                    m24u2.append(m83i(this.f32g));
                    m24u2.append("... ignoring");
                    Log.w("MediaBrowserCompat", m24u2.toString());
                }
            }
        }

        /* renamed from: h */
        public void m85h() {
            MediaServiceConnection mediaServiceConnection = this.f33h;
            if (mediaServiceConnection != null) {
                this.f26a.unbindService(mediaServiceConnection);
            }
            this.f32g = 1;
            this.f33h = null;
            this.f34i = null;
            this.f35j = null;
            this.f30e.m69a(null);
            this.f36k = null;
            this.f37l = null;
        }

        /* renamed from: j */
        public final boolean m86j(Messenger messenger, String str) {
            int i2;
            if (this.f35j == messenger && (i2 = this.f32g) != 0 && i2 != 1) {
                return true;
            }
            int i3 = this.f32g;
            if (i3 == 0 || i3 == 1) {
                return false;
            }
            StringBuilder m27x = C0000a.m27x(str, " for ");
            m27x.append(this.f27b);
            m27x.append(" with mCallbacksMessenger=");
            m27x.append(this.f35j);
            m27x.append(" this=");
            m27x.append(this);
            Log.i("MediaBrowserCompat", m27x.toString());
            return false;
        }
    }

    public interface MediaBrowserServiceCallbackImpl {
        /* renamed from: c */
        void mo80c(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        /* renamed from: d */
        void mo81d(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);

        /* renamed from: g */
        void mo82g(Messenger messenger);
    }

    public static abstract class SearchCallback {
    }

    public static class SearchResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        /* renamed from: a */
        public void mo76a(int i2, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.m197j(bundle);
            }
            if (i2 != 0 || bundle == null || !bundle.containsKey("search_results")) {
                Objects.requireNonNull(null);
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            if (parcelableArray == null) {
                Objects.requireNonNull(null);
                throw null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            Objects.requireNonNull(null);
            throw null;
        }
    }

    public static class ServiceBinderWrapper {

        /* renamed from: a */
        public Messenger f48a;

        /* renamed from: b */
        public Bundle f49b;

        public ServiceBinderWrapper(IBinder iBinder, Bundle bundle) {
            this.f48a = new Messenger(iBinder);
            this.f49b = bundle;
        }

        /* renamed from: a */
        public final void m91a(int i2, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i2;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f48a.send(obtain);
        }
    }

    public static class Subscription {

        /* renamed from: a */
        public final List<SubscriptionCallback> f50a = new ArrayList();

        /* renamed from: b */
        public final List<Bundle> f51b = new ArrayList();

        /* renamed from: a */
        public SubscriptionCallback m92a(Bundle bundle) {
            for (int i2 = 0; i2 < this.f51b.size(); i2++) {
                if (MediaBrowserCompatUtils.m3295a(this.f51b.get(i2), bundle)) {
                    return this.f50a.get(i2);
                }
            }
            return null;
        }
    }

    public static abstract class SubscriptionCallback {

        /* renamed from: a */
        public final IBinder f52a = new Binder();

        @RequiresApi
        public class SubscriptionCallbackApi21 extends MediaBrowser.SubscriptionCallback {
            public SubscriptionCallbackApi21() {
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(@NonNull String str, List<MediaBrowser.MediaItem> list) {
                Objects.requireNonNull(SubscriptionCallback.this);
                SubscriptionCallback subscriptionCallback = SubscriptionCallback.this;
                MediaItem.m90c(list);
                Objects.requireNonNull(subscriptionCallback);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(@NonNull String str) {
                Objects.requireNonNull(SubscriptionCallback.this);
            }
        }

        @RequiresApi
        public class SubscriptionCallbackApi26 extends SubscriptionCallbackApi21 {
            public SubscriptionCallbackApi26() {
                super();
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(@NonNull String str, @NonNull List<MediaBrowser.MediaItem> list, @NonNull Bundle bundle) {
                MediaSessionCompat.m195a(bundle);
                SubscriptionCallback subscriptionCallback = SubscriptionCallback.this;
                MediaItem.m90c(list);
                Objects.requireNonNull(subscriptionCallback);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(@NonNull String str, @NonNull Bundle bundle) {
                MediaSessionCompat.m195a(bundle);
                Objects.requireNonNull(SubscriptionCallback.this);
            }
        }

        public SubscriptionCallback() {
            if (Build.VERSION.SDK_INT >= 26) {
                new SubscriptionCallbackApi26();
            } else {
                new SubscriptionCallbackApi21();
            }
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f11a = new MediaBrowserImplApi26(context, componentName, connectionCallback, null);
        } else if (i2 >= 23) {
            this.f11a = new MediaBrowserImplApi23(context, componentName, connectionCallback, null);
        } else {
            this.f11a = new MediaBrowserImplApi21(context, componentName, connectionCallback, null);
        }
    }

    /* renamed from: a */
    public void m64a() {
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        this.f11a.mo79f();
    }

    /* renamed from: b */
    public void m65b() {
        this.f11a.mo78b();
    }

    @NonNull
    /* renamed from: c */
    public MediaSessionCompat.Token m66c() {
        return this.f11a.mo77a();
    }

    @SuppressLint
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() { // from class: android.support.v4.media.MediaBrowserCompat.MediaItem.1
            @Override // android.os.Parcelable.Creator
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public MediaItem[] newArray(int i2) {
                return new MediaItem[i2];
            }
        };

        /* renamed from: b */
        public final int f46b;

        /* renamed from: c */
        public final MediaDescriptionCompat f47c;

        public MediaItem(@NonNull MediaDescriptionCompat mediaDescriptionCompat, int i2) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.f55b)) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.f46b = i2;
            this.f47c = mediaDescriptionCompat;
        }

        /* renamed from: a */
        public static MediaItem m89a(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
            return new MediaItem(MediaDescriptionCompat.m93a(Api21Impl.m67a(mediaItem)), Api21Impl.m68b(mediaItem));
        }

        /* renamed from: c */
        public static List<MediaItem> m90c(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m89a(it.next()));
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @NonNull
        public String toString() {
            return "MediaItem{mFlags=" + this.f46b + ", mDescription=" + this.f47c + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f46b);
            ((MediaDescription) this.f47c.m94c()).writeToParcel(parcel, i2);
        }

        public MediaItem(Parcel parcel) {
            this.f46b = parcel.readInt();
            this.f47c = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
