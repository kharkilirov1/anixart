package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.os.IResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Objects;

@SuppressLint
@RestrictTo
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new Parcelable.Creator<ResultReceiver>() { // from class: android.support.v4.os.ResultReceiver.1
        @Override // android.os.Parcelable.Creator
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ResultReceiver[] newArray(int i2) {
            return new ResultReceiver[i2];
        }
    };

    /* renamed from: b */
    public IResultReceiver f196b;

    public class MyResultReceiver extends IResultReceiver.Stub {
        public MyResultReceiver() {
        }

        @Override // android.support.v4.os.IResultReceiver
        /* renamed from: C2 */
        public void mo299C2(int i2, Bundle bundle) {
            Objects.requireNonNull(ResultReceiver.this);
            ResultReceiver.this.mo76a(i2, bundle);
        }
    }

    public class MyRunnable implements Runnable {

        /* renamed from: b */
        public final int f198b;

        /* renamed from: c */
        public final Bundle f199c;

        /* renamed from: d */
        public final /* synthetic */ ResultReceiver f200d;

        @Override // java.lang.Runnable
        public void run() {
            this.f200d.mo76a(this.f198b, this.f199c);
        }
    }

    public ResultReceiver(Parcel parcel) {
        IResultReceiver proxy;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i2 = IResultReceiver.Stub.f194a;
        if (readStrongBinder == null) {
            proxy = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            proxy = (queryLocalInterface == null || !(queryLocalInterface instanceof IResultReceiver)) ? new IResultReceiver.Stub.Proxy(readStrongBinder) : (IResultReceiver) queryLocalInterface;
        }
        this.f196b = proxy;
    }

    /* renamed from: a */
    public void mo76a(int i2, Bundle bundle) {
    }

    /* renamed from: c */
    public void m300c(int i2, Bundle bundle) {
        IResultReceiver iResultReceiver = this.f196b;
        if (iResultReceiver != null) {
            try {
                iResultReceiver.mo299C2(i2, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        synchronized (this) {
            if (this.f196b == null) {
                this.f196b = new MyResultReceiver();
            }
            parcel.writeStrongBinder(this.f196b.asBinder());
        }
    }
}
