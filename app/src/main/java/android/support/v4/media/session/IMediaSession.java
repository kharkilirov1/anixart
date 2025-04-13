package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.yandex.mobile.ads.C4632R;
import java.util.List;

/* loaded from: classes.dex */
public interface IMediaSession extends IInterface {

    public static class Default implements IMediaSession {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        /* renamed from: c1 */
        public boolean mo168c1(KeyEvent keyEvent) throws RemoteException {
            return false;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public MediaMetadataCompat getMetadata() throws RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        public PlaybackStateCompat getPlaybackState() throws RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        /* renamed from: n */
        public List<MediaSessionCompat.QueueItem> mo177n() throws RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession
        /* renamed from: z */
        public void mo187z(IMediaControllerCallback iMediaControllerCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IMediaSession {

        /* renamed from: a */
        public static final /* synthetic */ int f81a = 0;

        public static class Proxy implements IMediaSession {

            /* renamed from: a */
            public IBinder f82a;

            public Proxy(IBinder iBinder) {
                this.f82a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f82a;
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: c1 */
            public boolean mo168c1(KeyEvent keyEvent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(1);
                    keyEvent.writeToParcel(obtain, 0);
                    if (!this.f82a.transact(2, obtain, obtain2, 0)) {
                        int i2 = Stub.f81a;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public MediaMetadataCompat getMetadata() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f82a.transact(27, obtain, obtain2, 0)) {
                        int i2 = Stub.f81a;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public PlaybackStateCompat getPlaybackState() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f82a.transact(28, obtain, obtain2, 0)) {
                        int i2 = Stub.f81a;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: n */
            public List<MediaSessionCompat.QueueItem> mo177n() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f82a.transact(29, obtain, obtain2, 0)) {
                        int i2 = Stub.f81a;
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            /* renamed from: z */
            public void mo187z(IMediaControllerCallback iMediaControllerCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(iMediaControllerCallback.asBinder());
                    if (!this.f82a.transact(3, obtain, obtain2, 0)) {
                        int i2 = Stub.f81a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        /* renamed from: i */
        public static IMediaSession m188i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IMediaSession)) ? new Proxy(iBinder) : (IMediaSession) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaSession");
                return true;
            }
            switch (i2) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo159Q1(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean mo168c1 = mo168c1(parcel.readInt() != 0 ? (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(mo168c1 ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo187z(IMediaControllerCallback.Stub.m145i(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo147B0(IMediaControllerCallback.Stub.m145i(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean mo162U = mo162U();
                    parcel2.writeNoException();
                    parcel2.writeInt(mo162U ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String mo185x2 = mo185x2();
                    parcel2.writeNoException();
                    parcel2.writeString(mo185x2);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String mo169e = mo169e();
                    parcel2.writeNoException();
                    parcel2.writeString(mo169e);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PendingIntent mo164X = mo164X();
                    parcel2.writeNoException();
                    if (mo164X != null) {
                        parcel2.writeInt(1);
                        mo164X.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    long mo179p = mo179p();
                    parcel2.writeNoException();
                    parcel2.writeLong(mo179p);
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    ParcelableVolumeInfo mo176l2 = mo176l2();
                    parcel2.writeNoException();
                    if (mo176l2 != null) {
                        parcel2.writeInt(1);
                        mo176l2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo171g1(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo156N(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    play();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo150H0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo153J0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo158O0(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo173h2(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    pause();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    stop();
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    next();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    previous();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo155L0();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo161T1();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo172h(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo154K(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo183u(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    MediaMetadataCompat metadata = getMetadata();
                    parcel2.writeNoException();
                    if (metadata != null) {
                        parcel2.writeInt(1);
                        parcel2.writeBundle(metadata.f73b);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 28:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PlaybackStateCompat playbackState = getPlaybackState();
                    parcel2.writeNoException();
                    if (playbackState != null) {
                        parcel2.writeInt(1);
                        playbackState.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 29:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    List<MediaSessionCompat.QueueItem> mo177n = mo177n();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(mo177n);
                    return true;
                case 30:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    CharSequence mo184u0 = mo184u0();
                    parcel2.writeNoException();
                    if (mo184u0 != null) {
                        parcel2.writeInt(1);
                        TextUtils.writeToParcel(mo184u0, parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 31:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle extras = getExtras();
                    parcel2.writeNoException();
                    if (extras != null) {
                        parcel2.writeInt(1);
                        extras.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 32:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int mo166Z = mo166Z();
                    parcel2.writeNoException();
                    parcel2.writeInt(mo166Z);
                    return true;
                case 33:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    prepare();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo186y0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo167c0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo157O(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int mo180r = mo180r();
                    parcel2.writeNoException();
                    parcel2.writeInt(mo180r);
                    return true;
                case C4632R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean mo151I = mo151I();
                    parcel2.writeNoException();
                    parcel2.writeInt(mo151I ? 1 : 0);
                    return true;
                case 39:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo170f(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo174i2(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo163V(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo178n1(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo160T(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo149F1(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 45:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean mo152I1 = mo152I1();
                    parcel2.writeNoException();
                    parcel2.writeInt(mo152I1 ? 1 : 0);
                    return true;
                case 46:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo182t1(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 47:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int mo148E1 = mo148E1();
                    parcel2.writeNoException();
                    parcel2.writeInt(mo148E1);
                    return true;
                case 48:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo181s(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo165X0(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 50:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle mo146A0 = mo146A0();
                    parcel2.writeNoException();
                    if (mo146A0 != null) {
                        parcel2.writeInt(1);
                        mo146A0.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 51:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mo175k1(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
            }
        }
    }

    /* renamed from: A0 */
    Bundle mo146A0() throws RemoteException;

    /* renamed from: B0 */
    void mo147B0(IMediaControllerCallback iMediaControllerCallback) throws RemoteException;

    /* renamed from: E1 */
    int mo148E1() throws RemoteException;

    /* renamed from: F1 */
    void mo149F1(int i2) throws RemoteException;

    /* renamed from: H0 */
    void mo150H0(String str, Bundle bundle) throws RemoteException;

    /* renamed from: I */
    boolean mo151I() throws RemoteException;

    /* renamed from: I1 */
    boolean mo152I1() throws RemoteException;

    /* renamed from: J0 */
    void mo153J0(String str, Bundle bundle) throws RemoteException;

    /* renamed from: K */
    void mo154K(RatingCompat ratingCompat) throws RemoteException;

    /* renamed from: L0 */
    void mo155L0() throws RemoteException;

    /* renamed from: N */
    void mo156N(int i2, int i3, String str) throws RemoteException;

    /* renamed from: O */
    void mo157O(Uri uri, Bundle bundle) throws RemoteException;

    /* renamed from: O0 */
    void mo158O0(Uri uri, Bundle bundle) throws RemoteException;

    /* renamed from: Q1 */
    void mo159Q1(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException;

    /* renamed from: T */
    void mo160T(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    /* renamed from: T1 */
    void mo161T1() throws RemoteException;

    /* renamed from: U */
    boolean mo162U() throws RemoteException;

    /* renamed from: V */
    void mo163V(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    /* renamed from: X */
    PendingIntent mo164X() throws RemoteException;

    /* renamed from: X0 */
    void mo165X0(float f2) throws RemoteException;

    /* renamed from: Z */
    int mo166Z() throws RemoteException;

    /* renamed from: c0 */
    void mo167c0(String str, Bundle bundle) throws RemoteException;

    /* renamed from: c1 */
    boolean mo168c1(KeyEvent keyEvent) throws RemoteException;

    /* renamed from: e */
    String mo169e() throws RemoteException;

    /* renamed from: f */
    void mo170f(int i2) throws RemoteException;

    /* renamed from: g1 */
    void mo171g1(int i2, int i3, String str) throws RemoteException;

    Bundle getExtras() throws RemoteException;

    MediaMetadataCompat getMetadata() throws RemoteException;

    PlaybackStateCompat getPlaybackState() throws RemoteException;

    /* renamed from: h */
    void mo172h(long j2) throws RemoteException;

    /* renamed from: h2 */
    void mo173h2(long j2) throws RemoteException;

    /* renamed from: i2 */
    void mo174i2(boolean z) throws RemoteException;

    /* renamed from: k1 */
    void mo175k1(RatingCompat ratingCompat, Bundle bundle) throws RemoteException;

    /* renamed from: l2 */
    ParcelableVolumeInfo mo176l2() throws RemoteException;

    /* renamed from: n */
    List<MediaSessionCompat.QueueItem> mo177n() throws RemoteException;

    /* renamed from: n1 */
    void mo178n1(MediaDescriptionCompat mediaDescriptionCompat, int i2) throws RemoteException;

    void next() throws RemoteException;

    /* renamed from: p */
    long mo179p() throws RemoteException;

    void pause() throws RemoteException;

    void play() throws RemoteException;

    void prepare() throws RemoteException;

    void previous() throws RemoteException;

    /* renamed from: r */
    int mo180r() throws RemoteException;

    /* renamed from: s */
    void mo181s(int i2) throws RemoteException;

    void stop() throws RemoteException;

    /* renamed from: t1 */
    void mo182t1(boolean z) throws RemoteException;

    /* renamed from: u */
    void mo183u(String str, Bundle bundle) throws RemoteException;

    /* renamed from: u0 */
    CharSequence mo184u0() throws RemoteException;

    /* renamed from: x2 */
    String mo185x2() throws RemoteException;

    /* renamed from: y0 */
    void mo186y0(String str, Bundle bundle) throws RemoteException;

    /* renamed from: z */
    void mo187z(IMediaControllerCallback iMediaControllerCallback) throws RemoteException;
}
