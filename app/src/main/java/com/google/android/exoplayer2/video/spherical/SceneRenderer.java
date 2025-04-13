package com.google.android.exoplayer2.video.spherical;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimedValueQueue;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import com.google.android.exoplayer2.video.spherical.Projection;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class SceneRenderer implements VideoFrameMetadataListener, CameraMotionListener {

    /* renamed from: j */
    public int f14969j;

    /* renamed from: k */
    public SurfaceTexture f14970k;

    /* renamed from: n */
    @Nullable
    public byte[] f14973n;

    /* renamed from: b */
    public final AtomicBoolean f14961b = new AtomicBoolean();

    /* renamed from: c */
    public final AtomicBoolean f14962c = new AtomicBoolean(true);

    /* renamed from: d */
    public final ProjectionRenderer f14963d = new ProjectionRenderer();

    /* renamed from: e */
    public final FrameRotationQueue f14964e = new FrameRotationQueue();

    /* renamed from: f */
    public final TimedValueQueue<Long> f14965f = new TimedValueQueue<>();

    /* renamed from: g */
    public final TimedValueQueue<Projection> f14966g = new TimedValueQueue<>();

    /* renamed from: h */
    public final float[] f14967h = new float[16];

    /* renamed from: i */
    public final float[] f14968i = new float[16];

    /* renamed from: l */
    public volatile int f14971l = 0;

    /* renamed from: m */
    public int f14972m = -1;

    @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
    /* renamed from: a */
    public void mo5976a(long j2, float[] fArr) {
        this.f14964e.f14923c.m7685a(j2, fArr);
    }

    /* renamed from: b */
    public SurfaceTexture m7825b() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        GlUtil.m7555b();
        ProjectionRenderer projectionRenderer = this.f14963d;
        Objects.requireNonNull(projectionRenderer);
        GlUtil.Program program = new GlUtil.Program(ProjectionRenderer.f14941j, ProjectionRenderer.f14942k);
        projectionRenderer.f14951d = program;
        projectionRenderer.f14952e = GLES20.glGetUniformLocation(program.f14640a, "uMvpMatrix");
        projectionRenderer.f14953f = GLES20.glGetUniformLocation(projectionRenderer.f14951d.f14640a, "uTexMatrix");
        projectionRenderer.f14954g = GLES20.glGetAttribLocation(projectionRenderer.f14951d.f14640a, "aPosition");
        projectionRenderer.f14955h = GLES20.glGetAttribLocation(projectionRenderer.f14951d.f14640a, "aTexCoords");
        projectionRenderer.f14956i = GLES20.glGetUniformLocation(projectionRenderer.f14951d.f14640a, "uTexture");
        GlUtil.m7555b();
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        GlUtil.m7555b();
        this.f14969j = iArr[0];
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f14969j);
        this.f14970k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.google.android.exoplayer2.video.spherical.a
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                SceneRenderer.this.f14961b.set(true);
            }
        });
        return this.f14970k;
    }

    @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
    /* renamed from: d */
    public void mo5977d() {
        this.f14965f.m7686b();
        FrameRotationQueue frameRotationQueue = this.f14964e;
        frameRotationQueue.f14923c.m7686b();
        frameRotationQueue.f14924d = false;
        this.f14962c.set(true);
    }

    @Override // com.google.android.exoplayer2.video.VideoFrameMetadataListener
    /* renamed from: l */
    public void mo5978l(long j2, long j3, Format format, @Nullable MediaFormat mediaFormat) {
        float f2;
        float f3;
        int i2;
        int i3;
        ArrayList<Projection.Mesh> arrayList;
        int m7642f;
        this.f14965f.m7685a(j3, Long.valueOf(j2));
        byte[] bArr = format.f9669w;
        int i4 = format.f9670x;
        byte[] bArr2 = this.f14973n;
        int i5 = this.f14972m;
        this.f14973n = bArr;
        if (i4 == -1) {
            i4 = this.f14971l;
        }
        this.f14972m = i4;
        if (i5 == i4 && Arrays.equals(bArr2, this.f14973n)) {
            return;
        }
        byte[] bArr3 = this.f14973n;
        Projection projection = null;
        if (bArr3 != null) {
            int i6 = this.f14972m;
            ParsableByteArray parsableByteArray = new ParsableByteArray(bArr3);
            try {
                parsableByteArray.m7636G(4);
                m7642f = parsableByteArray.m7642f();
                parsableByteArray.m7635F(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (m7642f == 1886547818) {
                parsableByteArray.m7636G(8);
                int i7 = parsableByteArray.f14699b;
                int i8 = parsableByteArray.f14700c;
                while (i7 < i8) {
                    int m7642f2 = parsableByteArray.m7642f() + i7;
                    if (m7642f2 <= i7 || m7642f2 > i8) {
                        break;
                    }
                    int m7642f3 = parsableByteArray.m7642f();
                    if (m7642f3 != 2037673328 && m7642f3 != 1836279920) {
                        parsableByteArray.m7635F(m7642f2);
                        i7 = m7642f2;
                    }
                    parsableByteArray.m7634E(m7642f2);
                    arrayList = ProjectionDecoder.m7823a(parsableByteArray);
                    break;
                }
                arrayList = null;
            } else {
                arrayList = ProjectionDecoder.m7823a(parsableByteArray);
            }
            if (arrayList != null) {
                int size = arrayList.size();
                if (size == 1) {
                    projection = new Projection(arrayList.get(0), i6);
                } else if (size == 2) {
                    projection = new Projection(arrayList.get(0), arrayList.get(1), i6);
                }
            }
        }
        if (projection == null || !ProjectionRenderer.m7824a(projection)) {
            int i9 = this.f14972m;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f4 = radians / 36;
            float f5 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 36; i10 < i13; i13 = 36) {
                float f6 = radians / 2.0f;
                float f7 = (i10 * f4) - f6;
                int i14 = i10 + 1;
                float f8 = (i14 * f4) - f6;
                int i15 = 0;
                while (i15 < 73) {
                    int i16 = i14;
                    int i17 = 0;
                    for (int i18 = 2; i17 < i18; i18 = 2) {
                        if (i17 == 0) {
                            f3 = f8;
                            f2 = f7;
                        } else {
                            f2 = f8;
                            f3 = f2;
                        }
                        float f9 = i15 * f5;
                        float f10 = f7;
                        int i19 = i11 + 1;
                        float f11 = f5;
                        double d = 50.0f;
                        int i20 = i15;
                        double d2 = (f9 + 3.1415927f) - (radians2 / 2.0f);
                        int i21 = i9;
                        float f12 = radians;
                        double d3 = f2;
                        float f13 = f4;
                        fArr[i11] = -((float) (Math.cos(d3) * Math.sin(d2) * d));
                        int i22 = i19 + 1;
                        int i23 = i17;
                        fArr[i19] = (float) (Math.sin(d3) * d);
                        int i24 = i22 + 1;
                        fArr[i22] = (float) (Math.cos(d3) * Math.cos(d2) * d);
                        int i25 = i12 + 1;
                        fArr2[i12] = f9 / radians2;
                        int i26 = i25 + 1;
                        fArr2[i25] = ((i10 + i23) * f13) / f12;
                        if (i20 == 0 && i23 == 0) {
                            i3 = i23;
                            i2 = i20;
                        } else {
                            i2 = i20;
                            i3 = i23;
                            if (i2 != 72 || i3 != 1) {
                                i12 = i26;
                                i11 = i24;
                                i17 = i3 + 1;
                                i15 = i2;
                                f8 = f3;
                                f5 = f11;
                                f7 = f10;
                                radians = f12;
                                f4 = f13;
                                i9 = i21;
                            }
                        }
                        System.arraycopy(fArr, i24 - 3, fArr, i24, 3);
                        i24 += 3;
                        System.arraycopy(fArr2, i26 - 2, fArr2, i26, 2);
                        i26 += 2;
                        i12 = i26;
                        i11 = i24;
                        i17 = i3 + 1;
                        i15 = i2;
                        f8 = f3;
                        f5 = f11;
                        f7 = f10;
                        radians = f12;
                        f4 = f13;
                        i9 = i21;
                    }
                    i15++;
                    i14 = i16;
                    f8 = f8;
                    i9 = i9;
                }
                i10 = i14;
            }
            projection = new Projection(new Projection.Mesh(new Projection.SubMesh(0, fArr, fArr2, 1)), i9);
        }
        this.f14966g.m7685a(j3, projection);
    }
}
