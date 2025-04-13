package com.google.android.exoplayer2.video.spherical;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.video.spherical.Projection;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
final class ProjectionRenderer {

    /* renamed from: j */
    public static final String[] f14941j = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};

    /* renamed from: k */
    public static final String[] f14942k = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};

    /* renamed from: l */
    public static final float[] f14943l = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: m */
    public static final float[] f14944m = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: n */
    public static final float[] f14945n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: o */
    public static final float[] f14946o = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: p */
    public static final float[] f14947p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a */
    public int f14948a;

    /* renamed from: b */
    @Nullable
    public MeshData f14949b;

    /* renamed from: c */
    @Nullable
    public MeshData f14950c;

    /* renamed from: d */
    public GlUtil.Program f14951d;

    /* renamed from: e */
    public int f14952e;

    /* renamed from: f */
    public int f14953f;

    /* renamed from: g */
    public int f14954g;

    /* renamed from: h */
    public int f14955h;

    /* renamed from: i */
    public int f14956i;

    public static class MeshData {

        /* renamed from: a */
        public final int f14957a;

        /* renamed from: b */
        public final FloatBuffer f14958b;

        /* renamed from: c */
        public final FloatBuffer f14959c;

        /* renamed from: d */
        public final int f14960d;

        public MeshData(Projection.SubMesh subMesh) {
            float[] fArr = subMesh.f14939c;
            this.f14957a = fArr.length / 3;
            this.f14958b = GlUtil.m7556c(fArr);
            this.f14959c = GlUtil.m7556c(subMesh.f14940d);
            int i2 = subMesh.f14938b;
            if (i2 == 1) {
                this.f14960d = 5;
            } else if (i2 != 2) {
                this.f14960d = 4;
            } else {
                this.f14960d = 6;
            }
        }
    }

    /* renamed from: a */
    public static boolean m7824a(Projection projection) {
        Projection.Mesh mesh = projection.f14932a;
        Projection.Mesh mesh2 = projection.f14933b;
        Projection.SubMesh[] subMeshArr = mesh.f14936a;
        if (subMeshArr.length == 1 && subMeshArr[0].f14937a == 0) {
            Projection.SubMesh[] subMeshArr2 = mesh2.f14936a;
            if (subMeshArr2.length == 1 && subMeshArr2[0].f14937a == 0) {
                return true;
            }
        }
        return false;
    }
}
