package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public interface IMediaControllerCallback extends IInterface {

    public static class Default implements IMediaControllerCallback {
        @Override // android.support.v4.media.session.IMediaControllerCallback
        /* renamed from: A2 */
        public void mo137A2(PlaybackStateCompat playbackStateCompat) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        /* renamed from: N1 */
        public void mo139N1(int i2) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        /* renamed from: m1 */
        public void mo142m1() throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        /* renamed from: o1 */
        public void mo143o1(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        public void onRepeatModeChanged(int i2) throws RemoteException {
        }

        @Override // android.support.v4.media.session.IMediaControllerCallback
        /* renamed from: r0 */
        public void mo144r0(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IMediaControllerCallback {

        /* renamed from: a */
        public static final /* synthetic */ int f79a = 0;

        public static class Proxy implements IMediaControllerCallback {

            /* renamed from: a */
            public IBinder f80a;

            public Proxy(IBinder iBinder) {
                this.f80a = iBinder;
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            /* renamed from: A2 */
            public void mo137A2(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        obtain.writeInt(1);
                        playbackStateCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f80a.transact(3, obtain, null, 1)) {
                        int i2 = Stub.f79a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            /* renamed from: N1 */
            public void mo139N1(int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i2);
                    if (!this.f80a.transact(12, obtain, null, 1)) {
                        int i3 = Stub.f79a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f80a;
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            /* renamed from: m1 */
            public void mo142m1() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (!this.f80a.transact(2, obtain, null, 1)) {
                        int i2 = Stub.f79a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            /* renamed from: o1 */
            public void mo143o1(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (mediaMetadataCompat != null) {
                        obtain.writeInt(1);
                        obtain.writeBundle(mediaMetadataCompat.f73b);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f80a.transact(4, obtain, null, 1)) {
                        int i2 = Stub.f79a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onRepeatModeChanged(int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i2);
                    if (!this.f80a.transact(9, obtain, null, 1)) {
                        int i3 = Stub.f79a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            /* renamed from: r0 */
            public void mo144r0(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeTypedList(list);
                    if (!this.f80a.transact(5, obtain, null, 1)) {
                        int i2 = Stub.f79a;
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        /* renamed from: i */
        public static IMediaControllerCallback m145i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IMediaControllerCallback)) ? new Proxy(iBinder) : (IMediaControllerCallback) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            switch (i2) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                    ((MediaControllerCompat.Callback.StubCompat) this).f86b.get();
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo142m1();
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    ((MediaControllerCompat.Callback.StubCompat) this).mo137A2(parcel.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo143o1(parcel.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo144r0(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo140e1(parcel.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo141l0(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo138D2(parcel.readInt() != 0 ? ParcelableVolumeInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    ((MediaControllerCompat.Callback.StubCompat) this).onRepeatModeChanged(parcel.readInt());
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    ((MediaControllerCompat.Callback.StubCompat) this).f86b.get();
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    ((MediaControllerCompat.Callback.StubCompat) this).mo139N1(parcel.readInt());
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    ((MediaControllerCompat.Callback.StubCompat) this).f86b.get();
                    return true;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
            }
        }
    }

    /* renamed from: A2 */
    void mo137A2(PlaybackStateCompat playbackStateCompat) throws RemoteException;

    /* renamed from: D2 */
    void mo138D2(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;

    /* renamed from: N1 */
    void mo139N1(int i2) throws RemoteException;

    /* renamed from: e1 */
    void mo140e1(CharSequence charSequence) throws RemoteException;

    /* renamed from: l0 */
    void mo141l0(Bundle bundle) throws RemoteException;

    /* renamed from: m1 */
    void mo142m1() throws RemoteException;

    /* renamed from: o1 */
    void mo143o1(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;

    void onRepeatModeChanged(int i2) throws RemoteException;

    /* renamed from: r0 */
    void mo144r0(List<MediaSessionCompat.QueueItem> list) throws RemoteException;
}
