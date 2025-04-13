package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public class SafeParcelWriter {
    /* renamed from: a */
    public static int m8162a(@NonNull Parcel parcel) {
        return m8173l(parcel, 20293);
    }

    /* renamed from: b */
    public static void m8163b(@NonNull Parcel parcel, int i2, @NonNull Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                parcel.writeInt(i2 | 0);
            }
        } else {
            int m8173l = m8173l(parcel, i2);
            parcel.writeBundle(bundle);
            m8174m(parcel, m8173l);
        }
    }

    /* renamed from: c */
    public static void m8164c(@NonNull Parcel parcel, int i2, @NonNull byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                parcel.writeInt(i2 | 0);
            }
        } else {
            int m8173l = m8173l(parcel, i2);
            parcel.writeByteArray(bArr);
            m8174m(parcel, m8173l);
        }
    }

    /* renamed from: d */
    public static void m8165d(@NonNull Parcel parcel, int i2, @NonNull IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                parcel.writeInt(i2 | 0);
            }
        } else {
            int m8173l = m8173l(parcel, i2);
            parcel.writeStrongBinder(iBinder);
            m8174m(parcel, m8173l);
        }
    }

    /* renamed from: e */
    public static void m8166e(@NonNull Parcel parcel, int i2, @NonNull Long l2, boolean z) {
        if (l2 != null) {
            parcel.writeInt(i2 | 524288);
            parcel.writeLong(l2.longValue());
        } else if (z) {
            parcel.writeInt(i2 | 0);
        }
    }

    /* renamed from: f */
    public static void m8167f(@NonNull Parcel parcel, int i2, @NonNull Parcelable parcelable, int i3, boolean z) {
        if (parcelable == null) {
            if (z) {
                parcel.writeInt(i2 | 0);
            }
        } else {
            int m8173l = m8173l(parcel, i2);
            parcelable.writeToParcel(parcel, i3);
            m8174m(parcel, m8173l);
        }
    }

    /* renamed from: g */
    public static void m8168g(@NonNull Parcel parcel, int i2, @NonNull String str, boolean z) {
        if (str == null) {
            if (z) {
                parcel.writeInt(i2 | 0);
            }
        } else {
            int m8173l = m8173l(parcel, i2);
            parcel.writeString(str);
            m8174m(parcel, m8173l);
        }
    }

    /* renamed from: h */
    public static void m8169h(@NonNull Parcel parcel, int i2, @NonNull String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                parcel.writeInt(i2 | 0);
            }
        } else {
            int m8173l = m8173l(parcel, i2);
            parcel.writeStringArray(strArr);
            m8174m(parcel, m8173l);
        }
    }

    /* renamed from: i */
    public static void m8170i(@NonNull Parcel parcel, int i2, @NonNull List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                parcel.writeInt(i2 | 0);
            }
        } else {
            int m8173l = m8173l(parcel, i2);
            parcel.writeStringList(list);
            m8174m(parcel, m8173l);
        }
    }

    /* renamed from: j */
    public static <T extends Parcelable> void m8171j(@NonNull Parcel parcel, int i2, @NonNull T[] tArr, int i3, boolean z) {
        if (tArr == null) {
            if (z) {
                parcel.writeInt(i2 | 0);
                return;
            }
            return;
        }
        int m8173l = m8173l(parcel, i2);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m8175n(parcel, t, i3);
            }
        }
        m8174m(parcel, m8173l);
    }

    /* renamed from: k */
    public static <T extends Parcelable> void m8172k(@NonNull Parcel parcel, int i2, @NonNull List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                parcel.writeInt(i2 | 0);
                return;
            }
            return;
        }
        int m8173l = m8173l(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            T t = list.get(i3);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m8175n(parcel, t, 0);
            }
        }
        m8174m(parcel, m8173l);
    }

    /* renamed from: l */
    public static int m8173l(Parcel parcel, int i2) {
        parcel.writeInt(i2 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: m */
    public static void m8174m(Parcel parcel, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(dataPosition - i2);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: n */
    public static <T extends Parcelable> void m8175n(Parcel parcel, T t, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i2);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
