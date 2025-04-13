package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

@RestrictTo
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3401a = versionedParcel.m4322l(iconCompat.f3401a, 1);
        byte[] bArr = iconCompat.f3403c;
        if (versionedParcel.mo4320j(2)) {
            bArr = versionedParcel.mo4318h();
        }
        iconCompat.f3403c = bArr;
        iconCompat.f3404d = versionedParcel.m4324n(iconCompat.f3404d, 3);
        iconCompat.f3405e = versionedParcel.m4322l(iconCompat.f3405e, 4);
        iconCompat.f3406f = versionedParcel.m4322l(iconCompat.f3406f, 5);
        iconCompat.f3407g = (ColorStateList) versionedParcel.m4324n(iconCompat.f3407g, 6);
        String str = iconCompat.f3409i;
        if (versionedParcel.mo4320j(7)) {
            str = versionedParcel.mo4325o();
        }
        iconCompat.f3409i = str;
        String str2 = iconCompat.f3410j;
        if (versionedParcel.mo4320j(8)) {
            str2 = versionedParcel.mo4325o();
        }
        iconCompat.f3410j = str2;
        iconCompat.f3408h = PorterDuff.Mode.valueOf(iconCompat.f3409i);
        switch (iconCompat.f3401a) {
            case -1:
                Parcelable parcelable = iconCompat.f3404d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f3402b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f3404d;
                if (parcelable2 != null) {
                    iconCompat.f3402b = parcelable2;
                } else {
                    byte[] bArr2 = iconCompat.f3403c;
                    iconCompat.f3402b = bArr2;
                    iconCompat.f3401a = 3;
                    iconCompat.f3405e = 0;
                    iconCompat.f3406f = bArr2.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f3403c, Charset.forName("UTF-16"));
                iconCompat.f3402b = str3;
                if (iconCompat.f3401a == 2 && iconCompat.f3410j == null) {
                    iconCompat.f3410j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f3402b = iconCompat.f3403c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.mo4328r(true, true);
        boolean m4316f = versionedParcel.m4316f();
        iconCompat.f3409i = iconCompat.f3408h.name();
        switch (iconCompat.f3401a) {
            case -1:
                if (!m4316f) {
                    iconCompat.f3404d = (Parcelable) iconCompat.f3402b;
                    break;
                } else {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
            case 1:
            case 5:
                if (!m4316f) {
                    iconCompat.f3404d = (Parcelable) iconCompat.f3402b;
                    break;
                } else {
                    Bitmap bitmap = (Bitmap) iconCompat.f3402b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    iconCompat.f3403c = byteArrayOutputStream.toByteArray();
                    break;
                }
            case 2:
                iconCompat.f3403c = ((String) iconCompat.f3402b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f3403c = (byte[]) iconCompat.f3402b;
                break;
            case 4:
            case 6:
                iconCompat.f3403c = iconCompat.f3402b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f3401a;
        if (-1 != i2) {
            versionedParcel.mo4327q(1);
            versionedParcel.mo4332v(i2);
        }
        byte[] bArr = iconCompat.f3403c;
        if (bArr != null) {
            versionedParcel.mo4327q(2);
            versionedParcel.mo4330t(bArr);
        }
        Parcelable parcelable = iconCompat.f3404d;
        if (parcelable != null) {
            versionedParcel.mo4327q(3);
            versionedParcel.mo4333w(parcelable);
        }
        int i3 = iconCompat.f3405e;
        if (i3 != 0) {
            versionedParcel.mo4327q(4);
            versionedParcel.mo4332v(i3);
        }
        int i4 = iconCompat.f3406f;
        if (i4 != 0) {
            versionedParcel.mo4327q(5);
            versionedParcel.mo4332v(i4);
        }
        ColorStateList colorStateList = iconCompat.f3407g;
        if (colorStateList != null) {
            versionedParcel.mo4327q(6);
            versionedParcel.mo4333w(colorStateList);
        }
        String str = iconCompat.f3409i;
        if (str != null) {
            versionedParcel.mo4327q(7);
            versionedParcel.mo4334x(str);
        }
        String str2 = iconCompat.f3410j;
        if (str2 != null) {
            versionedParcel.mo4327q(8);
            versionedParcel.mo4334x(str2);
        }
    }
}
