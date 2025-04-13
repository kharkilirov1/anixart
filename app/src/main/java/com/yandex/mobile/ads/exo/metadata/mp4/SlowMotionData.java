package com.yandex.mobile.ads.exo.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.mp4.C1062a;
import com.yandex.mobile.ads.exo.metadata.C4740b;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.AbstractC5446mj;
import com.yandex.mobile.ads.impl.C5220ia;
import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.l60;
import com.yandex.mobile.ads.impl.s91;
import com.yandex.mobile.ads.impl.sb0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new C4761a();

    /* renamed from: a */
    public final List<Segment> f48135a;

    public static final class Segment implements Parcelable {
        public static final Parcelable.Creator<Segment> CREATOR;

        /* renamed from: a */
        public final long f48136a;

        /* renamed from: b */
        public final long f48137b;

        /* renamed from: c */
        public final int f48138c;

        /* renamed from: com.yandex.mobile.ads.exo.metadata.mp4.SlowMotionData$Segment$a */
        public class C4760a implements Parcelable.Creator<Segment> {
            @Override // android.os.Parcelable.Creator
            public final Segment createFromParcel(Parcel parcel) {
                return new Segment(parcel.readInt(), parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Segment[] newArray(int i2) {
                return new Segment[i2];
            }
        }

        static {
            C1062a c1062a = C1062a.f12100l;
            CREATOR = new C4760a();
        }

        public Segment(int i2, long j2, long j3) {
            C5220ia.m25473a(j2 < j3);
            this.f48136a = j2;
            this.f48137b = j3;
            this.f48138c = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ int m22256a(Segment segment, Segment segment2) {
            return AbstractC5446mj.m26681e().mo26683a(segment.f48136a, segment2.f48136a).mo26683a(segment.f48137b, segment2.f48137b).mo26682a(segment.f48138c, segment2.f48138c).mo26687d();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Segment.class != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            return this.f48136a == segment.f48136a && this.f48137b == segment.f48137b && this.f48138c == segment.f48138c;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f48136a), Long.valueOf(this.f48137b), Integer.valueOf(this.f48138c)});
        }

        public final String toString() {
            Object[] objArr = {Long.valueOf(this.f48136a), Long.valueOf(this.f48137b), Integer.valueOf(this.f48138c)};
            int i2 = s91.f54530a;
            return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", objArr);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeLong(this.f48136a);
            parcel.writeLong(this.f48137b);
            parcel.writeInt(this.f48138c);
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.metadata.mp4.SlowMotionData$a */
    public class C4761a implements Parcelable.Creator<SlowMotionData> {
        @Override // android.os.Parcelable.Creator
        public final SlowMotionData createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Segment.class.getClassLoader());
            return new SlowMotionData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SlowMotionData[] newArray(int i2) {
            return new SlowMotionData[i2];
        }
    }

    public SlowMotionData(ArrayList arrayList) {
        this.f48135a = arrayList;
        C5220ia.m25473a(!m22255a(arrayList));
    }

    /* renamed from: a */
    private static boolean m22255a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long j2 = ((Segment) arrayList.get(0)).f48137b;
        for (int i2 = 1; i2 < arrayList.size(); i2++) {
            if (((Segment) arrayList.get(i2)).f48136a < j2) {
                return true;
            }
            j2 = ((Segment) arrayList.get(i2)).f48137b;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    /* renamed from: a */
    public /* synthetic */ C5606pv mo22238a() {
        return C4740b.m22250a(this);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    /* renamed from: a */
    public /* synthetic */ void mo22239a(sb0.C5738a c5738a) {
        C4740b.m22251b(this, c5738a);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    /* renamed from: b */
    public /* synthetic */ byte[] mo22240b() {
        return C4740b.m22252c(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.f48135a.equals(((SlowMotionData) obj).f48135a);
    }

    public final int hashCode() {
        return this.f48135a.hashCode();
    }

    public final String toString() {
        StringBuilder m26356a = l60.m26356a("SlowMotion: segments=");
        m26356a.append(this.f48135a);
        return m26356a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeList(this.f48135a);
    }
}
