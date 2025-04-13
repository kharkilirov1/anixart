package com.google.android.exoplayer2.metadata.scte35;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.SimpleMetadataDecoder;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SpliceInfoDecoder extends SimpleMetadataDecoder {

    /* renamed from: a */
    public final ParsableByteArray f12106a = new ParsableByteArray();

    /* renamed from: b */
    public final ParsableBitArray f12107b = new ParsableBitArray();

    /* renamed from: c */
    public TimestampAdjuster f12108c;

    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    /* renamed from: b */
    public Metadata mo6705b(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        int i2;
        long j2;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        long j3;
        boolean z3;
        long j4;
        int i3;
        int i4;
        int i5;
        boolean z4;
        long j5;
        List list;
        long j6;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        long j7;
        int i6;
        int i7;
        int i8;
        boolean z9;
        long j8;
        TimestampAdjuster timestampAdjuster = this.f12108c;
        if (timestampAdjuster == null || metadataInputBuffer.f11988j != timestampAdjuster.m7694d()) {
            TimestampAdjuster timestampAdjuster2 = new TimestampAdjuster(metadataInputBuffer.f10607f);
            this.f12108c = timestampAdjuster2;
            timestampAdjuster2.m7691a(metadataInputBuffer.f10607f - metadataInputBuffer.f11988j);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f12106a.m7633D(array, limit);
        this.f12107b.m7625j(array, limit);
        this.f12107b.m7628m(39);
        long m7622g = (this.f12107b.m7622g(1) << 32) | this.f12107b.m7622g(32);
        this.f12107b.m7628m(20);
        int m7622g2 = this.f12107b.m7622g(12);
        int m7622g3 = this.f12107b.m7622g(8);
        this.f12106a.m7636G(14);
        Metadata.Entry entry = null;
        if (m7622g3 == 0) {
            entry = new SpliceNullCommand();
        } else if (m7622g3 != 255) {
            long j9 = 128;
            if (m7622g3 == 4) {
                ParsableByteArray parsableByteArray = this.f12106a;
                int m7657u = parsableByteArray.m7657u();
                ArrayList arrayList2 = new ArrayList(m7657u);
                int i9 = 0;
                while (i9 < m7657u) {
                    long m7658v = parsableByteArray.m7658v();
                    boolean z10 = (parsableByteArray.m7657u() & 128) != 0;
                    ArrayList arrayList3 = new ArrayList();
                    if (z10) {
                        i2 = m7657u;
                        j2 = j9;
                        arrayList = arrayList3;
                        z = false;
                        z2 = false;
                        j3 = -9223372036854775807L;
                        z3 = false;
                        j4 = -9223372036854775807L;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                    } else {
                        int m7657u2 = parsableByteArray.m7657u();
                        boolean z11 = (m7657u2 & 128) != 0;
                        boolean z12 = (m7657u2 & 64) != 0;
                        boolean z13 = (m7657u2 & 32) != 0;
                        long m7658v2 = z12 ? parsableByteArray.m7658v() : -9223372036854775807L;
                        if (z12) {
                            i2 = m7657u;
                        } else {
                            int m7657u3 = parsableByteArray.m7657u();
                            ArrayList arrayList4 = new ArrayList(m7657u3);
                            int i10 = 0;
                            while (i10 < m7657u3) {
                                arrayList4.add(new SpliceScheduleCommand.ComponentSplice(parsableByteArray.m7657u(), parsableByteArray.m7658v(), null));
                                i10++;
                                m7657u3 = m7657u3;
                                m7657u = m7657u;
                            }
                            i2 = m7657u;
                            arrayList3 = arrayList4;
                        }
                        if (z13) {
                            long m7657u4 = parsableByteArray.m7657u();
                            j2 = 128;
                            z4 = (m7657u4 & 128) != 0;
                            j5 = ((((m7657u4 & 1) << 32) | parsableByteArray.m7658v()) * 1000) / 90;
                        } else {
                            j2 = 128;
                            z4 = false;
                            j5 = -9223372036854775807L;
                        }
                        z3 = z4;
                        j4 = j5;
                        arrayList = arrayList3;
                        i3 = parsableByteArray.m7662z();
                        z = z11;
                        z2 = z12;
                        j3 = m7658v2;
                        i4 = parsableByteArray.m7657u();
                        i5 = parsableByteArray.m7657u();
                    }
                    arrayList2.add(new SpliceScheduleCommand.Event(m7658v, z10, z, z2, arrayList, j3, z3, j4, i3, i4, i5));
                    i9++;
                    j9 = j2;
                    m7657u = i2;
                }
                entry = new SpliceScheduleCommand(arrayList2);
            } else if (m7622g3 == 5) {
                ParsableByteArray parsableByteArray2 = this.f12106a;
                TimestampAdjuster timestampAdjuster3 = this.f12108c;
                long m7658v3 = parsableByteArray2.m7658v();
                boolean z14 = (parsableByteArray2.m7657u() & 128) != 0;
                List emptyList = Collections.emptyList();
                if (z14) {
                    list = emptyList;
                    j6 = -9223372036854775807L;
                    z5 = false;
                    z6 = false;
                    z7 = false;
                    z8 = false;
                    j7 = -9223372036854775807L;
                    i6 = 0;
                    i7 = 0;
                    i8 = 0;
                } else {
                    int m7657u5 = parsableByteArray2.m7657u();
                    boolean z15 = (m7657u5 & 128) != 0;
                    boolean z16 = (m7657u5 & 64) != 0;
                    boolean z17 = (m7657u5 & 32) != 0;
                    boolean z18 = (m7657u5 & 16) != 0;
                    long m6733a = (!z16 || z18) ? -9223372036854775807L : TimeSignalCommand.m6733a(parsableByteArray2, m7622g);
                    if (!z16) {
                        int m7657u6 = parsableByteArray2.m7657u();
                        ArrayList arrayList5 = new ArrayList(m7657u6);
                        for (int i11 = 0; i11 < m7657u6; i11++) {
                            int m7657u7 = parsableByteArray2.m7657u();
                            long m6733a2 = !z18 ? TimeSignalCommand.m6733a(parsableByteArray2, m7622g) : -9223372036854775807L;
                            arrayList5.add(new SpliceInsertCommand.ComponentSplice(m7657u7, m6733a2, timestampAdjuster3.m7692b(m6733a2), null));
                        }
                        emptyList = arrayList5;
                    }
                    if (z17) {
                        long m7657u8 = parsableByteArray2.m7657u();
                        z9 = (m7657u8 & 128) != 0;
                        j8 = ((((m7657u8 & 1) << 32) | parsableByteArray2.m7658v()) * 1000) / 90;
                    } else {
                        z9 = false;
                        j8 = -9223372036854775807L;
                    }
                    int m7662z = parsableByteArray2.m7662z();
                    int m7657u9 = parsableByteArray2.m7657u();
                    i6 = m7662z;
                    z8 = z9;
                    i8 = parsableByteArray2.m7657u();
                    list = emptyList;
                    j7 = j8;
                    i7 = m7657u9;
                    z5 = z15;
                    j6 = m6733a;
                    z7 = z18;
                    z6 = z16;
                }
                entry = new SpliceInsertCommand(m7658v3, z14, z5, z6, z7, j6, timestampAdjuster3.m7692b(j6), list, z8, j7, i6, i7, i8);
            } else if (m7622g3 == 6) {
                ParsableByteArray parsableByteArray3 = this.f12106a;
                TimestampAdjuster timestampAdjuster4 = this.f12108c;
                long m6733a3 = TimeSignalCommand.m6733a(parsableByteArray3, m7622g);
                entry = new TimeSignalCommand(m6733a3, timestampAdjuster4.m7692b(m6733a3));
            }
        } else {
            ParsableByteArray parsableByteArray4 = this.f12106a;
            long m7658v4 = parsableByteArray4.m7658v();
            int i12 = m7622g2 - 4;
            byte[] bArr = new byte[i12];
            System.arraycopy(parsableByteArray4.f14698a, parsableByteArray4.f14699b, bArr, 0, i12);
            parsableByteArray4.f14699b += i12;
            entry = new PrivateCommand(m7658v4, bArr, m7622g);
        }
        return entry == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(entry);
    }
}
