package android.support.v4.media.session;

import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.app.BundleCompat;
import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.ParcelImpl;
import androidx.versionedparcelable.ParcelUtils;
import androidx.versionedparcelable.VersionedParcelable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class MediaControllerCompat {

    /* renamed from: a */
    public final MediaControllerImpl f83a;

    public static abstract class Callback implements IBinder.DeathRecipient {

        /* renamed from: a */
        public IMediaControllerCallback f84a;

        @RequiresApi
        public static class MediaControllerCallbackApi21 extends MediaController.Callback {

            /* renamed from: a */
            public final WeakReference<Callback> f85a;

            public MediaControllerCallbackApi21(Callback callback) {
                this.f85a = new WeakReference<>(callback);
            }

            @Override // android.media.session.MediaController.Callback
            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                if (this.f85a.get() != null) {
                    playbackInfo.getPlaybackType();
                    playbackInfo.getAudioAttributes();
                    if (Build.VERSION.SDK_INT >= 26) {
                    }
                    playbackInfo.getVolumeControl();
                    playbackInfo.getMaxVolume();
                    playbackInfo.getCurrentVolume();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.m195a(bundle);
                this.f85a.get();
            }

            @Override // android.media.session.MediaController.Callback
            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                if (this.f85a.get() != null) {
                    MediaMetadataCompat.m113a(mediaMetadata);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onPlaybackStateChanged(PlaybackState playbackState) {
                Callback callback = this.f85a.get();
                if (callback == null || callback.f84a != null) {
                    return;
                }
                PlaybackStateCompat.m270a(playbackState);
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                if (this.f85a.get() != null) {
                    MediaSessionCompat.QueueItem.m264a(list);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueTitleChanged(CharSequence charSequence) {
                this.f85a.get();
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionDestroyed() {
                this.f85a.get();
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.m195a(bundle);
                this.f85a.get();
            }
        }

        public class MessageHandler extends Handler {
            @Override // android.os.Handler
            public void handleMessage(Message message) {
            }
        }

        public static class StubCompat extends IMediaControllerCallback.Stub {

            /* renamed from: b */
            public final WeakReference<Callback> f86b;

            public StubCompat(Callback callback) {
                this.f86b = new WeakReference<>(callback);
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            /* renamed from: A2 */
            public void mo137A2(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                this.f86b.get();
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            /* renamed from: D2 */
            public void mo138D2(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                if (this.f86b.get() == null || parcelableVolumeInfo == null) {
                    return;
                }
                new PlaybackInfo(parcelableVolumeInfo.f158b, parcelableVolumeInfo.f159c, parcelableVolumeInfo.f160d, parcelableVolumeInfo.f161e, parcelableVolumeInfo.f162f);
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            /* renamed from: N1 */
            public void mo139N1(int i2) throws RemoteException {
                this.f86b.get();
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            /* renamed from: e1 */
            public void mo140e1(CharSequence charSequence) throws RemoteException {
                this.f86b.get();
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            /* renamed from: l0 */
            public void mo141l0(Bundle bundle) throws RemoteException {
                this.f86b.get();
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            /* renamed from: m1 */
            public void mo142m1() throws RemoteException {
                this.f86b.get();
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            /* renamed from: o1 */
            public void mo143o1(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                this.f86b.get();
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onRepeatModeChanged(int i2) throws RemoteException {
                this.f86b.get();
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            /* renamed from: r0 */
            public void mo144r0(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                this.f86b.get();
            }
        }

        public Callback() {
            new MediaControllerCallbackApi21(this);
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
        }
    }

    public interface MediaControllerImpl {
        /* renamed from: a */
        boolean mo192a(KeyEvent keyEvent);

        PlaybackStateCompat getPlaybackState();

        /* renamed from: n */
        List<MediaSessionCompat.QueueItem> mo193n();
    }

    @RequiresApi
    public static class MediaControllerImplApi21 implements MediaControllerImpl {

        /* renamed from: a */
        public final MediaController f87a;

        /* renamed from: b */
        public final Object f88b = new Object();

        /* renamed from: c */
        @GuardedBy
        public final List<Callback> f89c = new ArrayList();

        /* renamed from: d */
        public HashMap<Callback, ExtraCallback> f90d = new HashMap<>();

        /* renamed from: e */
        public final MediaSessionCompat.Token f91e;

        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: b */
            public WeakReference<MediaControllerImplApi21> f92b;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f92b = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i2, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.f92b.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.f88b) {
                    MediaSessionCompat.Token token = mediaControllerImplApi21.f91e;
                    IMediaSession m188i = IMediaSession.Stub.m188i(BundleCompat.m1571a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                    synchronized (token.f154b) {
                        token.f156d = m188i;
                    }
                    MediaSessionCompat.Token token2 = mediaControllerImplApi21.f91e;
                    VersionedParcelable versionedParcelable = null;
                    try {
                        Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                        if (bundle2 != null) {
                            bundle2.setClassLoader(ParcelUtils.class.getClassLoader());
                            Parcelable parcelable = bundle2.getParcelable("a");
                            if (!(parcelable instanceof ParcelImpl)) {
                                throw new IllegalArgumentException("Invalid parcel");
                            }
                            versionedParcelable = ((ParcelImpl) parcelable).f6477b;
                        }
                    } catch (RuntimeException unused) {
                    }
                    synchronized (token2.f154b) {
                        token2.f157e = versionedParcelable;
                    }
                    mediaControllerImplApi21.m194b();
                }
            }
        }

        public static class ExtraCallback extends Callback.StubCompat {
            public ExtraCallback(Callback callback) {
                super(callback);
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            /* renamed from: D2 */
            public void mo138D2(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            /* renamed from: e1 */
            public void mo140e1(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            /* renamed from: l0 */
            public void mo141l0(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            /* renamed from: m1 */
            public void mo142m1() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            /* renamed from: o1 */
            public void mo143o1(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            /* renamed from: r0 */
            public void mo144r0(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f91e = token;
            MediaController mediaController = new MediaController(context, (MediaSession.Token) token.f155c);
            this.f87a = mediaController;
            if (token.m269c() == null) {
                mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        /* renamed from: a */
        public boolean mo192a(KeyEvent keyEvent) {
            return this.f87a.dispatchMediaButtonEvent(keyEvent);
        }

        @GuardedBy
        /* renamed from: b */
        public void m194b() {
            if (this.f91e.m269c() == null) {
                return;
            }
            for (Callback callback : this.f89c) {
                ExtraCallback extraCallback = new ExtraCallback(callback);
                this.f90d.put(callback, extraCallback);
                callback.f84a = extraCallback;
                try {
                    this.f91e.m269c().mo187z(extraCallback);
                } catch (RemoteException e2) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e2);
                }
            }
            this.f89c.clear();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public PlaybackStateCompat getPlaybackState() {
            if (this.f91e.m269c() != null) {
                try {
                    return this.f91e.m269c().getPlaybackState();
                } catch (RemoteException e2) {
                    Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e2);
                }
            }
            PlaybackState playbackState = this.f87a.getPlaybackState();
            if (playbackState != null) {
                return PlaybackStateCompat.m270a(playbackState);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        /* renamed from: n */
        public List<MediaSessionCompat.QueueItem> mo193n() {
            List<MediaSession.QueueItem> queue = this.f87a.getQueue();
            if (queue != null) {
                return MediaSessionCompat.QueueItem.m264a(queue);
            }
            return null;
        }
    }

    @RequiresApi
    public static class MediaControllerImplApi29 extends MediaControllerImplApi21 {
        public MediaControllerImplApi29(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    public static class MediaControllerImplBase implements MediaControllerImpl {

        /* renamed from: a */
        public IMediaSession f93a;

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        /* renamed from: a */
        public boolean mo192a(KeyEvent keyEvent) {
            try {
                this.f93a.mo168c1(keyEvent);
                return false;
            } catch (RemoteException e2) {
                Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", e2);
                return false;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public PlaybackStateCompat getPlaybackState() {
            try {
                return this.f93a.getPlaybackState();
            } catch (RemoteException e2) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e2);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        /* renamed from: n */
        public List<MediaSessionCompat.QueueItem> mo193n() {
            try {
                return this.f93a.mo177n();
            } catch (RemoteException e2) {
                Log.e("MediaControllerCompat", "Dead object in getQueue.", e2);
                return null;
            }
        }
    }

    public static final class PlaybackInfo {
        public PlaybackInfo(int i2, int i3, int i4, int i5, int i6) {
            AudioAttributesCompat.Builder builder = new AudioAttributesCompat.Builder();
            builder.f4773a.mo3287a(i3);
            builder.m3283a();
        }
    }

    public static abstract class TransportControls {
    }

    @RequiresApi
    public static class TransportControlsApi21 extends TransportControls {
    }

    @RequiresApi
    public static class TransportControlsApi23 extends TransportControlsApi21 {
    }

    @RequiresApi
    public static class TransportControlsApi24 extends TransportControlsApi23 {
    }

    @RequiresApi
    public static class TransportControlsApi29 extends TransportControlsApi24 {
    }

    public static class TransportControlsBase extends TransportControls {
    }

    public MediaControllerCompat(Context context, @NonNull MediaSessionCompat mediaSessionCompat) {
        new ConcurrentHashMap();
        MediaSessionCompat.Token mo237a = mediaSessionCompat.f96a.mo237a();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f83a = new MediaControllerImplApi29(context, mo237a);
        } else {
            this.f83a = new MediaControllerImplApi21(context, mo237a);
        }
    }

    /* renamed from: a */
    public boolean m189a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f83a.mo192a(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    /* renamed from: b */
    public PlaybackStateCompat m190b() {
        return this.f83a.getPlaybackState();
    }

    /* renamed from: c */
    public List<MediaSessionCompat.QueueItem> m191c() {
        return this.f83a.mo193n();
    }

    public MediaControllerCompat(Context context, @NonNull MediaSessionCompat.Token token) {
        new ConcurrentHashMap();
        if (token != null) {
            this.f83a = new MediaControllerImplApi21(context, token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }
}
