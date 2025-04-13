package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
abstract class Atom {

    /* renamed from: a */
    public final int f11156a;

    public static final class ContainerAtom extends Atom {

        /* renamed from: b */
        public final long f11157b;

        /* renamed from: c */
        public final List<LeafAtom> f11158c;

        /* renamed from: d */
        public final List<ContainerAtom> f11159d;

        public ContainerAtom(int i2, long j2) {
            super(i2);
            this.f11157b = j2;
            this.f11158c = new ArrayList();
            this.f11159d = new ArrayList();
        }

        @Nullable
        /* renamed from: b */
        public ContainerAtom m6493b(int i2) {
            int size = this.f11159d.size();
            for (int i3 = 0; i3 < size; i3++) {
                ContainerAtom containerAtom = this.f11159d.get(i3);
                if (containerAtom.f11156a == i2) {
                    return containerAtom;
                }
            }
            return null;
        }

        @Nullable
        /* renamed from: c */
        public LeafAtom m6494c(int i2) {
            int size = this.f11158c.size();
            for (int i3 = 0; i3 < size; i3++) {
                LeafAtom leafAtom = this.f11158c.get(i3);
                if (leafAtom.f11156a == i2) {
                    return leafAtom;
                }
            }
            return null;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.Atom
        public String toString() {
            String m6492a = Atom.m6492a(this.f11156a);
            String arrays = Arrays.toString(this.f11158c.toArray());
            String arrays2 = Arrays.toString(this.f11159d.toArray());
            StringBuilder m4122u = C0576a.m4122u(C0576a.m4106e(arrays2, C0576a.m4106e(arrays, C0576a.m4106e(m6492a, 22))), m6492a, " leaves: ", arrays, " containers: ");
            m4122u.append(arrays2);
            return m4122u.toString();
        }
    }

    public static final class LeafAtom extends Atom {

        /* renamed from: b */
        public final ParsableByteArray f11160b;

        public LeafAtom(int i2, ParsableByteArray parsableByteArray) {
            super(i2);
            this.f11160b = parsableByteArray;
        }
    }

    public Atom(int i2) {
        this.f11156a = i2;
    }

    /* renamed from: a */
    public static String m6492a(int i2) {
        char c2 = (char) ((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        char c3 = (char) ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        char c4 = (char) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        char c5 = (char) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
        StringBuilder sb = new StringBuilder(4);
        sb.append(c2);
        sb.append(c3);
        sb.append(c4);
        sb.append(c5);
        return sb.toString();
    }

    public String toString() {
        return m6492a(this.f11156a);
    }
}
