package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new Parcelable.Creator<SpliceScheduleCommand>() { // from class: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.1
        @Override // android.os.Parcelable.Creator
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public SpliceScheduleCommand[] newArray(int i2) {
            return new SpliceScheduleCommand[i2];
        }
    };

    /* renamed from: b */
    public final List<Event> f12125b;

    public SpliceScheduleCommand(List<Event> list) {
        this.f12125b = Collections.unmodifiableList(list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int size = this.f12125b.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            Event event = this.f12125b.get(i3);
            parcel.writeLong(event.f12128a);
            parcel.writeByte(event.f12129b ? (byte) 1 : (byte) 0);
            parcel.writeByte(event.f12130c ? (byte) 1 : (byte) 0);
            parcel.writeByte(event.f12131d ? (byte) 1 : (byte) 0);
            int size2 = event.f12133f.size();
            parcel.writeInt(size2);
            for (int i4 = 0; i4 < size2; i4++) {
                ComponentSplice componentSplice = event.f12133f.get(i4);
                parcel.writeInt(componentSplice.f12126a);
                parcel.writeLong(componentSplice.f12127b);
            }
            parcel.writeLong(event.f12132e);
            parcel.writeByte(event.f12134g ? (byte) 1 : (byte) 0);
            parcel.writeLong(event.f12135h);
            parcel.writeInt(event.f12136i);
            parcel.writeInt(event.f12137j);
            parcel.writeInt(event.f12138k);
        }
    }

    public static final class ComponentSplice {

        /* renamed from: a */
        public final int f12126a;

        /* renamed from: b */
        public final long f12127b;

        public ComponentSplice(int i2, long j2) {
            this.f12126a = i2;
            this.f12127b = j2;
        }

        public ComponentSplice(int i2, long j2, C10661 c10661) {
            this.f12126a = i2;
            this.f12127b = j2;
        }
    }

    public SpliceScheduleCommand(Parcel parcel, C10661 c10661) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(new Event(parcel));
        }
        this.f12125b = Collections.unmodifiableList(arrayList);
    }

    public static final class Event {

        /* renamed from: a */
        public final long f12128a;

        /* renamed from: b */
        public final boolean f12129b;

        /* renamed from: c */
        public final boolean f12130c;

        /* renamed from: d */
        public final boolean f12131d;

        /* renamed from: e */
        public final long f12132e;

        /* renamed from: f */
        public final List<ComponentSplice> f12133f;

        /* renamed from: g */
        public final boolean f12134g;

        /* renamed from: h */
        public final long f12135h;

        /* renamed from: i */
        public final int f12136i;

        /* renamed from: j */
        public final int f12137j;

        /* renamed from: k */
        public final int f12138k;

        public Event(long j2, boolean z, boolean z2, boolean z3, List<ComponentSplice> list, long j3, boolean z4, long j4, int i2, int i3, int i4) {
            this.f12128a = j2;
            this.f12129b = z;
            this.f12130c = z2;
            this.f12131d = z3;
            this.f12133f = Collections.unmodifiableList(list);
            this.f12132e = j3;
            this.f12134g = z4;
            this.f12135h = j4;
            this.f12136i = i2;
            this.f12137j = i3;
            this.f12138k = i4;
        }

        public Event(Parcel parcel) {
            this.f12128a = parcel.readLong();
            this.f12129b = parcel.readByte() == 1;
            this.f12130c = parcel.readByte() == 1;
            this.f12131d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i2 = 0; i2 < readInt; i2++) {
                arrayList.add(new ComponentSplice(parcel.readInt(), parcel.readLong()));
            }
            this.f12133f = Collections.unmodifiableList(arrayList);
            this.f12132e = parcel.readLong();
            this.f12134g = parcel.readByte() == 1;
            this.f12135h = parcel.readLong();
            this.f12136i = parcel.readInt();
            this.f12137j = parcel.readInt();
            this.f12138k = parcel.readInt();
        }
    }
}
