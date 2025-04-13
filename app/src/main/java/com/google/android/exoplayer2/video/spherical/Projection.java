package com.google.android.exoplayer2.video.spherical;

import com.google.android.exoplayer2.util.Assertions;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
final class Projection {

    /* renamed from: a */
    public final Mesh f14932a;

    /* renamed from: b */
    public final Mesh f14933b;

    /* renamed from: c */
    public final int f14934c;

    /* renamed from: d */
    public final boolean f14935d;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DrawMode {
    }

    public static final class Mesh {

        /* renamed from: a */
        public final SubMesh[] f14936a;

        public Mesh(SubMesh... subMeshArr) {
            this.f14936a = subMeshArr;
        }
    }

    public static final class SubMesh {

        /* renamed from: a */
        public final int f14937a;

        /* renamed from: b */
        public final int f14938b;

        /* renamed from: c */
        public final float[] f14939c;

        /* renamed from: d */
        public final float[] f14940d;

        public SubMesh(int i2, float[] fArr, float[] fArr2, int i3) {
            this.f14937a = i2;
            Assertions.m7513a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f14939c = fArr;
            this.f14940d = fArr2;
            this.f14938b = i3;
        }
    }

    public Projection(Mesh mesh, int i2) {
        this.f14932a = mesh;
        this.f14933b = mesh;
        this.f14934c = i2;
        this.f14935d = true;
    }

    public Projection(Mesh mesh, Mesh mesh2, int i2) {
        this.f14932a = mesh;
        this.f14933b = mesh2;
        this.f14934c = i2;
        this.f14935d = mesh == mesh2;
    }
}
