package androidx.core.app;

import android.app.PendingIntent;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
import androidx.versionedparcelable.VersionedParcelable;

@RestrictTo
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        VersionedParcelable versionedParcelable = remoteActionCompat.f3263a;
        if (versionedParcel.mo4320j(1)) {
            versionedParcelable = versionedParcel.m4326p();
        }
        remoteActionCompat.f3263a = (IconCompat) versionedParcelable;
        CharSequence charSequence = remoteActionCompat.f3264b;
        if (versionedParcel.mo4320j(2)) {
            charSequence = versionedParcel.mo4319i();
        }
        remoteActionCompat.f3264b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f3265c;
        if (versionedParcel.mo4320j(3)) {
            charSequence2 = versionedParcel.mo4319i();
        }
        remoteActionCompat.f3265c = charSequence2;
        remoteActionCompat.f3266d = (PendingIntent) versionedParcel.m4324n(remoteActionCompat.f3266d, 4);
        boolean z = remoteActionCompat.f3267e;
        if (versionedParcel.mo4320j(5)) {
            z = versionedParcel.mo4317g();
        }
        remoteActionCompat.f3267e = z;
        boolean z2 = remoteActionCompat.f3268f;
        if (versionedParcel.mo4320j(6)) {
            z2 = versionedParcel.mo4317g();
        }
        remoteActionCompat.f3268f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.mo4328r(false, false);
        IconCompat iconCompat = remoteActionCompat.f3263a;
        versionedParcel.mo4327q(1);
        versionedParcel.m4335y(iconCompat);
        CharSequence charSequence = remoteActionCompat.f3264b;
        versionedParcel.mo4327q(2);
        versionedParcel.mo4331u(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f3265c;
        versionedParcel.mo4327q(3);
        versionedParcel.mo4331u(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f3266d;
        versionedParcel.mo4327q(4);
        versionedParcel.mo4333w(pendingIntent);
        boolean z = remoteActionCompat.f3267e;
        versionedParcel.mo4327q(5);
        versionedParcel.mo4329s(z);
        boolean z2 = remoteActionCompat.f3268f;
        versionedParcel.mo4327q(6);
        versionedParcel.mo4329s(z2);
    }
}
