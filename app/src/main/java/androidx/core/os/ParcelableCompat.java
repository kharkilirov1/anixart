package androidx.core.os;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* loaded from: classes.dex */
public final class ParcelableCompat {

    public static class ParcelableCompatCreatorHoneycombMR2<T> implements Parcelable.ClassLoaderCreator<T> {
        @Override // android.os.Parcelable.Creator
        public T createFromParcel(Parcel parcel) {
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int i2) {
            throw null;
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            throw null;
        }
    }
}
