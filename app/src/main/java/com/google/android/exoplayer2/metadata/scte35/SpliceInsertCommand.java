package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new Parcelable.Creator<SpliceInsertCommand>() { // from class: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand.1
        @Override // android.os.Parcelable.Creator
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public SpliceInsertCommand[] newArray(int i2) {
            return new SpliceInsertCommand[i2];
        }
    };

    /* renamed from: b */
    public final long f12109b;

    /* renamed from: c */
    public final boolean f12110c;

    /* renamed from: d */
    public final boolean f12111d;

    /* renamed from: e */
    public final boolean f12112e;

    /* renamed from: f */
    public final boolean f12113f;

    /* renamed from: g */
    public final long f12114g;

    /* renamed from: h */
    public final long f12115h;

    /* renamed from: i */
    public final List<ComponentSplice> f12116i;

    /* renamed from: j */
    public final boolean f12117j;

    /* renamed from: k */
    public final long f12118k;

    /* renamed from: l */
    public final int f12119l;

    /* renamed from: m */
    public final int f12120m;

    /* renamed from: n */
    public final int f12121n;

    public SpliceInsertCommand(long j2, boolean z, boolean z2, boolean z3, boolean z4, long j3, long j4, List<ComponentSplice> list, boolean z5, long j5, int i2, int i3, int i4) {
        this.f12109b = j2;
        this.f12110c = z;
        this.f12111d = z2;
        this.f12112e = z3;
        this.f12113f = z4;
        this.f12114g = j3;
        this.f12115h = j4;
        this.f12116i = Collections.unmodifiableList(list);
        this.f12117j = z5;
        this.f12118k = j5;
        this.f12119l = i2;
        this.f12120m = i3;
        this.f12121n = i4;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f12109b);
        parcel.writeByte(this.f12110c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12111d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12112e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12113f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f12114g);
        parcel.writeLong(this.f12115h);
        int size = this.f12116i.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            ComponentSplice componentSplice = this.f12116i.get(i3);
            parcel.writeInt(componentSplice.f12122a);
            parcel.writeLong(componentSplice.f12123b);
            parcel.writeLong(componentSplice.f12124c);
        }
        parcel.writeByte(this.f12117j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f12118k);
        parcel.writeInt(this.f12119l);
        parcel.writeInt(this.f12120m);
        parcel.writeInt(this.f12121n);
    }

    public static final class ComponentSplice {

        /* renamed from: a */
        public final int f12122a;

        /* renamed from: b */
        public final long f12123b;

        /* renamed from: c */
        public final long f12124c;

        public ComponentSplice(int i2, long j2, long j3) {
            this.f12122a = i2;
            this.f12123b = j2;
            this.f12124c = j3;
        }

        public ComponentSplice(int i2, long j2, long j3, C10641 c10641) {
            this.f12122a = i2;
            this.f12123b = j2;
            this.f12124c = j3;
        }
    }

    public SpliceInsertCommand(Parcel parcel, C10641 c10641) {
        this.f12109b = parcel.readLong();
        this.f12110c = parcel.readByte() == 1;
        this.f12111d = parcel.readByte() == 1;
        this.f12112e = parcel.readByte() == 1;
        this.f12113f = parcel.readByte() == 1;
        this.f12114g = parcel.readLong();
        this.f12115h = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(new ComponentSplice(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f12116i = Collections.unmodifiableList(arrayList);
        this.f12117j = parcel.readByte() == 1;
        this.f12118k = parcel.readLong();
        this.f12119l = parcel.readInt();
        this.f12120m = parcel.readInt();
        this.f12121n = parcel.readInt();
    }
}
