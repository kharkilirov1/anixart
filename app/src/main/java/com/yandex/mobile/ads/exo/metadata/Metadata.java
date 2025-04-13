package com.yandex.mobile.ads.exo.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.l60;
import com.yandex.mobile.ads.impl.s91;
import com.yandex.mobile.ads.impl.sb0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new C4738a();

    /* renamed from: a */
    private final Entry[] f48048a;

    public interface Entry extends Parcelable {
        @Nullable
        /* renamed from: a */
        C5606pv mo22238a();

        /* renamed from: a */
        void mo22239a(sb0.C5738a c5738a);

        @Nullable
        /* renamed from: b */
        byte[] mo22240b();
    }

    /* renamed from: com.yandex.mobile.ads.exo.metadata.Metadata$a */
    public class C4738a implements Parcelable.Creator<Metadata> {
        @Override // android.os.Parcelable.Creator
        public final Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Metadata[] newArray(int i2) {
            return new Metadata[i2];
        }
    }

    public Metadata(Entry... entryArr) {
        this.f48048a = entryArr;
    }

    /* renamed from: a */
    public final Entry m22234a(int i2) {
        return this.f48048a[i2];
    }

    /* renamed from: c */
    public final int m22237c() {
        return this.f48048a.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f48048a, ((Metadata) obj).f48048a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f48048a);
    }

    public final String toString() {
        StringBuilder m26356a = l60.m26356a("entries=");
        m26356a.append(Arrays.toString(this.f48048a));
        return m26356a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f48048a.length);
        for (Entry entry : this.f48048a) {
            parcel.writeParcelable(entry, 0);
        }
    }

    /* renamed from: a */
    public final Metadata m22235a(@Nullable Metadata metadata) {
        return metadata == null ? this : m22236a(metadata.f48048a);
    }

    public Metadata(List<? extends Entry> list) {
        this.f48048a = (Entry[]) list.toArray(new Entry[0]);
    }

    /* renamed from: a */
    public final Metadata m22236a(Entry... entryArr) {
        return entryArr.length == 0 ? this : new Metadata((Entry[]) s91.m28115a((Object[]) this.f48048a, (Object[]) entryArr));
    }

    public Metadata(Parcel parcel) {
        this.f48048a = new Entry[parcel.readInt()];
        int i2 = 0;
        while (true) {
            Entry[] entryArr = this.f48048a;
            if (i2 >= entryArr.length) {
                return;
            }
            entryArr[i2] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
            i2++;
        }
    }
}
