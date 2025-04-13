package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new Parcelable.Creator<Metadata>() { // from class: com.google.android.exoplayer2.metadata.Metadata.1
        @Override // android.os.Parcelable.Creator
        public Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Metadata[] newArray(int i2) {
            return new Metadata[i2];
        }
    };

    /* renamed from: b */
    public final Entry[] f11986b;

    public interface Entry extends Parcelable {
        @Nullable
        /* renamed from: Q */
        Format mo6698Q();

        /* renamed from: b */
        void mo6699b(MediaMetadata.Builder builder);

        @Nullable
        /* renamed from: s0 */
        byte[] mo6700s0();
    }

    public Metadata(Entry... entryArr) {
        this.f11986b = entryArr;
    }

    /* renamed from: a */
    public Metadata m6696a(Entry... entryArr) {
        if (entryArr.length == 0) {
            return this;
        }
        Entry[] entryArr2 = this.f11986b;
        int i2 = Util.f14736a;
        Object[] copyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
        System.arraycopy(entryArr, 0, copyOf, entryArr2.length, entryArr.length);
        return new Metadata((Entry[]) copyOf);
    }

    /* renamed from: c */
    public Metadata m6697c(@Nullable Metadata metadata) {
        return metadata == null ? this : m6696a(metadata.f11986b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f11986b, ((Metadata) obj).f11986b);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f11986b);
    }

    public String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.f11986b));
        return valueOf.length() != 0 ? "entries=".concat(valueOf) : new String("entries=");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f11986b.length);
        for (Entry entry : this.f11986b) {
            parcel.writeParcelable(entry, 0);
        }
    }

    public Metadata(List<? extends Entry> list) {
        this.f11986b = (Entry[]) list.toArray(new Entry[0]);
    }

    public Metadata(Parcel parcel) {
        this.f11986b = new Entry[parcel.readInt()];
        int i2 = 0;
        while (true) {
            Entry[] entryArr = this.f11986b;
            if (i2 >= entryArr.length) {
                return;
            }
            entryArr[i2] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
            i2++;
        }
    }
}
