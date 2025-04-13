package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.BundleCompat;
import androidx.core.os.BuildCompat;
import androidx.media.MediaSessionManager;
import androidx.media.VolumeProviderCompat;
import androidx.media.session.MediaButtonReceiver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.versionedparcelable.ParcelImpl;
import androidx.versionedparcelable.VersionedParcelable;
import com.yandex.mobile.ads.C4632R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public class MediaSessionCompat {

    /* renamed from: d */
    @RestrictTo
    public static final int f94d;

    /* renamed from: e */
    public static int f95e;

    /* renamed from: a */
    public final MediaSessionImpl f96a;

    /* renamed from: b */
    public final MediaControllerCompat f97b;

    /* renamed from: c */
    public final ArrayList<OnActiveChangeListener> f98c = new ArrayList<>();

    public static abstract class Callback {

        /* renamed from: d */
        public boolean f101d;

        /* renamed from: f */
        @GuardedBy
        public CallbackHandler f103f;

        /* renamed from: b */
        public final Object f99b = new Object();

        /* renamed from: c */
        public final MediaSession.Callback f100c = new MediaSessionCallbackApi21();

        /* renamed from: e */
        @GuardedBy
        public WeakReference<MediaSessionImpl> f102e = new WeakReference<>(null);

        public class CallbackHandler extends Handler {
            public CallbackHandler(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                MediaSessionImpl mediaSessionImpl;
                Callback callback;
                CallbackHandler callbackHandler;
                if (message.what == 1) {
                    synchronized (Callback.this.f99b) {
                        mediaSessionImpl = Callback.this.f102e.get();
                        callback = Callback.this;
                        callbackHandler = callback.f103f;
                    }
                    if (mediaSessionImpl == null || callback != mediaSessionImpl.mo240d() || callbackHandler == null) {
                        return;
                    }
                    mediaSessionImpl.mo245i((MediaSessionManager.RemoteUserInfo) message.obj);
                    Callback.this.m209a(mediaSessionImpl, callbackHandler);
                    mediaSessionImpl.mo245i(null);
                }
            }
        }

        @RequiresApi
        public class MediaSessionCallbackApi21 extends MediaSession.Callback {
            public MediaSessionCallbackApi21() {
            }

            /* renamed from: a */
            public final MediaSessionImplApi21 m235a() {
                MediaSessionImplApi21 mediaSessionImplApi21;
                Callback callback;
                synchronized (Callback.this.f99b) {
                    mediaSessionImplApi21 = (MediaSessionImplApi21) Callback.this.f102e.get();
                }
                if (mediaSessionImplApi21 != null) {
                    Callback callback2 = Callback.this;
                    synchronized (mediaSessionImplApi21.f111c) {
                        callback = mediaSessionImplApi21.f119k;
                    }
                    if (callback2 == callback) {
                        return mediaSessionImplApi21;
                    }
                }
                return null;
            }

            /* renamed from: b */
            public final void m236b(MediaSessionImpl mediaSessionImpl) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                String m255m = ((MediaSessionImplApi21) mediaSessionImpl).m255m();
                if (TextUtils.isEmpty(m255m)) {
                    m255m = "android.media.session.MediaController";
                }
                mediaSessionImpl.mo245i(new MediaSessionManager.RemoteUserInfo(m255m, -1, -1));
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                VersionedParcelable versionedParcelable;
                MediaSessionImplApi21 m235a = m235a();
                if (m235a == null) {
                    return;
                }
                MediaSessionCompat.m195a(bundle);
                m236b(m235a);
                try {
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        Bundle bundle2 = new Bundle();
                        Token token = m235a.f110b;
                        IMediaSession m269c = token.m269c();
                        BundleCompat.m1572b(bundle2, "android.support.v4.media.session.EXTRA_BINDER", m269c == null ? null : m269c.asBinder());
                        synchronized (token.f154b) {
                            versionedParcelable = token.f157e;
                        }
                        if (versionedParcelable != null) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putParcelable("a", new ParcelImpl(versionedParcelable));
                            bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                        }
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        Callback.this.mo210b((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        Callback.this.mo211c((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        Callback.this.mo225q((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                    } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                        Callback.this.mo212d(str, bundle, resultReceiver);
                    } else if (m235a.f115g != null) {
                        int i2 = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                        QueueItem queueItem = (i2 < 0 || i2 >= m235a.f115g.size()) ? null : m235a.f115g.get(i2);
                        if (queueItem != null) {
                            Callback.this.mo225q(queueItem.f150b);
                        }
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
                m235a.mo245i(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCustomAction(String str, Bundle bundle) {
                MediaSessionImplApi21 m235a = m235a();
                if (m235a == null) {
                    return;
                }
                MediaSessionCompat.m195a(bundle);
                m236b(m235a);
                try {
                    if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                        Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.m195a(bundle2);
                        Callback.this.mo220l(uri, bundle2);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                        Callback.this.mo221m();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                        Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.m195a(bundle3);
                        Callback.this.mo222n(string, bundle3);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                        Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.m195a(bundle4);
                        Callback.this.mo223o(string2, bundle4);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.m195a(bundle5);
                        Callback.this.mo224p(uri2, bundle5);
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        Callback.this.mo228t(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        Callback.this.mo232x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        Callback.this.mo233y(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                        Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.m195a(bundle6);
                        Callback.this.mo231w(ratingCompat, bundle6);
                    } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        Callback.this.mo229u(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                    } else {
                        Callback.this.mo213e(str, bundle);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the data.");
                }
                m235a.mo245i(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onFastForward() {
                MediaSessionImplApi21 m235a = m235a();
                if (m235a == null) {
                    return;
                }
                m236b(m235a);
                Callback.this.mo214f();
                m235a.mo245i(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public boolean onMediaButtonEvent(Intent intent) {
                MediaSessionImplApi21 m235a = m235a();
                if (m235a == null) {
                    return false;
                }
                m236b(m235a);
                boolean mo215g = Callback.this.mo215g(intent);
                m235a.mo245i(null);
                return mo215g || super.onMediaButtonEvent(intent);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPause() {
                MediaSessionImplApi21 m235a = m235a();
                if (m235a == null) {
                    return;
                }
                m236b(m235a);
                Callback.this.mo216h();
                m235a.mo245i(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlay() {
                MediaSessionImplApi21 m235a = m235a();
                if (m235a == null) {
                    return;
                }
                m236b(m235a);
                Callback.this.mo217i();
                m235a.mo245i(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromMediaId(String str, Bundle bundle) {
                MediaSessionImplApi21 m235a = m235a();
                if (m235a == null) {
                    return;
                }
                MediaSessionCompat.m195a(bundle);
                m236b(m235a);
                Callback.this.mo218j(str, bundle);
                m235a.mo245i(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromSearch(String str, Bundle bundle) {
                MediaSessionImplApi21 m235a = m235a();
                if (m235a == null) {
                    return;
                }
                MediaSessionCompat.m195a(bundle);
                m236b(m235a);
                Callback.this.mo219k(str, bundle);
                m235a.mo245i(null);
            }

            @Override // android.media.session.MediaSession.Callback
            @RequiresApi
            public void onPlayFromUri(Uri uri, Bundle bundle) {
                MediaSessionImplApi21 m235a = m235a();
                if (m235a == null) {
                    return;
                }
                MediaSessionCompat.m195a(bundle);
                m236b(m235a);
                Callback.this.mo220l(uri, bundle);
                m235a.mo245i(null);
            }

            @Override // android.media.session.MediaSession.Callback
            @RequiresApi
            public void onPrepare() {
                MediaSessionImplApi21 m235a = m235a();
                if (m235a == null) {
                    return;
                }
                m236b(m235a);
                Callback.this.mo221m();
                m235a.mo245i(null);
            }

            @Override // android.media.session.MediaSession.Callback
            @RequiresApi
            public void onPrepareFromMediaId(String str, Bundle bundle) {
                MediaSessionImplApi21 m235a = m235a();
                if (m235a == null) {
                    return;
                }
                MediaSessionCompat.m195a(bundle);
                m236b(m235a);
                Callback.this.mo222n(str, bundle);
                m235a.mo245i(null);
            }

            @Override // android.media.session.MediaSession.Callback
            @RequiresApi
            public void onPrepareFromSearch(String str, Bundle bundle) {
                MediaSessionImplApi21 m235a = m235a();
                if (m235a == null) {
                    return;
                }
                MediaSessionCompat.m195a(bundle);
                m236b(m235a);
                Callback.this.mo223o(str, bundle);
                m235a.mo245i(null);
            }

            @Override // android.media.session.MediaSession.Callback
            @RequiresApi
            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                MediaSessionImplApi21 m235a = m235a();
                if (m235a == null) {
                    return;
                }
                MediaSessionCompat.m195a(bundle);
                m236b(m235a);
                Callback.this.mo224p(uri, bundle);
                m235a.mo245i(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onRewind() {
                MediaSessionImplApi21 m235a = m235a();
                if (m235a == null) {
                    return;
                }
                m236b(m235a);
                Callback.this.mo226r();
                m235a.mo245i(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSeekTo(long j2) {
                MediaSessionImplApi21 m235a = m235a();
                if (m235a == null) {
                    return;
                }
                m236b(m235a);
                Callback.this.mo227s(j2);
                m235a.mo245i(null);
            }

            @Override // android.media.session.MediaSession.Callback
            @RequiresApi
            public void onSetPlaybackSpeed(float f2) {
                MediaSessionImplApi21 m235a = m235a();
                if (m235a == null) {
                    return;
                }
                m236b(m235a);
                Callback.this.mo229u(f2);
                m235a.mo245i(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetRating(Rating rating) {
                MediaSessionImplApi21 m235a = m235a();
                if (m235a == null) {
                    return;
                }
                m236b(m235a);
                Callback.this.mo230v(RatingCompat.m120a(rating));
                m235a.mo245i(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToNext() {
                MediaSessionImplApi21 m235a = m235a();
                if (m235a == null) {
                    return;
                }
                m236b(m235a);
                Callback.this.mo234z();
                m235a.mo245i(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToPrevious() {
                MediaSessionImplApi21 m235a = m235a();
                if (m235a == null) {
                    return;
                }
                m236b(m235a);
                Callback.this.mo205A();
                m235a.mo245i(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToQueueItem(long j2) {
                MediaSessionImplApi21 m235a = m235a();
                if (m235a == null) {
                    return;
                }
                m236b(m235a);
                Callback.this.mo206B(j2);
                m235a.mo245i(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onStop() {
                MediaSessionImplApi21 m235a = m235a();
                if (m235a == null) {
                    return;
                }
                m236b(m235a);
                Callback.this.mo207C();
                m235a.mo245i(null);
            }
        }

        /* renamed from: A */
        public void mo205A() {
        }

        /* renamed from: B */
        public void mo206B(long j2) {
        }

        /* renamed from: C */
        public void mo207C() {
        }

        /* renamed from: D */
        public void m208D(MediaSessionImpl mediaSessionImpl, Handler handler) {
            synchronized (this.f99b) {
                this.f102e = new WeakReference<>(mediaSessionImpl);
                CallbackHandler callbackHandler = this.f103f;
                CallbackHandler callbackHandler2 = null;
                if (callbackHandler != null) {
                    callbackHandler.removeCallbacksAndMessages(null);
                }
                if (mediaSessionImpl != null && handler != null) {
                    callbackHandler2 = new CallbackHandler(handler.getLooper());
                }
                this.f103f = callbackHandler2;
            }
        }

        /* renamed from: a */
        public void m209a(MediaSessionImpl mediaSessionImpl, Handler handler) {
            if (this.f101d) {
                this.f101d = false;
                handler.removeMessages(1);
                PlaybackStateCompat playbackState = mediaSessionImpl.getPlaybackState();
                long j2 = playbackState == null ? 0L : playbackState.f167f;
                boolean z = playbackState != null && playbackState.f163b == 3;
                boolean z2 = (516 & j2) != 0;
                boolean z3 = (j2 & 514) != 0;
                if (z && z3) {
                    mo216h();
                } else {
                    if (z || !z2) {
                        return;
                    }
                    mo217i();
                }
            }
        }

        /* renamed from: b */
        public void mo210b(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        /* renamed from: c */
        public void mo211c(MediaDescriptionCompat mediaDescriptionCompat, int i2) {
        }

        /* renamed from: d */
        public void mo212d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        /* renamed from: e */
        public void mo213e(String str, Bundle bundle) {
        }

        /* renamed from: f */
        public void mo214f() {
        }

        /* renamed from: g */
        public boolean mo215g(Intent intent) {
            MediaSessionImpl mediaSessionImpl;
            CallbackHandler callbackHandler;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.f99b) {
                mediaSessionImpl = this.f102e.get();
                callbackHandler = this.f103f;
            }
            if (mediaSessionImpl == null || callbackHandler == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            MediaSessionManager.RemoteUserInfo mo247k = mediaSessionImpl.mo247k();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                m209a(mediaSessionImpl, callbackHandler);
                return false;
            }
            if (keyEvent.getRepeatCount() != 0) {
                m209a(mediaSessionImpl, callbackHandler);
            } else if (this.f101d) {
                callbackHandler.removeMessages(1);
                this.f101d = false;
                PlaybackStateCompat playbackState = mediaSessionImpl.getPlaybackState();
                if (((playbackState == null ? 0L : playbackState.f167f) & 32) != 0) {
                    mo234z();
                }
            } else {
                this.f101d = true;
                callbackHandler.sendMessageDelayed(callbackHandler.obtainMessage(1, mo247k), ViewConfiguration.getDoubleTapTimeout());
            }
            return true;
        }

        /* renamed from: h */
        public void mo216h() {
        }

        /* renamed from: i */
        public void mo217i() {
        }

        /* renamed from: j */
        public void mo218j(String str, Bundle bundle) {
        }

        /* renamed from: k */
        public void mo219k(String str, Bundle bundle) {
        }

        /* renamed from: l */
        public void mo220l(Uri uri, Bundle bundle) {
        }

        /* renamed from: m */
        public void mo221m() {
        }

        /* renamed from: n */
        public void mo222n(String str, Bundle bundle) {
        }

        /* renamed from: o */
        public void mo223o(String str, Bundle bundle) {
        }

        /* renamed from: p */
        public void mo224p(Uri uri, Bundle bundle) {
        }

        /* renamed from: q */
        public void mo225q(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        /* renamed from: r */
        public void mo226r() {
        }

        /* renamed from: s */
        public void mo227s(long j2) {
        }

        /* renamed from: t */
        public void mo228t(boolean z) {
        }

        /* renamed from: u */
        public void mo229u(float f2) {
        }

        /* renamed from: v */
        public void mo230v(RatingCompat ratingCompat) {
        }

        /* renamed from: w */
        public void mo231w(RatingCompat ratingCompat, Bundle bundle) {
        }

        /* renamed from: x */
        public void mo232x(int i2) {
        }

        /* renamed from: y */
        public void mo233y(int i2) {
        }

        /* renamed from: z */
        public void mo234z() {
        }
    }

    public interface MediaSessionImpl {
        /* renamed from: a */
        Token mo237a();

        /* renamed from: b */
        void mo238b(int i2);

        /* renamed from: c */
        void mo239c(Callback callback, Handler handler);

        /* renamed from: d */
        Callback mo240d();

        /* renamed from: e */
        void mo241e(MediaMetadataCompat mediaMetadataCompat);

        /* renamed from: f */
        void mo242f(int i2);

        /* renamed from: g */
        void mo243g(PendingIntent pendingIntent);

        PlaybackStateCompat getPlaybackState();

        /* renamed from: h */
        void mo244h(boolean z);

        /* renamed from: i */
        void mo245i(MediaSessionManager.RemoteUserInfo remoteUserInfo);

        /* renamed from: j */
        void mo246j(PlaybackStateCompat playbackStateCompat);

        /* renamed from: k */
        MediaSessionManager.RemoteUserInfo mo247k();

        /* renamed from: s */
        void mo248s(int i2);
    }

    @RequiresApi
    public static class MediaSessionImplApi18 extends MediaSessionImplBase {

        /* renamed from: x */
        public static boolean f106x = true;

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        /* renamed from: c */
        public void mo239c(Callback callback, Handler handler) {
            super.mo239c(callback, handler);
            if (callback == null) {
                this.f130i.setPlaybackPositionUpdateListener(null);
            } else {
                this.f130i.setPlaybackPositionUpdateListener(new RemoteControlClient.OnPlaybackPositionUpdateListener() { // from class: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18.1
                    @Override // android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
                    public void onPlaybackPositionUpdate(long j2) {
                        MediaSessionImplApi18.this.m257o(18, -1, -1, Long.valueOf(j2), null);
                    }
                });
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        /* renamed from: n */
        public int mo249n(long j2) {
            int mo249n = super.mo249n(j2);
            return (j2 & 256) != 0 ? mo249n | 256 : mo249n;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        /* renamed from: p */
        public void mo250p(PendingIntent pendingIntent, ComponentName componentName) {
            if (f106x) {
                try {
                    this.f129h.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    Log.w("MediaSessionCompat", "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
                    f106x = false;
                }
            }
            if (f106x) {
                return;
            }
            this.f129h.registerMediaButtonEventReceiver(componentName);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        /* renamed from: q */
        public void mo251q(PlaybackStateCompat playbackStateCompat) {
            long j2 = playbackStateCompat.f164c;
            float f2 = playbackStateCompat.f166e;
            long j3 = playbackStateCompat.f170i;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i2 = playbackStateCompat.f163b;
            if (i2 == 3) {
                long j4 = 0;
                if (j2 > 0) {
                    if (j3 > 0) {
                        j4 = elapsedRealtime - j3;
                        if (f2 > 0.0f && f2 != 1.0f) {
                            j4 = (long) (j4 * f2);
                        }
                    }
                    j2 += j4;
                }
            }
            this.f130i.setPlaybackState(m256m(i2), j2, f2);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        /* renamed from: r */
        public void mo252r(PendingIntent pendingIntent, ComponentName componentName) {
            if (f106x) {
                this.f129h.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                this.f129h.unregisterMediaButtonEventReceiver(componentName);
            }
        }
    }

    @RequiresApi
    public static class MediaSessionImplApi19 extends MediaSessionImplApi18 {
        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18, android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        /* renamed from: c */
        public void mo239c(Callback callback, Handler handler) {
            super.mo239c(callback, handler);
            if (callback == null) {
                this.f130i.setMetadataUpdateListener(null);
            } else {
                this.f130i.setMetadataUpdateListener(new RemoteControlClient.OnMetadataUpdateListener() { // from class: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi19.1
                    @Override // android.media.RemoteControlClient.OnMetadataUpdateListener
                    public void onMetadataUpdate(int i2, Object obj) {
                        if (i2 == 268435457 && (obj instanceof Rating)) {
                            MediaSessionImplApi19.this.m257o(19, -1, -1, RatingCompat.m120a(obj), null);
                        }
                    }
                });
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        /* renamed from: l */
        public RemoteControlClient.MetadataEditor mo253l(Bundle bundle) {
            RemoteControlClient.MetadataEditor mo253l = super.mo253l(bundle);
            PlaybackStateCompat playbackStateCompat = this.f139r;
            if (((playbackStateCompat == null ? 0L : playbackStateCompat.f167f) & 128) != 0) {
                mo253l.addEditableKey(268435457);
            }
            if (bundle == null) {
                return mo253l;
            }
            if (bundle.containsKey("android.media.metadata.YEAR")) {
                mo253l.putLong(8, bundle.getLong("android.media.metadata.YEAR"));
            }
            if (bundle.containsKey("android.media.metadata.RATING")) {
                mo253l.putObject(101, (Object) bundle.getParcelable("android.media.metadata.RATING"));
            }
            if (bundle.containsKey("android.media.metadata.USER_RATING")) {
                mo253l.putObject(268435457, (Object) bundle.getParcelable("android.media.metadata.USER_RATING"));
            }
            return mo253l;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi18, android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
        /* renamed from: n */
        public int mo249n(long j2) {
            int mo249n = super.mo249n(j2);
            return (j2 & 128) != 0 ? mo249n | RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN : mo249n;
        }
    }

    @RequiresApi
    public static class MediaSessionImplApi21 implements MediaSessionImpl {

        /* renamed from: a */
        public final MediaSession f109a;

        /* renamed from: b */
        public final Token f110b;

        /* renamed from: d */
        public Bundle f112d;

        /* renamed from: f */
        public PlaybackStateCompat f114f;

        /* renamed from: g */
        public List<QueueItem> f115g;

        /* renamed from: h */
        public MediaMetadataCompat f116h;

        /* renamed from: i */
        public int f117i;

        /* renamed from: j */
        public int f118j;

        /* renamed from: k */
        @GuardedBy
        public Callback f119k;

        /* renamed from: l */
        @GuardedBy
        public MediaSessionManager.RemoteUserInfo f120l;

        /* renamed from: c */
        public final Object f111c = new Object();

        /* renamed from: e */
        public final RemoteCallbackList<IMediaControllerCallback> f113e = new RemoteCallbackList<>();

        public class ExtraSession extends IMediaSession.Stub {
            public ExtraSession() {
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: A0 */
            public Bundle mo146A0() {
                if (MediaSessionImplApi21.this.f112d == null) {
                    return null;
                }
                return new Bundle(MediaSessionImplApi21.this.f112d);
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: B0 */
            public void mo147B0(IMediaControllerCallback iMediaControllerCallback) {
                MediaSessionImplApi21.this.f113e.unregister(iMediaControllerCallback);
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: E1 */
            public int mo148E1() {
                return MediaSessionImplApi21.this.f118j;
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: F1 */
            public void mo149F1(int i2) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: H0 */
            public void mo150H0(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: I */
            public boolean mo151I() {
                return false;
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: I1 */
            public boolean mo152I1() {
                Objects.requireNonNull(MediaSessionImplApi21.this);
                return false;
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: J0 */
            public void mo153J0(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: K */
            public void mo154K(RatingCompat ratingCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: L0 */
            public void mo155L0() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: N */
            public void mo156N(int i2, int i3, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: O */
            public void mo157O(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: O0 */
            public void mo158O0(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: Q1 */
            public void mo159Q1(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: T */
            public void mo160T(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: T1 */
            public void mo161T1() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: U */
            public boolean mo162U() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: V */
            public void mo163V(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: X */
            public PendingIntent mo164X() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: X0 */
            public void mo165X0(float f2) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: Z */
            public int mo166Z() {
                Objects.requireNonNull(MediaSessionImplApi21.this);
                return 0;
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: c0 */
            public void mo167c0(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: c1 */
            public boolean mo168c1(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: e */
            public String mo169e() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: f */
            public void mo170f(int i2) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: g1 */
            public void mo171g1(int i2, int i3, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public MediaMetadataCompat getMetadata() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PlaybackStateCompat getPlaybackState() {
                MediaSessionImplApi21 mediaSessionImplApi21 = MediaSessionImplApi21.this;
                return MediaSessionCompat.m196b(mediaSessionImplApi21.f114f, mediaSessionImplApi21.f116h);
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: h */
            public void mo172h(long j2) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: h2 */
            public void mo173h2(long j2) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: i2 */
            public void mo174i2(boolean z) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: k1 */
            public void mo175k1(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: l2 */
            public ParcelableVolumeInfo mo176l2() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: n */
            public List<QueueItem> mo177n() {
                return null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: n1 */
            public void mo178n1(MediaDescriptionCompat mediaDescriptionCompat, int i2) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void next() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: p */
            public long mo179p() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void pause() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void play() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepare() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void previous() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: r */
            public int mo180r() {
                return MediaSessionImplApi21.this.f117i;
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: s */
            public void mo181s(int i2) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void stop() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: t1 */
            public void mo182t1(boolean z) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: u */
            public void mo183u(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: u0 */
            public CharSequence mo184u0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: x2 */
            public String mo185x2() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: y0 */
            public void mo186y0(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: z */
            public void mo187z(IMediaControllerCallback iMediaControllerCallback) {
                Objects.requireNonNull(MediaSessionImplApi21.this);
                MediaSessionImplApi21.this.f113e.register(iMediaControllerCallback, new MediaSessionManager.RemoteUserInfo("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
            }
        }

        public MediaSessionImplApi21(Context context, String str, VersionedParcelable versionedParcelable, Bundle bundle) {
            MediaSession mo254l = mo254l(context, str, bundle);
            this.f109a = mo254l;
            this.f110b = new Token(mo254l.getSessionToken(), new ExtraSession(), versionedParcelable);
            this.f112d = bundle;
            mo254l.setFlags(3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        /* renamed from: a */
        public Token mo237a() {
            return this.f110b;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        @SuppressLint
        /* renamed from: b */
        public void mo238b(int i2) {
            this.f109a.setFlags(i2 | 1 | 2);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        /* renamed from: c */
        public void mo239c(Callback callback, Handler handler) {
            synchronized (this.f111c) {
                this.f119k = callback;
                this.f109a.setCallback(callback == null ? null : callback.f100c, handler);
                if (callback != null) {
                    callback.m208D(this, handler);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        /* renamed from: d */
        public Callback mo240d() {
            Callback callback;
            synchronized (this.f111c) {
                callback = this.f119k;
            }
            return callback;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        /* renamed from: e */
        public void mo241e(MediaMetadataCompat mediaMetadataCompat) {
            MediaMetadata mediaMetadata;
            this.f116h = mediaMetadataCompat;
            MediaSession mediaSession = this.f109a;
            if (mediaMetadataCompat == null) {
                mediaMetadata = null;
            } else {
                if (mediaMetadataCompat.f74c == null) {
                    Parcel obtain = Parcel.obtain();
                    obtain.writeBundle(mediaMetadataCompat.f73b);
                    obtain.setDataPosition(0);
                    mediaMetadataCompat.f74c = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
                    obtain.recycle();
                }
                mediaMetadata = mediaMetadataCompat.f74c;
            }
            mediaSession.setMetadata(mediaMetadata);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        /* renamed from: f */
        public void mo242f(int i2) {
            if (this.f117i != i2) {
                this.f117i = i2;
                for (int beginBroadcast = this.f113e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f113e.getBroadcastItem(beginBroadcast).onRepeatModeChanged(i2);
                    } catch (RemoteException unused) {
                    }
                }
                this.f113e.finishBroadcast();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        /* renamed from: g */
        public void mo243g(PendingIntent pendingIntent) {
            this.f109a.setMediaButtonReceiver(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public PlaybackStateCompat getPlaybackState() {
            return this.f114f;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        /* renamed from: h */
        public void mo244h(boolean z) {
            this.f109a.setActive(z);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        /* renamed from: i */
        public void mo245i(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            synchronized (this.f111c) {
                this.f120l = remoteUserInfo;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        /* renamed from: j */
        public void mo246j(PlaybackStateCompat playbackStateCompat) {
            PlaybackState playbackState;
            this.f114f = playbackStateCompat;
            for (int beginBroadcast = this.f113e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f113e.getBroadcastItem(beginBroadcast).mo137A2(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f113e.finishBroadcast();
            MediaSession mediaSession = this.f109a;
            if (playbackStateCompat == null) {
                playbackState = null;
            } else {
                if (playbackStateCompat.f174m == null) {
                    PlaybackState.Builder m274d = PlaybackStateCompat.Api21Impl.m274d();
                    PlaybackStateCompat.Api21Impl.m294x(m274d, playbackStateCompat.f163b, playbackStateCompat.f164c, playbackStateCompat.f166e, playbackStateCompat.f170i);
                    PlaybackStateCompat.Api21Impl.m291u(m274d, playbackStateCompat.f165d);
                    PlaybackStateCompat.Api21Impl.m289s(m274d, playbackStateCompat.f167f);
                    PlaybackStateCompat.Api21Impl.m292v(m274d, playbackStateCompat.f169h);
                    for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.f171j) {
                        PlaybackState.CustomAction customAction2 = customAction.f190f;
                        if (customAction2 == null) {
                            PlaybackState.CustomAction.Builder m275e = PlaybackStateCompat.Api21Impl.m275e(customAction.f186b, customAction.f187c, customAction.f188d);
                            PlaybackStateCompat.Api21Impl.m293w(m275e, customAction.f189e);
                            customAction2 = PlaybackStateCompat.Api21Impl.m272b(m275e);
                        }
                        PlaybackStateCompat.Api21Impl.m271a(m274d, customAction2);
                    }
                    PlaybackStateCompat.Api21Impl.m290t(m274d, playbackStateCompat.f172k);
                    if (Build.VERSION.SDK_INT >= 22) {
                        PlaybackStateCompat.Api22Impl.m296b(m274d, playbackStateCompat.f173l);
                    }
                    playbackStateCompat.f174m = PlaybackStateCompat.Api21Impl.m273c(m274d);
                }
                playbackState = playbackStateCompat.f174m;
            }
            mediaSession.setPlaybackState(playbackState);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        /* renamed from: k */
        public MediaSessionManager.RemoteUserInfo mo247k() {
            MediaSessionManager.RemoteUserInfo remoteUserInfo;
            synchronized (this.f111c) {
                remoteUserInfo = this.f120l;
            }
            return remoteUserInfo;
        }

        /* renamed from: l */
        public MediaSession mo254l(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str);
        }

        /* renamed from: m */
        public String m255m() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                return (String) this.f109a.getClass().getMethod("getCallingPackage", new Class[0]).invoke(this.f109a, new Object[0]);
            } catch (Exception e2) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e2);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        /* renamed from: s */
        public void mo248s(int i2) {
            if (this.f118j != i2) {
                this.f118j = i2;
                for (int beginBroadcast = this.f113e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f113e.getBroadcastItem(beginBroadcast).mo139N1(i2);
                    } catch (RemoteException unused) {
                    }
                }
                this.f113e.finishBroadcast();
            }
        }
    }

    @RequiresApi
    public static class MediaSessionImplApi22 extends MediaSessionImplApi21 {
        public MediaSessionImplApi22(Context context, String str, VersionedParcelable versionedParcelable, Bundle bundle) {
            super(context, str, versionedParcelable, bundle);
        }
    }

    @RequiresApi
    public static class MediaSessionImplApi28 extends MediaSessionImplApi22 {
        public MediaSessionImplApi28(Context context, String str, VersionedParcelable versionedParcelable, Bundle bundle) {
            super(context, str, versionedParcelable, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        /* renamed from: i */
        public void mo245i(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21, android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        @NonNull
        /* renamed from: k */
        public final MediaSessionManager.RemoteUserInfo mo247k() {
            return new MediaSessionManager.RemoteUserInfo(this.f109a.getCurrentControllerInfo());
        }
    }

    @RequiresApi
    public static class MediaSessionImplApi29 extends MediaSessionImplApi28 {
        public MediaSessionImplApi29(Context context, String str, VersionedParcelable versionedParcelable, Bundle bundle) {
            super(context, str, versionedParcelable, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21
        /* renamed from: l */
        public MediaSession mo254l(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str, bundle);
        }
    }

    public static class MediaSessionImplBase implements MediaSessionImpl {

        /* renamed from: a */
        public final Context f122a;

        /* renamed from: b */
        public final ComponentName f123b;

        /* renamed from: c */
        public final PendingIntent f124c;

        /* renamed from: d */
        public final Token f125d;

        /* renamed from: e */
        public final String f126e;

        /* renamed from: f */
        public final Bundle f127f;

        /* renamed from: g */
        public final String f128g;

        /* renamed from: h */
        public final AudioManager f129h;

        /* renamed from: i */
        public final RemoteControlClient f130i;

        /* renamed from: j */
        public final Object f131j;

        /* renamed from: k */
        public final RemoteCallbackList<IMediaControllerCallback> f132k;

        /* renamed from: l */
        public MessageHandler f133l;

        /* renamed from: m */
        public boolean f134m;

        /* renamed from: n */
        public volatile Callback f135n;

        /* renamed from: o */
        public MediaSessionManager.RemoteUserInfo f136o;

        /* renamed from: p */
        public int f137p;

        /* renamed from: q */
        public MediaMetadataCompat f138q;

        /* renamed from: r */
        public PlaybackStateCompat f139r;

        /* renamed from: s */
        public List<QueueItem> f140s;

        /* renamed from: t */
        public int f141t;

        /* renamed from: u */
        public int f142u;

        /* renamed from: v */
        public int f143v;

        /* renamed from: w */
        public int f144w;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$1 */
        public class C00241 extends VolumeProviderCompat.Callback {
        }

        public static final class Command {

            /* renamed from: a */
            public final String f145a;

            /* renamed from: b */
            public final Bundle f146b;

            /* renamed from: c */
            public final ResultReceiver f147c;

            public Command(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f145a = str;
                this.f146b = bundle;
                this.f147c = resultReceiver;
            }
        }

        public class MediaSessionStub extends IMediaSession.Stub {

            /* renamed from: b */
            public final /* synthetic */ MediaSessionImplBase f148b;

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: A0 */
            public Bundle mo146A0() {
                if (this.f148b.f127f == null) {
                    return null;
                }
                return new Bundle(this.f148b.f127f);
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: B0 */
            public void mo147B0(IMediaControllerCallback iMediaControllerCallback) {
                this.f148b.f132k.unregister(iMediaControllerCallback);
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: E1 */
            public int mo148E1() {
                return this.f148b.f142u;
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: F1 */
            public void mo149F1(int i2) {
                m261t(28, i2);
            }

            /* renamed from: F2 */
            public void m258F2(int i2, Object obj, Bundle bundle) {
                this.f148b.m257o(i2, 0, 0, obj, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: H0 */
            public void mo150H0(String str, Bundle bundle) throws RemoteException {
                m258F2(8, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: I */
            public boolean mo151I() {
                return false;
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: I1 */
            public boolean mo152I1() {
                Objects.requireNonNull(this.f148b);
                return false;
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: J0 */
            public void mo153J0(String str, Bundle bundle) throws RemoteException {
                m258F2(9, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: K */
            public void mo154K(RatingCompat ratingCompat) throws RemoteException {
                m259S0(19, ratingCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: L0 */
            public void mo155L0() throws RemoteException {
                m260q(16);
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: N */
            public void mo156N(int i2, int i3, String str) {
                MediaSessionImplBase mediaSessionImplBase = this.f148b;
                if (mediaSessionImplBase.f143v == 2) {
                    return;
                }
                mediaSessionImplBase.f129h.setStreamVolume(mediaSessionImplBase.f144w, i2, i3);
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: O */
            public void mo157O(Uri uri, Bundle bundle) throws RemoteException {
                m258F2(6, uri, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: O0 */
            public void mo158O0(Uri uri, Bundle bundle) throws RemoteException {
                m258F2(10, uri, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: Q1 */
            public void mo159Q1(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                m259S0(1, new Command(str, bundle, resultReceiverWrapper == null ? null : resultReceiverWrapper.f153b));
            }

            /* renamed from: S0 */
            public void m259S0(int i2, Object obj) {
                this.f148b.m257o(i2, 0, 0, obj, null);
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: T */
            public void mo160T(MediaDescriptionCompat mediaDescriptionCompat) {
                m259S0(27, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: T1 */
            public void mo161T1() throws RemoteException {
                m260q(17);
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: U */
            public boolean mo162U() {
                return true;
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: V */
            public void mo163V(MediaDescriptionCompat mediaDescriptionCompat) {
                m259S0(25, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: X */
            public PendingIntent mo164X() {
                synchronized (this.f148b.f131j) {
                    Objects.requireNonNull(this.f148b);
                }
                return null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: X0 */
            public void mo165X0(float f2) throws RemoteException {
                m259S0(32, Float.valueOf(f2));
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: Z */
            public int mo166Z() {
                Objects.requireNonNull(this.f148b);
                return 0;
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: c0 */
            public void mo167c0(String str, Bundle bundle) throws RemoteException {
                m258F2(5, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: c1 */
            public boolean mo168c1(KeyEvent keyEvent) {
                m259S0(21, keyEvent);
                return true;
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: e */
            public String mo169e() {
                return this.f148b.f128g;
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: f */
            public void mo170f(int i2) throws RemoteException {
                m261t(23, i2);
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: g1 */
            public void mo171g1(int i2, int i3, String str) {
                MediaSessionImplBase mediaSessionImplBase = this.f148b;
                if (mediaSessionImplBase.f143v == 2) {
                    return;
                }
                mediaSessionImplBase.f129h.adjustStreamVolume(mediaSessionImplBase.f144w, i2, i3);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public Bundle getExtras() {
                synchronized (this.f148b.f131j) {
                    Objects.requireNonNull(this.f148b);
                }
                return null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public MediaMetadataCompat getMetadata() {
                return this.f148b.f138q;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PlaybackStateCompat getPlaybackState() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (this.f148b.f131j) {
                    MediaSessionImplBase mediaSessionImplBase = this.f148b;
                    playbackStateCompat = mediaSessionImplBase.f139r;
                    mediaMetadataCompat = mediaSessionImplBase.f138q;
                }
                return MediaSessionCompat.m196b(playbackStateCompat, mediaMetadataCompat);
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: h */
            public void mo172h(long j2) throws RemoteException {
                m259S0(18, Long.valueOf(j2));
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: h2 */
            public void mo173h2(long j2) {
                m259S0(11, Long.valueOf(j2));
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: i2 */
            public void mo174i2(boolean z) throws RemoteException {
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: k1 */
            public void mo175k1(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                m258F2(31, ratingCompat, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: l2 */
            public ParcelableVolumeInfo mo176l2() {
                int i2;
                int i3;
                int streamMaxVolume;
                int streamVolume;
                synchronized (this.f148b.f131j) {
                    MediaSessionImplBase mediaSessionImplBase = this.f148b;
                    i2 = mediaSessionImplBase.f143v;
                    i3 = mediaSessionImplBase.f144w;
                    Objects.requireNonNull(mediaSessionImplBase);
                    if (i2 == 2) {
                        Objects.requireNonNull(null);
                        throw null;
                    }
                    streamMaxVolume = this.f148b.f129h.getStreamMaxVolume(i3);
                    streamVolume = this.f148b.f129h.getStreamVolume(i3);
                }
                return new ParcelableVolumeInfo(i2, i3, 2, streamMaxVolume, streamVolume);
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: n */
            public List<QueueItem> mo177n() {
                List<QueueItem> list;
                synchronized (this.f148b.f131j) {
                    list = this.f148b.f140s;
                }
                return list;
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: n1 */
            public void mo178n1(MediaDescriptionCompat mediaDescriptionCompat, int i2) {
                this.f148b.m257o(26, i2, 0, mediaDescriptionCompat, null);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void next() throws RemoteException {
                m260q(14);
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: p */
            public long mo179p() {
                long j2;
                synchronized (this.f148b.f131j) {
                    j2 = this.f148b.f137p;
                }
                return j2;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void pause() throws RemoteException {
                m260q(12);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void play() throws RemoteException {
                m260q(7);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void prepare() throws RemoteException {
                m260q(3);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void previous() throws RemoteException {
                m260q(15);
            }

            /* renamed from: q */
            public void m260q(int i2) {
                this.f148b.m257o(i2, 0, 0, null, null);
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: r */
            public int mo180r() {
                return this.f148b.f141t;
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: s */
            public void mo181s(int i2) throws RemoteException {
                m261t(30, i2);
            }

            @Override // android.support.v4.media.session.IMediaSession
            public void stop() throws RemoteException {
                m260q(13);
            }

            /* renamed from: t */
            public void m261t(int i2, int i3) {
                this.f148b.m257o(i2, i3, 0, null, null);
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: t1 */
            public void mo182t1(boolean z) throws RemoteException {
                m259S0(29, Boolean.valueOf(z));
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: u */
            public void mo183u(String str, Bundle bundle) throws RemoteException {
                m258F2(20, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: u0 */
            public CharSequence mo184u0() {
                Objects.requireNonNull(this.f148b);
                return null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: x2 */
            public String mo185x2() {
                return this.f148b.f126e;
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: y0 */
            public void mo186y0(String str, Bundle bundle) throws RemoteException {
                m258F2(4, str, bundle);
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: z */
            public void mo187z(IMediaControllerCallback iMediaControllerCallback) {
                Objects.requireNonNull(this.f148b);
                String nameForUid = this.f148b.f122a.getPackageManager().getNameForUid(Binder.getCallingUid());
                if (TextUtils.isEmpty(nameForUid)) {
                    nameForUid = "android.media.session.MediaController";
                }
                this.f148b.f132k.register(iMediaControllerCallback, new MediaSessionManager.RemoteUserInfo(nameForUid, Binder.getCallingPid(), Binder.getCallingUid()));
            }
        }

        public class MessageHandler extends Handler {
            public MessageHandler(Looper looper) {
                super(looper);
            }

            /* renamed from: a */
            public final void m262a(KeyEvent keyEvent, Callback callback) {
                if (keyEvent == null || keyEvent.getAction() != 0) {
                    return;
                }
                PlaybackStateCompat playbackStateCompat = MediaSessionImplBase.this.f139r;
                long j2 = playbackStateCompat == null ? 0L : playbackStateCompat.f167f;
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79) {
                    if (keyCode == 126) {
                        if ((j2 & 4) != 0) {
                            callback.mo217i();
                            return;
                        }
                        return;
                    }
                    if (keyCode == 127) {
                        if ((j2 & 2) != 0) {
                            callback.mo216h();
                            return;
                        }
                        return;
                    }
                    switch (keyCode) {
                        case C4632R.styleable.AppCompatTheme_panelBackground /* 86 */:
                            if ((j2 & 1) != 0) {
                                callback.mo207C();
                                break;
                            }
                            break;
                        case C4632R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                            if ((j2 & 32) != 0) {
                                callback.mo234z();
                                break;
                            }
                            break;
                        case C4632R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                            if ((j2 & 16) != 0) {
                                callback.mo205A();
                                break;
                            }
                            break;
                        case C4632R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                            if ((j2 & 8) != 0) {
                                callback.mo226r();
                                break;
                            }
                            break;
                        case 90:
                            if ((j2 & 64) != 0) {
                                callback.mo214f();
                                break;
                            }
                            break;
                    }
                }
                Log.w("MediaSessionCompat", "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                Callback callback = MediaSessionImplBase.this.f135n;
                if (callback == null) {
                    return;
                }
                Bundle data = message.getData();
                MediaSessionCompat.m195a(data);
                MediaSessionImplBase.this.mo245i(new MediaSessionManager.RemoteUserInfo(data.getString("data_calling_pkg"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                Bundle bundle = data.getBundle("data_extras");
                MediaSessionCompat.m195a(bundle);
                try {
                    switch (message.what) {
                        case 1:
                            Command command = (Command) message.obj;
                            callback.mo212d(command.f145a, command.f146b, command.f147c);
                            break;
                        case 2:
                            MediaSessionImplBase mediaSessionImplBase = MediaSessionImplBase.this;
                            int i2 = message.arg1;
                            if (mediaSessionImplBase.f143v != 2) {
                                mediaSessionImplBase.f129h.adjustStreamVolume(mediaSessionImplBase.f144w, i2, 0);
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            callback.mo221m();
                            break;
                        case 4:
                            callback.mo222n((String) message.obj, bundle);
                            break;
                        case 5:
                            callback.mo223o((String) message.obj, bundle);
                            break;
                        case 6:
                            callback.mo224p((Uri) message.obj, bundle);
                            break;
                        case 7:
                            callback.mo217i();
                            break;
                        case 8:
                            callback.mo218j((String) message.obj, bundle);
                            break;
                        case 9:
                            callback.mo219k((String) message.obj, bundle);
                            break;
                        case 10:
                            callback.mo220l((Uri) message.obj, bundle);
                            break;
                        case 11:
                            callback.mo206B(((Long) message.obj).longValue());
                            break;
                        case 12:
                            callback.mo216h();
                            break;
                        case 13:
                            callback.mo207C();
                            break;
                        case 14:
                            callback.mo234z();
                            break;
                        case 15:
                            callback.mo205A();
                            break;
                        case 16:
                            callback.mo214f();
                            break;
                        case 17:
                            callback.mo226r();
                            break;
                        case 18:
                            callback.mo227s(((Long) message.obj).longValue());
                            break;
                        case 19:
                            callback.mo230v((RatingCompat) message.obj);
                            break;
                        case 20:
                            callback.mo213e((String) message.obj, bundle);
                            break;
                        case 21:
                            KeyEvent keyEvent = (KeyEvent) message.obj;
                            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                            intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                            if (!callback.mo215g(intent)) {
                                m262a(keyEvent, callback);
                                break;
                            }
                            break;
                        case 22:
                            MediaSessionImplBase mediaSessionImplBase2 = MediaSessionImplBase.this;
                            int i3 = message.arg1;
                            if (mediaSessionImplBase2.f143v != 2) {
                                mediaSessionImplBase2.f129h.setStreamVolume(mediaSessionImplBase2.f144w, i3, 0);
                                break;
                            } else {
                                break;
                            }
                        case 23:
                            callback.mo232x(message.arg1);
                            break;
                        case 25:
                            callback.mo210b((MediaDescriptionCompat) message.obj);
                            break;
                        case 26:
                            callback.mo211c((MediaDescriptionCompat) message.obj, message.arg1);
                            break;
                        case 27:
                            callback.mo225q((MediaDescriptionCompat) message.obj);
                            break;
                        case 28:
                            List<QueueItem> list = MediaSessionImplBase.this.f140s;
                            if (list != null) {
                                int i4 = message.arg1;
                                QueueItem queueItem = (i4 < 0 || i4 >= list.size()) ? null : MediaSessionImplBase.this.f140s.get(message.arg1);
                                if (queueItem != null) {
                                    callback.mo225q(queueItem.f150b);
                                    break;
                                }
                            }
                            break;
                        case 29:
                            callback.mo228t(((Boolean) message.obj).booleanValue());
                            break;
                        case 30:
                            callback.mo233y(message.arg1);
                            break;
                        case 31:
                            callback.mo231w((RatingCompat) message.obj, bundle);
                            break;
                        case 32:
                            callback.mo229u(((Float) message.obj).floatValue());
                            break;
                    }
                } finally {
                    MediaSessionImplBase.this.mo245i(null);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        /* renamed from: a */
        public Token mo237a() {
            return this.f125d;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        /* renamed from: b */
        public void mo238b(int i2) {
            synchronized (this.f131j) {
                this.f137p = i2 | 1 | 2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0030 A[Catch: all -> 0x0037, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:10:0x0010, B:11:0x001b, B:13:0x0021, B:15:0x0025, B:16:0x002a, B:18:0x0030, B:19:0x0035), top: B:3:0x0003 }] */
        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo239c(android.support.v4.media.session.MediaSessionCompat.Callback r5, android.os.Handler r6) {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f131j
                monitor-enter(r0)
                android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$MessageHandler r1 = r4.f133l     // Catch: java.lang.Throwable -> L37
                r2 = 0
                if (r1 == 0) goto Lb
                r1.removeCallbacksAndMessages(r2)     // Catch: java.lang.Throwable -> L37
            Lb:
                if (r5 == 0) goto L1a
                if (r6 != 0) goto L10
                goto L1a
            L10:
                android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$MessageHandler r1 = new android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$MessageHandler     // Catch: java.lang.Throwable -> L37
                android.os.Looper r3 = r6.getLooper()     // Catch: java.lang.Throwable -> L37
                r1.<init>(r3)     // Catch: java.lang.Throwable -> L37
                goto L1b
            L1a:
                r1 = r2
            L1b:
                r4.f133l = r1     // Catch: java.lang.Throwable -> L37
                android.support.v4.media.session.MediaSessionCompat$Callback r1 = r4.f135n     // Catch: java.lang.Throwable -> L37
                if (r1 == r5) goto L2a
                android.support.v4.media.session.MediaSessionCompat$Callback r1 = r4.f135n     // Catch: java.lang.Throwable -> L37
                if (r1 == 0) goto L2a
                android.support.v4.media.session.MediaSessionCompat$Callback r1 = r4.f135n     // Catch: java.lang.Throwable -> L37
                r1.m208D(r2, r2)     // Catch: java.lang.Throwable -> L37
            L2a:
                r4.f135n = r5     // Catch: java.lang.Throwable -> L37
                android.support.v4.media.session.MediaSessionCompat$Callback r5 = r4.f135n     // Catch: java.lang.Throwable -> L37
                if (r5 == 0) goto L35
                android.support.v4.media.session.MediaSessionCompat$Callback r5 = r4.f135n     // Catch: java.lang.Throwable -> L37
                r5.m208D(r4, r6)     // Catch: java.lang.Throwable -> L37
            L35:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
                return
            L37:
                r5 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.mo239c(android.support.v4.media.session.MediaSessionCompat$Callback, android.os.Handler):void");
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        /* renamed from: d */
        public Callback mo240d() {
            Callback callback;
            synchronized (this.f131j) {
                callback = this.f135n;
            }
            return callback;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        /* renamed from: e */
        public void mo241e(MediaMetadataCompat mediaMetadataCompat) {
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new MediaMetadataCompat.Builder(mediaMetadataCompat, MediaSessionCompat.f95e).m115a();
            }
            synchronized (this.f131j) {
                this.f138q = mediaMetadataCompat;
            }
            int beginBroadcast = this.f132k.beginBroadcast();
            while (true) {
                beginBroadcast--;
                if (beginBroadcast < 0) {
                    break;
                } else {
                    try {
                        this.f132k.getBroadcastItem(beginBroadcast).mo143o1(mediaMetadataCompat);
                    } catch (RemoteException unused) {
                    }
                }
            }
            this.f132k.finishBroadcast();
            if (this.f134m) {
                mo253l(mediaMetadataCompat == null ? null : mediaMetadataCompat.m114c()).apply();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        /* renamed from: f */
        public void mo242f(int i2) {
            if (this.f141t == i2) {
                return;
            }
            this.f141t = i2;
            int beginBroadcast = this.f132k.beginBroadcast();
            while (true) {
                beginBroadcast--;
                if (beginBroadcast < 0) {
                    this.f132k.finishBroadcast();
                    return;
                }
                try {
                    this.f132k.getBroadcastItem(beginBroadcast).onRepeatModeChanged(i2);
                } catch (RemoteException unused) {
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        /* renamed from: g */
        public void mo243g(PendingIntent pendingIntent) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        public PlaybackStateCompat getPlaybackState() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.f131j) {
                playbackStateCompat = this.f139r;
            }
            return playbackStateCompat;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        /* renamed from: h */
        public void mo244h(boolean z) {
            if (z == this.f134m) {
                return;
            }
            this.f134m = z;
            if (!z) {
                mo252r(this.f124c, this.f123b);
                this.f130i.setPlaybackState(0);
                this.f129h.unregisterRemoteControlClient(this.f130i);
            } else {
                mo250p(this.f124c, this.f123b);
                this.f129h.registerRemoteControlClient(this.f130i);
                mo241e(this.f138q);
                mo246j(this.f139r);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        /* renamed from: i */
        public void mo245i(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            synchronized (this.f131j) {
                this.f136o = remoteUserInfo;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        /* renamed from: j */
        public void mo246j(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.f131j) {
                this.f139r = playbackStateCompat;
            }
            int beginBroadcast = this.f132k.beginBroadcast();
            while (true) {
                beginBroadcast--;
                if (beginBroadcast < 0) {
                    break;
                } else {
                    try {
                        this.f132k.getBroadcastItem(beginBroadcast).mo137A2(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
            }
            this.f132k.finishBroadcast();
            if (this.f134m) {
                if (playbackStateCompat == null) {
                    this.f130i.setPlaybackState(0);
                    this.f130i.setTransportControlFlags(0);
                } else {
                    mo251q(playbackStateCompat);
                    this.f130i.setTransportControlFlags(mo249n(playbackStateCompat.f167f));
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        /* renamed from: k */
        public MediaSessionManager.RemoteUserInfo mo247k() {
            MediaSessionManager.RemoteUserInfo remoteUserInfo;
            synchronized (this.f131j) {
                remoteUserInfo = this.f136o;
            }
            return remoteUserInfo;
        }

        /* renamed from: l */
        public RemoteControlClient.MetadataEditor mo253l(Bundle bundle) {
            RemoteControlClient.MetadataEditor editMetadata = this.f130i.editMetadata(true);
            if (bundle == null) {
                return editMetadata;
            }
            if (bundle.containsKey("android.media.metadata.ART")) {
                Bitmap bitmap = (Bitmap) bundle.getParcelable("android.media.metadata.ART");
                if (bitmap != null) {
                    bitmap = bitmap.copy(bitmap.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap);
            } else if (bundle.containsKey("android.media.metadata.ALBUM_ART")) {
                Bitmap bitmap2 = (Bitmap) bundle.getParcelable("android.media.metadata.ALBUM_ART");
                if (bitmap2 != null) {
                    bitmap2 = bitmap2.copy(bitmap2.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap2);
            }
            if (bundle.containsKey("android.media.metadata.ALBUM")) {
                editMetadata.putString(1, bundle.getString("android.media.metadata.ALBUM"));
            }
            if (bundle.containsKey("android.media.metadata.ALBUM_ARTIST")) {
                editMetadata.putString(13, bundle.getString("android.media.metadata.ALBUM_ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.ARTIST")) {
                editMetadata.putString(2, bundle.getString("android.media.metadata.ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.AUTHOR")) {
                editMetadata.putString(3, bundle.getString("android.media.metadata.AUTHOR"));
            }
            if (bundle.containsKey("android.media.metadata.COMPILATION")) {
                editMetadata.putString(15, bundle.getString("android.media.metadata.COMPILATION"));
            }
            if (bundle.containsKey("android.media.metadata.COMPOSER")) {
                editMetadata.putString(4, bundle.getString("android.media.metadata.COMPOSER"));
            }
            if (bundle.containsKey("android.media.metadata.DATE")) {
                editMetadata.putString(5, bundle.getString("android.media.metadata.DATE"));
            }
            if (bundle.containsKey("android.media.metadata.DISC_NUMBER")) {
                editMetadata.putLong(14, bundle.getLong("android.media.metadata.DISC_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                editMetadata.putLong(9, bundle.getLong("android.media.metadata.DURATION"));
            }
            if (bundle.containsKey("android.media.metadata.GENRE")) {
                editMetadata.putString(6, bundle.getString("android.media.metadata.GENRE"));
            }
            if (bundle.containsKey("android.media.metadata.TITLE")) {
                editMetadata.putString(7, bundle.getString("android.media.metadata.TITLE"));
            }
            if (bundle.containsKey("android.media.metadata.TRACK_NUMBER")) {
                editMetadata.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.WRITER")) {
                editMetadata.putString(11, bundle.getString("android.media.metadata.WRITER"));
            }
            return editMetadata;
        }

        /* renamed from: m */
        public int m256m(int i2) {
            switch (i2) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        /* renamed from: n */
        public int mo249n(long j2) {
            int i2 = (1 & j2) != 0 ? 32 : 0;
            if ((2 & j2) != 0) {
                i2 |= 16;
            }
            if ((4 & j2) != 0) {
                i2 |= 4;
            }
            if ((8 & j2) != 0) {
                i2 |= 2;
            }
            if ((16 & j2) != 0) {
                i2 |= 1;
            }
            if ((32 & j2) != 0) {
                i2 |= 128;
            }
            if ((64 & j2) != 0) {
                i2 |= 64;
            }
            return (j2 & 512) != 0 ? i2 | 8 : i2;
        }

        /* renamed from: o */
        public void m257o(int i2, int i3, int i4, Object obj, Bundle bundle) {
            synchronized (this.f131j) {
                MessageHandler messageHandler = this.f133l;
                if (messageHandler != null) {
                    Message obtainMessage = messageHandler.obtainMessage(i2, i3, i4, obj);
                    Bundle bundle2 = new Bundle();
                    int callingUid = Binder.getCallingUid();
                    bundle2.putInt("data_calling_uid", callingUid);
                    String nameForUid = this.f122a.getPackageManager().getNameForUid(callingUid);
                    if (TextUtils.isEmpty(nameForUid)) {
                        nameForUid = "android.media.session.MediaController";
                    }
                    bundle2.putString("data_calling_pkg", nameForUid);
                    int callingPid = Binder.getCallingPid();
                    if (callingPid > 0) {
                        bundle2.putInt("data_calling_pid", callingPid);
                    } else {
                        bundle2.putInt("data_calling_pid", -1);
                    }
                    if (bundle != null) {
                        bundle2.putBundle("data_extras", bundle);
                    }
                    obtainMessage.setData(bundle2);
                    obtainMessage.sendToTarget();
                }
            }
        }

        /* renamed from: p */
        public void mo250p(PendingIntent pendingIntent, ComponentName componentName) {
            this.f129h.registerMediaButtonEventReceiver(componentName);
        }

        /* renamed from: q */
        public void mo251q(PlaybackStateCompat playbackStateCompat) {
            this.f130i.setPlaybackState(m256m(playbackStateCompat.f163b));
        }

        /* renamed from: r */
        public void mo252r(PendingIntent pendingIntent, ComponentName componentName) {
            this.f129h.unregisterMediaButtonEventReceiver(componentName);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.MediaSessionImpl
        /* renamed from: s */
        public void mo248s(int i2) {
            if (this.f142u == i2) {
                return;
            }
            this.f142u = i2;
            int beginBroadcast = this.f132k.beginBroadcast();
            while (true) {
                beginBroadcast--;
                if (beginBroadcast < 0) {
                    this.f132k.finishBroadcast();
                    return;
                }
                try {
                    this.f132k.getBroadcastItem(beginBroadcast).mo139N1(i2);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public interface OnActiveChangeListener {
        /* renamed from: a */
        void m263a();
    }

    @SuppressLint
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new Parcelable.Creator<ResultReceiverWrapper>() { // from class: android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.1
            @Override // android.os.Parcelable.Creator
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public ResultReceiverWrapper[] newArray(int i2) {
                return new ResultReceiverWrapper[i2];
            }
        };

        /* renamed from: b */
        public ResultReceiver f153b;

        public ResultReceiverWrapper(Parcel parcel) {
            this.f153b = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            this.f153b.writeToParcel(parcel, i2);
        }
    }

    @SuppressLint
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator<Token>() { // from class: android.support.v4.media.session.MediaSessionCompat.Token.1
            @Override // android.os.Parcelable.Creator
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null), null, null);
            }

            @Override // android.os.Parcelable.Creator
            public Token[] newArray(int i2) {
                return new Token[i2];
            }
        };

        /* renamed from: b */
        public final Object f154b = new Object();

        /* renamed from: c */
        public final Object f155c;

        /* renamed from: d */
        @GuardedBy
        public IMediaSession f156d;

        /* renamed from: e */
        @GuardedBy
        public VersionedParcelable f157e;

        public Token(Object obj, IMediaSession iMediaSession, VersionedParcelable versionedParcelable) {
            this.f155c = obj;
            this.f156d = iMediaSession;
            this.f157e = versionedParcelable;
        }

        @RestrictTo
        /* renamed from: a */
        public static Token m268a(Object obj, IMediaSession iMediaSession) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof MediaSession.Token) {
                return new Token(obj, iMediaSession, null);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        @RestrictTo
        /* renamed from: c */
        public IMediaSession m269c() {
            IMediaSession iMediaSession;
            synchronized (this.f154b) {
                iMediaSession = this.f156d;
            }
            return iMediaSession;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f155c;
            if (obj2 == null) {
                return token.f155c == null;
            }
            Object obj3 = token.f155c;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f155c;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable((Parcelable) this.f155c, i2);
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f94d = i2 >= 31 || (i2 >= 30 && BuildCompat.m1940a("S", Build.VERSION.CODENAME)) ? 33554432 : 0;
    }

    public MediaSessionCompat(@NonNull Context context, @NonNull String str) {
        ComponentName componentName;
        PendingIntent pendingIntent;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        int i2 = MediaButtonReceiver.f4876a;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
        } else {
            if (queryBroadcastReceivers.size() > 1) {
                Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            }
            componentName = null;
        }
        if (componentName == null) {
            Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
        }
        if (componentName != null) {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, f94d);
        } else {
            pendingIntent = null;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            this.f96a = new MediaSessionImplApi29(context, str, null, null);
        } else if (i3 >= 28) {
            this.f96a = new MediaSessionImplApi28(context, str, null, null);
        } else if (i3 >= 22) {
            this.f96a = new MediaSessionImplApi22(context, str, null, null);
        } else {
            this.f96a = new MediaSessionImplApi21(context, str, null, null);
        }
        this.f96a.mo239c(new Callback(this) { // from class: android.support.v4.media.session.MediaSessionCompat.1
        }, new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
        this.f96a.mo243g(pendingIntent);
        this.f97b = new MediaControllerCompat(context, this);
        if (f95e == 0) {
            f95e = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    @RestrictTo
    /* renamed from: a */
    public static void m195a(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* renamed from: b */
    public static PlaybackStateCompat m196b(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j2 = -1;
        if (playbackStateCompat.f164c == -1) {
            return playbackStateCompat;
        }
        int i2 = playbackStateCompat.f163b;
        if (i2 != 3 && i2 != 4 && i2 != 5) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.f170i <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = ((long) (playbackStateCompat.f166e * (elapsedRealtime - r0))) + playbackStateCompat.f164c;
        if (mediaMetadataCompat != null && mediaMetadataCompat.f73b.containsKey("android.media.metadata.DURATION")) {
            j2 = mediaMetadataCompat.f73b.getLong("android.media.metadata.DURATION", 0L);
        }
        long j4 = (j2 < 0 || j3 <= j2) ? j3 < 0 ? 0L : j3 : j2;
        PlaybackStateCompat.Builder builder = new PlaybackStateCompat.Builder(playbackStateCompat);
        builder.m298b(playbackStateCompat.f163b, j4, playbackStateCompat.f166e, elapsedRealtime);
        return builder.m297a();
    }

    @Nullable
    @RestrictTo
    /* renamed from: j */
    public static Bundle m197j(@Nullable Bundle bundle) {
        m195a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    /* renamed from: c */
    public void m198c(boolean z) {
        this.f96a.mo244h(z);
        Iterator<OnActiveChangeListener> it = this.f98c.iterator();
        while (it.hasNext()) {
            it.next().m263a();
        }
    }

    /* renamed from: d */
    public void m199d(Callback callback, Handler handler) {
        this.f96a.mo239c(callback, handler);
    }

    /* renamed from: e */
    public void m200e(int i2) {
        this.f96a.mo238b(i2);
    }

    /* renamed from: f */
    public void m201f(MediaMetadataCompat mediaMetadataCompat) {
        this.f96a.mo241e(mediaMetadataCompat);
    }

    /* renamed from: g */
    public void m202g(PlaybackStateCompat playbackStateCompat) {
        this.f96a.mo246j(playbackStateCompat);
    }

    /* renamed from: h */
    public void m203h(int i2) {
        this.f96a.mo242f(i2);
    }

    /* renamed from: i */
    public void m204i(int i2) {
        this.f96a.mo248s(i2);
    }

    @SuppressLint
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new Parcelable.Creator<QueueItem>() { // from class: android.support.v4.media.session.MediaSessionCompat.QueueItem.1
            @Override // android.os.Parcelable.Creator
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public QueueItem[] newArray(int i2) {
                return new QueueItem[i2];
            }
        };

        /* renamed from: b */
        public final MediaDescriptionCompat f150b;

        /* renamed from: c */
        public final long f151c;

        /* renamed from: d */
        public MediaSession.QueueItem f152d;

        @RequiresApi
        public static class Api21Impl {
            @DoNotInline
            /* renamed from: a */
            public static MediaSession.QueueItem m265a(MediaDescription mediaDescription, long j2) {
                return new MediaSession.QueueItem(mediaDescription, j2);
            }

            @DoNotInline
            /* renamed from: b */
            public static MediaDescription m266b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            @DoNotInline
            /* renamed from: c */
            public static long m267c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j2) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j2 == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.f150b = mediaDescriptionCompat;
            this.f151c = j2;
            this.f152d = queueItem;
        }

        /* renamed from: a */
        public static List<QueueItem> m264a(List<?> list) {
            QueueItem queueItem;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj != null) {
                    MediaSession.QueueItem queueItem2 = (MediaSession.QueueItem) obj;
                    queueItem = new QueueItem(queueItem2, MediaDescriptionCompat.m93a(Api21Impl.m266b(queueItem2)), Api21Impl.m267c(queueItem2));
                } else {
                    queueItem = null;
                }
                arrayList.add(queueItem);
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder m24u = C0000a.m24u("MediaSession.QueueItem {Description=");
            m24u.append(this.f150b);
            m24u.append(", Id=");
            return C0000a.m19p(m24u, this.f151c, " }");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            ((MediaDescription) this.f150b.m94c()).writeToParcel(parcel, i2);
            parcel.writeLong(this.f151c);
        }

        public QueueItem(Parcel parcel) {
            this.f150b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f151c = parcel.readLong();
        }
    }
}
