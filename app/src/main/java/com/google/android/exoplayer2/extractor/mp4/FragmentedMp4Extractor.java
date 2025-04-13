package com.google.android.exoplayer2.extractor.mp4;

import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.C1008a;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer2.metadata.emsg.EventMessageEncoder;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class FragmentedMp4Extractor implements Extractor {

    /* renamed from: I */
    public static final byte[] f11190I = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: J */
    public static final Format f11191J;

    /* renamed from: A */
    public int f11192A;

    /* renamed from: B */
    public int f11193B;

    /* renamed from: C */
    public int f11194C;

    /* renamed from: D */
    public boolean f11195D;

    /* renamed from: E */
    public ExtractorOutput f11196E;

    /* renamed from: F */
    public TrackOutput[] f11197F;

    /* renamed from: G */
    public TrackOutput[] f11198G;

    /* renamed from: H */
    public boolean f11199H;

    /* renamed from: a */
    public final int f11200a;

    /* renamed from: b */
    @Nullable
    public final Track f11201b;

    /* renamed from: c */
    public final List<Format> f11202c;

    /* renamed from: d */
    public final SparseArray<TrackBundle> f11203d;

    /* renamed from: e */
    public final ParsableByteArray f11204e;

    /* renamed from: f */
    public final ParsableByteArray f11205f;

    /* renamed from: g */
    public final ParsableByteArray f11206g;

    /* renamed from: h */
    public final byte[] f11207h;

    /* renamed from: i */
    public final ParsableByteArray f11208i;

    /* renamed from: j */
    @Nullable
    public final TimestampAdjuster f11209j;

    /* renamed from: k */
    public final EventMessageEncoder f11210k;

    /* renamed from: l */
    public final ParsableByteArray f11211l;

    /* renamed from: m */
    public final ArrayDeque<Atom.ContainerAtom> f11212m;

    /* renamed from: n */
    public final ArrayDeque<MetadataSampleInfo> f11213n;

    /* renamed from: o */
    @Nullable
    public final TrackOutput f11214o;

    /* renamed from: p */
    public int f11215p;

    /* renamed from: q */
    public int f11216q;

    /* renamed from: r */
    public long f11217r;

    /* renamed from: s */
    public int f11218s;

    /* renamed from: t */
    @Nullable
    public ParsableByteArray f11219t;

    /* renamed from: u */
    public long f11220u;

    /* renamed from: v */
    public int f11221v;

    /* renamed from: w */
    public long f11222w;

    /* renamed from: x */
    public long f11223x;

    /* renamed from: y */
    public long f11224y;

    /* renamed from: z */
    @Nullable
    public TrackBundle f11225z;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class MetadataSampleInfo {

        /* renamed from: a */
        public final long f11226a;

        /* renamed from: b */
        public final int f11227b;

        public MetadataSampleInfo(long j2, int i2) {
            this.f11226a = j2;
            this.f11227b = i2;
        }
    }

    public static final class TrackBundle {

        /* renamed from: a */
        public final TrackOutput f11228a;

        /* renamed from: d */
        public TrackSampleTable f11231d;

        /* renamed from: e */
        public DefaultSampleValues f11232e;

        /* renamed from: f */
        public int f11233f;

        /* renamed from: g */
        public int f11234g;

        /* renamed from: h */
        public int f11235h;

        /* renamed from: i */
        public int f11236i;

        /* renamed from: l */
        public boolean f11239l;

        /* renamed from: b */
        public final TrackFragment f11229b = new TrackFragment();

        /* renamed from: c */
        public final ParsableByteArray f11230c = new ParsableByteArray();

        /* renamed from: j */
        public final ParsableByteArray f11237j = new ParsableByteArray(1);

        /* renamed from: k */
        public final ParsableByteArray f11238k = new ParsableByteArray();

        public TrackBundle(TrackOutput trackOutput, TrackSampleTable trackSampleTable, DefaultSampleValues defaultSampleValues) {
            this.f11228a = trackOutput;
            this.f11231d = trackSampleTable;
            this.f11232e = defaultSampleValues;
            this.f11231d = trackSampleTable;
            this.f11232e = defaultSampleValues;
            trackOutput.mo6399e(trackSampleTable.f11315a.f11287f);
            m6514e();
        }

        /* renamed from: a */
        public long m6510a() {
            return !this.f11239l ? this.f11231d.f11317c[this.f11233f] : this.f11229b.f11303f[this.f11235h];
        }

        @Nullable
        /* renamed from: b */
        public TrackEncryptionBox m6511b() {
            if (!this.f11239l) {
                return null;
            }
            TrackFragment trackFragment = this.f11229b;
            DefaultSampleValues defaultSampleValues = trackFragment.f11298a;
            int i2 = Util.f14736a;
            int i3 = defaultSampleValues.f11186a;
            TrackEncryptionBox trackEncryptionBox = trackFragment.f11310m;
            if (trackEncryptionBox == null) {
                trackEncryptionBox = this.f11231d.f11315a.m6531a(i3);
            }
            if (trackEncryptionBox == null || !trackEncryptionBox.f11293a) {
                return null;
            }
            return trackEncryptionBox;
        }

        /* renamed from: c */
        public boolean m6512c() {
            this.f11233f++;
            if (!this.f11239l) {
                return false;
            }
            int i2 = this.f11234g + 1;
            this.f11234g = i2;
            int[] iArr = this.f11229b.f11304g;
            int i3 = this.f11235h;
            if (i2 != iArr[i3]) {
                return true;
            }
            this.f11235h = i3 + 1;
            this.f11234g = 0;
            return false;
        }

        /* renamed from: d */
        public int m6513d(int i2, int i3) {
            ParsableByteArray parsableByteArray;
            TrackEncryptionBox m6511b = m6511b();
            if (m6511b == null) {
                return 0;
            }
            int i4 = m6511b.f11296d;
            if (i4 != 0) {
                parsableByteArray = this.f11229b.f11311n;
            } else {
                byte[] bArr = m6511b.f11297e;
                int i5 = Util.f14736a;
                ParsableByteArray parsableByteArray2 = this.f11238k;
                int length = bArr.length;
                parsableByteArray2.f14698a = bArr;
                parsableByteArray2.f14700c = length;
                parsableByteArray2.f14699b = 0;
                i4 = bArr.length;
                parsableByteArray = parsableByteArray2;
            }
            TrackFragment trackFragment = this.f11229b;
            boolean z = trackFragment.f11308k && trackFragment.f11309l[this.f11233f];
            boolean z2 = z || i3 != 0;
            ParsableByteArray parsableByteArray3 = this.f11237j;
            parsableByteArray3.f14698a[0] = (byte) ((z2 ? 128 : 0) | i4);
            parsableByteArray3.m7635F(0);
            this.f11228a.mo6400f(this.f11237j, 1, 1);
            this.f11228a.mo6400f(parsableByteArray, i4, 1);
            if (!z2) {
                return i4 + 1;
            }
            if (!z) {
                this.f11230c.m7631B(8);
                ParsableByteArray parsableByteArray4 = this.f11230c;
                byte[] bArr2 = parsableByteArray4.f14698a;
                bArr2[0] = 0;
                bArr2[1] = 1;
                bArr2[2] = (byte) ((i3 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr2[3] = (byte) (i3 & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr2[4] = (byte) ((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr2[5] = (byte) ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr2[6] = (byte) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr2[7] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f11228a.mo6400f(parsableByteArray4, 8, 1);
                return i4 + 1 + 8;
            }
            ParsableByteArray parsableByteArray5 = this.f11229b.f11311n;
            int m7662z = parsableByteArray5.m7662z();
            parsableByteArray5.m7636G(-2);
            int i6 = (m7662z * 6) + 2;
            if (i3 != 0) {
                this.f11230c.m7631B(i6);
                byte[] bArr3 = this.f11230c.f14698a;
                parsableByteArray5.m7641e(bArr3, 0, i6);
                int i7 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i3;
                bArr3[2] = (byte) ((i7 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr3[3] = (byte) (i7 & KotlinVersion.MAX_COMPONENT_VALUE);
                parsableByteArray5 = this.f11230c;
            }
            this.f11228a.mo6400f(parsableByteArray5, i6, 1);
            return i4 + 1 + i6;
        }

        /* renamed from: e */
        public void m6514e() {
            TrackFragment trackFragment = this.f11229b;
            trackFragment.f11301d = 0;
            trackFragment.f11313p = 0L;
            trackFragment.f11314q = false;
            trackFragment.f11308k = false;
            trackFragment.f11312o = false;
            trackFragment.f11310m = null;
            this.f11233f = 0;
            this.f11235h = 0;
            this.f11234g = 0;
            this.f11236i = 0;
            this.f11239l = false;
        }
    }

    static {
        Format.Builder builder = new Format.Builder();
        builder.f9687k = "application/x-emsg";
        f11191J = builder.m5833a();
    }

    public FragmentedMp4Extractor() {
        this(0, null, null, Collections.emptyList(), null);
    }

    /* renamed from: a */
    public static int m6504a(int i2) throws ParserException {
        if (i2 >= 0) {
            return i2;
        }
        throw C1008a.m6436c(38, "Unexpected negative value: ", i2, null);
    }

    @Nullable
    /* renamed from: h */
    public static DrmInitData m6505h(List<Atom.LeafAtom> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            Atom.LeafAtom leafAtom = list.get(i2);
            if (leafAtom.f11156a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = leafAtom.f11160b.f14698a;
                PsshAtomUtil.PsshAtom m6526c = PsshAtomUtil.m6526c(bArr);
                UUID uuid = m6526c == null ? null : m6526c.f11271a;
                if (uuid == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(null, false, (DrmInitData.SchemeData[]) arrayList.toArray(new DrmInitData.SchemeData[0]));
    }

    /* renamed from: i */
    public static void m6506i(ParsableByteArray parsableByteArray, int i2, TrackFragment trackFragment) throws ParserException {
        parsableByteArray.m7635F(i2 + 8);
        int m7642f = parsableByteArray.m7642f() & 16777215;
        if ((m7642f & 1) != 0) {
            throw ParserException.m5909c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (m7642f & 2) != 0;
        int m7660x = parsableByteArray.m7660x();
        if (m7660x == 0) {
            Arrays.fill(trackFragment.f11309l, 0, trackFragment.f11302e, false);
            return;
        }
        int i3 = trackFragment.f11302e;
        if (m7660x != i3) {
            throw ParserException.m5907a(C0576a.m4112k(80, "Senc sample count ", m7660x, " is different from fragment sample count", i3), null);
        }
        Arrays.fill(trackFragment.f11309l, 0, m7660x, z);
        int m7637a = parsableByteArray.m7637a();
        ParsableByteArray parsableByteArray2 = trackFragment.f11311n;
        byte[] bArr = parsableByteArray2.f14698a;
        if (bArr.length < m7637a) {
            bArr = new byte[m7637a];
        }
        parsableByteArray2.f14698a = bArr;
        parsableByteArray2.f14700c = m7637a;
        parsableByteArray2.f14699b = 0;
        trackFragment.f11308k = true;
        trackFragment.f11312o = true;
        parsableByteArray.m7641e(bArr, 0, m7637a);
        trackFragment.f11311n.m7635F(0);
        trackFragment.f11312o = false;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public void mo6401b(ExtractorOutput extractorOutput) {
        int i2;
        this.f11196E = extractorOutput;
        m6507d();
        TrackOutput[] trackOutputArr = new TrackOutput[2];
        this.f11197F = trackOutputArr;
        TrackOutput trackOutput = this.f11214o;
        if (trackOutput != null) {
            trackOutputArr[0] = trackOutput;
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i3 = 100;
        if ((this.f11200a & 4) != 0) {
            trackOutputArr[i2] = this.f11196E.mo6392b(100, 5);
            i3 = 101;
            i2++;
        }
        TrackOutput[] trackOutputArr2 = (TrackOutput[]) Util.m7719R(this.f11197F, i2);
        this.f11197F = trackOutputArr2;
        for (TrackOutput trackOutput2 : trackOutputArr2) {
            trackOutput2.mo6399e(f11191J);
        }
        this.f11198G = new TrackOutput[this.f11202c.size()];
        int i4 = 0;
        while (i4 < this.f11198G.length) {
            TrackOutput mo6392b = this.f11196E.mo6392b(i3, 3);
            mo6392b.mo6399e(this.f11202c.get(i4));
            this.f11198G[i4] = mo6392b;
            i4++;
            i3++;
        }
        Track track = this.f11201b;
        if (track != null) {
            this.f11203d.put(0, new TrackBundle(extractorOutput.mo6392b(0, track.f11283b), new TrackSampleTable(this.f11201b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new DefaultSampleValues(0, 0, 0, 0)));
            this.f11196E.mo6394h();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: c */
    public void mo6402c(long j2, long j3) {
        int size = this.f11203d.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f11203d.valueAt(i2).m6514e();
        }
        this.f11213n.clear();
        this.f11221v = 0;
        this.f11222w = j3;
        this.f11212m.clear();
        m6507d();
    }

    /* renamed from: d */
    public final void m6507d() {
        this.f11215p = 0;
        this.f11218s = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    public boolean mo6403e(ExtractorInput extractorInput) throws IOException {
        return Sniffer.m6530a(extractorInput, true, false);
    }

    /* renamed from: f */
    public final DefaultSampleValues m6508f(SparseArray<DefaultSampleValues> sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        DefaultSampleValues defaultSampleValues = sparseArray.get(i2);
        Objects.requireNonNull(defaultSampleValues);
        return defaultSampleValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0750 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x02db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0004 A[SYNTHETIC] */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo6404g(com.google.android.exoplayer2.extractor.ExtractorInput r28, com.google.android.exoplayer2.extractor.PositionHolder r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1888
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.mo6404g(com.google.android.exoplayer2.extractor.ExtractorInput, com.google.android.exoplayer2.extractor.PositionHolder):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0386  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6509j(long r47) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 1893
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.m6509j(long):void");
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    public FragmentedMp4Extractor(int i2, @Nullable TimestampAdjuster timestampAdjuster, @Nullable Track track, List<Format> list, @Nullable TrackOutput trackOutput) {
        this.f11200a = i2;
        this.f11209j = timestampAdjuster;
        this.f11201b = track;
        this.f11202c = Collections.unmodifiableList(list);
        this.f11214o = trackOutput;
        this.f11210k = new EventMessageEncoder();
        this.f11211l = new ParsableByteArray(16);
        this.f11204e = new ParsableByteArray(NalUnitUtil.f14658a);
        this.f11205f = new ParsableByteArray(5);
        this.f11206g = new ParsableByteArray();
        byte[] bArr = new byte[16];
        this.f11207h = bArr;
        this.f11208i = new ParsableByteArray(bArr);
        this.f11212m = new ArrayDeque<>();
        this.f11213n = new ArrayDeque<>();
        this.f11203d = new SparseArray<>();
        this.f11223x = -9223372036854775807L;
        this.f11222w = -9223372036854775807L;
        this.f11224y = -9223372036854775807L;
        this.f11196E = ExtractorOutput.f10843w1;
        this.f11197F = new TrackOutput[0];
        this.f11198G = new TrackOutput[0];
    }
}
