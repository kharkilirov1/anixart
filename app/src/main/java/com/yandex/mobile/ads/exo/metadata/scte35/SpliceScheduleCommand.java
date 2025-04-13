package com.yandex.mobile.ads.exo.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.ap0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new C4767a();

    /* renamed from: a */
    public final List<C4769c> f48160a;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.scte35.SpliceScheduleCommand$a */
    public class C4767a implements Parcelable.Creator<SpliceScheduleCommand> {
        @Override // android.os.Parcelable.Creator
        public final SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SpliceScheduleCommand[] newArray(int i2) {
            return new SpliceScheduleCommand[i2];
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.metadata.scte35.SpliceScheduleCommand$b */
    public static final class C4768b {

        /* renamed from: a */
        public final int f48161a;

        /* renamed from: b */
        public final long f48162b;

        public /* synthetic */ C4768b(int i2, long j2, int i3) {
            this(i2, j2);
        }

        /* renamed from: a */
        public static C4768b m22262a(Parcel parcel) {
            return new C4768b(parcel.readInt(), parcel.readLong());
        }

        private C4768b(int i2, long j2) {
            this.f48161a = i2;
            this.f48162b = j2;
        }
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, int i2) {
        this(parcel);
    }

    /* renamed from: a */
    public static SpliceScheduleCommand m22261a(ap0 ap0Var) {
        int m22607t = ap0Var.m22607t();
        ArrayList arrayList = new ArrayList(m22607t);
        for (int i2 = 0; i2 < m22607t; i2++) {
            arrayList.add(C4769c.m22264a(ap0Var));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int size = this.f48160a.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            C4769c c4769c = this.f48160a.get(i3);
            parcel.writeLong(c4769c.f48163a);
            parcel.writeByte(c4769c.f48164b ? (byte) 1 : (byte) 0);
            parcel.writeByte(c4769c.f48165c ? (byte) 1 : (byte) 0);
            parcel.writeByte(c4769c.f48166d ? (byte) 1 : (byte) 0);
            int size2 = c4769c.f48168f.size();
            parcel.writeInt(size2);
            for (int i4 = 0; i4 < size2; i4++) {
                C4768b c4768b = c4769c.f48168f.get(i4);
                parcel.writeInt(c4768b.f48161a);
                parcel.writeLong(c4768b.f48162b);
            }
            parcel.writeLong(c4769c.f48167e);
            parcel.writeByte(c4769c.f48169g ? (byte) 1 : (byte) 0);
            parcel.writeLong(c4769c.f48170h);
            parcel.writeInt(c4769c.f48171i);
            parcel.writeInt(c4769c.f48172j);
            parcel.writeInt(c4769c.f48173k);
        }
    }

    private SpliceScheduleCommand(ArrayList arrayList) {
        this.f48160a = Collections.unmodifiableList(arrayList);
    }

    private SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(C4769c.m22263a(parcel));
        }
        this.f48160a = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: com.yandex.mobile.ads.exo.metadata.scte35.SpliceScheduleCommand$c */
    public static final class C4769c {

        /* renamed from: a */
        public final long f48163a;

        /* renamed from: b */
        public final boolean f48164b;

        /* renamed from: c */
        public final boolean f48165c;

        /* renamed from: d */
        public final boolean f48166d;

        /* renamed from: e */
        public final long f48167e;

        /* renamed from: f */
        public final List<C4768b> f48168f;

        /* renamed from: g */
        public final boolean f48169g;

        /* renamed from: h */
        public final long f48170h;

        /* renamed from: i */
        public final int f48171i;

        /* renamed from: j */
        public final int f48172j;

        /* renamed from: k */
        public final int f48173k;

        private C4769c(long j2, boolean z, boolean z2, boolean z3, ArrayList arrayList, long j3, boolean z4, long j4, int i2, int i3, int i4) {
            this.f48163a = j2;
            this.f48164b = z;
            this.f48165c = z2;
            this.f48166d = z3;
            this.f48168f = Collections.unmodifiableList(arrayList);
            this.f48167e = j3;
            this.f48169g = z4;
            this.f48170h = j4;
            this.f48171i = i2;
            this.f48172j = i3;
            this.f48173k = i4;
        }

        /* renamed from: a */
        public static C4769c m22264a(ap0 ap0Var) {
            ArrayList arrayList;
            long j2;
            boolean z;
            boolean z2;
            int i2;
            int i3;
            int i4;
            long j3;
            long j4;
            long m22609v = ap0Var.m22609v();
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = (ap0Var.m22607t() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z5) {
                arrayList = arrayList2;
                j2 = -9223372036854775807L;
                z = false;
                z2 = false;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                j3 = -9223372036854775807L;
            } else {
                int m22607t = ap0Var.m22607t();
                boolean z6 = (m22607t & 128) != 0;
                z2 = (m22607t & 64) != 0;
                boolean z7 = (m22607t & 32) != 0;
                long m22609v2 = z2 ? ap0Var.m22609v() : -9223372036854775807L;
                if (!z2) {
                    int m22607t2 = ap0Var.m22607t();
                    ArrayList arrayList3 = new ArrayList(m22607t2);
                    for (int i5 = 0; i5 < m22607t2; i5++) {
                        arrayList3.add(new C4768b(ap0Var.m22607t(), ap0Var.m22609v(), z3 ? 1 : 0));
                    }
                    arrayList2 = arrayList3;
                }
                if (z7) {
                    long m22607t3 = ap0Var.m22607t();
                    boolean z8 = (128 & m22607t3) != 0;
                    j4 = ((((m22607t3 & 1) << 32) | ap0Var.m22609v()) * 1000) / 90;
                    z4 = z8;
                } else {
                    j4 = -9223372036854775807L;
                }
                int m22613z = ap0Var.m22613z();
                int m22607t4 = ap0Var.m22607t();
                j3 = j4;
                i4 = ap0Var.m22607t();
                arrayList = arrayList2;
                long j5 = m22609v2;
                i2 = m22613z;
                i3 = m22607t4;
                j2 = j5;
                boolean z9 = z6;
                z = z4;
                z3 = z9;
            }
            return new C4769c(m22609v, z5, z3, z2, arrayList, j2, z, j3, i2, i3, i4);
        }

        private C4769c(Parcel parcel) {
            this.f48163a = parcel.readLong();
            this.f48164b = parcel.readByte() == 1;
            this.f48165c = parcel.readByte() == 1;
            this.f48166d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i2 = 0; i2 < readInt; i2++) {
                arrayList.add(C4768b.m22262a(parcel));
            }
            this.f48168f = Collections.unmodifiableList(arrayList);
            this.f48167e = parcel.readLong();
            this.f48169g = parcel.readByte() == 1;
            this.f48170h = parcel.readLong();
            this.f48171i = parcel.readInt();
            this.f48172j = parcel.readInt();
            this.f48173k = parcel.readInt();
        }

        /* renamed from: a */
        public static C4769c m22263a(Parcel parcel) {
            return new C4769c(parcel);
        }
    }
}
