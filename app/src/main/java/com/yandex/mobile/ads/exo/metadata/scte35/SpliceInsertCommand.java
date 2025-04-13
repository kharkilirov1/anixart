package com.yandex.mobile.ads.exo.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.ap0;
import com.yandex.mobile.ads.impl.p61;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new C4764a();

    /* renamed from: a */
    public final long f48144a;

    /* renamed from: b */
    public final boolean f48145b;

    /* renamed from: c */
    public final boolean f48146c;

    /* renamed from: d */
    public final boolean f48147d;

    /* renamed from: e */
    public final boolean f48148e;

    /* renamed from: f */
    public final long f48149f;

    /* renamed from: g */
    public final long f48150g;

    /* renamed from: h */
    public final List<C4765b> f48151h;

    /* renamed from: i */
    public final boolean f48152i;

    /* renamed from: j */
    public final long f48153j;

    /* renamed from: k */
    public final int f48154k;

    /* renamed from: l */
    public final int f48155l;

    /* renamed from: m */
    public final int f48156m;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.scte35.SpliceInsertCommand$a */
    public class C4764a implements Parcelable.Creator<SpliceInsertCommand> {
        @Override // android.os.Parcelable.Creator
        public final SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SpliceInsertCommand[] newArray(int i2) {
            return new SpliceInsertCommand[i2];
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.metadata.scte35.SpliceInsertCommand$b */
    public static final class C4765b {

        /* renamed from: a */
        public final int f48157a;

        /* renamed from: b */
        public final long f48158b;

        /* renamed from: c */
        public final long f48159c;

        public /* synthetic */ C4765b(int i2, long j2, long j3, int i3) {
            this(i2, j2, j3);
        }

        /* renamed from: a */
        public static C4765b m22260a(Parcel parcel) {
            return new C4765b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        private C4765b(int i2, long j2, long j3) {
            this.f48157a = i2;
            this.f48158b = j2;
            this.f48159c = j3;
        }
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, int i2) {
        this(parcel);
    }

    /* renamed from: a */
    public static SpliceInsertCommand m22259a(ap0 ap0Var, long j2, p61 p61Var) {
        List list;
        int i2;
        boolean z;
        boolean z2;
        long j3;
        boolean z3;
        long j4;
        boolean z4;
        int i3;
        int i4;
        boolean z5;
        long j5;
        ap0 ap0Var2 = ap0Var;
        long m22609v = ap0Var.m22609v();
        boolean z6 = (ap0Var.m22607t() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (z6) {
            list = emptyList;
            i2 = 0;
            z = false;
            z2 = false;
            j3 = -9223372036854775807L;
            z3 = false;
            j4 = -9223372036854775807L;
            z4 = false;
            i3 = 0;
            i4 = 0;
        } else {
            int m22607t = ap0Var.m22607t();
            boolean z7 = (m22607t & 128) != 0;
            boolean z8 = (m22607t & 64) != 0;
            boolean z9 = (m22607t & 32) != 0;
            boolean z10 = (m22607t & 16) != 0;
            long m22265a = (!z8 || z10) ? -9223372036854775807L : TimeSignalCommand.m22265a(j2, ap0Var2);
            if (!z8) {
                int m22607t2 = ap0Var.m22607t();
                ArrayList arrayList = new ArrayList(m22607t2);
                int i5 = 0;
                while (i5 < m22607t2) {
                    int m22607t3 = ap0Var.m22607t();
                    long m22265a2 = !z10 ? TimeSignalCommand.m22265a(j2, ap0Var2) : -9223372036854775807L;
                    arrayList.add(new C4765b(m22607t3, m22265a2, p61Var.m27173b(m22265a2), 0));
                    i5++;
                    ap0Var2 = ap0Var;
                }
                emptyList = arrayList;
            }
            if (z9) {
                long m22607t4 = ap0Var.m22607t();
                boolean z11 = (128 & m22607t4) != 0;
                j5 = ((((m22607t4 & 1) << 32) | ap0Var.m22609v()) * 1000) / 90;
                z5 = z11;
            } else {
                z5 = false;
                j5 = -9223372036854775807L;
            }
            i2 = ap0Var.m22613z();
            i3 = ap0Var.m22607t();
            i4 = ap0Var.m22607t();
            list = emptyList;
            z4 = z8;
            long j6 = m22265a;
            z3 = z5;
            j4 = j5;
            z2 = z10;
            z = z7;
            j3 = j6;
        }
        return new SpliceInsertCommand(m22609v, z6, z, z4, z2, j3, p61Var.m27173b(j3), list, z3, j4, i2, i3, i4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f48144a);
        parcel.writeByte(this.f48145b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f48146c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f48147d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f48148e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f48149f);
        parcel.writeLong(this.f48150g);
        int size = this.f48151h.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            C4765b c4765b = this.f48151h.get(i3);
            parcel.writeInt(c4765b.f48157a);
            parcel.writeLong(c4765b.f48158b);
            parcel.writeLong(c4765b.f48159c);
        }
        parcel.writeByte(this.f48152i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f48153j);
        parcel.writeInt(this.f48154k);
        parcel.writeInt(this.f48155l);
        parcel.writeInt(this.f48156m);
    }

    private SpliceInsertCommand(long j2, boolean z, boolean z2, boolean z3, boolean z4, long j3, long j4, List<C4765b> list, boolean z5, long j5, int i2, int i3, int i4) {
        this.f48144a = j2;
        this.f48145b = z;
        this.f48146c = z2;
        this.f48147d = z3;
        this.f48148e = z4;
        this.f48149f = j3;
        this.f48150g = j4;
        this.f48151h = Collections.unmodifiableList(list);
        this.f48152i = z5;
        this.f48153j = j5;
        this.f48154k = i2;
        this.f48155l = i3;
        this.f48156m = i4;
    }

    private SpliceInsertCommand(Parcel parcel) {
        this.f48144a = parcel.readLong();
        this.f48145b = parcel.readByte() == 1;
        this.f48146c = parcel.readByte() == 1;
        this.f48147d = parcel.readByte() == 1;
        this.f48148e = parcel.readByte() == 1;
        this.f48149f = parcel.readLong();
        this.f48150g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(C4765b.m22260a(parcel));
        }
        this.f48151h = Collections.unmodifiableList(arrayList);
        this.f48152i = parcel.readByte() == 1;
        this.f48153j = parcel.readLong();
        this.f48154k = parcel.readInt();
        this.f48155l = parcel.readInt();
        this.f48156m = parcel.readInt();
    }
}
